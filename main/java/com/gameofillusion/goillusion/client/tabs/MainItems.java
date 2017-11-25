package com.gameofillusion.goillusion.client.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MainItems extends CreativeTabs{

	public MainItems(String label) {
		super("mainItems");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(Items.DIAMOND);
		
	}


}
