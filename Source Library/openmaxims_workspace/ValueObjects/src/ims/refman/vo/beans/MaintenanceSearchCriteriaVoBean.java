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

public class MaintenanceSearchCriteriaVoBean extends ims.vo.ValueObjectBean
{
	public MaintenanceSearchCriteriaVoBean()
	{
	}
	public MaintenanceSearchCriteriaVoBean(ims.RefMan.vo.MaintenanceSearchCriteriaVo vo)
	{
		this.specialty = vo.getSpecialty() == null ? null : new ims.vo.RefVoBean(vo.getSpecialty().getBoId(), vo.getSpecialty().getBoVersion());
		this.clinic = vo.getClinic() == null ? null : (ims.scheduling.vo.beans.ProfileLiteVoBean)vo.getClinic().getBean();
		this.datefrom = vo.getDateFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateFrom().getBean();
		this.dateto = vo.getDateTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateTo().getBean();
		this.nhsno = vo.getNHSNo();
		this.failedrequests = vo.getFailedRequests();
		this.dateupdatedfrom = vo.getDateUpdatedFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateUpdatedFrom().getBean();
		this.dateupdatedto = vo.getDateUpdatedTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateUpdatedTo().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.MaintenanceSearchCriteriaVo vo)
	{
		this.specialty = vo.getSpecialty() == null ? null : new ims.vo.RefVoBean(vo.getSpecialty().getBoId(), vo.getSpecialty().getBoVersion());
		this.clinic = vo.getClinic() == null ? null : (ims.scheduling.vo.beans.ProfileLiteVoBean)vo.getClinic().getBean(map);
		this.datefrom = vo.getDateFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateFrom().getBean();
		this.dateto = vo.getDateTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateTo().getBean();
		this.nhsno = vo.getNHSNo();
		this.failedrequests = vo.getFailedRequests();
		this.dateupdatedfrom = vo.getDateUpdatedFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateUpdatedFrom().getBean();
		this.dateupdatedto = vo.getDateUpdatedTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateUpdatedTo().getBean();
	}

	public ims.RefMan.vo.MaintenanceSearchCriteriaVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.MaintenanceSearchCriteriaVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.MaintenanceSearchCriteriaVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.MaintenanceSearchCriteriaVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.MaintenanceSearchCriteriaVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.vo.RefVoBean getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.vo.RefVoBean value)
	{
		this.specialty = value;
	}
	public ims.scheduling.vo.beans.ProfileLiteVoBean getClinic()
	{
		return this.clinic;
	}
	public void setClinic(ims.scheduling.vo.beans.ProfileLiteVoBean value)
	{
		this.clinic = value;
	}
	public ims.framework.utils.beans.DateBean getDateFrom()
	{
		return this.datefrom;
	}
	public void setDateFrom(ims.framework.utils.beans.DateBean value)
	{
		this.datefrom = value;
	}
	public ims.framework.utils.beans.DateBean getDateTo()
	{
		return this.dateto;
	}
	public void setDateTo(ims.framework.utils.beans.DateBean value)
	{
		this.dateto = value;
	}
	public String getNHSNo()
	{
		return this.nhsno;
	}
	public void setNHSNo(String value)
	{
		this.nhsno = value;
	}
	public Boolean getFailedRequests()
	{
		return this.failedrequests;
	}
	public void setFailedRequests(Boolean value)
	{
		this.failedrequests = value;
	}
	public ims.framework.utils.beans.DateBean getDateUpdatedFrom()
	{
		return this.dateupdatedfrom;
	}
	public void setDateUpdatedFrom(ims.framework.utils.beans.DateBean value)
	{
		this.dateupdatedfrom = value;
	}
	public ims.framework.utils.beans.DateBean getDateUpdatedTo()
	{
		return this.dateupdatedto;
	}
	public void setDateUpdatedTo(ims.framework.utils.beans.DateBean value)
	{
		this.dateupdatedto = value;
	}

	private ims.vo.RefVoBean specialty;
	private ims.scheduling.vo.beans.ProfileLiteVoBean clinic;
	private ims.framework.utils.beans.DateBean datefrom;
	private ims.framework.utils.beans.DateBean dateto;
	private String nhsno;
	private Boolean failedrequests;
	private ims.framework.utils.beans.DateBean dateupdatedfrom;
	private ims.framework.utils.beans.DateBean dateupdatedto;
}