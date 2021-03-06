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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class PreAssessmentOutcomeVoBean extends ims.vo.ValueObjectBean
{
	public PreAssessmentOutcomeVoBean()
	{
	}
	public PreAssessmentOutcomeVoBean(ims.RefMan.vo.PreAssessmentOutcomeVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.recordinginformation = vo.getRecordingInformation() == null ? null : (ims.RefMan.vo.beans.RecordingUserInformationForPreassessOutCVoBean)vo.getRecordingInformation().getBean();
		this.lastupdatinginformation = vo.getLastUpdatingInformation() == null ? null : (ims.RefMan.vo.beans.RecordingUserInformationForPreassessOutCVoBean)vo.getLastUpdatingInformation().getBean();
		this.primaryprocedure = vo.getPrimaryProcedure() == null ? null : new ims.vo.RefVoBean(vo.getPrimaryProcedure().getBoId(), vo.getPrimaryProcedure().getBoVersion());
		this.proceduredescription = vo.getProcedureDescription();
		this.proclaterality = vo.getProcLaterality() == null ? null : (ims.vo.LookupInstanceBean)vo.getProcLaterality().getBean();
		this.anaesthetictype = vo.getAnaestheticType() == null ? null : (ims.vo.LookupInstanceBean)vo.getAnaestheticType().getBean();
		this.secondaryprocedure = vo.getSecondaryProcedure() == null ? null : new ims.vo.RefVoBean(vo.getSecondaryProcedure().getBoId(), vo.getSecondaryProcedure().getBoVersion());
		this.secondarydescription = vo.getSecondaryDescription();
		this.secondaryproclaterality = vo.getSecondaryProcLaterality() == null ? null : (ims.vo.LookupInstanceBean)vo.getSecondaryProcLaterality().getBean();
		this.metrics = vo.getMetrics() == null ? null : (ims.RefMan.vo.beans.VSMetricsForPreassesOutcVoBean)vo.getMetrics().getBean();
		this.patientdiabetic = vo.getPatientDiabetic() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientDiabetic().getBean();
		this.pacemakerdefib = vo.getPaceMakerDefib() == null ? null : (ims.vo.LookupInstanceBean)vo.getPaceMakerDefib().getBean();
		this.pacemakertype = vo.getPaceMakerType() == null ? null : (ims.vo.LookupInstanceBean)vo.getPaceMakerType().getBean();
		this.datelastcheckpacemaker = vo.getDateLastCheckPacemaker() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateLastCheckPacemaker().getBean();
		this.receivinganticoag = vo.getReceivingAntiCoag() == null ? null : (ims.vo.LookupInstanceBean)vo.getReceivingAntiCoag().getBean();
		this.therapyaction = vo.getTherapyAction() == null ? null : (ims.vo.LookupInstanceBean)vo.getTherapyAction().getBean();
		this.mobilityconsideration = vo.getMobilityConsideration();
		this.mobilitycomment = vo.getMobilityComment();
		this.electricbedneeded = vo.getElectricBedNeeded();
		this.shortnotice = vo.getShortNotice();
		this.noticeperiodvalue = vo.getNoticePeriodValue();
		this.noticeperiodtype = vo.getNoticePeriodType() == null ? null : (ims.vo.LookupInstanceBean)vo.getNoticePeriodType().getBean();
		this.preopovernight = vo.getPreOpOvernight();
		this.nights = vo.getNights();
		this.postopstay = vo.getPostOpStay();
		this.theatretype = vo.getTheatreType() == null ? null : (ims.vo.LookupInstanceBean)vo.getTheatreType().getBean();
		this.postopcomments = vo.getPostOpComments();
		this.senioranaestrequired = vo.getSeniorAnaestRequired();
		this.senioranaestcomments = vo.getSeniorAnaestComments();
		this.criticalcarebedrequired = vo.getCriticalCareBedRequired();
		this.hducriticalcarebed = vo.getHduCriticalCareBed();
		this.itucriticalcarebed = vo.getItuCriticalCareBed();
		this.anaesthetichazards = vo.getAnaestheticHazards() == null ? null : vo.getAnaestheticHazards().getBeanCollection();
		this.waitingfordetails = vo.getWaitingForDetails() == null ? null : vo.getWaitingForDetails().getBeanCollection();
		this.detailsoutstanding = vo.getDetailsOutstanding();
		this.crossmatchrequired = vo.getCrossmatchRequired();
		this.crossmatchcomments = vo.getCrossmatchComments();
		this.fittoproceed = vo.getFitToProceed();
		this.generalcomments = vo.getGeneralComments();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.PreAssessmentOutcomeVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.recordinginformation = vo.getRecordingInformation() == null ? null : (ims.RefMan.vo.beans.RecordingUserInformationForPreassessOutCVoBean)vo.getRecordingInformation().getBean(map);
		this.lastupdatinginformation = vo.getLastUpdatingInformation() == null ? null : (ims.RefMan.vo.beans.RecordingUserInformationForPreassessOutCVoBean)vo.getLastUpdatingInformation().getBean(map);
		this.primaryprocedure = vo.getPrimaryProcedure() == null ? null : new ims.vo.RefVoBean(vo.getPrimaryProcedure().getBoId(), vo.getPrimaryProcedure().getBoVersion());
		this.proceduredescription = vo.getProcedureDescription();
		this.proclaterality = vo.getProcLaterality() == null ? null : (ims.vo.LookupInstanceBean)vo.getProcLaterality().getBean();
		this.anaesthetictype = vo.getAnaestheticType() == null ? null : (ims.vo.LookupInstanceBean)vo.getAnaestheticType().getBean();
		this.secondaryprocedure = vo.getSecondaryProcedure() == null ? null : new ims.vo.RefVoBean(vo.getSecondaryProcedure().getBoId(), vo.getSecondaryProcedure().getBoVersion());
		this.secondarydescription = vo.getSecondaryDescription();
		this.secondaryproclaterality = vo.getSecondaryProcLaterality() == null ? null : (ims.vo.LookupInstanceBean)vo.getSecondaryProcLaterality().getBean();
		this.metrics = vo.getMetrics() == null ? null : (ims.RefMan.vo.beans.VSMetricsForPreassesOutcVoBean)vo.getMetrics().getBean(map);
		this.patientdiabetic = vo.getPatientDiabetic() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientDiabetic().getBean();
		this.pacemakerdefib = vo.getPaceMakerDefib() == null ? null : (ims.vo.LookupInstanceBean)vo.getPaceMakerDefib().getBean();
		this.pacemakertype = vo.getPaceMakerType() == null ? null : (ims.vo.LookupInstanceBean)vo.getPaceMakerType().getBean();
		this.datelastcheckpacemaker = vo.getDateLastCheckPacemaker() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateLastCheckPacemaker().getBean();
		this.receivinganticoag = vo.getReceivingAntiCoag() == null ? null : (ims.vo.LookupInstanceBean)vo.getReceivingAntiCoag().getBean();
		this.therapyaction = vo.getTherapyAction() == null ? null : (ims.vo.LookupInstanceBean)vo.getTherapyAction().getBean();
		this.mobilityconsideration = vo.getMobilityConsideration();
		this.mobilitycomment = vo.getMobilityComment();
		this.electricbedneeded = vo.getElectricBedNeeded();
		this.shortnotice = vo.getShortNotice();
		this.noticeperiodvalue = vo.getNoticePeriodValue();
		this.noticeperiodtype = vo.getNoticePeriodType() == null ? null : (ims.vo.LookupInstanceBean)vo.getNoticePeriodType().getBean();
		this.preopovernight = vo.getPreOpOvernight();
		this.nights = vo.getNights();
		this.postopstay = vo.getPostOpStay();
		this.theatretype = vo.getTheatreType() == null ? null : (ims.vo.LookupInstanceBean)vo.getTheatreType().getBean();
		this.postopcomments = vo.getPostOpComments();
		this.senioranaestrequired = vo.getSeniorAnaestRequired();
		this.senioranaestcomments = vo.getSeniorAnaestComments();
		this.criticalcarebedrequired = vo.getCriticalCareBedRequired();
		this.hducriticalcarebed = vo.getHduCriticalCareBed();
		this.itucriticalcarebed = vo.getItuCriticalCareBed();
		this.anaesthetichazards = vo.getAnaestheticHazards() == null ? null : vo.getAnaestheticHazards().getBeanCollection();
		this.waitingfordetails = vo.getWaitingForDetails() == null ? null : vo.getWaitingForDetails().getBeanCollection();
		this.detailsoutstanding = vo.getDetailsOutstanding();
		this.crossmatchrequired = vo.getCrossmatchRequired();
		this.crossmatchcomments = vo.getCrossmatchComments();
		this.fittoproceed = vo.getFitToProceed();
		this.generalcomments = vo.getGeneralComments();
	}

	public ims.RefMan.vo.PreAssessmentOutcomeVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.PreAssessmentOutcomeVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.PreAssessmentOutcomeVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.PreAssessmentOutcomeVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.PreAssessmentOutcomeVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.RefMan.vo.beans.RecordingUserInformationForPreassessOutCVoBean getRecordingInformation()
	{
		return this.recordinginformation;
	}
	public void setRecordingInformation(ims.RefMan.vo.beans.RecordingUserInformationForPreassessOutCVoBean value)
	{
		this.recordinginformation = value;
	}
	public ims.RefMan.vo.beans.RecordingUserInformationForPreassessOutCVoBean getLastUpdatingInformation()
	{
		return this.lastupdatinginformation;
	}
	public void setLastUpdatingInformation(ims.RefMan.vo.beans.RecordingUserInformationForPreassessOutCVoBean value)
	{
		this.lastupdatinginformation = value;
	}
	public ims.vo.RefVoBean getPrimaryProcedure()
	{
		return this.primaryprocedure;
	}
	public void setPrimaryProcedure(ims.vo.RefVoBean value)
	{
		this.primaryprocedure = value;
	}
	public String getProcedureDescription()
	{
		return this.proceduredescription;
	}
	public void setProcedureDescription(String value)
	{
		this.proceduredescription = value;
	}
	public ims.vo.LookupInstanceBean getProcLaterality()
	{
		return this.proclaterality;
	}
	public void setProcLaterality(ims.vo.LookupInstanceBean value)
	{
		this.proclaterality = value;
	}
	public ims.vo.LookupInstanceBean getAnaestheticType()
	{
		return this.anaesthetictype;
	}
	public void setAnaestheticType(ims.vo.LookupInstanceBean value)
	{
		this.anaesthetictype = value;
	}
	public ims.vo.RefVoBean getSecondaryProcedure()
	{
		return this.secondaryprocedure;
	}
	public void setSecondaryProcedure(ims.vo.RefVoBean value)
	{
		this.secondaryprocedure = value;
	}
	public String getSecondaryDescription()
	{
		return this.secondarydescription;
	}
	public void setSecondaryDescription(String value)
	{
		this.secondarydescription = value;
	}
	public ims.vo.LookupInstanceBean getSecondaryProcLaterality()
	{
		return this.secondaryproclaterality;
	}
	public void setSecondaryProcLaterality(ims.vo.LookupInstanceBean value)
	{
		this.secondaryproclaterality = value;
	}
	public ims.RefMan.vo.beans.VSMetricsForPreassesOutcVoBean getMetrics()
	{
		return this.metrics;
	}
	public void setMetrics(ims.RefMan.vo.beans.VSMetricsForPreassesOutcVoBean value)
	{
		this.metrics = value;
	}
	public ims.vo.LookupInstanceBean getPatientDiabetic()
	{
		return this.patientdiabetic;
	}
	public void setPatientDiabetic(ims.vo.LookupInstanceBean value)
	{
		this.patientdiabetic = value;
	}
	public ims.vo.LookupInstanceBean getPaceMakerDefib()
	{
		return this.pacemakerdefib;
	}
	public void setPaceMakerDefib(ims.vo.LookupInstanceBean value)
	{
		this.pacemakerdefib = value;
	}
	public ims.vo.LookupInstanceBean getPaceMakerType()
	{
		return this.pacemakertype;
	}
	public void setPaceMakerType(ims.vo.LookupInstanceBean value)
	{
		this.pacemakertype = value;
	}
	public ims.framework.utils.beans.DateBean getDateLastCheckPacemaker()
	{
		return this.datelastcheckpacemaker;
	}
	public void setDateLastCheckPacemaker(ims.framework.utils.beans.DateBean value)
	{
		this.datelastcheckpacemaker = value;
	}
	public ims.vo.LookupInstanceBean getReceivingAntiCoag()
	{
		return this.receivinganticoag;
	}
	public void setReceivingAntiCoag(ims.vo.LookupInstanceBean value)
	{
		this.receivinganticoag = value;
	}
	public ims.vo.LookupInstanceBean getTherapyAction()
	{
		return this.therapyaction;
	}
	public void setTherapyAction(ims.vo.LookupInstanceBean value)
	{
		this.therapyaction = value;
	}
	public Boolean getMobilityConsideration()
	{
		return this.mobilityconsideration;
	}
	public void setMobilityConsideration(Boolean value)
	{
		this.mobilityconsideration = value;
	}
	public String getMobilityComment()
	{
		return this.mobilitycomment;
	}
	public void setMobilityComment(String value)
	{
		this.mobilitycomment = value;
	}
	public Boolean getElectricBedNeeded()
	{
		return this.electricbedneeded;
	}
	public void setElectricBedNeeded(Boolean value)
	{
		this.electricbedneeded = value;
	}
	public Boolean getShortNotice()
	{
		return this.shortnotice;
	}
	public void setShortNotice(Boolean value)
	{
		this.shortnotice = value;
	}
	public Integer getNoticePeriodValue()
	{
		return this.noticeperiodvalue;
	}
	public void setNoticePeriodValue(Integer value)
	{
		this.noticeperiodvalue = value;
	}
	public ims.vo.LookupInstanceBean getNoticePeriodType()
	{
		return this.noticeperiodtype;
	}
	public void setNoticePeriodType(ims.vo.LookupInstanceBean value)
	{
		this.noticeperiodtype = value;
	}
	public Boolean getPreOpOvernight()
	{
		return this.preopovernight;
	}
	public void setPreOpOvernight(Boolean value)
	{
		this.preopovernight = value;
	}
	public Integer getNights()
	{
		return this.nights;
	}
	public void setNights(Integer value)
	{
		this.nights = value;
	}
	public Integer getPostOpStay()
	{
		return this.postopstay;
	}
	public void setPostOpStay(Integer value)
	{
		this.postopstay = value;
	}
	public ims.vo.LookupInstanceBean getTheatreType()
	{
		return this.theatretype;
	}
	public void setTheatreType(ims.vo.LookupInstanceBean value)
	{
		this.theatretype = value;
	}
	public String getPostOpComments()
	{
		return this.postopcomments;
	}
	public void setPostOpComments(String value)
	{
		this.postopcomments = value;
	}
	public Boolean getSeniorAnaestRequired()
	{
		return this.senioranaestrequired;
	}
	public void setSeniorAnaestRequired(Boolean value)
	{
		this.senioranaestrequired = value;
	}
	public String getSeniorAnaestComments()
	{
		return this.senioranaestcomments;
	}
	public void setSeniorAnaestComments(String value)
	{
		this.senioranaestcomments = value;
	}
	public Boolean getCriticalCareBedRequired()
	{
		return this.criticalcarebedrequired;
	}
	public void setCriticalCareBedRequired(Boolean value)
	{
		this.criticalcarebedrequired = value;
	}
	public Boolean getHduCriticalCareBed()
	{
		return this.hducriticalcarebed;
	}
	public void setHduCriticalCareBed(Boolean value)
	{
		this.hducriticalcarebed = value;
	}
	public Boolean getItuCriticalCareBed()
	{
		return this.itucriticalcarebed;
	}
	public void setItuCriticalCareBed(Boolean value)
	{
		this.itucriticalcarebed = value;
	}
	public ims.core.vo.beans.PatientAlertLiteVoBean[] getAnaestheticHazards()
	{
		return this.anaesthetichazards;
	}
	public void setAnaestheticHazards(ims.core.vo.beans.PatientAlertLiteVoBean[] value)
	{
		this.anaesthetichazards = value;
	}
	public ims.RefMan.vo.beans.PreAssessmentInformationVoBean[] getWaitingForDetails()
	{
		return this.waitingfordetails;
	}
	public void setWaitingForDetails(ims.RefMan.vo.beans.PreAssessmentInformationVoBean[] value)
	{
		this.waitingfordetails = value;
	}
	public Boolean getDetailsOutstanding()
	{
		return this.detailsoutstanding;
	}
	public void setDetailsOutstanding(Boolean value)
	{
		this.detailsoutstanding = value;
	}
	public Boolean getCrossmatchRequired()
	{
		return this.crossmatchrequired;
	}
	public void setCrossmatchRequired(Boolean value)
	{
		this.crossmatchrequired = value;
	}
	public String getCrossmatchComments()
	{
		return this.crossmatchcomments;
	}
	public void setCrossmatchComments(String value)
	{
		this.crossmatchcomments = value;
	}
	public Boolean getFitToProceed()
	{
		return this.fittoproceed;
	}
	public void setFitToProceed(Boolean value)
	{
		this.fittoproceed = value;
	}
	public String getGeneralComments()
	{
		return this.generalcomments;
	}
	public void setGeneralComments(String value)
	{
		this.generalcomments = value;
	}

	private Integer id;
	private int version;
	private ims.RefMan.vo.beans.RecordingUserInformationForPreassessOutCVoBean recordinginformation;
	private ims.RefMan.vo.beans.RecordingUserInformationForPreassessOutCVoBean lastupdatinginformation;
	private ims.vo.RefVoBean primaryprocedure;
	private String proceduredescription;
	private ims.vo.LookupInstanceBean proclaterality;
	private ims.vo.LookupInstanceBean anaesthetictype;
	private ims.vo.RefVoBean secondaryprocedure;
	private String secondarydescription;
	private ims.vo.LookupInstanceBean secondaryproclaterality;
	private ims.RefMan.vo.beans.VSMetricsForPreassesOutcVoBean metrics;
	private ims.vo.LookupInstanceBean patientdiabetic;
	private ims.vo.LookupInstanceBean pacemakerdefib;
	private ims.vo.LookupInstanceBean pacemakertype;
	private ims.framework.utils.beans.DateBean datelastcheckpacemaker;
	private ims.vo.LookupInstanceBean receivinganticoag;
	private ims.vo.LookupInstanceBean therapyaction;
	private Boolean mobilityconsideration;
	private String mobilitycomment;
	private Boolean electricbedneeded;
	private Boolean shortnotice;
	private Integer noticeperiodvalue;
	private ims.vo.LookupInstanceBean noticeperiodtype;
	private Boolean preopovernight;
	private Integer nights;
	private Integer postopstay;
	private ims.vo.LookupInstanceBean theatretype;
	private String postopcomments;
	private Boolean senioranaestrequired;
	private String senioranaestcomments;
	private Boolean criticalcarebedrequired;
	private Boolean hducriticalcarebed;
	private Boolean itucriticalcarebed;
	private ims.core.vo.beans.PatientAlertLiteVoBean[] anaesthetichazards;
	private ims.RefMan.vo.beans.PreAssessmentInformationVoBean[] waitingfordetails;
	private Boolean detailsoutstanding;
	private Boolean crossmatchrequired;
	private String crossmatchcomments;
	private Boolean fittoproceed;
	private String generalcomments;
}
