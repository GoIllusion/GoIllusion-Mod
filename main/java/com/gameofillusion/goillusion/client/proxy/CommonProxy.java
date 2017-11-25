package com.gameofillusion.goillusion.client.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

public abstract class CommonProxy {
	

	public void registerItemRenderer(Item item, int meta, String id) {}
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
	
	public void preInit() {

		 
	  }

	  /**
	   * Do your mod setup. Build whatever data structures you care about. Register recipes,
	   * send FMLInterModComms messages to other mods.
	   */
	  public void init() {
		
	  }

	  /**
	   * Handle interaction with other mods, complete your setup based on this.
	   */
	  public void postInit() {
		
	  }

	  // helper to determine whether the given player is in creative mode
	  //  not necessary for most examples
	  abstract public boolean playerIsInCreativeMode(EntityPlayer player);

	  /**
	   * is this a dedicated server?
	   * @return true if this is a dedicated server, false otherwise
	   */
	  abstract public boolean isDedicatedServer();
	}
