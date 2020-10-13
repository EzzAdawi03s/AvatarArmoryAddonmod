package com.ezzadawi.avataraddonmod.items.tools;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.items.ItemSword;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import com.ezzadawi.avataraddonmod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolMachete extends ItemAxe implements IHasModel{
	
	public ToolMachete(String name, ToolMaterial material)
	{
		super(material, 7.0f, -1.0f);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.watertribearmory);
		
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
