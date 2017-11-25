package com.gameofillusion.goillusion.objects.blocks;

//import com.gameofillusion.goillusion.Main;
import com.gameofillusion.goillusion.init.BlockInit;
import com.gameofillusion.goillusion.init.ItemInit;
import com.gameofillusion.goillusion.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(1.0f);
		setResistance(1.0f);
		//setCreativeTab(Main.MAIN_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		//Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}