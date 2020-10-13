package com.ezzadawi.avataraddonmod.items.tools;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.items.ItemSword;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import com.ezzadawi.avataraddonmod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolMeteoriteSword extends ItemAxe implements IHasModel{
	
	public ToolMeteoriteSword(String name, ToolMaterial material)
	{
		super(material, 9.0f, 0.0f);
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
