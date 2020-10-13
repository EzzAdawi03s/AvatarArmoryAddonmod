package com.ezzadawi.avataraddonmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() 
	
	{
		GameRegistry.addSmelting(Blocks.LAPIS_BLOCK, new ItemStack(ModItems.BLUE_HEAVY_BALL, 2), 1.5f);
		GameRegistry.addSmelting(ModBlocks.METEORITE, new ItemStack(ModItems.METEORITE_INGOT, 50), 35.0f);

	}

}
