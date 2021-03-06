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

package ims.ocrr.vo.beans;

public class OrderEntryTemplateVoBean extends ims.vo.ValueObjectBean
{
	public OrderEntryTemplateVoBean()
	{
	}
	public OrderEntryTemplateVoBean(ims.ocrr.vo.OrderEntryTemplateVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.formname = vo.getFormName();
		this.menuname = vo.getMenuName();
		this.description = vo.getDescription();
		this.components = vo.getComponents() == null ? null : vo.getComponents().getBeanCollection();
		this.templatecategory = vo.getTemplateCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getTemplateCategory().getBean();
		this.activestatus = vo.getActiveStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getActiveStatus().getBean();
		this.templateslocations = vo.getTemplatesLocations() == null ? null : vo.getTemplatesLocations().getBeanCollection();
		this.columns = vo.getColumns() == null ? null : vo.getColumns().getBeanCollection();
		this.templateroles = vo.getTemplateRoles() == null ? null : vo.getTemplateRoles().getBeanCollection();
		this.formtext = vo.getFormText();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.OrderEntryTemplateVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.formname = vo.getFormName();
		this.menuname = vo.getMenuName();
		this.description = vo.getDescription();
		this.components = vo.getComponents() == null ? null : vo.getComponents().getBeanCollection();
		this.templatecategory = vo.getTemplateCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getTemplateCategory().getBean();
		this.activestatus = vo.getActiveStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getActiveStatus().getBean();
		this.templateslocations = vo.getTemplatesLocations() == null ? null : vo.getTemplatesLocations().getBeanCollection();
		this.columns = vo.getColumns() == null ? null : vo.getColumns().getBeanCollection();
		this.templateroles = vo.getTemplateRoles() == null ? null : vo.getTemplateRoles().getBeanCollection();
		this.formtext = vo.getFormText();
	}

	public ims.ocrr.vo.OrderEntryTemplateVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocrr.vo.OrderEntryTemplateVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.OrderEntryTemplateVo vo = null;
		if(map != null)
			vo = (ims.ocrr.vo.OrderEntryTemplateVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocrr.vo.OrderEntryTemplateVo();
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
	public String getFormName()
	{
		return this.formname;
	}
	public void setFormName(String value)
	{
		this.formname = value;
	}
	public String getMenuName()
	{
		return this.menuname;
	}
	public void setMenuName(String value)
	{
		this.menuname = value;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String value)
	{
		this.description = value;
	}
	public ims.ocrr.vo.beans.OrderEntryTemplateComponentShortVoBean[] getComponents()
	{
		return this.components;
	}
	public void setComponents(ims.ocrr.vo.beans.OrderEntryTemplateComponentShortVoBean[] value)
	{
		this.components = value;
	}
	public ims.vo.LookupInstanceBean getTemplateCategory()
	{
		return this.templatecategory;
	}
	public void setTemplateCategory(ims.vo.LookupInstanceBean value)
	{
		this.templatecategory = value;
	}
	public ims.vo.LookupInstanceBean getActiveStatus()
	{
		return this.activestatus;
	}
	public void setActiveStatus(ims.vo.LookupInstanceBean value)
	{
		this.activestatus = value;
	}
	public ims.ocrr.vo.beans.TemplateLocationShortVoBean[] getTemplatesLocations()
	{
		return this.templateslocations;
	}
	public void setTemplatesLocations(ims.ocrr.vo.beans.TemplateLocationShortVoBean[] value)
	{
		this.templateslocations = value;
	}
	public ims.ocrr.vo.beans.OrderEntryTemplateColumnVoBean[] getColumns()
	{
		return this.columns;
	}
	public void setColumns(ims.ocrr.vo.beans.OrderEntryTemplateColumnVoBean[] value)
	{
		this.columns = value;
	}
	public ims.ocrr.vo.beans.TemplateRoleShortVoBean[] getTemplateRoles()
	{
		return this.templateroles;
	}
	public void setTemplateRoles(ims.ocrr.vo.beans.TemplateRoleShortVoBean[] value)
	{
		this.templateroles = value;
	}
	public String getFormText()
	{
		return this.formtext;
	}
	public void setFormText(String value)
	{
		this.formtext = value;
	}

	private Integer id;
	private int version;
	private String formname;
	private String menuname;
	private String description;
	private ims.ocrr.vo.beans.OrderEntryTemplateComponentShortVoBean[] components;
	private ims.vo.LookupInstanceBean templatecategory;
	private ims.vo.LookupInstanceBean activestatus;
	private ims.ocrr.vo.beans.TemplateLocationShortVoBean[] templateslocations;
	private ims.ocrr.vo.beans.OrderEntryTemplateColumnVoBean[] columns;
	private ims.ocrr.vo.beans.TemplateRoleShortVoBean[] templateroles;
	private String formtext;
}
