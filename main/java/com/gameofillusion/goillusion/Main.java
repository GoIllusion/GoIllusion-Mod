package com.gameofillusion.goillusion;

import com.gameofillusion.goillusion.client.proxy.CommonProxy;
import com.gameofillusion.goillusion.client.tabs.MainArmors;
import com.gameofillusion.goillusion.client.tabs.MainBlocks;
import com.gameofillusion.goillusion.client.tabs.MainItems;
import com.gameofillusion.goillusion.client.tabs.MainTab;
import com.gameofillusion.goillusion.client.tabs.MainTools;
import com.gameofillusion.goillusion.util.Constants;
import com.gameofillusion.goillusion.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MOD_ID, version = Constants.MOD_VERSION )
public class Main
{
	@Mod.Instance(Constants.MOD_ID)
    public static Main instance;
	
	@SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.COMMON_PROXY_CLASS)
    
    public static CommonProxy proxy;
	
	public static final CreativeTabs MAIN_TAB = new MainTab("mainTab");
	public static final CreativeTabs MAIN_BLOCKS = new MainBlocks("mainBlocks");
	public static final CreativeTabs MAIN_ITEMS = new MainItems("mainItems");
	public static final CreativeTabs MAIN_TOOLS = new MainTools("mainTools");
	public static final CreativeTabs MAIN_ARMORS = new MainArmors("mainArmors");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
      proxy.preInit();
      RegistryHandler.preInitRegistries();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
      proxy.init();
      RegistryHandler.initRegistries();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
      proxy.postInit();
      RegistryHandler.postInitRegistries();
    }

    /**
     * Prepend the name with the mod ID, suitable for ResourceLocations such as textures.
     * @param name
     * @return eg "minecraftbyexample:myblockname"
     */
    public static String prependModID(String name) {return Constants.MOD_ID + ":" + name;}
}
