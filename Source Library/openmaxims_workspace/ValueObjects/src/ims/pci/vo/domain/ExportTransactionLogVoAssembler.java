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
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class ExportTransactionLogVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.ExportTransactionLogVo copy(ims.pci.vo.ExportTransactionLogVo valueObjectDest, ims.pci.vo.ExportTransactionLogVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ExportTransactionLog(valueObjectSrc.getID_ExportTransactionLog());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DateGenerated
		valueObjectDest.setDateGenerated(valueObjectSrc.getDateGenerated());
		// RegistrationFilename
		valueObjectDest.setRegistrationFilename(valueObjectSrc.getRegistrationFilename());
		// ImmunisationFilename
		valueObjectDest.setImmunisationFilename(valueObjectSrc.getImmunisationFilename());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createExportTransactionLogVoCollectionFromExportTransactionLog(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ExportTransactionLog objects.
	 */
	public static ims.pci.vo.ExportTransactionLogVoCollection createExportTransactionLogVoCollectionFromExportTransactionLog(java.util.Set domainObjectSet)	
	{
		return createExportTransactionLogVoCollectionFromExportTransactionLog(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ExportTransactionLog objects.
	 */
	public static ims.pci.vo.ExportTransactionLogVoCollection createExportTransactionLogVoCollectionFromExportTransactionLog(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.ExportTransactionLogVoCollection voList = new ims.pci.vo.ExportTransactionLogVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pci.domain.objects.ExportTransactionLog domainObject = (ims.pci.domain.objects.ExportTransactionLog) iterator.next();
			ims.pci.vo.ExportTransactionLogVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pci.domain.objects.ExportTransactionLog objects.
	 */
	public static ims.pci.vo.ExportTransactionLogVoCollection createExportTransactionLogVoCollectionFromExportTransactionLog(java.util.List domainObjectList) 
	{
		return createExportTransactionLogVoCollectionFromExportTransactionLog(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pci.domain.objects.ExportTransactionLog objects.
	 */
	public static ims.pci.vo.ExportTransactionLogVoCollection createExportTransactionLogVoCollectionFromExportTransactionLog(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.ExportTransactionLogVoCollection voList = new ims.pci.vo.ExportTransactionLogVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pci.domain.objects.ExportTransactionLog domainObject = (ims.pci.domain.objects.ExportTransactionLog) domainObjectList.get(i);
			ims.pci.vo.ExportTransactionLogVo vo = create(map, domainObject);

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
	 * Create the ims.pci.domain.objects.ExportTransactionLog set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractExportTransactionLogSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ExportTransactionLogVoCollection voCollection) 
	 {
	 	return extractExportTransactionLogSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractExportTransactionLogSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ExportTransactionLogVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ExportTransactionLogVo vo = voCollection.get(i);
			ims.pci.domain.objects.ExportTransactionLog domainObject = ExportTransactionLogVoAssembler.extractExportTransactionLog(domainFactory, vo, domMap);

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
	 * Create the ims.pci.domain.objects.ExportTransactionLog list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractExportTransactionLogList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ExportTransactionLogVoCollection voCollection) 
	 {
	 	return extractExportTransactionLogList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractExportTransactionLogList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ExportTransactionLogVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ExportTransactionLogVo vo = voCollection.get(i);
			ims.pci.domain.objects.ExportTransactionLog domainObject = ExportTransactionLogVoAssembler.extractExportTransactionLog(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pci.domain.objects.ExportTransactionLog object.
	 * @param domainObject ims.pci.domain.objects.ExportTransactionLog
	 */
	 public static ims.pci.vo.ExportTransactionLogVo create(ims.pci.domain.objects.ExportTransactionLog domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pci.domain.objects.ExportTransactionLog object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.ExportTransactionLogVo create(DomainObjectMap map, ims.pci.domain.objects.ExportTransactionLog domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.ExportTransactionLogVo valueObject = (ims.pci.vo.ExportTransactionLogVo) map.getValueObject(domainObject, ims.pci.vo.ExportTransactionLogVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.ExportTransactionLogVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pci.domain.objects.ExportTransactionLog
	 */
	 public static ims.pci.vo.ExportTransactionLogVo insert(ims.pci.vo.ExportTransactionLogVo valueObject, ims.pci.domain.objects.ExportTransactionLog domainObject) 
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
	 * @param domainObject ims.pci.domain.objects.ExportTransactionLog
	 */
	 public static ims.pci.vo.ExportTransactionLogVo insert(DomainObjectMap map, ims.pci.vo.ExportTransactionLogVo valueObject, ims.pci.domain.objects.ExportTransactionLog domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ExportTransactionLog(domainObject.getId());
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
			
		// DateGenerated
		java.util.Date DateGenerated = domainObject.getDateGenerated();
		if ( null != DateGenerated ) 
		{
			valueObject.setDateGenerated(new ims.framework.utils.DateTime(DateGenerated) );
		}
		// RegistrationFilename
		valueObject.setRegistrationFilename(domainObject.getRegistrationFilename());
		// ImmunisationFilename
		valueObject.setImmunisationFilename(domainObject.getImmunisationFilename());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pci.domain.objects.ExportTransactionLog extractExportTransactionLog(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ExportTransactionLogVo valueObject) 
	{
		return 	extractExportTransactionLog(domainFactory, valueObject, new HashMap());
	}

	public static ims.pci.domain.objects.ExportTransactionLog extractExportTransactionLog(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ExportTransactionLogVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ExportTransactionLog();
		ims.pci.domain.objects.ExportTransactionLog domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pci.domain.objects.ExportTransactionLog)domMap.get(valueObject);
			}
			// ims.pci.vo.ExportTransactionLogVo ID_ExportTransactionLog field is unknown
			domainObject = new ims.pci.domain.objects.ExportTransactionLog();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ExportTransactionLog());
			if (domMap.get(key) != null)
			{
				return (ims.pci.domain.objects.ExportTransactionLog)domMap.get(key);
			}
			domainObject = (ims.pci.domain.objects.ExportTransactionLog) domainFactory.getDomainObject(ims.pci.domain.objects.ExportTransactionLog.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ExportTransactionLog());

		ims.framework.utils.DateTime dateTime1 = valueObject.getDateGenerated();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setDateGenerated(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRegistrationFilename() != null && valueObject.getRegistrationFilename().equals(""))
		{
			valueObject.setRegistrationFilename(null);
		}
		domainObject.setRegistrationFilename(valueObject.getRegistrationFilename());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getImmunisationFilename() != null && valueObject.getImmunisationFilename().equals(""))
		{
			valueObject.setImmunisationFilename(null);
		}
		domainObject.setImmunisationFilename(valueObject.getImmunisationFilename());

		return domainObject;
	}

}