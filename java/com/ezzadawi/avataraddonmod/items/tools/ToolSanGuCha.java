package com.ezzadawi.avataraddonmod.items.tools;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import com.ezzadawi.avataraddonmod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSanGuCha extends ItemAxe implements IHasModel

{

	public ToolSanGuCha(String name, ToolMaterial material)
	{
		super(material, 2.0F, 5.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.firenationarmory);
		
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

	
}
