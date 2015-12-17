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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.80 build 5540.19885)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.

package ims.clinical.domain.impl;

import ims.clinical.domain.base.impl.BaseTheatreSafeyBriefDelayDialogImpl;
import ims.clinical.vo.domain.SessionTheatreDelayAndDebriefTimesVoAssembler;
import ims.domain.DomainFactory;
import ims.framework.exceptions.CodingRuntimeException;
import ims.scheduling.domain.objects.Sch_Session;

public class TheatreSafeyBriefDelayDialogImpl extends BaseTheatreSafeyBriefDelayDialogImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* saveSessionDebrief
	*/
	public void saveSessionDelay(ims.clinical.vo.SessionTheatreDelayAndDebriefTimesVo sessionDelay) throws ims.domain.exceptions.StaleObjectException
	{
		String methodName = "saveSessionDelay";
		if (sessionDelay == null)
			throw new CodingRuntimeException("saveSessionDelay is null in method " + methodName);
		if (!sessionDelay.isValidated())
			throw new CodingRuntimeException("saveSessionDelay has not been validated in method " + methodName);

		DomainFactory factory = getDomainFactory();
		Sch_Session doSession = SessionTheatreDelayAndDebriefTimesVoAssembler.extractSch_Session(factory, sessionDelay);
		factory.save(doSession);
	}

	/**
	* getSessionDebrief
	*/
	public ims.clinical.vo.SessionTheatreDelayAndDebriefTimesVo getSessionDelay(ims.scheduling.vo.Sch_SessionRefVo sessionDelay) 
	{
		if (sessionDelay == null)
			throw new CodingRuntimeException("session is null in method getSessionDelay");
		
		return SessionTheatreDelayAndDebriefTimesVoAssembler.create((Sch_Session) getDomainFactory().getDomainObject(sessionDelay));
	}
}