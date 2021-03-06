package com.gameofillusion.goillusion.server;

import com.gameofillusion.goillusion.client.proxy.CommonProxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class ServerProxy extends CommonProxy {

	public void preInit() {
	    super.preInit();
	  }

	  /**
	   * Do your mod setup. Build whatever data structures you care about. Register recipes,
	   * send FMLInterModComms messages to other mods.
	   */
	  public void init() {
	    super.init();
	  }

	  /**
	   * Handle interaction with other mods, complete your setup based on this.
	   */
	  public void postInit() {
	    super.postInit();
	  }

	  @Override
	  public boolean playerIsInCreativeMode(EntityPlayer player) {
	    if (player instanceof EntityPlayerMP) {
	      EntityPlayerMP entityPlayerMP = (EntityPlayerMP) player;
	      return entityPlayerMP.interactionManager.isCreative();
	    }
	    return false;
	  }

	  @Override
	  public boolean isDedicatedServer() {return true;}

	}

