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
// This code was generated by Peter Martin using IMS Development Environment (version 1.70 build 3478.14513)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.core.forms.mdtcustomlist;

import ims.core.forms.mdtcustomlist.GenForm.grdPatientsRow;
import ims.core.vo.CareContextVo;
import ims.core.vo.CareContextVoCollection;
import ims.core.vo.CareSpellVo;
import ims.core.vo.CareSpellVoCollection;
import ims.core.vo.ClinicalContactShortVoCollection;
import ims.core.vo.CustomListVo;
import ims.core.vo.CustomListVoCollection;
import ims.core.vo.EpisodeofCareVoCollection;
import ims.core.vo.MDTPatientCustomListVo;
import ims.core.vo.PatientShort;
import ims.core.vo.PatientShortCollection;
import ims.core.vo.PersonName;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.vo.ValueObject;

public class Logic extends BaseLogic
{
	private static final String	INDENT	= "";
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
	}
	private void initialize() {
		form.getContextMenus().Core.hideAllMDTCustomListsMenuItems();
	}
	private void loadListCombo(CustomListVoCollection collCustomListVo) {
		form.cmbCustomLists().clear();
		if(collCustomListVo!=null)
			for(int i=0;i<collCustomListVo.size();i++)
			{
				CustomListVo voCustomList = collCustomListVo.get(i);
				form.cmbCustomLists().newRow(voCustomList, voCustomList.getListName());
			}
	}
	@Override
	protected void onImbResetClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.cmbSpecialty().setValue(null);
		form.dteDate().setValue(null);
		form.cmbCustomLists().setValue(null);
		form.cmbCustomLists().clear();
		form.grdPatients().getRows().clear();
		form.getContextMenus().Core.hideAllMDTCustomListsMenuItems();
	}
	@Override
	protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(form.cmbSpecialty().getValue()==null){
			engine.showMessage("Please select a Specialty for search");
			return;
		}
		if(form.dteDate().getValue()==null){
			engine.showMessage("Please select a Date for search");
			return;
		}
		CustomListVo voCustomList = form.cmbCustomLists().getValue();
		if(voCustomList!=null){
			populatePatientsGrid(domain.getCustomList(voCustomList));
			if(form.grdPatients().getRows().size()==0)
				engine.showMessage("No Care Contexts exist for Patients in this list.");
		}
		else{
			form.grdPatients().getRows().clear();
			engine.showMessage("Please select a List Name for search");
		}
		
		form.getContextMenus().Core.hideAllMDTCustomListsMenuItems();
	}
	private void populatePatientsGrid(MDTPatientCustomListVo voPatientCustomList) {
		if(voPatientCustomList!=null && voPatientCustomList.getPatientsIsNotNull()){
			PatientShortCollection collPatientShort = voPatientCustomList.getPatients();
			form.grdPatients().getRows().clear();
			for(int i=0;i<collPatientShort.size();i++)
			{
				PatientShort voPatient = collPatientShort.get(i);
				
				listCareSpells(voPatient);
				
			}
		}
	}
	private void listCareSpells(PatientShort voPatient)
	{
		CareSpellVoCollection voCollCareSpells = domain.listCareSpellsByPatient(voPatient);
		populateGrid(voCollCareSpells, voPatient.getName());
	}
	private void populateGrid(CareSpellVoCollection voCollCareSpells, PersonName name)
	{
		if (voCollCareSpells != null)
		{
			populateCareSpellRows(voCollCareSpells, name);
		}
	}

	private void populateCareSpellRows(CareSpellVoCollection voCollCareSpells, PersonName name)
	{
		grdPatientsRow careSpellRow;
		for (int i = 0; i < voCollCareSpells.size(); i++)
		{
			careSpellRow = form.grdPatients().getRows().newRow();
			CareSpellVo careSpellVo = voCollCareSpells.get(i);
			careSpellRow.setcolStartDateEndDate(name.toString());
			//setStartDateEndDateAndTooltip(careSpellRow, careSpellVo);
			careSpellRow.setCollapsedImage(form.getImages().Core.CareSpell);
			careSpellRow.setExpandedImage(form.getImages().Core.CareSpell);
			careSpellRow.setBackColor(Color.Bisque);
			careSpellRow.setBold(true);
			careSpellRow.setValue(careSpellVo);

			if (careSpellVo.getEndDateIsNotNull())
				form.getLocalContext().setParentEnded(Boolean.TRUE);

			boolean bCollapseAll = populateEpisodeOfCareRows(careSpellVo.getEpisodes().sort(), careSpellRow);
			careSpellRow.setExpanded(!bCollapseAll);
		}
	}

	private boolean populateEpisodeOfCareRows(EpisodeofCareVoCollection voCollEpisodeOfCare, grdPatientsRow careSpellRow)
	{
		int endedCount = 0;
		if (voCollEpisodeOfCare != null && careSpellRow != null)
		{
			grdPatientsRow episodeOfCareRow;
			for (int i = 0; i < voCollEpisodeOfCare.size(); i++)
			{
				episodeOfCareRow = careSpellRow.getRows().newRow();

				episodeOfCareRow.setcolStartDateEndDate(voCollEpisodeOfCare.get(i).createDisplayString());
				episodeOfCareRow.setcolSpeciality( voCollEpisodeOfCare.get(i).getSpecialtyIsNotNull() ? INDENT + voCollEpisodeOfCare.get(i).getSpecialty().getText() : null);
				if (voCollEpisodeOfCare.get(i).getResponsibleHCPIsNotNull())
					episodeOfCareRow.setcolRMO(voCollEpisodeOfCare.get(i).getResponsibleHCP().getMosIsNotNull() ? INDENT + voCollEpisodeOfCare.get(i).getResponsibleHCP().getMos().toString() : null);
				episodeOfCareRow.setCollapsedImage(form.getImages().Core.EpisodeOfCare);
				episodeOfCareRow.setExpandedImage(form.getImages().Core.EpisodeOfCare);
				episodeOfCareRow.setValue(voCollEpisodeOfCare.get(i));
				populateCareContextRows(voCollEpisodeOfCare.get(i).getCareContexts().sort(), episodeOfCareRow);
				
				if(voCollEpisodeOfCare.get(i).getEndDate() == null)
					episodeOfCareRow.setExpanded(true);
				else
					endedCount++;
			}
			
			return (endedCount == voCollEpisodeOfCare.size());
		}

		return false;
	}

	private void populateCareContextRows(CareContextVoCollection voCollCareContexts, grdPatientsRow episodeOfCareRow)
	{
		if (voCollCareContexts != null && episodeOfCareRow != null)
		{
			voCollCareContexts.sort();
			grdPatientsRow careContextRow;
			for (int i = 0; i < voCollCareContexts.size(); i++)
			{
				careContextRow = episodeOfCareRow.getRows().newRow();

				String displayString = voCollCareContexts.get(i).createDisplayString();
							
				careContextRow.setcolStartDateEndDate(displayString);
				careContextRow.setcolSpeciality(voCollCareContexts.get(i).getContextIsNotNull() ? INDENT + INDENT +  voCollCareContexts.get(i).getContext().getText() : null);
				careContextRow.setCollapsedImage(form.getImages().Core.CareContext);
				careContextRow.setExpandedImage(form.getImages().Core.CareContext);
				careContextRow.setValue(voCollCareContexts.get(i));
				populateClinicalContacts(voCollCareContexts.get(i).getClinicalContacts().sort(), careContextRow);
				
				if(voCollCareContexts.get(i).getEndDateTime() == null)
					careContextRow.setExpanded(true);
			}
		}
	}
	private void populateClinicalContacts(ClinicalContactShortVoCollection voCollclinicalContacts, grdPatientsRow careContextRow)
	{
		if (voCollclinicalContacts != null && careContextRow != null)
		{
			voCollclinicalContacts.sort();
			grdPatientsRow clinicalContactRow = null;
			for (int i = 0; i < voCollclinicalContacts.size(); i++)
			{
				clinicalContactRow = careContextRow.getRows().newRow();

				clinicalContactRow.setcolStartDateEndDate(voCollclinicalContacts.get(i).createDisplayString());
				clinicalContactRow.setcolSpeciality(voCollclinicalContacts.get(i).getSpecialtyIsNotNull() ? INDENT + INDENT + INDENT + voCollclinicalContacts.get(i).getSpecialty().getText() : null);
				clinicalContactRow.setcolContactType(voCollclinicalContacts.get(i).getContactTypeIsNotNull() ? voCollclinicalContacts.get(i).getContactType().getText() : null);
				
				clinicalContactRow.setcolRMO(voCollclinicalContacts.get(i).getSeenByIsNotNull() ? INDENT + INDENT + INDENT +  voCollclinicalContacts.get(i).getSeenBy().toString() : null);
				clinicalContactRow.setCollapsedImage(form.getImages().Admin.MemberOfStaff);
				clinicalContactRow.setExpandedImage(form.getImages().Admin.MemberOfStaff);
				clinicalContactRow.setValue(voCollclinicalContacts.get(i));
			}
		}
	}
	@Override
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		switch (menuItemID)
		{
			case GenForm.ContextMenus.CoreNamespace.MDTCustomLists.VIEW_MDT_DETAILS:
				engine.open(form.getForms().Oncology.MDTDetailsDialog);
			break;
			case GenForm.ContextMenus.CoreNamespace.MDTCustomLists.VIEW_CARE_PLAN_DETAILS:
				engine.open(form.getForms().Oncology.CarePlanDetailsDialog);
			break;
				
			default :
				break;
		}
	}
	@Override
	protected void onGrdPatientsSelectionChanged() throws PresentationLogicException {
		if(form.grdPatients().getValue() instanceof CareContextVo)
		{
			form.getContextMenus().Core.getMDTCustomListsVIEW_MDT_DETAILSItem().setVisible(true);
			form.getContextMenus().Core.getMDTCustomListsVIEW_CARE_PLAN_DETAILSItem().setVisible(true);
		}
		else
			form.getContextMenus().Core.hideAllMDTCustomListsMenuItems();
		
		setPatientSummaryGlobalContexts(form.grdPatients().getValue());
	}
	private void setPatientSummaryGlobalContexts(ValueObject value) {
		form.getGlobalContext().Core.setCurrentCareContext(null);

		// Care Context
		if (value instanceof CareContextVo)
		{
			form.getGlobalContext().Core.setCurrentCareContext((CareContextVo) value);
		}
	}
	@Override
	protected void onCmbCustomListsValueChanged() throws PresentationLogicException {
		form.grdPatients().getRows().clear();
	}
	@Override
	protected void onDteDateValueChanged() throws PresentationLogicException {
		if(form.dteDate().getValue()!=null && form.dteDate().getValue()!=null){
			CustomListVo voCustomList = new CustomListVo();
			voCustomList.setDate(form.dteDate().getValue());
			voCustomList.setSpecialty(form.cmbSpecialty().getValue());
			loadListCombo(domain.listCustomListTypes(voCustomList));
		}
		form.grdPatients().getRows().clear();
		form.getContextMenus().Core.hideAllMDTCustomListsMenuItems();		
	}
	@Override
	protected void onCmbSpecialtyValueChanged() throws PresentationLogicException {
		if(form.dteDate().getValue()!=null && form.dteDate().getValue()!=null){
			CustomListVo voCustomList = new CustomListVo();
			voCustomList.setDate(form.dteDate().getValue());
			voCustomList.setSpecialty(form.cmbSpecialty().getValue());
			loadListCombo(domain.listCustomListTypes(voCustomList));
		}
		form.grdPatients().getRows().clear();
		form.getContextMenus().Core.hideAllMDTCustomListsMenuItems();		
	}
}