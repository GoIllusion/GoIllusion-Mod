package com.gameofillusion.goillusion.util.handlers;

import com.gameofillusion.goillusion.objects.blocks.variants.BlockVariants.EnumColour;

import net.minecraft.util.IStringSerializable;

public class EnumColorHandler {
	
	public static enum EnumColour implements IStringSerializable
	  {
	    BLUE(0, "blue"),
	    RED(1, "red"),
	    GREEN(2, "green"),
	    YELLOW(3, "yellow");

	    public int getMetadata()
	    {
	      return this.meta;
	    }

	    @Override
	    public String toString()
	    {
	      return this.name;
	    }

	    public static EnumColour byMetadata(int meta)
	    {
	      if (meta < 0 || meta >= META_LOOKUP.length)
	      {
	        meta = 0;
	      }

	      return META_LOOKUP[meta];
	    }

	    public String getName()
	    {
	      return this.name;
	    }

	    private final int meta;
	    private final String name;
	    private static final EnumColour[] META_LOOKUP = new EnumColour[values().length];

	    private EnumColour(int i_meta, String i_name)
	    {
	      this.meta = i_meta;
	      this.name = i_name;
	    }

	    static
	    {
	      for (EnumColour colour : values()) {
	        META_LOOKUP[colour.getMetadata()] = colour;
	      }
	    }
	  }

}
