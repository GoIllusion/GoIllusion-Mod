package com.gameofillusion.goillusion.client.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MainTools extends CreativeTabs{

	public MainTools(String label) {
		super("mainTools");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(Items.GOLDEN_AXE);
		
	}


}
