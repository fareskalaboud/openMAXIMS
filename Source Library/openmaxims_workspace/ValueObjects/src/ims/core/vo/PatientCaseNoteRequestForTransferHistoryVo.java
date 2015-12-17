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

package ims.core.vo;


public class PatientCaseNoteRequestForTransferHistoryVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientCaseNoteRequestForTransferHistoryVo()
	{
	}
	public PatientCaseNoteRequestForTransferHistoryVo(ims.core.vo.beans.PatientCaseNoteRequestForTransferHistoryVoBean bean)
	{
		this.requestedby = bean.getRequestedBy() == null ? null : bean.getRequestedBy().buildVo();
		this.requesteddate = bean.getRequestedDate() == null ? null : bean.getRequestedDate().buildDateTime();
		this.casenotetransfer = bean.getCaseNoteTransfer() == null ? null : bean.getCaseNoteTransfer().buildVo();
		this.casenote = bean.getCaseNote() == null ? null : new ims.core.clinical.vo.PatientCaseNoteRefVo(new Integer(bean.getCaseNote().getId()), bean.getCaseNote().getVersion());
		this.requestreason = bean.getRequestReason() == null ? null : ims.core.vo.lookups.CaseNoteReasonForRequest.buildLookup(bean.getRequestReason());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PatientCaseNoteRequestForTransferHistoryVoBean bean)
	{
		this.requestedby = bean.getRequestedBy() == null ? null : bean.getRequestedBy().buildVo(map);
		this.requesteddate = bean.getRequestedDate() == null ? null : bean.getRequestedDate().buildDateTime();
		this.casenotetransfer = bean.getCaseNoteTransfer() == null ? null : bean.getCaseNoteTransfer().buildVo(map);
		this.casenote = bean.getCaseNote() == null ? null : new ims.core.clinical.vo.PatientCaseNoteRefVo(new Integer(bean.getCaseNote().getId()), bean.getCaseNote().getVersion());
		this.requestreason = bean.getRequestReason() == null ? null : ims.core.vo.lookups.CaseNoteReasonForRequest.buildLookup(bean.getRequestReason());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PatientCaseNoteRequestForTransferHistoryVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PatientCaseNoteRequestForTransferHistoryVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PatientCaseNoteRequestForTransferHistoryVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getRequestedByIsNotNull()
	{
		return this.requestedby != null;
	}
	public ims.core.vo.MemberOfStaffMinVo getRequestedBy()
	{
		return this.requestedby;
	}
	public void setRequestedBy(ims.core.vo.MemberOfStaffMinVo value)
	{
		this.isValidated = false;
		this.requestedby = value;
	}
	public boolean getRequestedDateIsNotNull()
	{
		return this.requesteddate != null;
	}
	public ims.framework.utils.DateTime getRequestedDate()
	{
		return this.requesteddate;
	}
	public void setRequestedDate(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.requesteddate = value;
	}
	public boolean getCaseNoteTransferIsNotNull()
	{
		return this.casenotetransfer != null;
	}
	public ims.core.vo.PatientCaseNoteTransferListVo getCaseNoteTransfer()
	{
		return this.casenotetransfer;
	}
	public void setCaseNoteTransfer(ims.core.vo.PatientCaseNoteTransferListVo value)
	{
		this.isValidated = false;
		this.casenotetransfer = value;
	}
	public boolean getCaseNoteIsNotNull()
	{
		return this.casenote != null;
	}
	public ims.core.clinical.vo.PatientCaseNoteRefVo getCaseNote()
	{
		return this.casenote;
	}
	public void setCaseNote(ims.core.clinical.vo.PatientCaseNoteRefVo value)
	{
		this.isValidated = false;
		this.casenote = value;
	}
	public boolean getRequestReasonIsNotNull()
	{
		return this.requestreason != null;
	}
	public ims.core.vo.lookups.CaseNoteReasonForRequest getRequestReason()
	{
		return this.requestreason;
	}
	public void setRequestReason(ims.core.vo.lookups.CaseNoteReasonForRequest value)
	{
		this.isValidated = false;
		this.requestreason = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof PatientCaseNoteRequestForTransferHistoryVo))
			return false;
		PatientCaseNoteRequestForTransferHistoryVo compareObj = (PatientCaseNoteRequestForTransferHistoryVo)obj;
		if(this.getCaseNote() == null && compareObj.getCaseNote() != null)
			return false;
		if(this.getCaseNote() != null && compareObj.getCaseNote() == null)
			return false;
		if(this.getCaseNote() != null && compareObj.getCaseNote() != null)
			if(!this.getCaseNote().equals(compareObj.getCaseNote()))
				return false;
		if(this.getCaseNoteTransfer() == null && compareObj.getCaseNoteTransfer() != null)
			return false;
		if(this.getCaseNoteTransfer() != null && compareObj.getCaseNoteTransfer() == null)
			return false;
		if(this.getCaseNoteTransfer() != null && compareObj.getCaseNoteTransfer() != null)
			if(!this.getCaseNoteTransfer().equals(compareObj.getCaseNoteTransfer()))
				return false;
		if(this.getRequestedBy() == null && compareObj.getRequestedBy() != null)
			return false;
		if(this.getRequestedBy() != null && compareObj.getRequestedBy() == null)
			return false;
		if(this.getRequestedBy() != null && compareObj.getRequestedBy() != null)
			if(!this.getRequestedBy().equals(compareObj.getRequestedBy()))
				return false;
		if(this.getRequestedDate() == null && compareObj.getRequestedDate() != null)
			return false;
		if(this.getRequestedDate() != null && compareObj.getRequestedDate() == null)
			return false;
		if(this.getRequestedDate() != null && compareObj.getRequestedDate() != null)
			return this.getRequestedDate().equals(compareObj.getRequestedDate());
		return super.equals(obj);
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
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PatientCaseNoteRequestForTransferHistoryVo clone = new PatientCaseNoteRequestForTransferHistoryVo();
		
		if(this.requestedby == null)
			clone.requestedby = null;
		else
			clone.requestedby = (ims.core.vo.MemberOfStaffMinVo)this.requestedby.clone();
		if(this.requesteddate == null)
			clone.requesteddate = null;
		else
			clone.requesteddate = (ims.framework.utils.DateTime)this.requesteddate.clone();
		if(this.casenotetransfer == null)
			clone.casenotetransfer = null;
		else
			clone.casenotetransfer = (ims.core.vo.PatientCaseNoteTransferListVo)this.casenotetransfer.clone();
		clone.casenote = this.casenote;
		if(this.requestreason == null)
			clone.requestreason = null;
		else
			clone.requestreason = (ims.core.vo.lookups.CaseNoteReasonForRequest)this.requestreason.clone();
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
		if (!(PatientCaseNoteRequestForTransferHistoryVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientCaseNoteRequestForTransferHistoryVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		PatientCaseNoteRequestForTransferHistoryVo compareObj = (PatientCaseNoteRequestForTransferHistoryVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getCaseNoteTransfer() == null && compareObj.getCaseNoteTransfer() != null)
				return -1;
			if(this.getCaseNoteTransfer() != null && compareObj.getCaseNoteTransfer() == null)
				return 1;
			if(this.getCaseNoteTransfer() != null && compareObj.getCaseNoteTransfer() != null)
				retVal = this.getCaseNoteTransfer().compareTo(compareObj.getCaseNoteTransfer());
		}
		if (retVal == 0)
		{
			if(this.getRequestedDate() == null && compareObj.getRequestedDate() != null)
				return -1;
			if(this.getRequestedDate() != null && compareObj.getRequestedDate() == null)
				return 1;
			if(this.getRequestedDate() != null && compareObj.getRequestedDate() != null)
				retVal = this.getRequestedDate().compareTo(compareObj.getRequestedDate());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.requestedby != null)
			count++;
		if(this.requesteddate != null)
			count++;
		if(this.casenotetransfer != null)
			count++;
		if(this.casenote != null)
			count++;
		if(this.requestreason != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.core.vo.MemberOfStaffMinVo requestedby;
	protected ims.framework.utils.DateTime requesteddate;
	protected ims.core.vo.PatientCaseNoteTransferListVo casenotetransfer;
	protected ims.core.clinical.vo.PatientCaseNoteRefVo casenote;
	protected ims.core.vo.lookups.CaseNoteReasonForRequest requestreason;
	private boolean isValidated = false;
	private boolean isBusy = false;
}