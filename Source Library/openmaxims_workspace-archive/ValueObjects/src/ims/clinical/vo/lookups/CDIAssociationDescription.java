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

package ims.clinical.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class CDIAssociationDescription extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public CDIAssociationDescription()
	{
		super();
	}
	public CDIAssociationDescription(int id)
	{
		super(id, "", true);
	}
	public CDIAssociationDescription(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public CDIAssociationDescription(int id, String text, boolean active, CDIAssociationDescription parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public CDIAssociationDescription(int id, String text, boolean active, CDIAssociationDescription parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public CDIAssociationDescription(int id, String text, boolean active, CDIAssociationDescription parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static CDIAssociationDescription buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new CDIAssociationDescription(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (CDIAssociationDescription)super.getParentInstance();
	}
	public CDIAssociationDescription getParent()
	{
		return (CDIAssociationDescription)super.getParentInstance();
	}
	public void setParent(CDIAssociationDescription parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		CDIAssociationDescription[] typedChildren = new CDIAssociationDescription[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (CDIAssociationDescription)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof CDIAssociationDescription)
		{
			super.addChild((CDIAssociationDescription)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof CDIAssociationDescription)
		{
			super.removeChild((CDIAssociationDescription)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		CDIAssociationDescriptionCollection result = new CDIAssociationDescriptionCollection();
		result.add(ISACOMPLICATIONOF);
		return result;
	}
	public static CDIAssociationDescription[] getNegativeInstances()
	{
		CDIAssociationDescription[] instances = new CDIAssociationDescription[1];
		instances[0] = ISACOMPLICATIONOF;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[1];
		negativeInstances[0] = "ISACOMPLICATIONOF";
		return negativeInstances;
	}
	public static CDIAssociationDescription getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static CDIAssociationDescription getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		CDIAssociationDescription[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1231022;
	public static final CDIAssociationDescription ISACOMPLICATIONOF = new CDIAssociationDescription(-923, "is a complication of", true, null, null, Color.Default);
}
