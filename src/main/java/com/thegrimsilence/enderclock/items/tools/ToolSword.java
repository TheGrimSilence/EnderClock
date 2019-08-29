package com.thegrimsilence.enderclock.items.tools;

import com.thegrimsilence.enderclock.Main;
import com.thegrimsilence.enderclock.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{
	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
