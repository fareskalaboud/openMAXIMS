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

package ims.scheduling.vo;

/**
 * Linked to Scheduling.Booking_Appointment business object (ID: 1055100007).
 */
public class BookingAppointmentForLinkedAppointmentsVo extends ims.scheduling.vo.Booking_AppointmentRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public BookingAppointmentForLinkedAppointmentsVo()
	{
	}
	public BookingAppointmentForLinkedAppointmentsVo(Integer id, int version)
	{
		super(id, version);
	}
	public BookingAppointmentForLinkedAppointmentsVo(ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.appointmentdate = bean.getAppointmentDate() == null ? null : bean.getAppointmentDate().buildDate();
		this.apptstarttime = bean.getApptStartTime() == null ? null : bean.getApptStartTime().buildTime();
		this.apptendtime = bean.getApptEndTime() == null ? null : bean.getApptEndTime().buildTime();
		this.apptstatus = bean.getApptStatus() == null ? null : ims.scheduling.vo.lookups.Status_Reason.buildLookup(bean.getApptStatus());
		this.session = bean.getSession() == null ? null : bean.getSession().buildVo();
		this.linkedappointments = ims.scheduling.vo.BookingAppointmentForLinkedAppointmentsVoCollection.buildFromBeanCollection(bean.getLinkedAppointments());
		this.sessionslot = bean.getSessionSlot() == null ? null : new ims.scheduling.vo.Session_SlotRefVo(new Integer(bean.getSessionSlot().getId()), bean.getSessionSlot().getVersion());
		this.parentchildslot = bean.getParentChildSlot() == null ? null : new ims.scheduling.vo.SessionParentChildSlotRefVo(new Integer(bean.getParentChildSlot().getId()), bean.getParentChildSlot().getVersion());
		this.activity = bean.getActivity() == null ? null : bean.getActivity().buildVo();
		this.firstconsultationactivity = bean.getFirstConsultationActivity();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.appointmentdate = bean.getAppointmentDate() == null ? null : bean.getAppointmentDate().buildDate();
		this.apptstarttime = bean.getApptStartTime() == null ? null : bean.getApptStartTime().buildTime();
		this.apptendtime = bean.getApptEndTime() == null ? null : bean.getApptEndTime().buildTime();
		this.apptstatus = bean.getApptStatus() == null ? null : ims.scheduling.vo.lookups.Status_Reason.buildLookup(bean.getApptStatus());
		this.session = bean.getSession() == null ? null : bean.getSession().buildVo(map);
		this.linkedappointments = ims.scheduling.vo.BookingAppointmentForLinkedAppointmentsVoCollection.buildFromBeanCollection(bean.getLinkedAppointments());
		this.sessionslot = bean.getSessionSlot() == null ? null : new ims.scheduling.vo.Session_SlotRefVo(new Integer(bean.getSessionSlot().getId()), bean.getSessionSlot().getVersion());
		this.parentchildslot = bean.getParentChildSlot() == null ? null : new ims.scheduling.vo.SessionParentChildSlotRefVo(new Integer(bean.getParentChildSlot().getId()), bean.getParentChildSlot().getVersion());
		this.activity = bean.getActivity() == null ? null : bean.getActivity().buildVo(map);
		this.firstconsultationactivity = bean.getFirstConsultationActivity();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean bean = null;
		if(map != null)
			bean = (ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("APPOINTMENTDATE"))
			return getAppointmentDate();
		if(fieldName.equals("APPTSTARTTIME"))
			return getApptStartTime();
		if(fieldName.equals("APPTENDTIME"))
			return getApptEndTime();
		if(fieldName.equals("APPTSTATUS"))
			return getApptStatus();
		if(fieldName.equals("SESSION"))
			return getSession();
		if(fieldName.equals("LINKEDAPPOINTMENTS"))
			return getLinkedAppointments();
		if(fieldName.equals("SESSIONSLOT"))
			return getSessionSlot();
		if(fieldName.equals("PARENTCHILDSLOT"))
			return getParentChildSlot();
		if(fieldName.equals("ACTIVITY"))
			return getActivity();
		if(fieldName.equals("FIRSTCONSULTATIONACTIVITY"))
			return getFirstConsultationActivity();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAppointmentDateIsNotNull()
	{
		return this.appointmentdate != null;
	}
	public ims.framework.utils.Date getAppointmentDate()
	{
		return this.appointmentdate;
	}
	public void setAppointmentDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.appointmentdate = value;
	}
	public boolean getApptStartTimeIsNotNull()
	{
		return this.apptstarttime != null;
	}
	public ims.framework.utils.Time getApptStartTime()
	{
		return this.apptstarttime;
	}
	public void setApptStartTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.apptstarttime = value;
	}
	public boolean getApptEndTimeIsNotNull()
	{
		return this.apptendtime != null;
	}
	public ims.framework.utils.Time getApptEndTime()
	{
		return this.apptendtime;
	}
	public void setApptEndTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.apptendtime = value;
	}
	public boolean getApptStatusIsNotNull()
	{
		return this.apptstatus != null;
	}
	public ims.scheduling.vo.lookups.Status_Reason getApptStatus()
	{
		return this.apptstatus;
	}
	public void setApptStatus(ims.scheduling.vo.lookups.Status_Reason value)
	{
		this.isValidated = false;
		this.apptstatus = value;
	}
	public boolean getSessionIsNotNull()
	{
		return this.session != null;
	}
	public ims.scheduling.vo.SessionForAppLinkedVo getSession()
	{
		return this.session;
	}
	public void setSession(ims.scheduling.vo.SessionForAppLinkedVo value)
	{
		this.isValidated = false;
		this.session = value;
	}
	public boolean getLinkedAppointmentsIsNotNull()
	{
		return this.linkedappointments != null;
	}
	public ims.scheduling.vo.BookingAppointmentForLinkedAppointmentsVoCollection getLinkedAppointments()
	{
		return this.linkedappointments;
	}
	public void setLinkedAppointments(ims.scheduling.vo.BookingAppointmentForLinkedAppointmentsVoCollection value)
	{
		this.isValidated = false;
		this.linkedappointments = value;
	}
	public boolean getSessionSlotIsNotNull()
	{
		return this.sessionslot != null;
	}
	public ims.scheduling.vo.Session_SlotRefVo getSessionSlot()
	{
		return this.sessionslot;
	}
	public void setSessionSlot(ims.scheduling.vo.Session_SlotRefVo value)
	{
		this.isValidated = false;
		this.sessionslot = value;
	}
	public boolean getParentChildSlotIsNotNull()
	{
		return this.parentchildslot != null;
	}
	public ims.scheduling.vo.SessionParentChildSlotRefVo getParentChildSlot()
	{
		return this.parentchildslot;
	}
	public void setParentChildSlot(ims.scheduling.vo.SessionParentChildSlotRefVo value)
	{
		this.isValidated = false;
		this.parentchildslot = value;
	}
	public boolean getActivityIsNotNull()
	{
		return this.activity != null;
	}
	public ims.core.vo.ActivityLiteVo getActivity()
	{
		return this.activity;
	}
	public void setActivity(ims.core.vo.ActivityLiteVo value)
	{
		this.isValidated = false;
		this.activity = value;
	}
	public boolean getFirstConsultationActivityIsNotNull()
	{
		return this.firstconsultationactivity != null;
	}
	public Boolean getFirstConsultationActivity()
	{
		return this.firstconsultationactivity;
	}
	public void setFirstConsultationActivity(Boolean value)
	{
		this.isValidated = false;
		this.firstconsultationactivity = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		BookingAppointmentForLinkedAppointmentsVo clone = new BookingAppointmentForLinkedAppointmentsVo(this.id, this.version);
		
		if(this.appointmentdate == null)
			clone.appointmentdate = null;
		else
			clone.appointmentdate = (ims.framework.utils.Date)this.appointmentdate.clone();
		if(this.apptstarttime == null)
			clone.apptstarttime = null;
		else
			clone.apptstarttime = (ims.framework.utils.Time)this.apptstarttime.clone();
		if(this.apptendtime == null)
			clone.apptendtime = null;
		else
			clone.apptendtime = (ims.framework.utils.Time)this.apptendtime.clone();
		if(this.apptstatus == null)
			clone.apptstatus = null;
		else
			clone.apptstatus = (ims.scheduling.vo.lookups.Status_Reason)this.apptstatus.clone();
		if(this.session == null)
			clone.session = null;
		else
			clone.session = (ims.scheduling.vo.SessionForAppLinkedVo)this.session.clone();
		if(this.linkedappointments == null)
			clone.linkedappointments = null;
		else
			clone.linkedappointments = (ims.scheduling.vo.BookingAppointmentForLinkedAppointmentsVoCollection)this.linkedappointments.clone();
		clone.sessionslot = this.sessionslot;
		clone.parentchildslot = this.parentchildslot;
		if(this.activity == null)
			clone.activity = null;
		else
			clone.activity = (ims.core.vo.ActivityLiteVo)this.activity.clone();
		clone.firstconsultationactivity = this.firstconsultationactivity;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(BookingAppointmentForLinkedAppointmentsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A BookingAppointmentForLinkedAppointmentsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((BookingAppointmentForLinkedAppointmentsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((BookingAppointmentForLinkedAppointmentsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.appointmentdate != null)
			count++;
		if(this.apptstarttime != null)
			count++;
		if(this.apptendtime != null)
			count++;
		if(this.apptstatus != null)
			count++;
		if(this.session != null)
			count++;
		if(this.linkedappointments != null)
			count++;
		if(this.sessionslot != null)
			count++;
		if(this.parentchildslot != null)
			count++;
		if(this.activity != null)
			count++;
		if(this.firstconsultationactivity != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 10;
	}
	protected ims.framework.utils.Date appointmentdate;
	protected ims.framework.utils.Time apptstarttime;
	protected ims.framework.utils.Time apptendtime;
	protected ims.scheduling.vo.lookups.Status_Reason apptstatus;
	protected ims.scheduling.vo.SessionForAppLinkedVo session;
	protected ims.scheduling.vo.BookingAppointmentForLinkedAppointmentsVoCollection linkedappointments;
	protected ims.scheduling.vo.Session_SlotRefVo sessionslot;
	protected ims.scheduling.vo.SessionParentChildSlotRefVo parentchildslot;
	protected ims.core.vo.ActivityLiteVo activity;
	protected Boolean firstconsultationactivity;
	private boolean isValidated = false;
	private boolean isBusy = false;
}