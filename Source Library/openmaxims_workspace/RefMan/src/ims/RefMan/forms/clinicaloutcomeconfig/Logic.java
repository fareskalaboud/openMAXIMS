//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Andrei Stefan Bondar using IMS Development Environment (version 1.80 build 4084.19189)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.clinicaloutcomeconfig;

import ims.RefMan.forms.clinicaloutcomeconfig.GenForm.grdClinicalOutcomeConfigsRow;
import ims.clinicaladmin.vo.ClinicalOutcomeConfigDisplayVo;
import ims.clinicaladmin.vo.ClinicalOutcomeConfigDisplayVoCollection;
import ims.clinicaladmin.vo.ClinicalOutcomeConfigSearchVo;
import ims.clinicaladmin.vo.ClinicalOutcomeConfigVo;
import ims.configuration.gen.ConfigFlag;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.MessageButtons;
import ims.framework.MessageIcon;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.FormOpenException;
import ims.framework.exceptions.PresentationLogicException;

import java.util.ArrayList;
import java.util.List;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	// ------------------------------------------------------------------------------------------------------------------------------------------------------
	// Region - Event Handlers
	// ------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		// Initialize the form
		initialize();
		
		// Refresh the form
		open();
	}

	@Override
	protected void onFormModeChanged()
	{
		// Update the state for controls & context menu
		updateControlsState();
	}
	
	@Override
	protected void onImbSearchClick() throws PresentationLogicException
	{
		// Perform search
		search();
		
		// Update controls state
		updateControlsState();
	}
	
	@Override
	protected void onImbClearClick() throws PresentationLogicException
	{
		// Clear selected record local context
		form.getLocalContext().setSelectedRecord(null);
		// Clear search criteria
		form.getGlobalContext().ClinicalAdmin.setClinicalOutcomeConfigSearchCriteria(null);
		
		// Clear screen (search controls, grid & instance controls)
		clear();
		
		// Update controls state
		updateControlsState();
	}

	@Override
	protected void onGrdClinicalOutcomeConfigsSelectionChanged()
	{
		// Set selected record local context
		form.getLocalContext().setSelectedRecord(domain.getClinicalOutcome(form.grdClinicalOutcomeConfigs().getValue()));
		
		// Present selected record to screen
		populateInstanceControls(form.getLocalContext().getSelectedRecord());
		
		// Update controls state
		updateControlsState();
	}
	
	@Override
	protected void onGrdClinicalOutcomeConfigsSelectionCleared() throws PresentationLogicException
	{
		// Clear selected record local context
		form.getLocalContext().setSelectedRecord(null);
		
		// Clear instance controls
		clearInstanceControls();
		
		// Update controls state
		updateControlsState();
	}

	@Override
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		newInstance(); 
	}
	
	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		updateInstance();
	}
	
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (save())
			open();
	}
	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}
	
	@Override
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		switch (menuItemID)
		{
			case GenForm.ContextMenus.RefManNamespace.ClinicalOutcomeConfig.NEW:
				newInstance();
				break;
				
			case GenForm.ContextMenus.RefManNamespace.ClinicalOutcomeConfig.EDIT:
				updateInstance();
				break;
		}
	}

	
	// -----------------------------------------------------------------------------------------------------------------------------------------------------
	// Form presentation functions
	// -----------------------------------------------------------------------------------------------------------------------------------------------------
	
	/**
	 *  Function used to intialize the form
	 */
	public void initialize() throws FormOpenException
	{
		// Clear local context
		form.getLocalContext().setSelectedRecord(null);
		
		// Hide all context menu options
		form.getContextMenus().RefMan.hideAllClinicalOutcomeConfigMenuItems();
		
		// Set default values on screen
		form.chkActiveOnly().setValue(true);
		
		// Populate search controls from global context search criteria if it's not null
		if (form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteriaIsNotNull())
		{
			form.cmbCategory().setValue(form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria().getCategory());
			form.cmbSpecialty().setValue(form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria().getSpecialty());
			form.txtClinicalOutcome().setValue(form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria().getClinicalOutcome());
			form.txtCode().setValue(form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria().getCode());
			form.chkActiveOnly().setValue(form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria().getActiveOnly());
		}
	}
	
	/**
	 * Function used to perform a search
	 */
	public void search()
	{
		// Validate search criteria
		if (!validSearchCriteria())
		{
			engine.showMessage("At least one search criteria must be selected!");
			return;
		}
		
		// Clear selected record local context
		form.getLocalContext().setSelectedRecord(null);

		// Set the search criteria global context
		if (!form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteriaIsNotNull())
			form.getGlobalContext().ClinicalAdmin.setClinicalOutcomeConfigSearchCriteria(new ClinicalOutcomeConfigSearchVo());
		
		form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria().setCategory(form.cmbCategory().getValue());
		form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria().setSpecialty(form.cmbSpecialty().getValue());
		form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria().setClinicalOutcome(form.txtClinicalOutcome().getValue());
		form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria().setCode(form.txtCode().getValue());
		form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria().setActiveOnly(form.chkActiveOnly().getValue());
		
		// Populate grid with search result
		populateClinicalOutcomeGrid(domain.listClinicalOutcomes(null, form.cmbCategory().getValue(), form.cmbSpecialty().getValue(), form.txtClinicalOutcome().getValue(),
				form.txtCode().getValue(), form.chkActiveOnly().getValue()), true);
	}

	/**
	 * Function used to refresh the screen
	 * Will clear the screen and populate with selected record (if any)
	 */
	public void open() throws PresentationLogicException
	{
		// Clear screen
		clearScreen();
		
		// If selected record wasn't saved then clear it
		if (form.getLocalContext().getSelectedRecordIsNotNull() && !form.getLocalContext().getSelectedRecord().getID_ClinicalOutcomeConfigIsNotNull())
			form.getLocalContext().setSelectedRecord(null);
		
		// Populate grid with search results (if valid) & selected record (edited or newly created)
		if (form.getLocalContext().getSelectedRecordIsNotNull() || form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteriaIsNotNull())
		{
			if (form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteriaIsNotNull())
			{
				ClinicalOutcomeConfigSearchVo criteria = form.getGlobalContext().ClinicalAdmin.getClinicalOutcomeConfigSearchCriteria();
				populateClinicalOutcomeGrid(domain.listClinicalOutcomes(form.getLocalContext().getSelectedRecord(), criteria.getCategory(), criteria.getSpecialty(), criteria.getClinicalOutcome(), criteria.getCode(), criteria.getActiveOnly()), true);
			}
			else
				populateClinicalOutcomeGrid(domain.listClinicalOutcomes(form.getLocalContext().getSelectedRecord(), null, null, null, null, null), false);
				
		}
		else
			populateClinicalOutcomeGrid(null, false);
		

		// Reselect latest edited item & refresh local context
		form.grdClinicalOutcomeConfigs().setValue(form.getLocalContext().getSelectedRecord());
		form.getLocalContext().setSelectedRecord(domain.getClinicalOutcome(form.grdClinicalOutcomeConfigs().getValue()));
		
		// Populate instance controls with selected action
		populateInstanceControls(form.getLocalContext().getSelectedRecord());
		
		// Set form to VIEW mode
		form.setMode(FormMode.VIEW);
	}
	
	/**
	 * Function used to prepare the screen for recording a new Clinical Output record
	 */
	public void newInstance() throws PresentationLogicException
	{
		// Clear record from local context
		form.getLocalContext().setSelectedRecord(null);
		
		// Clear grid selection
		form.grdClinicalOutcomeConfigs().setValue(null);
		
		// Clear instance controls
		clearInstanceControls();
		
		// Set default values
		form.ctnConfigDetails().chkActive().setValue(Boolean.TRUE);
		form.ctnConfigDetails().chkRecordProcedure().setValue(Boolean.TRUE);			// WDEV-12485 - Set initially as true
		
		// Set form to EDIT mode
		form.setMode(FormMode.EDIT);
	}
	
	/**
	 * Function used to prepare the screen for editing a Clinical Output record
	 */
	public void updateInstance()
	{
		// Set form to EDIT mode
		form.setMode(FormMode.EDIT);
	}

	/**
	 * Function used to save a Clinical Output record to database
	 */
	public boolean save() throws PresentationLogicException
	{
		try
		{
			// Populate record to save from screen
			form.getLocalContext().setSelectedRecord(populateDataFromInstanceControls(form.getLocalContext().getSelectedRecord()));

			// Validate record to save
			String[] errors = form.getLocalContext().getSelectedRecord().validate(validateUIRules());
			if (errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				// Prevent from saving
				return false;
			}

			// Attempt save
			form.getLocalContext().setSelectedRecord(domain.saveClinicalOutcome(form.getLocalContext().getSelectedRecord()));

			// Save successful
			return true;
		}
		// Treat any exception that might arise
		catch (DomainInterfaceException e)
		{
			engine.showMessage(e.getMessage());
			e.printStackTrace();
			return false;							// Save failed
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			e.printStackTrace();
			open();									// Refresh screen
			return false;							// Save failed
		}
		catch (ForeignKeyViolationException e)
		{
			engine.showMessage(e.getMessage());
			e.printStackTrace();
			return false;							// Save failed
		}
		catch (UniqueKeyViolationException e)
		{
			engine.showMessage(e.getMessage());
			e.printStackTrace();
			return false;							// Save failed
		}
		catch (UnqViolationUncheckedException e)
		{
			engine.showMessage("Taxonomy Code is already in use");
			e.printStackTrace();
			return false;
		}
	}
	
	public String[] validateUIRules()
	{
		List<String> uiErrors = new ArrayList<String>();
		
		if (form.ctnConfigDetails().cmbOutcomeCategory().getValue() == null && form.ctnConfigDetails().cmbOutcomeSpecialty().getValue() == null)
		{
			uiErrors.add("Please enter a Category or a Specialty.");
		}
		
		String[] uiResults = new String[uiErrors.size()];
		uiErrors.toArray(uiResults);
		
		return uiResults;
	}

	/**
	 * Function used to clear entire screen
	 */
	public void clear()
	{
		// Clear search controls
		clearSearchControls();
		
		// Clear screen (grid & instance controls)
		clearScreen();
	}

	
	/**
	 * Function used to clear search controls
	 */
	private void clearSearchControls()
	{
		form.cmbCategory().setValue(null);
		form.cmbSpecialty().setValue(null);
		form.txtClinicalOutcome().setValue(null);
		form.txtCode().setValue(null);
		form.chkActiveOnly().setValue(null);
	}

	/**
	 * Function used to clear grid and instance controls
	 */
	private void clearScreen()
	{
		// Clear grid
		form.grdClinicalOutcomeConfigs().getRows().clear();
		
		// Clear instance controls
		clearInstanceControls();
	}

	/**
	 * Function used to clear instance controls
	 */
	public void clearInstanceControls()
	{
		form.ctnConfigDetails().txtOutcome().setValue(null);
		
		form.ctnConfigDetails().chkActive().setValue(null);
		
		form.ctnConfigDetails().cmbOutcomeCategory().setValue(null);
		form.ctnConfigDetails().cmbOutcomeSpecialty().setValue(null);
		
		form.ctnConfigDetails().chkRecordProcedure().setValue(null);		// WDEV-12485 -	Remember to also clear the newly added control

		form.ctnConfigDetails().ccTaxonomy().clear();
	}
	
	
	/**
	 * Function used to update the state of controls
	 */
	public void updateControlsState()
	{
		// Set container collapsed / expanded
		form.ctnConfigDetails().setCollapsed(!FormMode.EDIT.equals(form.getMode()) && !form.getLocalContext().getSelectedRecordIsNotNull());
		
		if (FormMode.VIEW.equals(form.getMode()))
		{
			form.btnEdit().setVisible(true);
			form.btnEdit().setEnabled(form.grdClinicalOutcomeConfigs().getValue() != null);
		}
		
		form.ctnConfigDetails().ccTaxonomy().setComponentMode(form.getMode());
		
		
		// Update context menu options
		updateContextMenuState();
	}

	private void updateContextMenuState()
	{
		form.getContextMenus().RefMan.getClinicalOutcomeConfigNEWItem().setVisible(FormMode.VIEW.equals(form.getMode()));
		form.getContextMenus().RefMan.getClinicalOutcomeConfigEDITItem().setVisible(FormMode.VIEW.equals(form.getMode()) && form.grdClinicalOutcomeConfigs().getValue() != null);
	}

	
	// -----------------------------------------------------------------------------------------------------------------------------------------------------
	// Data exchange function
	// -----------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * Function used to populate Clinical Outcome records to the grid
	 */
	private void populateClinicalOutcomeGrid(ClinicalOutcomeConfigDisplayVoCollection clinicalOutcomeConfigDisplayVoCollection, Boolean showErrors)
	{
		// Clear screen
		clearScreen();
		
		// Stop if collection is null
		if (clinicalOutcomeConfigDisplayVoCollection == null || clinicalOutcomeConfigDisplayVoCollection.size() == 0)
		{
			if(Boolean.TRUE.equals(showErrors))
			{
				engine.showMessage("No records to match your criteria found", "No records", MessageButtons.OK, MessageIcon.INFORMATION);
			}
			
			return;
		}
		
		for (ClinicalOutcomeConfigDisplayVo outcome : clinicalOutcomeConfigDisplayVoCollection)
		{
			grdClinicalOutcomeConfigsRow row = form.grdClinicalOutcomeConfigs().getRows().newRow();
			
			row.setColCategory(outcome.getCategoryIsNotNull() ? outcome.getCategory().getText() : null);
			row.setColSpecialty(outcome.getSpecialtyIsNotNull() ? outcome.getSpecialty().getText() : null);
			row.setColClinicalOutcome(outcome.getClinicalOutcome());
			row.setColCode(outcome.getDisplayTaxonomy());
			row.setColActive(outcome.getIsActive());
			
			row.setValue(outcome);
		}
	}

	/**
	 * Function used to display on screen data from a Clinical Outcome record
	 * @param selectedRecord
	 */
	private void populateInstanceControls(ClinicalOutcomeConfigVo clinicalOutcome)
	{
		// Clear instance controls
		clearInstanceControls();
		
		// Stop if record is null 
		if (clinicalOutcome == null)
			return;
		
		// Set instance controls values
		form.ctnConfigDetails().txtOutcome().setValue(clinicalOutcome.getClinicalOutcome());
		
		form.ctnConfigDetails().chkActive().setValue(clinicalOutcome.getIsActive());
		form.ctnConfigDetails().cmbOutcomeCategory().setValue(clinicalOutcome.getCategory());
		form.ctnConfigDetails().cmbOutcomeSpecialty().setValue(clinicalOutcome.getSpecialty());
		form.ctnConfigDetails().chkRecordProcedure().setValue(clinicalOutcome.getRequiresProcedureLink());		// WDEV-12485 - This will allow recording ClinicalOutcomes
																												//				without a Procedure mandatory
		
		form.ctnConfigDetails().ccTaxonomy().setValue(clinicalOutcome.getCodeMappings());
	}

	/**
	 * Function used to populate a Clinical Outcome record data from screen
	 * @param selectedRecord
	 * @return
	 */
	private ClinicalOutcomeConfigVo populateDataFromInstanceControls(ClinicalOutcomeConfigVo clinicalOutcome)
	{
		// Check if Clinical Outcome record is not null
		if (clinicalOutcome == null)
			clinicalOutcome = new ClinicalOutcomeConfigVo();
		
		// Get data from screen into record
		clinicalOutcome.setClinicalOutcome(form.ctnConfigDetails().txtOutcome().getValue());
		clinicalOutcome.setIsActive(Boolean.TRUE.equals(form.ctnConfigDetails().chkActive().getValue()));
		clinicalOutcome.setCategory(form.ctnConfigDetails().cmbOutcomeCategory().getValue());
		clinicalOutcome.setSpecialty(form.ctnConfigDetails().cmbOutcomeSpecialty().getValue());
		clinicalOutcome.setRequiresProcedureLink(form.ctnConfigDetails().chkRecordProcedure().getValue());		// WDEV-12485 -	This will allow recording Clinical Outcomes
																												//				without a Procedure mandatory
		
		clinicalOutcome.setCodeMappings(form.ctnConfigDetails().ccTaxonomy().getValue());
		
		// Return selected record 
		return clinicalOutcome;
	}

	// -----------------------------------------------------------------------------------------------------------------------------------------------------
	// On screen validation functions
	// -----------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * Function used to validate the search criteria
	 */
	private boolean validSearchCriteria()
	{
		if (form.cmbCategory().getValue() == null
				&& form.cmbSpecialty().getValue() == null
				&& form.txtClinicalOutcome().getValue() == null
				&& form.txtCode().getValue() == null)
			return false;
		
		return true;
	}

}
