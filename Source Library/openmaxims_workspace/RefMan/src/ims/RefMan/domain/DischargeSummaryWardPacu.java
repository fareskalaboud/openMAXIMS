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

package ims.RefMan.domain;

// Generated from form domain impl
public interface DischargeSummaryWardPacu extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* Lists all discharge summaries (Ward and PACU) associated with provieded referral. Returns null if none are found or provided referral is null.
	*/
	public ims.RefMan.vo.DischargeSummaryPacuAndWardLiteVoCollection listDischargeSummaryWardAndPacu(ims.RefMan.vo.CatsReferralRefVo referral);

	// Generated from form domain interface definition
	/**
	* Funtion used to retrieve all details for a discharge summary (Ward and PACU). Throws CodingRuntime exception if the argument passed is null or has no ID.
	*/
	public ims.RefMan.vo.DischargeSummaryPacuAndWardVo getDischargeSummaryWardAndPacu(ims.RefMan.vo.DischargeSummaryPacuAndWardRefVo dischargeSummaryRef);

	// Generated from form domain interface definition
	public ims.RefMan.vo.DischargeSummaryPacuAndWardVo saveDischargeSummaryWardAndPacu(ims.RefMan.vo.DischargeSummaryPacuAndWardVo dischargeSummary) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection getAppointments(ims.RefMan.vo.CatsReferralRefVo referral);

	// Generated from form domain interface definition
	public Boolean getReferralAccepted(ims.RefMan.vo.CatsReferralRefVo referral) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.SessionServiceAndSlotActivityVo getServiceAndActivityByAppt(ims.scheduling.vo.Booking_AppointmentRefVo booking) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.Booking_AppointmentVo getAppointmentFull(ims.scheduling.vo.Booking_AppointmentRefVo booking) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.Booking_AppointmentVo cancelAppointment(ims.scheduling.vo.Booking_AppointmentVo appointment, ims.chooseandbook.vo.lookups.ActionRequestType requestType, String requestSource) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void updateCatsReferralAdditionalInvStatus(ims.RefMan.vo.CatsReferralRefVo referral) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.BookingAppointmentTheatreVo getTheatreAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appointment);

	// Generated from form domain interface definition
	public ims.RefMan.vo.TheatreProcedureServiceAndConsultantLiteVo getTheatreServiceProcedureAndConsultant(ims.scheduling.vo.Booking_AppointmentRefVo booking);

	// Generated from form domain interface definition
	public ims.core.vo.InpatientEpisodeVo getInpatientEpisode(ims.RefMan.vo.CatsReferralRefVo referral);

	// Generated from form domain interface definition
	public ims.core.vo.DischargedEpisodeVo dischargePatient(ims.RefMan.vo.CatsReferralRefVo referral, ims.core.vo.DischargedEpisodeVo dischargeEpisode) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	public String[] getSystemReportAndTemplate(Integer imsID);

	// Generated from form domain interface definition
	public ims.RefMan.vo.CatsReferralReportsVo getCatsReferralReport(ims.RefMan.vo.CatsReferralRefVo referral);

	// Generated from form domain interface definition
	public void saveDocument(ims.core.vo.PatientDocumentVo document, ims.RefMan.vo.CatsReferralRefVo referral, Boolean bIsCurrent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.core.patient.vo.PatientRefVo getPatientRef(ims.RefMan.vo.CatsReferralRefVo referral);

	// Generated from form domain interface definition
	public ims.core.admin.vo.CareContextRefVo getCareContextRef(ims.RefMan.vo.CatsReferralRefVo referral);

	// Generated from form domain interface definition
	public ims.core.admin.vo.EpisodeOfCareRefVo getEpisodeOfCareRef(ims.RefMan.vo.CatsReferralRefVo referral);

	// Generated from form domain interface definition
	public ims.RefMan.vo.CatsReferralWizardVo getCatsReferral(ims.RefMan.vo.CatsReferralRefVo voCatsRef);

	// Generated from form domain interface definition
	public ims.RefMan.vo.DischargeSummaryPacuAndWardVo saveDischargeSummaryWardAndPacuPlusCatsReferral(ims.RefMan.vo.DischargeSummaryPacuAndWardVo dischargeSummary, ims.RefMan.vo.DischargeSummaryPacuAndWardLiteVo currentDischarge, ims.RefMan.vo.CatsReferralWizardVo voCatsReferralWizard, ims.core.vo.InpatientEpisodeVo inpatep) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.framework.utils.DateTime getAdmissionDateTime(ims.RefMan.vo.CatsReferralRefVo voCatsRef);

	// Generated from form domain interface definition
	public ims.core.vo.PatientDiagnosisLiteVoCollection getDiagnosis(ims.core.admin.vo.CareContextRefVo careContextRef);

	// Generated from form domain interface definition
	public ims.framework.utils.DateTime getCurrentAddmissionDateTime(ims.core.admin.pas.vo.DischargedEpisodeRefVo dischargedEpisode);

	// Generated from form domain interface definition
	public ims.core.clinical.vo.PatientProcedureRefVo getPerformedProcedureFromLastIntraOperativeRecordForCareContext(ims.core.admin.vo.CareContextRefVo careContextRef);

	// Generated from form domain interface definition
	public ims.RefMan.vo.DischargeSummaryPacuAndWardVo saveAndDischarge(ims.RefMan.vo.DischargeSummaryPacuAndWardVo dischargeSummary, ims.RefMan.vo.DischargeSummaryPacuAndWardLiteVo currentDischarge, ims.RefMan.vo.CatsReferralWizardVo voCatsReferralWizard, ims.core.vo.DischargedEpisodeVo dischargeEpisode, ims.core.vo.InpatientEpisodeVo pasEvent) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	public Boolean hasInapatientEpisode(ims.core.patient.vo.PatientRefVo patient);

	// Generated from form domain interface definition
	public ims.core.vo.DischargedEpisodeVo getDischargedEpisode(ims.core.admin.pas.vo.DischargedEpisodeRefVo dischargedEpisodeRef);

	// Generated from form domain interface definition
	public void updateCatsReferralCancelStatus(ims.RefMan.vo.CatsReferralRefVo referral) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public Boolean isLinkedICPCompleted(ims.RefMan.vo.CatsReferralRefVo catsReferral);

	// Generated from form domain interface definition
	public void updateCatsReferralAdditionalInvStatus(ims.RefMan.vo.CatsReferralRefVo referral, ims.scheduling.vo.Booking_AppointmentRefVo appointment) throws ims.domain.exceptions.StaleObjectException;
}
