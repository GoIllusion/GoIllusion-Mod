package com.gameofillusion.goillusion.client.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class MainTab extends CreativeTabs{

	public MainTab(String label) {
		super("mainTab");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(Blocks.ANVIL);
		
	}


}

