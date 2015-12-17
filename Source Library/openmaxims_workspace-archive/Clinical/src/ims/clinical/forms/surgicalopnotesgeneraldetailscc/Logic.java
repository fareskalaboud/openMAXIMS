//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Calin Perebiceanu using IMS Development Environment (version 1.71 build 3642.24101)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.surgicalopnotesgeneraldetailscc;

import ims.clinical.forms.surgicalopnotesgeneraldetailscc.GenForm.GroupOperationEnumeration;
import ims.clinical.forms.surgicalopnotesgeneraldetailscc.GenForm.grdAssistantsRow;
import ims.clinical.forms.surgicalopnotesgeneraldetailscc.GenForm.grdDiagnosisRow;
import ims.clinical.forms.surgicalopnotesgeneraldetailscc.GenForm.grdProceduresRow;
import ims.clinical.forms.surgicalopnotesgeneraldetailscc.GenForm.grdProceduresRowCollection;
import ims.clinical.vo.PatientDiagnosisOpNotesVo;
import ims.clinical.vo.PatientDiagnosisOpNotesVoCollection;
import ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.CSPrimaryDiagnosisVo;
import ims.core.vo.CSPrimaryDiagnosisVoCollection;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.HcpLiteVoCollection;
import ims.core.vo.PatientProcedureSurgicalOpVo;
import ims.core.vo.PatientProcedureSurgicalOpVoCollection;
import ims.core.vo.ProcedureLiteVo;
import ims.core.vo.enums.MosType;
import ims.core.vo.lookups.HcpDisType;
import ims.core.vo.lookups.PatientProcedureStatus;
import ims.core.vo.lookups.ProcedureUrgency;
import ims.core.vo.lookups.SourceofInformation;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.FormOpenException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.PartialDate;

