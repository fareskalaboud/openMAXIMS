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

package ims.emergency.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to emergency.Configuration.TriagePriorityKPConfig business object (ID: 1087100008).
 */
public class TriagePriorityKpConfigVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<TriagePriorityKpConfigVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<TriagePriorityKpConfigVo> col = new ArrayList<TriagePriorityKpConfigVo>();
	public String getBoClassName()
	{
		return "ims.emergency.configuration.domain.objects.TriagePriorityKPConfig";
	}
	public boolean add(TriagePriorityKpConfigVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, TriagePriorityKpConfigVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(TriagePriorityKpConfigVo instance)
	{
		return col.indexOf(instance);
	}
	public TriagePriorityKpConfigVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, TriagePriorityKpConfigVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(TriagePriorityKpConfigVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(TriagePriorityKpConfigVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		TriagePriorityKpConfigVoCollection clone = new TriagePriorityKpConfigVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((TriagePriorityKpConfigVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public TriagePriorityKpConfigVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public TriagePriorityKpConfigVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public TriagePriorityKpConfigVoCollection sort(SortOrder order)
	{
		return sort(new TriagePriorityKpConfigVoComparator(order));
	}
	public TriagePriorityKpConfigVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new TriagePriorityKpConfigVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public TriagePriorityKpConfigVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.emergency.configuration.vo.TriagePriorityKPConfigRefVoCollection toRefVoCollection()
	{
		ims.emergency.configuration.vo.TriagePriorityKPConfigRefVoCollection result = new ims.emergency.configuration.vo.TriagePriorityKPConfigRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public TriagePriorityKpConfigVo[] toArray()
	{
		TriagePriorityKpConfigVo[] arr = new TriagePriorityKpConfigVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<TriagePriorityKpConfigVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class TriagePriorityKpConfigVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public TriagePriorityKpConfigVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public TriagePriorityKpConfigVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public TriagePriorityKpConfigVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			TriagePriorityKpConfigVo voObj1 = (TriagePriorityKpConfigVo)obj1;
			TriagePriorityKpConfigVo voObj2 = (TriagePriorityKpConfigVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.emergency.vo.beans.TriagePriorityKpConfigVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.emergency.vo.beans.TriagePriorityKpConfigVoBean[] getBeanCollectionArray()
	{
		ims.emergency.vo.beans.TriagePriorityKpConfigVoBean[] result = new ims.emergency.vo.beans.TriagePriorityKpConfigVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			TriagePriorityKpConfigVo vo = ((TriagePriorityKpConfigVo)col.get(i));
			result[i] = (ims.emergency.vo.beans.TriagePriorityKpConfigVoBean)vo.getBean();
		}
		return result;
	}
	public static TriagePriorityKpConfigVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		TriagePriorityKpConfigVoCollection coll = new TriagePriorityKpConfigVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.emergency.vo.beans.TriagePriorityKpConfigVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static TriagePriorityKpConfigVoCollection buildFromBeanCollection(ims.emergency.vo.beans.TriagePriorityKpConfigVoBean[] beans)
	{
		TriagePriorityKpConfigVoCollection coll = new TriagePriorityKpConfigVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
