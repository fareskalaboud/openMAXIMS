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

package ims.clinical.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseAcuteTheatreCaseTimesDialogImpl extends DomainImpl implements ims.clinical.domain.AcuteTheatreCaseTimesDialog, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatesaveAnaestheticSignIn(ims.clinical.vo.PeriOpAnaesthticSignInTimVo signIn, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
		if(signIn == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'signIn' of type 'ims.clinical.vo.PeriOpAnaesthticSignInTimVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetAnaestheticSignIn(ims.clinical.vo.PeriOpAnaesthticSignInTimVo signIn)
	{
		if(signIn == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'signIn' of type 'ims.clinical.vo.PeriOpAnaesthticSignInTimVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetSafetyBrief(ims.clinical.vo.PeriOpSafetyBriefTimeVo safetyBrief)
	{
		if(safetyBrief == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'safetyBrief' of type 'ims.clinical.vo.PeriOpSafetyBriefTimeVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetPatientSentFor(ims.clinical.vo.PeriOpPatientSentTimeVo patientSentFor)
	{
		if(patientSentFor == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'patientSentFor' of type 'ims.clinical.vo.PeriOpPatientSentTimeVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetPatientArrived(ims.clinical.vo.PeriOpPatientArrivedTimeVo patientArrived)
	{
		if(patientArrived == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'patientArrived' of type 'ims.clinical.vo.PeriOpPatientArrivedTimeVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetAnaesRFS(ims.clinical.vo.PeriOpReadyForSurgeryTimeVo anaesRFS)
	{
		if(anaesRFS == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'anaesRFS' of type 'ims.clinical.vo.PeriOpReadyForSurgeryTimeVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetTimeOutCompleted(ims.clinical.vo.PeriOpTimeOutCompleteVo timeOutCompleted)
	{
		if(timeOutCompleted == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'timeOutCompleted' of type 'ims.clinical.vo.PeriOpTimeOutCompleteVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetSurgeryStart(ims.clinical.vo.PeriOpSurgeryStartTimeVo surgeryStart)
	{
		if(surgeryStart == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'surgeryStart' of type 'ims.clinical.vo.PeriOpSurgeryStartTimeVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetSurgeryStop(ims.clinical.vo.PeriOpSurgeryStopTimeVo surgeryStop)
	{
		if(surgeryStop == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'surgeryStop' of type 'ims.clinical.vo.PeriOpSurgeryStopTimeVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetReadyForDischarge(ims.clinical.vo.PeriOpReadyForDischargeVo readyForDischarge)
	{
		if(readyForDischarge == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'readyForDischarge' of type 'ims.clinical.vo.PeriOpReadyForDischargeVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetPatientLeftTheatre(ims.clinical.vo.PeriOpPatientLeftTheatreVo patientLeftTheatre)
	{
		if(patientLeftTheatre == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'patientLeftTheatre' of type 'ims.clinical.vo.PeriOpPatientLeftTheatreVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetTimeOutOfRecovery(ims.clinical.vo.PeriOpTimeOutOfRecoveryVo timeOutOfRecovery)
	{
		if(timeOutOfRecovery == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'timeOutOfRecovery' of type 'ims.clinical.vo.PeriOpTimeOutOfRecoveryVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatesaveSafetyBrief(ims.clinical.vo.PeriOpSafetyBriefTimeVo safetyBrief, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
	}

	@SuppressWarnings("unused")
	public void validatesavePatientSentFor(ims.clinical.vo.PeriOpPatientSentTimeVo patientSentFor, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
	}

	@SuppressWarnings("unused")
	public void validatesavePatientArrived(ims.clinical.vo.PeriOpPatientArrivedTimeVo patientArrived, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveAnaesthetisedRFS(ims.clinical.vo.PeriOpReadyForSurgeryTimeVo anaesthetizedRFS, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveTimeOutCompleted(ims.clinical.vo.PeriOpTimeOutCompleteVo timeOutCompleted, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveSurgeryStart(ims.clinical.vo.PeriOpSurgeryStartTimeVo surgeryStart, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveSurgeryStop(ims.clinical.vo.PeriOpSurgeryStopTimeVo surgeryStop, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
	}

	@SuppressWarnings("unused")
	public void validatesavePatientLeftTheatre(ims.clinical.vo.PeriOpPatientLeftTheatreVo patientLeftTheatre, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
	}

	@SuppressWarnings("unused")
	public void validatesavePatientReadyForDischarge(ims.clinical.vo.PeriOpReadyForDischargeVo patientRFD, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveTimeOutOfRecovery(ims.clinical.vo.PeriOpTimeOutOfRecoveryVo timeOutOfRecovery, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
	}

	@SuppressWarnings("unused")
	public void validategetTimeIntoRecovery(ims.clinical.vo.PeriOpTimeIntoRecoveryVo timeIntoRecovery)
	{
		if(timeIntoRecovery == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'timeIntoRecovery' of type 'ims.clinical.vo.PeriOpTimeIntoRecoveryVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatesaveTimeIntoRecovery(ims.clinical.vo.PeriOpTimeIntoRecoveryVo timeIntoRecovery, ims.scheduling.vo.TheatreBookingRefVo theatreBooking)
	{
		if(timeIntoRecovery == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'timeIntoRecovery' of type 'ims.clinical.vo.PeriOpTimeIntoRecoveryVo' cannot be null.");
	}
}
