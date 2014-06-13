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

package ims.core.vo.beans;

public class CDSResultVoBean extends ims.vo.ValueObjectBean
{
	public CDSResultVoBean()
	{
	}
	public CDSResultVoBean(ims.core.vo.CDSResultVo vo)
	{
		this.successful = vo.getSuccessful();
		this.errormessage = vo.getErrorMessage();
		this.resulturl = vo.getResultUrl();
		this.logurl = vo.getLogUrl();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.CDSResultVo vo)
	{
		this.successful = vo.getSuccessful();
		this.errormessage = vo.getErrorMessage();
		this.resulturl = vo.getResultUrl();
		this.logurl = vo.getLogUrl();
	}

	public ims.core.vo.CDSResultVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.CDSResultVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.CDSResultVo vo = null;
		if(map != null)
			vo = (ims.core.vo.CDSResultVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.CDSResultVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Boolean getSuccessful()
	{
		return this.successful;
	}
	public void setSuccessful(Boolean value)
	{
		this.successful = value;
	}
	public String getErrorMessage()
	{
		return this.errormessage;
	}
	public void setErrorMessage(String value)
	{
		this.errormessage = value;
	}
	public String getResultUrl()
	{
		return this.resulturl;
	}
	public void setResultUrl(String value)
	{
		this.resulturl = value;
	}
	public String getLogUrl()
	{
		return this.logurl;
	}
	public void setLogUrl(String value)
	{
		this.logurl = value;
	}

	private Boolean successful;
	private String errormessage;
	private String resulturl;
	private String logurl;
}