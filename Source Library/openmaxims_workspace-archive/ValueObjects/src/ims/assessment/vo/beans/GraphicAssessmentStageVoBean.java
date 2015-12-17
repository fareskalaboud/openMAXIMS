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

package ims.assessment.vo.beans;

public class GraphicAssessmentStageVoBean extends ims.vo.ValueObjectBean
{
	public GraphicAssessmentStageVoBean()
	{
	}
	public GraphicAssessmentStageVoBean(ims.assessment.vo.GraphicAssessmentStageVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.isannotated = vo.getIsAnnotated();
		this.stagename = vo.getStageName();
		this.equivalentstage = vo.getEquivalentStage() == null ? null : (ims.assessment.vo.beans.GraphicAssessmentStageVoBean)vo.getEquivalentStage().getBean();
		this.isactive = vo.getIsActive();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.assessment.vo.GraphicAssessmentStageVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.isannotated = vo.getIsAnnotated();
		this.stagename = vo.getStageName();
		this.equivalentstage = vo.getEquivalentStage() == null ? null : (ims.assessment.vo.beans.GraphicAssessmentStageVoBean)vo.getEquivalentStage().getBean(map);
		this.isactive = vo.getIsActive();
	}

	public ims.assessment.vo.GraphicAssessmentStageVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.assessment.vo.GraphicAssessmentStageVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.assessment.vo.GraphicAssessmentStageVo vo = null;
		if(map != null)
			vo = (ims.assessment.vo.GraphicAssessmentStageVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.assessment.vo.GraphicAssessmentStageVo();
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
	public Boolean getIsAnnotated()
	{
		return this.isannotated;
	}
	public void setIsAnnotated(Boolean value)
	{
		this.isannotated = value;
	}
	public String getStageName()
	{
		return this.stagename;
	}
	public void setStageName(String value)
	{
		this.stagename = value;
	}
	public ims.assessment.vo.beans.GraphicAssessmentStageVoBean getEquivalentStage()
	{
		return this.equivalentstage;
	}
	public void setEquivalentStage(ims.assessment.vo.beans.GraphicAssessmentStageVoBean value)
	{
		this.equivalentstage = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}

	private Integer id;
	private int version;
	private Boolean isannotated;
	private String stagename;
	private ims.assessment.vo.beans.GraphicAssessmentStageVoBean equivalentstage;
	private Boolean isactive;
}