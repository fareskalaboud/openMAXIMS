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

package ims.icp.vo;

/**
 * Linked to ICPs.Configuration.ICP business object (ID: 1060100000).
 */
public class ICPFullVo extends ims.icp.vo.ICPLiteVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ICPFullVo()
	{
	}
	public ICPFullVo(Integer id, int version)
	{
		super(id, version);
	}
	public ICPFullVo(ims.icp.vo.beans.ICPFullVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.description = bean.getDescription();
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		this.helpurl = bean.getHelpURL();
		this.category = bean.getCategory() == null ? null : ims.core.vo.lookups.ICPCategoryType.buildLookup(bean.getCategory());
		this.type = bean.getType() == null ? null : ims.core.vo.lookups.ICPCategoryType.buildLookup(bean.getType());
		this.specialty = bean.getSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getSpecialty());
		this.creationdate = bean.getCreationDate() == null ? null : bean.getCreationDate().buildDate();
		this.contactperson = bean.getContactPerson() == null ? null : bean.getContactPerson().buildVo();
		this.diagnosis = bean.getDiagnosis() == null ? null : bean.getDiagnosis().buildVo();
		this.procedures = ims.core.vo.ProcedureLiteVoCollection.buildFromBeanCollection(bean.getProcedures());
		this.stages = ims.icp.vo.ICPStageFullVoCollection.buildFromBeanCollection(bean.getStages());
		this.problem = bean.getProblem() == null ? null : bean.getProblem().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.icp.vo.beans.ICPFullVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.description = bean.getDescription();
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		this.helpurl = bean.getHelpURL();
		this.category = bean.getCategory() == null ? null : ims.core.vo.lookups.ICPCategoryType.buildLookup(bean.getCategory());
		this.type = bean.getType() == null ? null : ims.core.vo.lookups.ICPCategoryType.buildLookup(bean.getType());
		this.specialty = bean.getSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getSpecialty());
		this.creationdate = bean.getCreationDate() == null ? null : bean.getCreationDate().buildDate();
		this.contactperson = bean.getContactPerson() == null ? null : bean.getContactPerson().buildVo(map);
		this.diagnosis = bean.getDiagnosis() == null ? null : bean.getDiagnosis().buildVo(map);
		this.procedures = ims.core.vo.ProcedureLiteVoCollection.buildFromBeanCollection(bean.getProcedures());
		this.stages = ims.icp.vo.ICPStageFullVoCollection.buildFromBeanCollection(bean.getStages());
		this.problem = bean.getProblem() == null ? null : bean.getProblem().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.icp.vo.beans.ICPFullVoBean bean = null;
		if(map != null)
			bean = (ims.icp.vo.beans.ICPFullVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.icp.vo.beans.ICPFullVoBean();
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
		if(fieldName.equals("HELPURL"))
			return getHelpURL();
		if(fieldName.equals("CATEGORY"))
			return getCategory();
		if(fieldName.equals("TYPE"))
			return getType();
		if(fieldName.equals("SPECIALTY"))
			return getSpecialty();
		if(fieldName.equals("CREATIONDATE"))
			return getCreationDate();
		if(fieldName.equals("CONTACTPERSON"))
			return getContactPerson();
		if(fieldName.equals("DIAGNOSIS"))
			return getDiagnosis();
		if(fieldName.equals("PROCEDURES"))
			return getProcedures();
		if(fieldName.equals("STAGES"))
			return getStages();
		if(fieldName.equals("PROBLEM"))
			return getProblem();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getHelpURLIsNotNull()
	{
		return this.helpurl != null;
	}
	public String getHelpURL()
	{
		return this.helpurl;
	}
	public static int getHelpURLMaxLength()
	{
		return 255;
	}
	public void setHelpURL(String value)
	{
		this.isValidated = false;
		this.helpurl = value;
	}
	public boolean getCategoryIsNotNull()
	{
		return this.category != null;
	}
	public ims.core.vo.lookups.ICPCategoryType getCategory()
	{
		return this.category;
	}
	public void setCategory(ims.core.vo.lookups.ICPCategoryType value)
	{
		this.isValidated = false;
		this.category = value;
	}
	public boolean getTypeIsNotNull()
	{
		return this.type != null;
	}
	public ims.core.vo.lookups.ICPCategoryType getType()
	{
		return this.type;
	}
	public void setType(ims.core.vo.lookups.ICPCategoryType value)
	{
		this.isValidated = false;
		this.type = value;
	}
	public boolean getSpecialtyIsNotNull()
	{
		return this.specialty != null;
	}
	public ims.core.vo.lookups.Specialty getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.core.vo.lookups.Specialty value)
	{
		this.isValidated = false;
		this.specialty = value;
	}
	public boolean getCreationDateIsNotNull()
	{
		return this.creationdate != null;
	}
	public ims.framework.utils.Date getCreationDate()
	{
		return this.creationdate;
	}
	public void setCreationDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.creationdate = value;
	}
	public boolean getContactPersonIsNotNull()
	{
		return this.contactperson != null;
	}
	public ims.core.vo.MemberOfStaffLiteVo getContactPerson()
	{
		return this.contactperson;
	}
	public void setContactPerson(ims.core.vo.MemberOfStaffLiteVo value)
	{
		this.isValidated = false;
		this.contactperson = value;
	}
	public boolean getDiagnosisIsNotNull()
	{
		return this.diagnosis != null;
	}
	public ims.core.vo.DiagLiteVo getDiagnosis()
	{
		return this.diagnosis;
	}
	public void setDiagnosis(ims.core.vo.DiagLiteVo value)
	{
		this.isValidated = false;
		this.diagnosis = value;
	}
	public boolean getProceduresIsNotNull()
	{
		return this.procedures != null;
	}
	public ims.core.vo.ProcedureLiteVoCollection getProcedures()
	{
		return this.procedures;
	}
	public void setProcedures(ims.core.vo.ProcedureLiteVoCollection value)
	{
		this.isValidated = false;
		this.procedures = value;
	}
	public boolean getStagesIsNotNull()
	{
		return this.stages != null;
	}
	public ims.icp.vo.ICPStageFullVoCollection getStages()
	{
		return this.stages;
	}
	public void setStages(ims.icp.vo.ICPStageFullVoCollection value)
	{
		this.isValidated = false;
		this.stages = value;
	}
	public boolean getProblemIsNotNull()
	{
		return this.problem != null;
	}
	public ims.clinical.vo.ClinicalProblemShortVo getProblem()
	{
		return this.problem;
	}
	public void setProblem(ims.clinical.vo.ClinicalProblemShortVo value)
	{
		this.isValidated = false;
		this.problem = value;
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
		if(this.stages != null)
		{
			if(!this.stages.isValidated())
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
		if(this.name == null || this.name.length() == 0)
			listOfErrors.add("Name is mandatory");
		else if(this.name.length() > 255)
			listOfErrors.add("The length of the field [name] in the value object [ims.icp.vo.ICPFullVo] is too big. It should be less or equal to 255");
		if(this.description != null)
			if(this.description.length() > 500)
				listOfErrors.add("The length of the field [description] in the value object [ims.icp.vo.ICPFullVo] is too big. It should be less or equal to 500");
		if(this.status == null)
			listOfErrors.add("Status is mandatory");
		if(this.helpurl != null)
			if(this.helpurl.length() > 255)
				listOfErrors.add("The length of the field [helpurl] in the value object [ims.icp.vo.ICPFullVo] is too big. It should be less or equal to 255");
		if(this.stages != null)
		{
			String[] listOfOtherErrors = this.stages.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
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
	
		ICPFullVo clone = new ICPFullVo(this.id, this.version);
		
		clone.name = this.name;
		clone.description = this.description;
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.status.clone();
		clone.helpurl = this.helpurl;
		if(this.category == null)
			clone.category = null;
		else
			clone.category = (ims.core.vo.lookups.ICPCategoryType)this.category.clone();
		if(this.type == null)
			clone.type = null;
		else
			clone.type = (ims.core.vo.lookups.ICPCategoryType)this.type.clone();
		if(this.specialty == null)
			clone.specialty = null;
		else
			clone.specialty = (ims.core.vo.lookups.Specialty)this.specialty.clone();
		if(this.creationdate == null)
			clone.creationdate = null;
		else
			clone.creationdate = (ims.framework.utils.Date)this.creationdate.clone();
		if(this.contactperson == null)
			clone.contactperson = null;
		else
			clone.contactperson = (ims.core.vo.MemberOfStaffLiteVo)this.contactperson.clone();
		if(this.diagnosis == null)
			clone.diagnosis = null;
		else
			clone.diagnosis = (ims.core.vo.DiagLiteVo)this.diagnosis.clone();
		if(this.procedures == null)
			clone.procedures = null;
		else
			clone.procedures = (ims.core.vo.ProcedureLiteVoCollection)this.procedures.clone();
		if(this.stages == null)
			clone.stages = null;
		else
			clone.stages = (ims.icp.vo.ICPStageFullVoCollection)this.stages.clone();
		if(this.problem == null)
			clone.problem = null;
		else
			clone.problem = (ims.clinical.vo.ClinicalProblemShortVo)this.problem.clone();
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
		if (!(ICPFullVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ICPFullVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ICPFullVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ICPFullVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.helpurl != null)
			count++;
		if(this.category != null)
			count++;
		if(this.type != null)
			count++;
		if(this.specialty != null)
			count++;
		if(this.creationdate != null)
			count++;
		if(this.contactperson != null)
			count++;
		if(this.diagnosis != null)
			count++;
		if(this.procedures != null)
			count++;
		if(this.stages != null)
			count++;
		if(this.problem != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 10;
	}
	protected String helpurl;
	protected ims.core.vo.lookups.ICPCategoryType category;
	protected ims.core.vo.lookups.ICPCategoryType type;
	protected ims.core.vo.lookups.Specialty specialty;
	protected ims.framework.utils.Date creationdate;
	protected ims.core.vo.MemberOfStaffLiteVo contactperson;
	protected ims.core.vo.DiagLiteVo diagnosis;
	protected ims.core.vo.ProcedureLiteVoCollection procedures;
	protected ims.icp.vo.ICPStageFullVoCollection stages;
	protected ims.clinical.vo.ClinicalProblemShortVo problem;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
