package com.gameofillusion.goillusion.client.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class MainBlocks extends CreativeTabs{

	public MainBlocks(String label) {
		super("mainBlocks");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(Blocks.CLAY);
		
	}


}


