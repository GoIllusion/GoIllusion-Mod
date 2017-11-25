package com.gameofillusion.goillusion.objects.items;

//import com.gameofillusion.goillusion.Main;
import com.gameofillusion.goillusion.init.ItemInit;
import com.gameofillusion.goillusion.util.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab(Main.MAIN_ITEMS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		//Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}