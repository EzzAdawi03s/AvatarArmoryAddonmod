package com.ezzadawi.avataraddonmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBoomerang extends Item
{
    public ItemBoomerang()
    {
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

    public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter)
    {
        EntityTippedArrow entitytippedarrow = new EntityTippedArrow(worldIn, shooter);
        entitytippedarrow.setPotionEffect(stack);
        return entitytippedarrow;
    }

    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)
    {
        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, bow);
        return enchant <= 0 ? false : this.getClass() == ItemBoomerang.class;
    }
    
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
    	// TODO Auto-generated method stub
    	return super.hitEntity(stack, target, attacker);
    }
    
    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
    	// TODO Auto-generated method stub
    	return super.getItemUseAction(stack);
    }
}