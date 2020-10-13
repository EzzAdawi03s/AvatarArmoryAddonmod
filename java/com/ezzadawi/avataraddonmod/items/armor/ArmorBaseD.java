package com.ezzadawi.avataraddonmod.items.armor;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import com.ezzadawi.avataraddonmod.Main;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBaseD extends ItemArmor implements IHasModel

{

	public ArmorBaseD(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.airnomadarmory);
		
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");	
	}
	
	
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;	
	}
	
	
	public boolean isFullCube(IBlockState state)
	{
	    return false;
	}
	
	@Override
	public boolean isFull3D()
	{
		return super.isFull3D();
	}
	
	@Override
	public boolean isShield(ItemStack stack, EntityLivingBase entity) {
		// TODO Auto-generated method stub
		return super.isShield(stack, entity);
	}

}
