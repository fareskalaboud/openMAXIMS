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

package ims.clinical.vo;

/**
 * Linked to clinical.SurgicalAuditPreOpChecksTheatreNurse business object (ID: 1072100102).
 */
public class SurgicalAuditPreOpChecksTheatreNurseVo extends ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SurgicalAuditPreOpChecksTheatreNurseVo()
	{
	}
	public SurgicalAuditPreOpChecksTheatreNurseVo(Integer id, int version)
	{
		super(id, version);
	}
	public SurgicalAuditPreOpChecksTheatreNurseVo(ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.theatrename = bean.getTheatreName() == null ? null : bean.getTheatreName().buildVo();
		this.comments = bean.getComments();
		this.operationtype = bean.getOperationType() == null ? null : ims.core.vo.lookups.ProcedureUrgency.buildLookup(bean.getOperationType());
		this.accompanyingtheatrenurse = bean.getAccompanyingTheatreNurse() == null ? null : bean.getAccompanyingTheatreNurse().buildVo();
		this.accompanyingtheatrenurselocumbool = bean.getAccompanyingTheatreNurseLocumBool();
		this.accompanyingtheatrenurselocumnurse = bean.getAccompanyingTheatreNurseLocumNurse();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.theatrename = bean.getTheatreName() == null ? null : bean.getTheatreName().buildVo(map);
		this.comments = bean.getComments();
		this.operationtype = bean.getOperationType() == null ? null : ims.core.vo.lookups.ProcedureUrgency.buildLookup(bean.getOperationType());
		this.accompanyingtheatrenurse = bean.getAccompanyingTheatreNurse() == null ? null : bean.getAccompanyingTheatreNurse().buildVo(map);
		this.accompanyingtheatrenurselocumbool = bean.getAccompanyingTheatreNurseLocumBool();
		this.accompanyingtheatrenurselocumnurse = bean.getAccompanyingTheatreNurseLocumNurse();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.SurgicalAuditPreOpChecksTheatreNurseVoBean();
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
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("AUTHORINGINFORMATION"))
			return getAuthoringInformation();
		if(fieldName.equals("THEATRENAME"))
			return getTheatreName();
		if(fieldName.equals("COMMENTS"))
			return getComments();
		if(fieldName.equals("OPERATIONTYPE"))
			return getOperationType();
		if(fieldName.equals("ACCOMPANYINGTHEATRENURSE"))
			return getAccompanyingTheatreNurse();
		if(fieldName.equals("ACCOMPANYINGTHEATRENURSELOCUMBOOL"))
			return getAccompanyingTheatreNurseLocumBool();
		if(fieldName.equals("ACCOMPANYINGTHEATRENURSELOCUMNURSE"))
			return getAccompanyingTheatreNurseLocumNurse();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.patient.vo.PatientRefVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.patient.vo.PatientRefVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getAuthoringInformationIsNotNull()
	{
		return this.authoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinformation = value;
	}
	public boolean getTheatreNameIsNotNull()
	{
		return this.theatrename != null;
	}
	public ims.core.vo.LocationLiteVo getTheatreName()
	{
		return this.theatrename;
	}
	public void setTheatreName(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.theatrename = value;
	}
	public boolean getCommentsIsNotNull()
	{
		return this.comments != null;
	}
	public String getComments()
	{
		return this.comments;
	}
	public static int getCommentsMaxLength()
	{
		return 100;
	}
	public void setComments(String value)
	{
		this.isValidated = false;
		this.comments = value;
	}
	public boolean getOperationTypeIsNotNull()
	{
		return this.operationtype != null;
	}
	public ims.core.vo.lookups.ProcedureUrgency getOperationType()
	{
		return this.operationtype;
	}
	public void setOperationType(ims.core.vo.lookups.ProcedureUrgency value)
	{
		this.isValidated = false;
		this.operationtype = value;
	}
	public boolean getAccompanyingTheatreNurseIsNotNull()
	{
		return this.accompanyingtheatrenurse != null;
	}
	public ims.core.vo.NurseVo getAccompanyingTheatreNurse()
	{
		return this.accompanyingtheatrenurse;
	}
	public void setAccompanyingTheatreNurse(ims.core.vo.NurseVo value)
	{
		this.isValidated = false;
		this.accompanyingtheatrenurse = value;
	}
	public boolean getAccompanyingTheatreNurseLocumBoolIsNotNull()
	{
		return this.accompanyingtheatrenurselocumbool != null;
	}
	public Boolean getAccompanyingTheatreNurseLocumBool()
	{
		return this.accompanyingtheatrenurselocumbool;
	}
	public void setAccompanyingTheatreNurseLocumBool(Boolean value)
	{
		this.isValidated = false;
		this.accompanyingtheatrenurselocumbool = value;
	}
	public boolean getAccompanyingTheatreNurseLocumNurseIsNotNull()
	{
		return this.accompanyingtheatrenurselocumnurse != null;
	}
	public String getAccompanyingTheatreNurseLocumNurse()
	{
		return this.accompanyingtheatrenurselocumnurse;
	}
	public static int getAccompanyingTheatreNurseLocumNurseMaxLength()
	{
		return 100;
	}
	public void setAccompanyingTheatreNurseLocumNurse(String value)
	{
		this.isValidated = false;
		this.accompanyingtheatrenurselocumnurse = value;
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
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.authoringinformation == null)
			listOfErrors.add("AuthoringInformation is mandatory");
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.theatrename == null)
			listOfErrors.add("TheatreName is mandatory");
		if(this.comments != null)
			if(this.comments.length() > 100)
				listOfErrors.add("The length of the field [comments] in the value object [ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo] is too big. It should be less or equal to 100");
		if(this.accompanyingtheatrenurselocumnurse != null)
			if(this.accompanyingtheatrenurselocumnurse.length() > 100)
				listOfErrors.add("The length of the field [accompanyingtheatrenurselocumnurse] in the value object [ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo] is too big. It should be less or equal to 100");
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
	
		SurgicalAuditPreOpChecksTheatreNurseVo clone = new SurgicalAuditPreOpChecksTheatreNurseVo(this.id, this.version);
		
		clone.patient = this.patient;
		clone.carecontext = this.carecontext;
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		if(this.theatrename == null)
			clone.theatrename = null;
		else
			clone.theatrename = (ims.core.vo.LocationLiteVo)this.theatrename.clone();
		clone.comments = this.comments;
		if(this.operationtype == null)
			clone.operationtype = null;
		else
			clone.operationtype = (ims.core.vo.lookups.ProcedureUrgency)this.operationtype.clone();
		if(this.accompanyingtheatrenurse == null)
			clone.accompanyingtheatrenurse = null;
		else
			clone.accompanyingtheatrenurse = (ims.core.vo.NurseVo)this.accompanyingtheatrenurse.clone();
		clone.accompanyingtheatrenurselocumbool = this.accompanyingtheatrenurselocumbool;
		clone.accompanyingtheatrenurselocumnurse = this.accompanyingtheatrenurselocumnurse;
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
		if (!(SurgicalAuditPreOpChecksTheatreNurseVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SurgicalAuditPreOpChecksTheatreNurseVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((SurgicalAuditPreOpChecksTheatreNurseVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((SurgicalAuditPreOpChecksTheatreNurseVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.patient != null)
			count++;
		if(this.carecontext != null)
			count++;
		if(this.authoringinformation != null)
			count++;
		if(this.theatrename != null)
			count++;
		if(this.comments != null)
			count++;
		if(this.operationtype != null)
			count++;
		if(this.accompanyingtheatrenurse != null)
			count++;
		if(this.accompanyingtheatrenurselocumbool != null)
			count++;
		if(this.accompanyingtheatrenurselocumnurse != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected ims.core.patient.vo.PatientRefVo patient;
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected ims.core.vo.AuthoringInformationVo authoringinformation;
	protected ims.core.vo.LocationLiteVo theatrename;
	protected String comments;
	protected ims.core.vo.lookups.ProcedureUrgency operationtype;
	protected ims.core.vo.NurseVo accompanyingtheatrenurse;
	protected Boolean accompanyingtheatrenurselocumbool;
	protected String accompanyingtheatrenurselocumnurse;
	private boolean isValidated = false;
	private boolean isBusy = false;
}