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

package ims.core.vo.beans;

public class PDSPatientFilterSearchCriteriaVoBean extends ims.vo.ValueObjectBean
{
	public PDSPatientFilterSearchCriteriaVoBean()
	{
	}
	public PDSPatientFilterSearchCriteriaVoBean(ims.core.vo.PDSPatientFilterSearchCriteriaVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.sex = vo.getSex() == null ? null : (ims.vo.LookupInstanceBean)vo.getSex().getBean();
		this.dob = vo.getDob() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDob().getBean();
		this.surname = vo.getSurname();
		this.forename = vo.getForename();
		this.forename2 = vo.getForename2();
		this.county = vo.getCounty() == null ? null : (ims.vo.LookupInstanceBean)vo.getCounty().getBean();
		this.address = vo.getAddress();
		this.persid = vo.getPersId() == null ? null : (ims.core.vo.beans.PatientIdBean)vo.getPersId().getBean();
		this.cca = vo.getCCA() == null ? null : (ims.core.vo.beans.LocSiteLiteVoBean)vo.getCCA().getBean();
		this.excludequickregistrationpatients = vo.getExcludeQuickRegistrationPatients();
		this.excludedeceseadpatients = vo.getExcludeDeceseadPatients();
		this.postcode = vo.getPostCode();
		this.nhsnumber = vo.getNHSNumber();
		this.dod = vo.getDoD() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDoD().getBean();
		this.gp = vo.getGP();
		this.algorithmictrace = vo.getAlgorithmicTrace();
		this.includealias = vo.getIncludeAlias();
		this.swapnames = vo.getSwapNames();
		this.extendeddob = vo.getExtendedDoB();
		this.extendeddod = vo.getExtendedDoD();
		this.searchtab = vo.getSearchTab();
		this.wastimeron = vo.getWasTimerOn();
		this.surnameorig = vo.getSurnameOrig();
		this.forenameorig = vo.getForenameOrig();
		this.postcodeorig = vo.getPostcodeOrig();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PDSPatientFilterSearchCriteriaVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.sex = vo.getSex() == null ? null : (ims.vo.LookupInstanceBean)vo.getSex().getBean();
		this.dob = vo.getDob() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDob().getBean();
		this.surname = vo.getSurname();
		this.forename = vo.getForename();
		this.forename2 = vo.getForename2();
		this.county = vo.getCounty() == null ? null : (ims.vo.LookupInstanceBean)vo.getCounty().getBean();
		this.address = vo.getAddress();
		this.persid = vo.getPersId() == null ? null : (ims.core.vo.beans.PatientIdBean)vo.getPersId().getBean(map);
		this.cca = vo.getCCA() == null ? null : (ims.core.vo.beans.LocSiteLiteVoBean)vo.getCCA().getBean(map);
		this.excludequickregistrationpatients = vo.getExcludeQuickRegistrationPatients();
		this.excludedeceseadpatients = vo.getExcludeDeceseadPatients();
		this.postcode = vo.getPostCode();
		this.nhsnumber = vo.getNHSNumber();
		this.dod = vo.getDoD() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDoD().getBean();
		this.gp = vo.getGP();
		this.algorithmictrace = vo.getAlgorithmicTrace();
		this.includealias = vo.getIncludeAlias();
		this.swapnames = vo.getSwapNames();
		this.extendeddob = vo.getExtendedDoB();
		this.extendeddod = vo.getExtendedDoD();
		this.searchtab = vo.getSearchTab();
		this.wastimeron = vo.getWasTimerOn();
		this.surnameorig = vo.getSurnameOrig();
		this.forenameorig = vo.getForenameOrig();
		this.postcodeorig = vo.getPostcodeOrig();
	}

