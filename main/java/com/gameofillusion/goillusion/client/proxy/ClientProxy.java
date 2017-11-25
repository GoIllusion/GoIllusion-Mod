package com.gameofillusion.goillusion.client.proxy;

import com.gameofillusion.goillusion.util.Constants;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Constants.MOD_ID, filename), id));
	}
	
	/**
	   * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
	   */
	  public void preInit()
	  {
	    super.preInit();
	    
	  }

	  /**
	   * Do your mod setup. Build whatever data structures you care about. Register recipes,
	   * send FMLInterModComms messages to other mods.
	   */
	  public void init()
	  {
	    super.init();
	    
	  }

	  /**
	   * Handle interaction with other mods, complete your setup based on this.
	   */
	  public void postInit()
	  {
	    super.postInit();
	   
	  }

	  @Override
	  public boolean playerIsInCreativeMode(EntityPlayer player) {
	    if (player instanceof EntityPlayerMP) {
	      EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
	      return entityPlayerMP.interactionManager.isCreative();
	    } else if (player instanceof EntityPlayerSP) {
	      return Minecraft.getMinecraft().playerController.isInCreativeMode();
	    }
	    return false;
	  }

	  @Override
	  public boolean isDedicatedServer() {return false;}

	}
