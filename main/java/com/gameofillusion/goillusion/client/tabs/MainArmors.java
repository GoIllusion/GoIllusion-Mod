package com.gameofillusion.goillusion.client.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MainArmors extends CreativeTabs{

	public MainArmors(String label) {
		super("mainArmors");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(Items.IRON_HELMET);
		
	}


}

