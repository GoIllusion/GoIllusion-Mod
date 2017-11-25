package com.gameofillusion.goillusion.util;

public class Constants {
	
	public Constants() {
		
	}
	
	// Mod Constants
    public static final String MOD_ID = "goillusion";
    public static final String MOD_NAME = "Game Of Illusion";
    public static final String MOD_VERSION = "1.12.2-1.0";
    public static final String BUILD = "GRADLE:BUILD";
	public static final String VERSION = "GRADLE:VERSION-" + BUILD;
 
    // Gen Constants  
    public static final String URL = "http://www.gameofillusion.com";
	public static final String APDATEURL = "";
	public static final String COPYRYGHT = "GAME OF ILLUSION";
    
    // Common Constants
	
	public static final String CLIENT_PROXY_CLASS = "com.gameofillusion.goillusion.client.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.gameofillusion.goillusion.client.proxy.CommonProxy";
	public static final String SERVER_PROXY_CLASS = "com.gameofillusion.goillusion.server.ServerProxy";
	
    // UI Constants
	public static final String PREFIX_MOD = MOD_ID+":";
	public static final String GUI_CONFIG_FACTORY = PREFIX_MOD + "config/GuiConfigFactory";
    public static final String PREFIX_GUI = PREFIX_MOD + "goi/textures/gui/";

    // Dependencies
    
    public static final String DEPENDENCIES = "";
	public static final String GUI_FACTORY = "com.gameofillusion.goillusion.config.MBEGuiFactory";
	public static final String MAIN_CONFIG = "com.gameofillusion.goillusion.config.MainConfig";
    public static final String GOGUI_FACTORY_CONFIG = "com.gameofillusion.goillusion.config.GoIllusionGuiFactory";
    public static final String GUI_FACTORY_CONFIG = "com.gameofillusion.goillusion.config.GuiFactory$ConfigGui";
}
