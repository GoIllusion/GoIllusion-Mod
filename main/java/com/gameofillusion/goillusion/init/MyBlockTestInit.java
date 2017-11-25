package com.gameofillusion.goillusion.init;

import com.gameofillusion.goillusion.client.proxy.CommonProxy;
import com.gameofillusion.goillusion.client.proxy.TestCommonProxy;

import minecraftbyexample.mbe02_block_partial.BlockPartial;
import minecraftbyexample.mbe02_block_partial.StartupCommon;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;

public class MyBlockTestInit {
	
	 public static BlockPartial blockPartial;  // this holds the unique instance of your block
	  public static ItemBlock itemBlockPartial;  // this holds the instance of the ItemBlock for your Block
	

	public MyBlockTestInit() {
		
	}
	
	public static void registrationTest(){
	
	ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("goillusion:block_partial_test", "inventory");
    
	final int DEFAULT_ITEM_SUBTYPE = 0;
    
    ModelLoader.setCustomModelResourceLocation(TestCommonProxy.itemBlockPartial, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
	}
	
	
	
}
