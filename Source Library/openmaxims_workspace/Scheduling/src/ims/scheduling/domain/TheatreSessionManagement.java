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

package ims.scheduling.domain;

// Generated from form domain impl
public interface TheatreSessionManagement extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public ims.scheduling.vo.ProfileLiteVoCollection listProfiles(String profileName);

	// Generated from form domain interface definition
	public ims.core.vo.LocationLiteVoCollection listActiveHospitals();

	// Generated from form domain interface definition
	public ims.core.vo.LocationLiteVo getHospitalForCurrentLocation(Integer locId);

	// Generated from form domain interface definition
	public ims.core.vo.LocShortMappingsVoCollection listActiveLocationsForHospital(ims.core.vo.LocationLiteVo location);

	// Generated from form domain interface definition
	public ims.core.vo.HcpLiteVoCollection listHcpLite(ims.core.vo.HcpFilter filter);

	// Generated from form domain interface definition
	public ims.core.vo.ServiceVoCollection listServices();

	// Generated from form domain interface definition
	public ims.scheduling.vo.TheatreSessionManagementVoCollection listSessions(ims.scheduling.vo.SessionManagementSearchCriteriaVo searchCriteria);

	// Generated from form domain interface definition
	public ims.RefMan.vo.CatsReferralForSessionManagementVo getCatsReferralForAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appointmentRef);

	// Generated from form domain interface definition
	public ims.scheduling.vo.SessionShortVo getSessionShortVo(ims.scheduling.vo.Sch_SessionRefVo sessionRef);

	// Generated from form domain interface definition
	public void cancelSession(ims.scheduling.vo.Sch_SessionRefVo session, ims.scheduling.vo.Appointment_StatusVo voApptCancelStatus, Boolean cancelAppointment, Boolean isFlexible) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.SessionVo getSessionVo(ims.scheduling.vo.Sch_SessionRefVo sessionRef);

	// Generated from form domain interface definition
	public ims.scheduling.vo.TheatreSessionManagementVo getSessionManagementVo(ims.scheduling.vo.Sch_SessionRefVo sessionRef);

	// Generated from form domain interface definition
	public ims.scheduling.vo.SessionVo saveSession(ims.scheduling.vo.SessionVo session, Boolean editingSlots) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public Boolean isReferralICPCompleted(ims.RefMan.vo.CatsReferralRefVo catsReferral);

	// Generated from form domain interface definition
	public ims.scheduling.vo.Booking_AppointmentVo getBookingAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appt);

	// Generated from form domain interface definition
	public ims.scheduling.vo.Booking_AppointmentVo cancelAppt(ims.scheduling.vo.Booking_AppointmentVo appt, ims.chooseandbook.vo.lookups.ActionRequestType requestType, String requestSource) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void updateCatsReferralAdditionalInvStatus(ims.RefMan.vo.CatsReferralRefVo catsReferral) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void updateCatsReferralAdditionalInvStatus(ims.RefMan.vo.CatsReferralRefVo catsReferral, ims.scheduling.vo.Booking_AppointmentRefVo appt) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void updateCatsReferralCancelStatus(ims.RefMan.vo.CatsReferralRefVo catsReferral) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.core.vo.PatientShort getPatientShort(ims.core.patient.vo.PatientRefVo patientRef);

	// Generated from form domain interface definition
	public ims.scheduling.vo.TheatreSessionManagementVo justSaveSession(ims.scheduling.vo.TheatreSessionManagementVo sessionToSave) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void saveAppointment(ims.scheduling.vo.BookingAppointmentForSessionManagementVo appointmentToSave) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection getTheatreFixedSlotsForSession(ims.scheduling.vo.Sch_SessionRefVo sessionRef);

	// Generated from form domain interface definition
	public void addTheatreFixedSlotToSession(ims.scheduling.vo.TheatreSessionManagementVo session, ims.scheduling.vo.SessionParentChildSlotVo slot) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.RefMan.vo.TheatreProcedureServiceAndConsultantLiteVo getTheatreServiceProcedureAndConsultant(ims.scheduling.vo.Booking_AppointmentRefVo appt);

	// Generated from form domain interface definition
	public ims.scheduling.vo.BookingAppointmentTheatreVo getTheatreAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appt);

	// Generated from form domain interface definition
	public void cancelTCIAndReferralEROD(ims.RefMan.vo.CatsReferralRefVo catsReferral, ims.scheduling.vo.Booking_AppointmentRefVo apptRef,  ims.scheduling.vo.lookups.CancelAppointmentReason cancellationReason, String cancellationComments, Boolean isProviderCancellation, Boolean isPatientCancellation, Boolean cancelledForNonmedicalReason) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.BookingAppointmentTheatreVoCollection getCancelledAppointmentsForSession(ims.scheduling.vo.Sch_SessionRefVo session);

	// Generated from form domain interface definition
	public ims.RefMan.vo.PatientElectiveListRefVo getPatientElectiveListForAppt(ims.scheduling.vo.Booking_AppointmentRefVo appointment);

	// Generated from form domain interface definition
	public ims.scheduling.vo.PendingEmergencyTheatreRefVo getPendingEmergencyTheatreForAppt(ims.scheduling.vo.Booking_AppointmentRefVo appointment);

	// Generated from form domain interface definition
	public Boolean hasSlotConflictWithSessionSlots(ims.scheduling.vo.Sch_SessionRefVo session, ims.scheduling.vo.SessionParentChildSlotVo slot);

	// Generated from form domain interface definition
	public void cancelTCI(ims.RefMan.vo.PatientElectiveListRefVo patientElectiveListRef, ims.RefMan.vo.TCIOutcomeForPatientElectiveListVo tciOutcomeVo, ims.scheduling.vo.Booking_AppointmentRefVo theatreApptToCancel) throws ims.domain.exceptions.StaleObjectException;
}