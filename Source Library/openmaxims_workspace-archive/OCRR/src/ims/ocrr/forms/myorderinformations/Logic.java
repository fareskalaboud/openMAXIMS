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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.51 build 2469.26857)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.ocrr.forms.myorderinformations;

import ims.core.vo.GeneralQuestionAnswerVo;
import ims.core.vo.GeneralQuestionAnswerVoCollection;
import ims.framework.FormName;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.ocrr.configuration.vo.InvestigationRefVo;
import ims.ocrr.configuration.vo.InvestigationRefVoCollection;
import ims.ocrr.helper.MyOrderQuestionsPopulation;

public class Logic extends BaseLogic
{
	private static final long	serialVersionUID	= 1L;

	protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException
	{
		populateQuestionsInformations();//WDEV-16762

		if (form.getGlobalContext().OCRR.SelectAndOrder.getLaunchYesNoGenderDialogIsNotNull() && form.getGlobalContext().OCRR.SelectAndOrder.getLaunchYesNoGenderDialog().booleanValue())
			engine.open(form.getForms().OCRR.GenderYesNoDialog, false);// 	WDEV-16717
		if(form.getGlobalContext().OCRR.SelectAndOrder.getLaunchYesNoReOrderDialogIsNotNull() && form.getGlobalContext().OCRR.SelectAndOrder.getLaunchYesNoReOrderDialog().booleanValue())// 	WDEV-16648
			engine.open(form.getForms().OCRR.YesNoDialogWithReason, false);// 	WDEV-16703
	}

	//WDEV-16762
	private void populateQuestionsInformations() 
	{
		MyOrderQuestionsPopulation helper = new MyOrderQuestionsPopulation();
		helper.setGridQuestions(form.dyngrdInformations());
		helper.setInfoImage(form.getImages().OCRR.Information);
		helper.setQuestionOrInformation("Information");
		helper.populateQuestionInformation(form.getGlobalContext().OCRR.getMyOrderInformations());//WDEV-16762
	}

	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException
	{
		//WDEV-16762
		if(form.getGlobalContext().OCRR.getRefusedInvestigation() != null && form.getGlobalContext().OCRR.getRefusedInvestigation().size() > 0)
		{
			removeQuestionsInformations();
			
			if(form.getGlobalContext().OCRR.getMyOrderInformations() == null || form.getGlobalContext().OCRR.getMyOrderInformations().size() == 0)
			{
				engine.close(result);
				return;
			}
			
			populateQuestionsInformations();
		}
		
		form.getLocalContext().setYesNoResult(result);
	}

	//WDEV-16762
	private void removeQuestionsInformations() 
	{
		GeneralQuestionAnswerVoCollection questions = form.getGlobalContext().OCRR.getMyOrderInformations();
		
		if(questions == null || questions.size() == 0)
			return;
		
		for(int i = questions.size() - 1; i >= 0; i--)
		{
			if(questions.get(i) == null || questions.get(i).getItemId() == null)
				continue;
			
			if(itemIdIsInRefusedList(questions.get(i)))
			{
				questions.remove(questions.get(i));
			}
		}
	}

	//WDEV-16762
	private boolean itemIdIsInRefusedList(GeneralQuestionAnswerVo generalQuestionAnswerVo) 
	{
		if(generalQuestionAnswerVo == null || generalQuestionAnswerVo.getItemId() == null)
			return false;
		
		InvestigationRefVoCollection refusedInv = form.getGlobalContext().OCRR.getRefusedInvestigation();
		
		if(refusedInv == null || refusedInv.size() == 0)
			return false;
		
		for(InvestigationRefVo inv : refusedInv)
		{
			if(inv == null)
				continue;
				
			if(inv.getID_Investigation().equals(generalQuestionAnswerVo.getItemId()) || inv.getID_Investigation().equals(generalQuestionAnswerVo.getParentid()))
				return true;
		}
		
		return false;
	}

	protected void onBtnCloseClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (form.getLocalContext().getYesNoResultIsNotNull())
			engine.close(form.getLocalContext().getYesNoResult());
		else
			engine.close(DialogResult.OK);
	}
}