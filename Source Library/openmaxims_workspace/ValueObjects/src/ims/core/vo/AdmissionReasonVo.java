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


public class AdmissionReasonVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public AdmissionReasonVo()
	{
	}
	public AdmissionReasonVo(ims.core.vo.beans.AdmissionReasonVoBean bean)
	{
		this.reasonforprivatebedallocation = bean.getReasonForPrivateBedAllocation() == null ? null : ims.core.vo.lookups.ReasonforPrivateBedAllocation.buildLookup(bean.getReasonForPrivateBedAllocation());
		this.reasonformixingbaygender = bean.getReasonForMixingBayGender() == null ? null : ims.core.vo.lookups.ReasonForAdmissionToGenderSpecificBay.buildLookup(bean.getReasonForMixingBayGender());
		this.reasonforadmissionoutofopeninghours = bean.getReasonForAdmissionOutOfOpeningHours() == null ? null : ims.core.vo.lookups.ReasonForAdmissionOutOfOpeningHours.buildLookup(bean.getReasonForAdmissionOutOfOpeningHours());
		this.reasonforprivatebedallocationcomment = bean.getReasonForPrivateBedAllocationComment();
		this.reasonformixingbaygendercomment = bean.getReasonForMixingBayGenderComment();
		this.reasonforadmissionoohcomment = bean.getReasonForAdmissionOohComment();
		this.validationtype = bean.getValidationType();
		this.isprivatebedallocationvalidated = bean.getIsPrivateBedAllocationValidated();
		this.ismixinggenderbayvalidated = bean.getIsMixingGenderBayValidated();
		this.isgenderspecificbayvalidated = bean.getIsGenderSpecificBayValidated();
		this.isoohallocationvalidated = bean.getIsOohAllocationValidated();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.AdmissionReasonVoBean bean)
	{
		this.reasonforprivatebedallocation = bean.getReasonForPrivateBedAllocation() == null ? null : ims.core.vo.lookups.ReasonforPrivateBedAllocation.buildLookup(bean.getReasonForPrivateBedAllocation());
		this.reasonformixingbaygender = bean.getReasonForMixingBayGender() == null ? null : ims.core.vo.lookups.ReasonForAdmissionToGenderSpecificBay.buildLookup(bean.getReasonForMixingBayGender());
		this.reasonforadmissionoutofopeninghours = bean.getReasonForAdmissionOutOfOpeningHours() == null ? null : ims.core.vo.lookups.ReasonForAdmissionOutOfOpeningHours.buildLookup(bean.getReasonForAdmissionOutOfOpeningHours());
		this.reasonforprivatebedallocationcomment = bean.getReasonForPrivateBedAllocationComment();
		this.reasonformixingbaygendercomment = bean.getReasonForMixingBayGenderComment();
		this.reasonforadmissionoohcomment = bean.getReasonForAdmissionOohComment();
		this.validationtype = bean.getValidationType();
		this.isprivatebedallocationvalidated = bean.getIsPrivateBedAllocationValidated();
		this.ismixinggenderbayvalidated = bean.getIsMixingGenderBayValidated();
		this.isgenderspecificbayvalidated = bean.getIsGenderSpecificBayValidated();
		this.isoohallocationvalidated = bean.getIsOohAllocationValidated();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.AdmissionReasonVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.AdmissionReasonVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.AdmissionReasonVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getReasonForPrivateBedAllocationIsNotNull()
	{
		return this.reasonforprivatebedallocation != null;
	}
	public ims.core.vo.lookups.ReasonforPrivateBedAllocation getReasonForPrivateBedAllocation()
	{
		return this.reasonforprivatebedallocation;
	}
	public void setReasonForPrivateBedAllocation(ims.core.vo.lookups.ReasonforPrivateBedAllocation value)
	{
		this.isValidated = false;
		this.reasonforprivatebedallocation = value;
	}
	public boolean getReasonForMixingBayGenderIsNotNull()
	{
		return this.reasonformixingbaygender != null;
	}
	public ims.core.vo.lookups.ReasonForAdmissionToGenderSpecificBay getReasonForMixingBayGender()
	{
		return this.reasonformixingbaygender;
	}
	public void setReasonForMixingBayGender(ims.core.vo.lookups.ReasonForAdmissionToGenderSpecificBay value)
	{
		this.isValidated = false;
		this.reasonformixingbaygender = value;
	}
	public boolean getReasonForAdmissionOutOfOpeningHoursIsNotNull()
	{
		return this.reasonforadmissionoutofopeninghours != null;
	}
	public ims.core.vo.lookups.ReasonForAdmissionOutOfOpeningHours getReasonForAdmissionOutOfOpeningHours()
	{
		return this.reasonforadmissionoutofopeninghours;
	}
	public void setReasonForAdmissionOutOfOpeningHours(ims.core.vo.lookups.ReasonForAdmissionOutOfOpeningHours value)
	{
		this.isValidated = false;
		this.reasonforadmissionoutofopeninghours = value;
	}
	public boolean getReasonForPrivateBedAllocationCommentIsNotNull()
	{
		return this.reasonforprivatebedallocationcomment != null;
	}
	public String getReasonForPrivateBedAllocationComment()
	{
		return this.reasonforprivatebedallocationcomment;
	}
	public static int getReasonForPrivateBedAllocationCommentMaxLength()
	{
		return 255;
	}
	public void setReasonForPrivateBedAllocationComment(String value)
	{
		this.isValidated = false;
		this.reasonforprivatebedallocationcomment = value;
	}
	public boolean getReasonForMixingBayGenderCommentIsNotNull()
	{
		return this.reasonformixingbaygendercomment != null;
	}
	public String getReasonForMixingBayGenderComment()
	{
		return this.reasonformixingbaygendercomment;
	}
	public static int getReasonForMixingBayGenderCommentMaxLength()
	{
		return 255;
	}
	public void setReasonForMixingBayGenderComment(String value)
	{
		this.isValidated = false;
		this.reasonformixingbaygendercomment = value;
	}
	public boolean getReasonForAdmissionOohCommentIsNotNull()
	{
		return this.reasonforadmissionoohcomment != null;
	}
	public String getReasonForAdmissionOohComment()
	{
		return this.reasonforadmissionoohcomment;
	}
	public static int getReasonForAdmissionOohCommentMaxLength()
	{
		return 255;
	}
	public void setReasonForAdmissionOohComment(String value)
	{
		this.isValidated = false;
		this.reasonforadmissionoohcomment = value;
	}
	public boolean getValidationTypeIsNotNull()
	{
		return this.validationtype != null;
	}
	public String getValidationType()
	{
		return this.validationtype;
	}
	public static int getValidationTypeMaxLength()
	{
		return 255;
	}
	public void setValidationType(String value)
	{
		this.isValidated = false;
		this.validationtype = value;
	}
	public boolean getIsPrivateBedAllocationValidatedIsNotNull()
	{
		return this.isprivatebedallocationvalidated != null;
	}
	public Boolean getIsPrivateBedAllocationValidated()
	{
		return this.isprivatebedallocationvalidated;
	}
	public void setIsPrivateBedAllocationValidated(Boolean value)
	{
		this.isValidated = false;
		this.isprivatebedallocationvalidated = value;
	}
	public boolean getIsMixingGenderBayValidatedIsNotNull()
	{
		return this.ismixinggenderbayvalidated != null;
	}
	public Boolean getIsMixingGenderBayValidated()
	{
		return this.ismixinggenderbayvalidated;
	}
	public void setIsMixingGenderBayValidated(Boolean value)
	{
		this.isValidated = false;
		this.ismixinggenderbayvalidated = value;
	}
	public boolean getIsGenderSpecificBayValidatedIsNotNull()
	{
		return this.isgenderspecificbayvalidated != null;
	}
	public Boolean getIsGenderSpecificBayValidated()
	{
		return this.isgenderspecificbayvalidated;
	}
	public void setIsGenderSpecificBayValidated(Boolean value)
	{
		this.isValidated = false;
		this.isgenderspecificbayvalidated = value;
	}
	public boolean getIsOohAllocationValidatedIsNotNull()
	{
		return this.isoohallocationvalidated != null;
	}
	public Boolean getIsOohAllocationValidated()
	{
		return this.isoohallocationvalidated;
	}
	public void setIsOohAllocationValidated(Boolean value)
	{
		this.isValidated = false;
		this.isoohallocationvalidated = value;
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
		if(!(obj instanceof AdmissionReasonVo))
			return false;
		AdmissionReasonVo compareObj = (AdmissionReasonVo)obj;
		if(this.getReasonForPrivateBedAllocation() == null && compareObj.getReasonForPrivateBedAllocation() != null)
			return false;
		if(this.getReasonForPrivateBedAllocation() != null && compareObj.getReasonForPrivateBedAllocation() == null)
			return false;
		if(this.getReasonForPrivateBedAllocation() != null && compareObj.getReasonForPrivateBedAllocation() != null)
			if(!this.getReasonForPrivateBedAllocation().equals(compareObj.getReasonForPrivateBedAllocation()))
				return false;
		if(this.getReasonForMixingBayGender() == null && compareObj.getReasonForMixingBayGender() != null)
			return false;
		if(this.getReasonForMixingBayGender() != null && compareObj.getReasonForMixingBayGender() == null)
			return false;
		if(this.getReasonForMixingBayGender() != null && compareObj.getReasonForMixingBayGender() != null)
			if(!this.getReasonForMixingBayGender().equals(compareObj.getReasonForMixingBayGender()))
				return false;
		if(this.getReasonForAdmissionOutOfOpeningHours() == null && compareObj.getReasonForAdmissionOutOfOpeningHours() != null)
			return false;
		if(this.getReasonForAdmissionOutOfOpeningHours() != null && compareObj.getReasonForAdmissionOutOfOpeningHours() == null)
			return false;
		if(this.getReasonForAdmissionOutOfOpeningHours() != null && compareObj.getReasonForAdmissionOutOfOpeningHours() != null)
			return this.getReasonForAdmissionOutOfOpeningHours().equals(compareObj.getReasonForAdmissionOutOfOpeningHours());
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
	
		AdmissionReasonVo clone = new AdmissionReasonVo();
		
		if(this.reasonforprivatebedallocation == null)
			clone.reasonforprivatebedallocation = null;
		else
			clone.reasonforprivatebedallocation = (ims.core.vo.lookups.ReasonforPrivateBedAllocation)this.reasonforprivatebedallocation.clone();
		if(this.reasonformixingbaygender == null)
			clone.reasonformixingbaygender = null;
		else
			clone.reasonformixingbaygender = (ims.core.vo.lookups.ReasonForAdmissionToGenderSpecificBay)this.reasonformixingbaygender.clone();
		if(this.reasonforadmissionoutofopeninghours == null)
			clone.reasonforadmissionoutofopeninghours = null;
		else
			clone.reasonforadmissionoutofopeninghours = (ims.core.vo.lookups.ReasonForAdmissionOutOfOpeningHours)this.reasonforadmissionoutofopeninghours.clone();
		clone.reasonforprivatebedallocationcomment = this.reasonforprivatebedallocationcomment;
		clone.reasonformixingbaygendercomment = this.reasonformixingbaygendercomment;
		clone.reasonforadmissionoohcomment = this.reasonforadmissionoohcomment;
		clone.validationtype = this.validationtype;
		clone.isprivatebedallocationvalidated = this.isprivatebedallocationvalidated;
		clone.ismixinggenderbayvalidated = this.ismixinggenderbayvalidated;
		clone.isgenderspecificbayvalidated = this.isgenderspecificbayvalidated;
		clone.isoohallocationvalidated = this.isoohallocationvalidated;
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
		if (!(AdmissionReasonVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A AdmissionReasonVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		AdmissionReasonVo compareObj = (AdmissionReasonVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getReasonForPrivateBedAllocation() == null && compareObj.getReasonForPrivateBedAllocation() != null)
				return -1;
			if(this.getReasonForPrivateBedAllocation() != null && compareObj.getReasonForPrivateBedAllocation() == null)
				return 1;
			if(this.getReasonForPrivateBedAllocation() != null && compareObj.getReasonForPrivateBedAllocation() != null)
				retVal = this.getReasonForPrivateBedAllocation().compareTo(compareObj.getReasonForPrivateBedAllocation());
		}
		if (retVal == 0)
		{
			if(this.getReasonForMixingBayGender() == null && compareObj.getReasonForMixingBayGender() != null)
				return -1;
			if(this.getReasonForMixingBayGender() != null && compareObj.getReasonForMixingBayGender() == null)
				return 1;
			if(this.getReasonForMixingBayGender() != null && compareObj.getReasonForMixingBayGender() != null)
				retVal = this.getReasonForMixingBayGender().compareTo(compareObj.getReasonForMixingBayGender());
		}
		if (retVal == 0)
		{
			if(this.getReasonForAdmissionOutOfOpeningHours() == null && compareObj.getReasonForAdmissionOutOfOpeningHours() != null)
				return -1;
			if(this.getReasonForAdmissionOutOfOpeningHours() != null && compareObj.getReasonForAdmissionOutOfOpeningHours() == null)
				return 1;
			if(this.getReasonForAdmissionOutOfOpeningHours() != null && compareObj.getReasonForAdmissionOutOfOpeningHours() != null)
				retVal = this.getReasonForAdmissionOutOfOpeningHours().compareTo(compareObj.getReasonForAdmissionOutOfOpeningHours());
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
		if(this.reasonforprivatebedallocation != null)
			count++;
		if(this.reasonformixingbaygender != null)
			count++;
		if(this.reasonforadmissionoutofopeninghours != null)
			count++;
		if(this.reasonforprivatebedallocationcomment != null)
			count++;
		if(this.reasonformixingbaygendercomment != null)
			count++;
		if(this.reasonforadmissionoohcomment != null)
			count++;
		if(this.validationtype != null)
			count++;
		if(this.isprivatebedallocationvalidated != null)
			count++;
		if(this.ismixinggenderbayvalidated != null)
			count++;
		if(this.isgenderspecificbayvalidated != null)
			count++;
		if(this.isoohallocationvalidated != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 11;
	}
	protected ims.core.vo.lookups.ReasonforPrivateBedAllocation reasonforprivatebedallocation;
	protected ims.core.vo.lookups.ReasonForAdmissionToGenderSpecificBay reasonformixingbaygender;
	protected ims.core.vo.lookups.ReasonForAdmissionOutOfOpeningHours reasonforadmissionoutofopeninghours;
	protected String reasonforprivatebedallocationcomment;
	protected String reasonformixingbaygendercomment;
	protected String reasonforadmissionoohcomment;
	protected String validationtype;
	protected Boolean isprivatebedallocationvalidated;
	protected Boolean ismixinggenderbayvalidated;
	protected Boolean isgenderspecificbayvalidated;
	protected Boolean isoohallocationvalidated;
	private boolean isValidated = false;
	private boolean isBusy = false;
}