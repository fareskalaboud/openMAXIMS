// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class IFCATSExternalEventVoBean extends ims.vo.ValueObjectBean
{
	public IFCATSExternalEventVoBean()
	{
	}
	public IFCATSExternalEventVoBean(ims.RefMan.vo.IFCATSExternalEventVo vo)
	{
		this.appointmentid = vo.getAppointmentID();
		this.referralid = vo.getReferralID();
		this.transportarranged = vo.getTransportArranged();
		this.interperterrequired = vo.getInterperterRequired();
		this.commentsontransport = vo.getCommentsOnTransport();
		this.documenttype = vo.getDocumentType();
		this.documentformat = vo.getDocumentFormat();
		this.startdatetime = vo.getStartDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getStartDateTime().getBean();
		this.enddatetime = vo.getEndDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEndDateTime().getBean();
		this.orderid = vo.getOrderID();
		this.eventtype = vo.getEventType();
		this.documentpath = vo.getDocumentPath();
		this.appointmentstatuscode = vo.getAppointmentStatusCode();
		this.appointmentstatuscomment = vo.getAppointmentStatusComment();
		this.appointmentlocationcode = vo.getAppointmentLocationCode();
		this.appointmentparentlocationcode = vo.getAppointmentParentLocationCode();
		this.ubrn = vo.getUBRN();
		this.referralcreationdate = vo.getReferralCreationDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getReferralCreationDate().getBean();
		this.practicename = vo.getPracticeName();
		this.practicecode = vo.getPracticeCode();
		this.practiceaddress = vo.getPracticeAddress() == null ? null : (ims.core.vo.beans.PersonAddressBean)vo.getPracticeAddress().getBean();
		this.contracttype = vo.getContractType() == null ? null : (ims.vo.LookupInstanceBean)vo.getContractType().getBean();
		this.contractid = vo.getContractId();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.IFCATSExternalEventVo vo)
	{
		this.appointmentid = vo.getAppointmentID();
		this.referralid = vo.getReferralID();
		this.transportarranged = vo.getTransportArranged();
		this.interperterrequired = vo.getInterperterRequired();
		this.commentsontransport = vo.getCommentsOnTransport();
		this.documenttype = vo.getDocumentType();
		this.documentformat = vo.getDocumentFormat();
		this.startdatetime = vo.getStartDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getStartDateTime().getBean();
		this.enddatetime = vo.getEndDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEndDateTime().getBean();
		this.orderid = vo.getOrderID();
		this.eventtype = vo.getEventType();
		this.documentpath = vo.getDocumentPath();
		this.appointmentstatuscode = vo.getAppointmentStatusCode();
		this.appointmentstatuscomment = vo.getAppointmentStatusComment();
		this.appointmentlocationcode = vo.getAppointmentLocationCode();
		this.appointmentparentlocationcode = vo.getAppointmentParentLocationCode();
		this.ubrn = vo.getUBRN();
		this.referralcreationdate = vo.getReferralCreationDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getReferralCreationDate().getBean();
		this.practicename = vo.getPracticeName();
		this.practicecode = vo.getPracticeCode();
		this.practiceaddress = vo.getPracticeAddress() == null ? null : (ims.core.vo.beans.PersonAddressBean)vo.getPracticeAddress().getBean(map);
		this.contracttype = vo.getContractType() == null ? null : (ims.vo.LookupInstanceBean)vo.getContractType().getBean();
		this.contractid = vo.getContractId();
	}

	public ims.RefMan.vo.IFCATSExternalEventVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.IFCATSExternalEventVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.IFCATSExternalEventVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.IFCATSExternalEventVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.IFCATSExternalEventVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public String getAppointmentID()
	{
		return this.appointmentid;
	}
	public void setAppointmentID(String value)
	{
		this.appointmentid = value;
	}
	public String getReferralID()
	{
		return this.referralid;
	}
	public void setReferralID(String value)
	{
		this.referralid = value;
	}
	public String getTransportArranged()
	{
		return this.transportarranged;
	}
	public void setTransportArranged(String value)
	{
		this.transportarranged = value;
	}
	public String getInterperterRequired()
	{
		return this.interperterrequired;
	}
	public void setInterperterRequired(String value)
	{
		this.interperterrequired = value;
	}
	public String getCommentsOnTransport()
	{
		return this.commentsontransport;
	}
	public void setCommentsOnTransport(String value)
	{
		this.commentsontransport = value;
	}
	public String getDocumentType()
	{
		return this.documenttype;
	}
	public void setDocumentType(String value)
	{
		this.documenttype = value;
	}
	public String getDocumentFormat()
	{
		return this.documentformat;
	}
	public void setDocumentFormat(String value)
	{
		this.documentformat = value;
	}
	public ims.framework.utils.beans.DateTimeBean getStartDateTime()
	{
		return this.startdatetime;
	}
	public void setStartDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.startdatetime = value;
	}
	public ims.framework.utils.beans.DateTimeBean getEndDateTime()
	{
		return this.enddatetime;
	}
	public void setEndDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.enddatetime = value;
	}
	public String getOrderID()
	{
		return this.orderid;
	}
	public void setOrderID(String value)
	{
		this.orderid = value;
	}
	public String getEventType()
	{
		return this.eventtype;
	}
	public void setEventType(String value)
	{
		this.eventtype = value;
	}
	public String getDocumentPath()
	{
		return this.documentpath;
	}
	public void setDocumentPath(String value)
	{
		this.documentpath = value;
	}
	public String getAppointmentStatusCode()
	{
		return this.appointmentstatuscode;
	}
	public void setAppointmentStatusCode(String value)
	{
		this.appointmentstatuscode = value;
	}
	public String getAppointmentStatusComment()
	{
		return this.appointmentstatuscomment;
	}
	public void setAppointmentStatusComment(String value)
	{
		this.appointmentstatuscomment = value;
	}
	public String getAppointmentLocationCode()
	{
		return this.appointmentlocationcode;
	}
	public void setAppointmentLocationCode(String value)
	{
		this.appointmentlocationcode = value;
	}
	public String getAppointmentParentLocationCode()
	{
		return this.appointmentparentlocationcode;
	}
	public void setAppointmentParentLocationCode(String value)
	{
		this.appointmentparentlocationcode = value;
	}
	public String getUBRN()
	{
		return this.ubrn;
	}
	public void setUBRN(String value)
	{
		this.ubrn = value;
	}
	public ims.framework.utils.beans.DateTimeBean getReferralCreationDate()
	{
		return this.referralcreationdate;
	}
	public void setReferralCreationDate(ims.framework.utils.beans.DateTimeBean value)
	{
		this.referralcreationdate = value;
	}
	public String getPracticeName()
	{
		return this.practicename;
	}
	public void setPracticeName(String value)
	{
		this.practicename = value;
	}
	public String getPracticeCode()
	{
		return this.practicecode;
	}
	public void setPracticeCode(String value)
	{
		this.practicecode = value;
	}
	public ims.core.vo.beans.PersonAddressBean getPracticeAddress()
	{
		return this.practiceaddress;
	}
	public void setPracticeAddress(ims.core.vo.beans.PersonAddressBean value)
	{
		this.practiceaddress = value;
	}
	public ims.vo.LookupInstanceBean getContractType()
	{
		return this.contracttype;
	}
	public void setContractType(ims.vo.LookupInstanceBean value)
	{
		this.contracttype = value;
	}
	public String getContractId()
	{
		return this.contractid;
	}
	public void setContractId(String value)
	{
		this.contractid = value;
	}

	private String appointmentid;
	private String referralid;
	private String transportarranged;
	private String interperterrequired;
	private String commentsontransport;
	private String documenttype;
	private String documentformat;
	private ims.framework.utils.beans.DateTimeBean startdatetime;
	private ims.framework.utils.beans.DateTimeBean enddatetime;
	private String orderid;
	private String eventtype;
	private String documentpath;
	private String appointmentstatuscode;
	private String appointmentstatuscomment;
	private String appointmentlocationcode;
	private String appointmentparentlocationcode;
	private String ubrn;
	private ims.framework.utils.beans.DateTimeBean referralcreationdate;
	private String practicename;
	private String practicecode;
	private ims.core.vo.beans.PersonAddressBean practiceaddress;
	private ims.vo.LookupInstanceBean contracttype;
	private String contractid;
}