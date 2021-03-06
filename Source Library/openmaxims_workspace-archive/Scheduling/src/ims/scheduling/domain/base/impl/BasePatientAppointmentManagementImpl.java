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

package ims.scheduling.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BasePatientAppointmentManagementImpl extends DomainImpl implements ims.scheduling.domain.PatientAppointmentManagement, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatesearchPatients(ims.core.vo.PatientFilter filter)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistBookingAppointmentByPatientAndDate(ims.core.patient.vo.PatientRefVo patient, ims.framework.utils.Date apptDate)
	{
		if(patient == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'patient' of type 'ims.core.patient.vo.PatientRefVo' cannot be null.");
		if(apptDate == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'apptDate' of type 'ims.framework.utils.Date' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatesaveBookingAppt(ims.scheduling.vo.Booking_AppointmentShortVo appt, Boolean bUndoArrival, Boolean bUndoDNA)
	{
		if(appt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'appt' of type 'ims.scheduling.vo.Booking_AppointmentShortVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetServiceAndActivityByAppt(ims.scheduling.vo.Booking_AppointmentRefVo appt, Boolean isFlexible)
	{
		if(appt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'appt' of type 'ims.scheduling.vo.Booking_AppointmentRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetCatsReferralForAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appt)
	{
	}

	@SuppressWarnings("unused")
	public void validateupdateCatsReferralAdditionalInvStatus(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validategetServiceProcedureConsultantByAppt(ims.scheduling.vo.Booking_AppointmentShortVo appt)
	{
		if(appt == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'appt' of type 'ims.scheduling.vo.Booking_AppointmentShortVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validateupdateCatsReferralCancelStatus(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validategetBookingAppointmet(ims.scheduling.vo.Booking_AppointmentRefVo bookingApptRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveBookingApptFull(ims.scheduling.vo.Booking_AppointmentVo bookingApptFull, Boolean isProcessedForRTT)
	{
	}
}