	public ims.core.vo.PDSPatientFilterSearchCriteriaVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PDSPatientFilterSearchCriteriaVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PDSPatientFilterSearchCriteriaVo vo = null;
		if(map != null)
			vo = (ims.core.vo.PDSPatientFilterSearchCriteriaVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PDSPatientFilterSearchCriteriaVo();
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
	public ims.vo.LookupInstanceBean getSex()
	{
		return this.sex;
	}
	public void setSex(ims.vo.LookupInstanceBean value)
	{
		this.sex = value;
	}
	public ims.framework.utils.beans.PartialDateBean getDob()
	{
		return this.dob;
	}
	public void setDob(ims.framework.utils.beans.PartialDateBean value)
	{
		this.dob = value;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String value)
	{
		this.surname = value;
	}
	public String getForename()
	{
		return this.forename;
	}
	public void setForename(String value)
	{
		this.forename = value;
	}
	public String getForename2()
	{
		return this.forename2;
	}
	public void setForename2(String value)
	{
		this.forename2 = value;
	}
	public ims.vo.LookupInstanceBean getCounty()
	{
		return this.county;
	}
	public void setCounty(ims.vo.LookupInstanceBean value)
	{
		this.county = value;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setAddress(String value)
	{
		this.address = value;
	}
	public ims.core.vo.beans.PatientIdBean getPersId()
	{
		return this.persid;
	}
	public void setPersId(ims.core.vo.beans.PatientIdBean value)
	{
		this.persid = value;
	}
	public ims.core.vo.beans.LocSiteLiteVoBean getCCA()
	{
		return this.cca;
	}
	public void setCCA(ims.core.vo.beans.LocSiteLiteVoBean value)
	{
		this.cca = value;
	}
	public Boolean getExcludeQuickRegistrationPatients()
	{
		return this.excludequickregistrationpatients;
	}
	public void setExcludeQuickRegistrationPatients(Boolean value)
	{
		this.excludequickregistrationpatients = value;
	}
	public Boolean getExcludeDeceseadPatients()
	{
		return this.excludedeceseadpatients;
	}
	public void setExcludeDeceseadPatients(Boolean value)
	{
		this.excludedeceseadpatients = value;
	}
	public String getPostCode()
	{
		return this.postcode;
	}
	public void setPostCode(String value)
	{
		this.postcode = value;
	}
	public String getNHSNumber()
	{
		return this.nhsnumber;
	}
	public void setNHSNumber(String value)
	{
		this.nhsnumber = value;
	}
	public ims.framework.utils.beans.PartialDateBean getDoD()
	{
		return this.dod;
	}
	public void setDoD(ims.framework.utils.beans.PartialDateBean value)
	{
		this.dod = value;
	}
	public String getGP()
	{
		return this.gp;
	}
	public void setGP(String value)
	{
		this.gp = value;
	}
	public Boolean getAlgorithmicTrace()
	{
		return this.algorithmictrace;
	}
	public void setAlgorithmicTrace(Boolean value)
	{
		this.algorithmictrace = value;
	}
	public Boolean getIncludeAlias()
	{
		return this.includealias;
	}
	public void setIncludeAlias(Boolean value)
	{
		this.includealias = value;
	}
	public Boolean getSwapNames()
	{
		return this.swapnames;
	}
	public void setSwapNames(Boolean value)
	{
		this.swapnames = value;
	}
	public Boolean getExtendedDoB()
	{
		return this.extendeddob;
	}
	public void setExtendedDoB(Boolean value)
	{
		this.extendeddob = value;
	}
	public Boolean getExtendedDoD()
	{
		return this.extendeddod;
	}
	public void setExtendedDoD(Boolean value)
	{
		this.extendeddod = value;
	}
	public Integer getSearchTab()
	{
		return this.searchtab;
	}
	public void setSearchTab(Integer value)
	{
		this.searchtab = value;
	}
	public Boolean getWasTimerOn()
	{
		return this.wastimeron;
	}
	public void setWasTimerOn(Boolean value)
	{
		this.wastimeron = value;
	}
	public String getSurnameOrig()
	{
		return this.surnameorig;
	}
	public void setSurnameOrig(String value)
	{
		this.surnameorig = value;
	}
	public String getForenameOrig()
	{
		return this.forenameorig;
	}
	public void setForenameOrig(String value)
	{
		this.forenameorig = value;
	}
	public String getPostcodeOrig()
	{
		return this.postcodeorig;
	}
	public void setPostcodeOrig(String value)
	{
		this.postcodeorig = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean sex;
	private ims.framework.utils.beans.PartialDateBean dob;
	private String surname;
	private String forename;
	private String forename2;
	private ims.vo.LookupInstanceBean county;
	private String address;
	private ims.core.vo.beans.PatientIdBean persid;
	private ims.core.vo.beans.LocSiteLiteVoBean cca;
	private Boolean excludequickregistrationpatients;
	private Boolean excludedeceseadpatients;
	private String postcode;
	private String nhsnumber;
	private ims.framework.utils.beans.PartialDateBean dod;
	private String gp;
	private Boolean algorithmictrace;
	private Boolean includealias;
	private Boolean swapnames;
	private Boolean extendeddob;
	private Boolean extendeddod;
	private Integer searchtab;
	private Boolean wastimeron;
	private String surnameorig;
	private String forenameorig;
	private String postcodeorig;
}
