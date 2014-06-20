// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.lookups;

import ims.framework.cn.data.TreeModel;
import ims.framework.cn.data.TreeNode;
import ims.vo.LookupInstanceCollection;
import ims.vo.LookupInstVo;

public class ICABReferralStatusCollection extends LookupInstanceCollection implements ims.vo.ImsCloneable, TreeModel
{
	private static final long serialVersionUID = 1L;
	public void add(ICABReferralStatus value)
	{
		super.add(value);
	}
	public int indexOf(ICABReferralStatus instance)
	{
		return super.indexOf(instance);
	}
	public boolean contains(ICABReferralStatus instance)
	{
		return indexOf(instance) >= 0;
	}
	public ICABReferralStatus get(int index)
	{
		return (ICABReferralStatus)super.getIndex(index);
	}
	public void remove(ICABReferralStatus instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public Object clone()
	{
		ICABReferralStatusCollection newCol = new ICABReferralStatusCollection();
		ICABReferralStatus item;
		for (int i = 0; i < super.size(); i++)
		{
			item = this.get(i);
			newCol.add(new ICABReferralStatus(item.getID(), item.getText(), item.isActive(), item.getParent(), item.getImage(), item.getColor(), item.getOrder()));
		}
		for (int i = 0; i < newCol.size(); i++)
		{
			item = newCol.get(i);
			if (item.getParent() != null)
			{
				int parentIndex = this.indexOf(item.getParent());
				if(parentIndex >= 0)
					item.setParent(newCol.get(parentIndex));
				else
					item.setParent((ICABReferralStatus)item.getParent().clone());
			}
		}
		return newCol;
	}
	public ICABReferralStatus getInstance(int instanceId)
	{
		return (ICABReferralStatus)super.getInstanceById(instanceId);
	}
	public TreeNode[] getRootNodes()
	{
		LookupInstVo[] roots = super.getRoots();
		TreeNode[] nodes = new TreeNode[roots.length];
		System.arraycopy(roots, 0, nodes, 0, roots.length);
		return nodes;
	}
	public ICABReferralStatus[] toArray()
	{
		ICABReferralStatus[] arr = new ICABReferralStatus[this.size()];
		super.toArray(arr);
		return arr;
	}
	public static ICABReferralStatusCollection buildFromBeanCollection(java.util.Collection beans)
	{
		ICABReferralStatusCollection coll = new ICABReferralStatusCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while(iter.hasNext())
		{
			coll.add(ICABReferralStatus.buildLookup((ims.vo.LookupInstanceBean)iter.next()));
		}
		return coll;
	}
	public static ICABReferralStatusCollection buildFromBeanCollection(ims.vo.LookupInstanceBean[] beans)
	{
		ICABReferralStatusCollection coll = new ICABReferralStatusCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(ICABReferralStatus.buildLookup(beans[x]));
		}
		return coll;
	}
}