import java.util.ArrayList;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		
	}

	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();
		form.fireCustomControlValueChanged();
	}
	
	
	
	@Override
	protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
	{
		if (DialogResult.OK.equals(result))
		{
			if (form.getForms().Clinical.ConsultantProcedureHotlistDialog.equals(formName))
			{
				PatientProcedureSurgicalOpVo patProc = createPatientProcedure(form.getGlobalContext().Clinical.getSelectedProcedure());
				if (patProc != null)
				{
					addProcToGrid(patProc);
					
				}
				
			}
			if (form.getForms().Clinical.PatientDiagnosisDialog.equals(formName))
			{
				if (!form.getGlobalContext().Clinical.getSelectedPatientDiagnosisOPNotesIsNotNull())
					throw new PresentationLogicException("Not null patient diagnosis expected");
				grdDiagnosisRow newRow ;
				if (form.getGlobalContext().Clinical.getSelectedPatientDiagnosisOPNotes().getID_PatientDiagnosisIsNotNull())
				{
					newRow = form.grdDiagnosis().getSelectedRow();
				}
				else
				{
					newRow = form.grdDiagnosis().getRows().newRow();
					
				}
				newRow.setValue(form.getGlobalContext().Clinical.getSelectedPatientDiagnosisOPNotes());	
				form.grdDiagnosis().setValue(newRow.getValue());
				
				CSPrimaryDiagnosisVoCollection primaryForCareSpells = form.getGlobalContext().Clinical.getSelectedPatientDiagnosisOPNotes().getPrimaryForCareSpells();
				if (primaryForCareSpells != null && primaryForCareSpells.size() > 0 )
				for (int i= 0 ; i<form.grdDiagnosis().getRows().size() ; i++)
				{
					if (i != form.grdDiagnosis().getSelectedRowIndex())
					form.grdDiagnosis().getRows().get(i).getValue().setPrimaryForCareSpells(null);
				}
				
				save();
				open();
			}
			if (formName.equals(form.getForms().Core.RieConfirmationDialog))     	//wdev-15914
			{
				if( doRIE())
				{
					open();
					save();															//wdev-15914
					open();															//wdev-16294														
				}
				else
					open();
			}
			
			
		}
		
	}
	//wdev-15914
	private boolean doRIE() 
	{
		if(form.getLocalContext().getProcedureToBeRIEIsNotNull())
		{
			try 
			{
				domain.markAsRie(form.getLocalContext().getProcedureToBeRIE(), form.getForms().Clinical.SurgicalOPNotesGeneralDetailsCC, 
						null, 
						null,
						form.getGlobalContext().Core.getCurrentCareContextIsNotNull()?form.getGlobalContext().Core.getCurrentCareContext().getID_CareContext():null,
						form.getGlobalContext().Core.getRieMessage()
						);
			} 
			catch (StaleObjectException e) 
			{
				engine.showErrors(new String[]{ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue()});
				
				return false;
			}
			catch (UnqViolationUncheckedException e)
			{
				engine.showErrors(new String[]{ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue()});
				
				return false;
			}
			
			return true;
			
			
		}
		
		return false;
	}

	private PatientProcedureSurgicalOpVo createPatientProcedure(ProcedureLiteVo proc)
	{
		PatientProcedureSurgicalOpVo patProc = new PatientProcedureSurgicalOpVo();
		patProc.setProcedure(proc);
		patProc.setAuthoringInformation(getAuthoringInfo());
		patProc.setProcedureDescription(proc.getProcedureName());
		patProc.setCareContext(form.getGlobalContext().Core.getCurrentCareContext());
		//wdev-11815
		patProc.setEpisodeOfCare(form.getGlobalContext().Core.getCurrentCareContext().getEpisodeOfCare());
		//-----
		patProc.setIncludeInDischargeLetter(true);
		patProc.setInfoSource(SourceofInformation.CLINICALCONTACT);
		patProc.setProcedureStatus(PatientProcedureStatus.PERFORMED);
		return patProc;
		
	}

	private PatientProcedureSurgicalOpVo updateProcedureDataFromScreen(PatientProcedureSurgicalOpVo patProc,HcpLiteVoCollection assistants)
	{
		if (patProc == null)
			return null;
		patProc.setProcDate(form.dteDate().getValue() == null ? null : new PartialDate(form.dteDate().getValue()));
		patProc.setPeformedBy(form.qmbOpSurgeon().getValue());	 
		patProc.setHCPPresent(assistants);
		patProc.setProcedureUrgency(null);
		if (!GroupOperationEnumeration.None.equals(form.GroupOperation().getValue()))
		{
			patProc.setProcedureUrgency(GroupOperationEnumeration.rdoEmergency.equals(form.GroupOperation().getValue())?ProcedureUrgency.EMERGENCY:ProcedureUrgency.ELECTIVE);
		}
		return patProc;
	}
	private void  addProcToGrid(PatientProcedureSurgicalOpVo patProc)
	{
		if (patProc == null)
			return;
		grdProceduresRow nRow = form.grdProcedures().getRows().newRow();
		
		nRow.setColumnName(patProc.getProcedureIsNotNull()?patProc.getProcedure().getProcedureName():null);
		nRow.setColumnDescription(patProc.getProcedureDescription());
		nRow.setValue(patProc);
		form.grdProcedures().setValue(patProc);
		
	}
	@Override
	protected void onGrdDiagnosisSelectionChanged()
	{
		form.getGlobalContext().Clinical.setSelectedPatientDiagnosisOPNotes(form.grdDiagnosis().getValue());
		updateControlsState();
	}
	@Override
	protected void onGrdDiagnosisSelectionCleared() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	
	@Override
	protected void onSurgeonComboTextSubmitted(String value) throws ims.framework.exceptions.PresentationLogicException
	{
		form.qmbOpSurgeon().clear();
		HcpLiteVoCollection result = domain.listHCPS(HcpDisType.MEDICAL, value);
		if (result == null )
			return;
		for (int i=0 ; i< result.size() ; i++)
		{
			form.qmbOpSurgeon().newRow(result.get(i), result.get(i).getIMosName());
		}
		if (result.size()==1)
		{
			form.qmbOpSurgeon().setValue(result.get(0));
			
			// WDEV-11862
			// Clear procedures not saved yet
			clearUnsavedProcedures();
			
			updateControlsState();
		}
		else
		{
			form.qmbOpSurgeon().showOpened();
		}
		
	}

	@Override
	protected void onGrdProceduresSelectionChanged()
	{
		form.getLocalContext().setSelectedProcedure(form.grdProcedures().getValue());
		//populateInstanceControlsFromData(form.getLocalContext().getSelectedProcedure());
		updateControlsState();
	}
	@Override
	protected void onGrdProceduresSelectionCleared() throws ims.framework.exceptions.PresentationLogicException
	{
		//form.getLocalContext().setSelectedProcedure(null);
		updateControlsState();
	}
	@Override
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		switch (menuItemID) {
		case GenForm.ContextMenus.ClinicalNamespace.EDischargeDiagnosisEtcDiagnosisMenu.NEW_DIAGNOSIS:
			newInstanceDiag();
			break;
		case GenForm.ContextMenus.ClinicalNamespace.EDischargeDiagnosisEtcDiagnosisMenu.EDIT_DIAGNOSIS:
			updateInstance();
			break;
		case GenForm.ContextMenus.ClinicalNamespace.EDischargeDiagnosisEtcDiagnosisMenu.VIEW_DIAGNOSIS:
			viewInstance();
			break;
			
			
		case GenForm.ContextMenus.Procedure.ADD:
			newProcedure();
			break;
			
		case GenForm.ContextMenus.Procedure.UPDATE:
			form.setMode(FormMode.EDIT);
			break;
			
		case GenForm.ContextMenus.Procedure.RIE:			//wdev-15914
			
			//wdev-16077
			SurgicalOperationNotesGeneralDetailsVo tempVo = domain.getSurgicalOpNotesGeneralDetails(form.getGlobalContext().Core.getCurrentCareContext());
			if( tempVo != null)
			{
				if( tempVo.getProceduresPerformedIsNotNull() && tempVo.getProceduresPerformed().size() < 2)
				{
					engine.showErrors(new String[]{ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue()});
					open();
					return;
				}
			}
				
			//-------------
			markAsRie(form.grdProcedures().getValue());
			break;
					
			
		case GenForm.ContextMenus.GenericGrid.Add:
			newAssistant();

			break;
		case GenForm.ContextMenus.GenericGrid.Remove:
			form.grdAssistants().removeSelectedRow();
		default:
			break;
		}
		updateControlsState();
	}
	//wdev-15914
	private void markAsRie(PatientProcedureSurgicalOpVo value) 
	{
		if(value == null)
			return;
		
		form.getLocalContext().setProcedureToBeRIE(value);
		engine.open(form.getForms().Core.RieConfirmationDialog);
	}
	//-----


	private boolean newProcedure()
	{
		HcpLiteVo surgeon = form.qmbOpSurgeon().getValue();
		if (surgeon == null)
		{
		engine.showErrors(new String[]{"Please select the operating surgeon first."});
		return false;
		}
		return engine.open(form.getForms().Clinical.ConsultantProcedureHotlistDialog,new Object[]{surgeon});
		
	}

	private void newAssistant()
	{
		form.grdAssistants().getRows().newRow(true);
		form.grdAssistants().resetScrollPosition();
	}

	private void viewInstance() {
		form.getGlobalContext().Clinical.setSelectedPatientDiagnosisOPNotes(form.grdDiagnosis().getValue());
		engine.open(form.getForms().Clinical.PatientDiagnosisDialog,new Object[]{Boolean.TRUE});
	}
	public void open() throws ims.framework.exceptions.PresentationLogicException
	{
		
		form.getLocalContext().setCurrentOPNote(domain.getSurgicalOpNotesGeneralDetails(form.getGlobalContext().Core.getCurrentCareContext()));
		
		populateScreenFromData(form.getLocalContext().getCurrentOPNote());
		
		form.grdDiagnosis().setValue(form.getGlobalContext().Clinical.getSelectedPatientDiagnosisOPNotes());
		form.setMode(FormMode.VIEW);
		
	}
	
	@Override
	public void clear() {
		super.clear();
		form.grdDiagnosis().getRows().clear();
		form.grdProcedures().getRows().clear();
		
		clearInstanceControls();
	}

	public void clearInstanceControls()
	{
		form.dteDate().setValue(null);
		
		form.GroupOperation().setValue(GroupOperationEnumeration.None);
		
		
		form.lblConsultant().setValue(null);
		form.lblConsultant().setTooltip(null); //WDEV-16309
		
		
		form.qmbOpSurgeon().setValue(null);
		form.qmbOpSurgeon().clear();
		//wdev-13658
		form.ccPrincipalAnaesthetist().clear();
		form.dteEstimatedDateOfDischarge().setValue(null);
		form.ccConsultantAnaesthetist().clear();
		form.cmbAnaestheticGiven().setValue(null);
		//-----------------
		

		
		form.grdAssistants().getRows().clear();
	}
	
	public boolean save() throws ims.framework.exceptions.PresentationLogicException
	{
		
		SurgicalOperationNotesGeneralDetailsVo record = populateDataFromScreen();
		String[] errors = record.validate();
		if (errors != null && errors.length >0 )
		{
			engine.showErrors(errors);
			return false;
		}
		try {
			record = domain.saveSurgicalOPNotesGeneralDetail(record);
		} catch (DomainInterfaceException e) {
			engine.showErrors(new String[]{e.getMessage()});
		} catch (StaleObjectException e) {
			engine.showErrors(new String[]{ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue()});
			open();
			return false;
		} catch (UniqueKeyViolationException e) {
			engine.showErrors(new String[]{"A record with same unique key already exists"});
			return false;
		}
		return true;
	}
	public void updateControlsState()
	{
		
		boolean viewMode = FormMode.VIEW.equals(form.getMode());
		boolean isReadWrite = !(form.getLocalContext().getReadOnlyIsNotNull() && form.getLocalContext().getReadOnly());
		boolean isOperatingSurgeon = form.qmbOpSurgeon().getValue() != null;
		if (viewMode)
		{
			form.btnEdit().setVisible(isReadWrite);
			//wdev-15917
			if( form.getLocalContext().getCurrentOPNoteIsNotNull() && form.getLocalContext().getCurrentOPNote().getProceduresPerformedIsNotNull() && form.getLocalContext().getCurrentOPNote().getProceduresPerformed().size() > 0)
				form.btnEdit().setText("Edit");
			else
				form.btnEdit().setText("New");
		
		}
		form.getContextMenus().Clinical.getEDischargeDiagnosisEtcDiagnosisMenuNEW_DIAGNOSISItem().setVisible(viewMode && isReadWrite);
		form.getContextMenus().Clinical.getEDischargeDiagnosisEtcDiagnosisMenuEDIT_DIAGNOSISItem().setVisible(viewMode && form.grdDiagnosis().getSelectedRow()!=null && isReadWrite);
		form.getContextMenus().Clinical.getEDischargeDiagnosisEtcDiagnosisMenuVIEW_DIAGNOSISItem().setVisible(viewMode && form.grdDiagnosis().getSelectedRow()!=null);
		
		form.getContextMenus().getProcedureADDItem().setVisible(isOperatingSurgeon && !viewMode && isReadWrite);
		form.getContextMenus().getProcedureRIEItem().setVisible( isOperatingSurgeon && viewMode && isReadWrite && form.grdProcedures().getValue() instanceof PatientProcedureSurgicalOpVo && form.grdProcedures().getValue().getID_PatientProcedureIsNotNull() && form.grdProcedures().getRows().size() > 1); //wdev-15914

		 
		
		form.getContextMenus().getGenericGridAddItem().setVisible(!viewMode);
		form.getContextMenus().getGenericGridRemoveItem().setVisible(!viewMode && form.grdAssistants().getSelectedRowIndex() >= 0);

		
	}
	
	
	
	@Override
	public void initialize() throws FormOpenException {
		super.initialize();
		form.getContextMenus().disableAllGenericGridMenuItems();
		form.getContextMenus().getGenericGridAddItem().setText("Add Assistant");
		form.getContextMenus().getGenericGridAddItem().setEnabled(true);
		form.getContextMenus().getGenericGridRemoveItem().setText("Remove Assistant");
		form.getContextMenus().getGenericGridRemoveItem().setEnabled(true);
		form.ccPrincipalAnaesthetist().initialize(MosType.HCP);		//wdev-13658
		form.ccConsultantAnaesthetist().initialize(MosType.HCP);	//wdev-13658
	
	}
	private void populateScreenFromData(SurgicalOperationNotesGeneralDetailsVo songd)
	{
		clear();
		if (songd== null)
			return;
				
		populateProcedureGridFromData(songd.getProceduresPerformed());
		populateDiagnosisGridFromData(songd.getPatientDiagnoses());
		if (songd.getMainProcedureIsNotNull() && !Boolean.TRUE.equals(songd.getMainProcedure().getIsRIE()))  //wdev-15914
		{
			form.grdProcedures().getRowByValue(songd.getMainProcedure()).setColumnPrimary(true);
		}
		form.ccConsultantAnaesthetist().setValue(songd.getConsultantAnaesthetist()); //wdev-13658
		form.ccPrincipalAnaesthetist().setValue(songd.getPrincipalAnaesthetist()); //wdev-13658
		form.cmbAnaestheticGiven().setValue(songd.getAnaestheticGiven()); //wdev-13658
		form.dteEstimatedDateOfDischarge().setValue(songd.getEstimatedDateOfDischarge()); //wdev-13658
		
	}
	private void populateProcedureGridFromData(PatientProcedureSurgicalOpVoCollection ppso)
	{
		if (ppso == null || ppso.size() == 0)
			return;
		populateInstanceControlsFromData(ppso.get(0));
		for (int i= 0 ; i < ppso.size() ; i++)
		{
			PatientProcedureSurgicalOpVo current = ppso.get(i);
			if (current != null)
			{
				grdProceduresRow nRow = form.grdProcedures().getRows().newRow();
				nRow.setColumnName(current.getProcedureIsNotNull() ? current.getProcedure().getProcedureName() : null);
				nRow.setColumnDescription(current.getProcedureDescription());
				nRow.setValue(current);
			}
		}
	}
	
	private void populateInstanceControlsFromData(PatientProcedureSurgicalOpVo proc)
	{
		clearInstanceControls();
		if (proc == null)
			return;
		form.dteDate().setValue(proc.getProcDateIsNotNull() ? proc.getProcDate().toDate() : null);
		HcpLiteVo surgeon = proc.getPeformedBy();
		if (surgeon !=null)
		{
			form.qmbOpSurgeon().newRow(surgeon, surgeon.getMosIsNotNull()?surgeon.getMos().getIMosName():null);
			form.qmbOpSurgeon().setValue(surgeon);
		}
		
		HcpLiteVoCollection assistants = proc.getHCPPresent();
		if (assistants != null)
		{
			for (int i =0 ; i<assistants.size() ; i++)
			{
				HcpLiteVo assistant = assistants.get(i);
				if (assistant!=null)
				{
				grdAssistantsRow nRow = form.grdAssistants().getRows().newRow();
				nRow.getSurgeon().newRow(assistant,assistant.getIMosName());
				nRow.getSurgeon().setValue(assistant);
				}
			}
		}
		// TODO form.chkPrimary().setValue(form.getLocalContext().getCurrentOPNoteIsNotNull() && proc.equals(form.getLocalContext().getCurrentOPNote().getMainProcedure()));
		if (proc.getProcedureUrgencyIsNotNull())
		{
		form.GroupOperation().setValue(ProcedureUrgency.EMERGENCY.equals(proc.getProcedureUrgency())?GroupOperationEnumeration.rdoEmergency:GroupOperationEnumeration.rdoElective);
		}
		
		populateCmbConsultant();
		
	}

	private void populateCmbConsultant()
	{
		if (form.getGlobalContext().Core.getCurrentCareContext().getEpisodeOfCareIsNotNull() )
		{
			HcpLiteVo responsibleHCP = form.getGlobalContext().Core.getCurrentCareContext().getEpisodeOfCare().getResponsibleHCP();
			if (responsibleHCP != null)
			{
			//form.lblConsultant().setValue(responsibleHCP.getMos().getIMosName());
				form.lblConsultant().setValue(getFirst21Char(responsibleHCP.getMos().getIMosName()));	//wdev-16292
				form.lblConsultant().setTooltip(responsibleHCP.getMos().getIMosName()); 				//wdev-16292
			
			}
		}
	}
	private String getFirst21Char(String dtrg)
	{
		if( dtrg != null )
		{
			int lung = dtrg.length();
			if( lung > 21)
				return dtrg.substring(0, 20);
			else
				return dtrg;
		}
		return null;
	}
	private boolean isPrimaryDiagnosisRecord(PatientDiagnosisOpNotesVo voPatDiagnosis)
	{
		if (voPatDiagnosis == null || voPatDiagnosis.getPrimaryForCareSpells() == null)
			return false;

		CSPrimaryDiagnosisVoCollection voColl = voPatDiagnosis.getPrimaryForCareSpells();
		for (int i = 0; voColl != null && i < voColl.size(); i++)
		{
			CSPrimaryDiagnosisVo primaryDiagnosisVo = voColl.get(i);
			boolean sameDiagnosis = primaryDiagnosisVo.getDiagnosisIsNotNull() && primaryDiagnosisVo.getDiagnosis().equals(voPatDiagnosis);
			boolean sameCareContext = primaryDiagnosisVo.getCareContextIsNotNull() && primaryDiagnosisVo.getCareContext().equals(form.getGlobalContext().Core.getCurrentCareContext());

			if (sameDiagnosis && sameCareContext && primaryDiagnosisVo.getIsActiveIsNotNull() && primaryDiagnosisVo.getIsActive())
				return true;
		}

		return false;
	}

	private void populateDiagnosisGridFromData(PatientDiagnosisOpNotesVoCollection pdac)
	{	
		form.grdDiagnosis().getRows().clear();
		if (pdac == null)
			return;
		
		for (int i = 0 ; i < pdac.size() ; i++)
		{
			PatientDiagnosisOpNotesVo current = pdac.get(i);
			if (current != null)
			{
				grdDiagnosisRow nRow = form.grdDiagnosis().getRows().newRow();
				nRow.setColumnName(current.getDiagnosisIsNotNull() ? current.getDiagnosis().getDiagnosisName() : null);
				nRow.setColumnDescription(current.getDiagnosisDescription());
				nRow.setColumnPrimary(isPrimaryDiagnosisRecord(current));
				nRow.setValue(current);
				
				String toolTip = "";
				if (current.getCurrentStatusIsNotNull() && current.getCurrentStatus().getStatusIsNotNull())
				{
					toolTip = "<b>Status</b>: "+current.getCurrentStatus().getStatus().getText();
				}
				if (current.getAuthoringInfoIsNotNull()) 
				{
					if (current.getAuthoringInfo().getAuthoringHcpIsNotNull() && 
							current.getAuthoringInfo().getAuthoringHcp().getMosIsNotNull() &&
								current.getAuthoringInfo().getAuthoringHcp().getMos().getNameIsNotNull())
					{
						
						toolTip+= "<br/><b>Authoring HCP: </b> "+current.getAuthoringInfo().getAuthoringHcp().getMos().getName().toString();
					}
					if (current.getAuthoringInfo().getAuthoringDateTimeIsNotNull())
					{
						toolTip+= "<br/><b>Authoring Date/Time: </b> "+current.getAuthoringInfo().getAuthoringDateTime().toString();
					}
					
				}
				if (toolTip.length()>0)
					nRow.setTooltip(toolTip);
				
			}
		}
	}

	public void newInstanceDiag() throws PresentationLogicException {
		form.getGlobalContext().Clinical.setSelectedPatientDiagnosisOPNotes(null);
		engine.open(form.getForms().Clinical.PatientDiagnosisDialog);
		
	}

	public void updateInstance() {
		
		form.getGlobalContext().Clinical.setSelectedPatientDiagnosisOPNotes((PatientDiagnosisOpNotesVo) form.grdDiagnosis().getValue().clone());
		engine.open(form.getForms().Clinical.PatientDiagnosisDialog);
		
	}

	@Override
	protected void onBtnCancelClick() throws PresentationLogicException {
		open();
		
	}

	@Override
	protected void onBtnSaveClick() throws PresentationLogicException {
		if (validateInstanceControls())
		{
			if (save())
			{
				open();
			}
		}	
		
	}
	private boolean validateInstanceControls()
	{
		ArrayList<String> errors = new ArrayList<String>();
		if (form.qmbOpSurgeon().getValue() == null)
		{
			errors.add("Please select an Operating Surgeon");
		}
		if (getAddedAssistants().indexOf(form.qmbOpSurgeon().getValue())>=0)
		{
			errors.add("Operating surgeon cannot be included in the Assistant(s) list.");	//wdev-16088	
		}
		if (form.grdProcedures().getRows().size()==0)
		{
			errors.add("Please add at least one procedure");
		}
		if (errors.size() > 0)
		{
			
			engine.showErrors(errors.toArray(new String[errors.size()]));
			return false;
		}
	
		return true;
	}

	private HcpLiteVoCollection getAddedAssistants() {
		HcpLiteVoCollection assistants = new HcpLiteVoCollection();
		for (int i=0 ; i<form.grdAssistants().getRows().size() ; i++)
		{
			Object rowVal = form.grdAssistants().getRows().get(i).getSurgeon().getValue();
			if (rowVal instanceof HcpLiteVo)
				assistants.add((HcpLiteVo) rowVal);
		}
		return assistants;
	}
	private SurgicalOperationNotesGeneralDetailsVo populateDataFromScreen()
	{
		SurgicalOperationNotesGeneralDetailsVo songd = form.getLocalContext().getCurrentOPNote();
		if (songd == null)
		{
			songd = new SurgicalOperationNotesGeneralDetailsVo();
		}
		if (!songd.getCareContextIsNotNull())
		{
			songd.setCareContext(form.getGlobalContext().Core.getCurrentCareContext());
		}
		if (!songd.getAuthoringInfoIsNotNull())
		{
			AuthoringInformationVo authInfo = getAuthoringInfo();
			songd.setAuthoringInfo(authInfo);
		}
		songd.setProceduresPerformed(getDataFromGrid());
		songd.setPatientDiagnoses(form.grdDiagnosis().getValues());
		songd.setMainProcedure(getMainFromGrid());
		//if(form.ccPrincipalAnaesthetist().getValue() instanceof HcpLiteVo)							//wdev-13658
		songd.setPrincipalAnaesthetist((HcpLiteVo) form.ccPrincipalAnaesthetist().getValue());  //wdev-13658
		//if(form.ccConsultantAnaesthetist().getValue() instanceof HcpLiteVo)                         //wdev-13658 
		songd.setConsultantAnaesthetist((HcpLiteVo) form.ccConsultantAnaesthetist().getValue()); //wdev-13658
		songd.setAnaestheticGiven(form.cmbAnaestheticGiven().getValue()); //wdev-13658
		songd.setEstimatedDateOfDischarge(form.dteEstimatedDateOfDischarge().getValue());   		 //wdev-13658
		
		return songd;
	}

	private AuthoringInformationVo getAuthoringInfo()
	{
		AuthoringInformationVo authInfo = new AuthoringInformationVo();
		authInfo.setAuthoringDateTime(new DateTime());
		authInfo.setAuthoringHcp((HcpLiteVo) domain.getHcpLiteUser());
		return authInfo;
	}
	
	private PatientProcedureSurgicalOpVo getMainFromGrid()
	{
		grdProceduresRowCollection patProcs = form.grdProcedures().getRows();
		if (patProcs == null)
			return null;
		for (int i=0 ; i<patProcs.size() ; i++)
		{
			if (patProcs.get(i).getColumnPrimary() == true)
			{
				return patProcs.get(i).getValue();
			}
		}
		return null;
	}

	private PatientProcedureSurgicalOpVoCollection getDataFromGrid()
	{
		if (form.grdProcedures().getRows().size() == 0)
		{
			return null;
		}
		HcpLiteVoCollection addedAssistants = getAddedAssistants();
		PatientProcedureSurgicalOpVoCollection ppsugov = new PatientProcedureSurgicalOpVoCollection();
		for (int i =0 ; i<form.grdProcedures().getRows().size() ; i++)
		{
			PatientProcedureSurgicalOpVo value = form.grdProcedures().getRows().get(i).getValue();
			
			ppsugov.add(updateProcedureDataFromScreen(value, addedAssistants));
		}
		return ppsugov;
	}

	

	@Override
	protected void onGrdAssistantsGridQueryComboBoxTextSubmited(int column,grdAssistantsRow row, String text) throws PresentationLogicException {
		row.getSurgeon().clear();
		HcpLiteVoCollection result = domain.listHCPS(null, text);
		if (result == null )
			return;
		HcpLiteVoCollection alreadyIn = getAddedAssistants();
		if (alreadyIn != null)
		{
			for (int i=0 ; i<alreadyIn.size() ; i++)
			{
				result.remove(alreadyIn.get(i));
			}
		}
		if (result == null || result.size()==0)
			return;
		for (int i=0 ; i< result.size() ; i++)
		{
			row.getSurgeon().newRow(result.get(i), result.get(i).getIMosName());
		}
		if (result.size()==1)
		{
			row.getSurgeon().setValue(result.get(0));
			
		}
		else
		{
			row.getSurgeon().showOpened();
		}
	}

	@Override
	protected void onGrdAssistantsSelectionChanged() throws PresentationLogicException {
		updateControlsState();
		
	}

	public void newInstance() throws PresentationLogicException {
		return;
		
	}

	public void setReadOnly(Boolean isRead) {
		form.getLocalContext().setReadOnly(isRead);
		updateControlsState();
		
	}

	public void refresh(){
		try {
			open();
		} catch (PresentationLogicException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	protected void onBtnEditClick() throws PresentationLogicException
	{
		if (!form.getLocalContext().getCurrentOPNoteIsNotNull() ||
				!form.getLocalContext().getCurrentOPNote().getProceduresPerformedIsNotNull() ||
					form.getLocalContext().getCurrentOPNote().getProceduresPerformed().size()==0)
		{
			initializeInstanceControls();
		}
		form.setMode(FormMode.EDIT);
		
	}

	private void initializeInstanceControls()
	{
		form.dteDate().setValue(new Date());
		Object hcpLiteUser = domain.getHcpLiteUser();
		if (hcpLiteUser != null)
		{
			HcpLiteVo hcpLiteUserValue = (HcpLiteVo) hcpLiteUser;
    		if (HcpDisType.MEDICAL.equals(hcpLiteUserValue.getHcpType())) //WDEV-16180
    		{
    			form.qmbOpSurgeon().newRow(hcpLiteUserValue, hcpLiteUserValue.getIHcpName());
    			form.qmbOpSurgeon().setValue(hcpLiteUserValue);
    		}
		}
		populateCmbConsultant();
	}

	@Override
	protected void onQmbOpSurgeonValueChanged() throws PresentationLogicException
	{
		// WDEV-11862
		// Clear procedures not saved yet
		clearUnsavedProcedures();
		
		updateControlsState();
	}

	/**
	 * WDEV-11862
	 * Function used to remove procedures that were introduced but not saved
	 * when the Operating Surgeon gets changed. Save Procedures must remain
	 */
	private void clearUnsavedProcedures()
	{
		// If there is no record saved or no procedures saved then clear grid and exit the function
		if (!form.getLocalContext().getCurrentOPNoteIsNotNull()
				|| !form.getLocalContext().getCurrentOPNote().getProceduresPerformedIsNotNull())
		{
			form.grdProcedures().getRows().clear();
			return;
		}
		
		// Iterate backwards procedure grid rows to eliminate unsaved procedures
		for (int i = form.grdProcedures().getRows().size() - 1; i >= 0; i--)
		{
			PatientProcedureSurgicalOpVo procedure = form.grdProcedures().getRows().get(i).getValue();
			
			// If a procedure is not found in the procedure collection of the saved record
			// then remove it from the grid
			if (!form.getLocalContext().getCurrentOPNote().getProceduresPerformed().contains(procedure))
			{
				form.grdProcedures().getRows().remove(i);
			}
		}
	}

	@Override
	protected void onGrdProceduresGridCheckBoxClicked(int column, grdProceduresRow row, boolean isChecked) throws PresentationLogicException
	{
		if (isChecked)
		{
			grdProceduresRow mRow = getPreviousMainRow(row);
			if (mRow!=null)
			mRow.setColumnPrimary(false);
		}
		
	}

	private grdProceduresRow getPreviousMainRow(grdProceduresRow cuRow)
	{
		if (cuRow == null)
			return null;
		grdProceduresRowCollection rows = form.grdProcedures().getRows();
		if (rows == null || rows.size() == 0)
			return null;
		for (int i=0 ; i<rows.size() ; i++)
		{
			grdProceduresRow row = rows.get(i);
			
			if (row.getColumnPrimary() == true && !cuRow.getValue().equals(row.getValue()))
			{
			return row;
			}
		}
		return null;
	}
	
}