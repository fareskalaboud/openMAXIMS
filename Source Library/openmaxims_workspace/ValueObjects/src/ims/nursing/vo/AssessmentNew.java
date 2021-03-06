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

package ims.nursing.vo;

/**
 * Linked to nursing.assessment.AdmissionAssessment business object (ID: 1015100000).
 */
public class AssessmentNew extends ims.nursing.assessment.vo.AdmissionAssessmentRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public AssessmentNew()
	{
	}
	public AssessmentNew(Integer id, int version)
	{
		super(id, version);
	}
	public AssessmentNew(ims.nursing.vo.beans.AssessmentNewBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.components = ims.nursing.vo.lookups.AssessmentComponentTypeCollection.buildFromBeanCollection(bean.getComponents());
		this.assessmenttype = bean.getAssessmentType() == null ? null : ims.nursing.vo.lookups.AssessmentType.buildLookup(bean.getAssessmentType());
		this.hcpinitiated = bean.getHcpInitiated() == null ? null : new ims.core.resource.people.vo.HcpRefVo(new Integer(bean.getHcpInitiated().getId()), bean.getHcpInitiated().getVersion());
		this.datetimeinitiated = bean.getDateTimeInitiated() == null ? null : bean.getDateTimeInitiated().buildDateTime();
		this.clinicalcontact = bean.getClinicalContact() == null ? null : new ims.core.admin.vo.ClinicalContactRefVo(new Integer(bean.getClinicalContact().getId()), bean.getClinicalContact().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.nursing.vo.beans.AssessmentNewBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.components = ims.nursing.vo.lookups.AssessmentComponentTypeCollection.buildFromBeanCollection(bean.getComponents());
		this.assessmenttype = bean.getAssessmentType() == null ? null : ims.nursing.vo.lookups.AssessmentType.buildLookup(bean.getAssessmentType());
		this.hcpinitiated = bean.getHcpInitiated() == null ? null : new ims.core.resource.people.vo.HcpRefVo(new Integer(bean.getHcpInitiated().getId()), bean.getHcpInitiated().getVersion());
		this.datetimeinitiated = bean.getDateTimeInitiated() == null ? null : bean.getDateTimeInitiated().buildDateTime();
		this.clinicalcontact = bean.getClinicalContact() == null ? null : new ims.core.admin.vo.ClinicalContactRefVo(new Integer(bean.getClinicalContact().getId()), bean.getClinicalContact().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.nursing.vo.beans.AssessmentNewBean bean = null;
		if(map != null)
			bean = (ims.nursing.vo.beans.AssessmentNewBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.nursing.vo.beans.AssessmentNewBean();
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
		if(fieldName.equals("COMPONENTS"))
			return getComponents();
		if(fieldName.equals("ASSESSMENTTYPE"))
			return getAssessmentType();
		if(fieldName.equals("HCPINITIATED"))
			return getHcpInitiated();
		if(fieldName.equals("DATETIMEINITIATED"))
			return getDateTimeInitiated();
		if(fieldName.equals("CLINICALCONTACT"))
			return getClinicalContact();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getComponentsIsNotNull()
	{
		return this.components != null;
	}
	public ims.nursing.vo.lookups.AssessmentComponentTypeCollection getComponents()
	{
		return this.components;
	}
	public void setComponents(ims.nursing.vo.lookups.AssessmentComponentTypeCollection value)
	{
		this.isValidated = false;
		this.components = value;
	}
	public boolean getAssessmentTypeIsNotNull()
	{
		return this.assessmenttype != null;
	}
	public ims.nursing.vo.lookups.AssessmentType getAssessmentType()
	{
		return this.assessmenttype;
	}
	public void setAssessmentType(ims.nursing.vo.lookups.AssessmentType value)
	{
		this.isValidated = false;
		this.assessmenttype = value;
	}
	public boolean getHcpInitiatedIsNotNull()
	{
		return this.hcpinitiated != null;
	}
	public ims.core.resource.people.vo.HcpRefVo getHcpInitiated()
	{
		return this.hcpinitiated;
	}
	public void setHcpInitiated(ims.core.resource.people.vo.HcpRefVo value)
	{
		this.isValidated = false;
		this.hcpinitiated = value;
	}
	public boolean getDateTimeInitiatedIsNotNull()
	{
		return this.datetimeinitiated != null;
	}
	public ims.framework.utils.DateTime getDateTimeInitiated()
	{
		return this.datetimeinitiated;
	}
	public void setDateTimeInitiated(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.datetimeinitiated = value;
	}
	public boolean getClinicalContactIsNotNull()
	{
		return this.clinicalcontact != null;
	}
	public ims.core.admin.vo.ClinicalContactRefVo getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.admin.vo.ClinicalContactRefVo value)
	{
		this.isValidated = false;
		this.clinicalcontact = value;
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
	
		AssessmentNew clone = new AssessmentNew(this.id, this.version);
		
		if(this.components == null)
			clone.components = null;
		else
			clone.components = (ims.nursing.vo.lookups.AssessmentComponentTypeCollection)this.components.clone();
		if(this.assessmenttype == null)
			clone.assessmenttype = null;
		else
			clone.assessmenttype = (ims.nursing.vo.lookups.AssessmentType)this.assessmenttype.clone();
		clone.hcpinitiated = this.hcpinitiated;
		if(this.datetimeinitiated == null)
			clone.datetimeinitiated = null;
		else
			clone.datetimeinitiated = (ims.framework.utils.DateTime)this.datetimeinitiated.clone();
		clone.clinicalcontact = this.clinicalcontact;
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
		if (!(AssessmentNew.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A AssessmentNew object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((AssessmentNew)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((AssessmentNew)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.components != null)
			count++;
		if(this.assessmenttype != null)
			count++;
		if(this.hcpinitiated != null)
			count++;
		if(this.datetimeinitiated != null)
			count++;
		if(this.clinicalcontact != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.nursing.vo.lookups.AssessmentComponentTypeCollection components;
	protected ims.nursing.vo.lookups.AssessmentType assessmenttype;
	protected ims.core.resource.people.vo.HcpRefVo hcpinitiated;
	protected ims.framework.utils.DateTime datetimeinitiated;
	protected ims.core.admin.vo.ClinicalContactRefVo clinicalcontact;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
