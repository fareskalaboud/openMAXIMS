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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.assessment.forms.structuralassessment;

import ims.framework.enumerations.FormMode;

public interface IComponent
{
	public void setMode(FormMode mode);
	public FormMode getMode();
	/**
	* setPatientAssessment
	*/
	public void setPatientAssessment(ims.assessment.vo.PatientAssessmentVo assessment);

	/**
	* getPatientAssessment
	*/
	public ims.assessment.vo.PatientAssessmentVo getPatientAssessment();

	/**
	* clearComponent
	*/
	public void clearComponent();

	public void clearComponentAndData();

	/**
	* validateData
	*/
	public String[] validateData();

	/**
	* setEnabled
	*/
	public void setEnabled(Boolean enabled);

	/**
	* setReadOnly
	*/
	public void setReadOnly(Boolean readonly);

	public void createNewPatientAssessment(ims.assessment.vo.UserAssessmentVo  userAssessment);

	public void createNewPatientAssessment(ims.assessment.vo.UserAssessmentVo  userAssessment, ims.core.vo.PatientAssessmentInfoVo patInfo);

	public void preview(ims.assessment.vo.UserAssessmentVo userAssessment);

	/**
	* setPatientAssessment
	*/
	public void setPatientAssessment(ims.assessment.vo.PatientAssessmentVo assessment, Boolean displayAnsweredOnly);

	/**
	* setPatientAssessment
	*/
	public void setPatientAssessment(ims.assessment.vo.PatientAssessmentVo assessment, Boolean displayAnsweredOnly, ims.core.vo.PatientAssessmentInfoVo patInfo);

	public void setPatientAssessment(ims.assessment.vo.Patient_AssessmentVo assessment);

	public void setPatientAssessment(ims.assessment.vo.Patient_AssessmentVo assessment, Boolean displayAnsweredOnly);

	public void setPatientAssessment(ims.assessment.vo.Patient_AssessmentVo assessment, Boolean displayAnsweredOnly, ims.core.vo.PatientAssessmentInfoVo patInfo);

	public void createNewPatientAssessment(ims.assessment.vo.User_AssessmentVo userAssessment);

	public void createNewPatientAssessment(ims.assessment.vo.User_AssessmentVo userAssessment, ims.core.vo.PatientAssessmentInfoVo patInfo);

	public ims.assessment.vo.Patient_AssessmentVo getPatient_Assessment();

	public String[] validate_Data();

	public void set_ReadOnly(Boolean readOnly);

	public void preview(ims.assessment.vo.User_AssessmentVo userAssessment);
}