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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class DiathermyDetailIntraOpVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DiathermyDetailIntraOpVo copy(ims.clinical.vo.DiathermyDetailIntraOpVo valueObjectDest, ims.clinical.vo.DiathermyDetailIntraOpVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DiathermyDetailIntraOp(valueObjectSrc.getID_DiathermyDetailIntraOp());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// DiathermyMode
		valueObjectDest.setDiathermyMode(valueObjectSrc.getDiathermyMode());
		// CoagSetting
		valueObjectDest.setCoagSetting(valueObjectSrc.getCoagSetting());
		// CutSetting
		valueObjectDest.setCutSetting(valueObjectSrc.getCutSetting());
		// SerialNumber
		valueObjectDest.setSerialNumber(valueObjectSrc.getSerialNumber());
		// PadSite
		valueObjectDest.setPadSite(valueObjectSrc.getPadSite());
		// AppliedBy
		valueObjectDest.setAppliedBy(valueObjectSrc.getAppliedBy());
		// RemovedBy
		valueObjectDest.setRemovedBy(valueObjectSrc.getRemovedBy());
		// BlendSetting
		valueObjectDest.setBlendSetting(valueObjectSrc.getBlendSetting());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDiathermyDetailIntraOpVoCollectionFromDiathermyDetailIntraOp(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.DiathermyDetailIntraOp objects.
	 */
	public static ims.clinical.vo.DiathermyDetailIntraOpVoCollection createDiathermyDetailIntraOpVoCollectionFromDiathermyDetailIntraOp(java.util.Set domainObjectSet)	
	{
		return createDiathermyDetailIntraOpVoCollectionFromDiathermyDetailIntraOp(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.DiathermyDetailIntraOp objects.
	 */
	public static ims.clinical.vo.DiathermyDetailIntraOpVoCollection createDiathermyDetailIntraOpVoCollectionFromDiathermyDetailIntraOp(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DiathermyDetailIntraOpVoCollection voList = new ims.clinical.vo.DiathermyDetailIntraOpVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.DiathermyDetailIntraOp domainObject = (ims.clinical.domain.objects.DiathermyDetailIntraOp) iterator.next();
			ims.clinical.vo.DiathermyDetailIntraOpVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.clinical.domain.objects.DiathermyDetailIntraOp objects.
	 */
	public static ims.clinical.vo.DiathermyDetailIntraOpVoCollection createDiathermyDetailIntraOpVoCollectionFromDiathermyDetailIntraOp(java.util.List domainObjectList) 
	{
		return createDiathermyDetailIntraOpVoCollectionFromDiathermyDetailIntraOp(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.DiathermyDetailIntraOp objects.
	 */
	public static ims.clinical.vo.DiathermyDetailIntraOpVoCollection createDiathermyDetailIntraOpVoCollectionFromDiathermyDetailIntraOp(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DiathermyDetailIntraOpVoCollection voList = new ims.clinical.vo.DiathermyDetailIntraOpVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.DiathermyDetailIntraOp domainObject = (ims.clinical.domain.objects.DiathermyDetailIntraOp) domainObjectList.get(i);
			ims.clinical.vo.DiathermyDetailIntraOpVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.clinical.domain.objects.DiathermyDetailIntraOp set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDiathermyDetailIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DiathermyDetailIntraOpVoCollection voCollection) 
	 {
	 	return extractDiathermyDetailIntraOpSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDiathermyDetailIntraOpSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DiathermyDetailIntraOpVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DiathermyDetailIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.DiathermyDetailIntraOp domainObject = DiathermyDetailIntraOpVoAssembler.extractDiathermyDetailIntraOp(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.clinical.domain.objects.DiathermyDetailIntraOp list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDiathermyDetailIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DiathermyDetailIntraOpVoCollection voCollection) 
	 {
	 	return extractDiathermyDetailIntraOpList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDiathermyDetailIntraOpList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DiathermyDetailIntraOpVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DiathermyDetailIntraOpVo vo = voCollection.get(i);
			ims.clinical.domain.objects.DiathermyDetailIntraOp domainObject = DiathermyDetailIntraOpVoAssembler.extractDiathermyDetailIntraOp(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.clinical.domain.objects.DiathermyDetailIntraOp object.
	 * @param domainObject ims.clinical.domain.objects.DiathermyDetailIntraOp
	 */
	 public static ims.clinical.vo.DiathermyDetailIntraOpVo create(ims.clinical.domain.objects.DiathermyDetailIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.DiathermyDetailIntraOp object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DiathermyDetailIntraOpVo create(DomainObjectMap map, ims.clinical.domain.objects.DiathermyDetailIntraOp domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DiathermyDetailIntraOpVo valueObject = (ims.clinical.vo.DiathermyDetailIntraOpVo) map.getValueObject(domainObject, ims.clinical.vo.DiathermyDetailIntraOpVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DiathermyDetailIntraOpVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.DiathermyDetailIntraOp
	 */
	 public static ims.clinical.vo.DiathermyDetailIntraOpVo insert(ims.clinical.vo.DiathermyDetailIntraOpVo valueObject, ims.clinical.domain.objects.DiathermyDetailIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.DiathermyDetailIntraOp
	 */
	 public static ims.clinical.vo.DiathermyDetailIntraOpVo insert(DomainObjectMap map, ims.clinical.vo.DiathermyDetailIntraOpVo valueObject, ims.clinical.domain.objects.DiathermyDetailIntraOp domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DiathermyDetailIntraOp(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// TheatreAppointment
		if (domainObject.getTheatreAppointment() != null)
		{
			if(domainObject.getTheatreAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTheatreAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getTheatreAppointment().getId(), domainObject.getTheatreAppointment().getVersion()));
			}
		}
		// DiathermyMode
		ims.domain.lookups.LookupInstance instance2 = domainObject.getDiathermyMode();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.DiathermyMode voLookup2 = new ims.clinical.vo.lookups.DiathermyMode(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.DiathermyMode parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.DiathermyMode(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setDiathermyMode(voLookup2);
		}
				// CoagSetting
		valueObject.setCoagSetting(domainObject.getCoagSetting());
		// CutSetting
		valueObject.setCutSetting(domainObject.getCutSetting());
		// SerialNumber
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSerialNumber();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.DiathermySerialNumber voLookup5 = new ims.clinical.vo.lookups.DiathermySerialNumber(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.DiathermySerialNumber parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.DiathermySerialNumber(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSerialNumber(voLookup5);
		}
				// PadSite
		ims.domain.lookups.LookupInstance instance6 = domainObject.getPadSite();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.DiathermyPadSite voLookup6 = new ims.core.vo.lookups.DiathermyPadSite(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.DiathermyPadSite parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.DiathermyPadSite(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setPadSite(voLookup6);
		}
				// AppliedBy
		valueObject.setAppliedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAppliedBy()) );
		// RemovedBy
		valueObject.setRemovedBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getRemovedBy()) );
		// BlendSetting
		valueObject.setBlendSetting(domainObject.getBlendSetting());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.DiathermyDetailIntraOp extractDiathermyDetailIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DiathermyDetailIntraOpVo valueObject) 
	{
		return 	extractDiathermyDetailIntraOp(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.DiathermyDetailIntraOp extractDiathermyDetailIntraOp(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DiathermyDetailIntraOpVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DiathermyDetailIntraOp();
		ims.clinical.domain.objects.DiathermyDetailIntraOp domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.DiathermyDetailIntraOp)domMap.get(valueObject);
			}
			// ims.clinical.vo.DiathermyDetailIntraOpVo ID_DiathermyDetailIntraOp field is unknown
			domainObject = new ims.clinical.domain.objects.DiathermyDetailIntraOp();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DiathermyDetailIntraOp());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.DiathermyDetailIntraOp)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.DiathermyDetailIntraOp) domainFactory.getDomainObject(ims.clinical.domain.objects.DiathermyDetailIntraOp.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DiathermyDetailIntraOp());

		ims.scheduling.domain.objects.Booking_Appointment value1 = null;
		if ( null != valueObject.getTheatreAppointment() ) 
		{
			if (valueObject.getTheatreAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreAppointment()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getTheatreAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getTheatreAppointment();	
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getTheatreAppointment().getBoId());
			}
		}
		domainObject.setTheatreAppointment(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getDiathermyMode() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getDiathermyMode().getID());
		}
		domainObject.setDiathermyMode(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCoagSetting() != null && valueObject.getCoagSetting().equals(""))
		{
			valueObject.setCoagSetting(null);
		}
		domainObject.setCoagSetting(valueObject.getCoagSetting());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCutSetting() != null && valueObject.getCutSetting().equals(""))
		{
			valueObject.setCutSetting(null);
		}
		domainObject.setCutSetting(valueObject.getCutSetting());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSerialNumber() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSerialNumber().getID());
		}
		domainObject.setSerialNumber(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getPadSite() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getPadSite().getID());
		}
		domainObject.setPadSite(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value7 = null;
		if ( null != valueObject.getAppliedBy() ) 
		{
			if (valueObject.getAppliedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppliedBy()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getAppliedBy());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getAppliedBy().getBoId());
			}
		}
		domainObject.setAppliedBy(value7);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value8 = null;
		if ( null != valueObject.getRemovedBy() ) 
		{
			if (valueObject.getRemovedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getRemovedBy()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getRemovedBy());
				}
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getRemovedBy().getBoId());
			}
		}
		domainObject.setRemovedBy(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBlendSetting() != null && valueObject.getBlendSetting().equals(""))
		{
			valueObject.setBlendSetting(null);
		}
		domainObject.setBlendSetting(valueObject.getBlendSetting());

		return domainObject;
	}

}
