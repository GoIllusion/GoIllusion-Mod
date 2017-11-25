package com.gameofillusion.goillusion.init;

import java.util.ArrayList;
import java.util.List;

import com.gameofillusion.goillusion.objects.blocks.BlockBase;
import com.gameofillusion.goillusion.objects.blocks.BlockPartial;
import com.gameofillusion.goillusion.objects.blocks.BlockPartialBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_BASE = new BlockBase("block_base", Material.IRON);
	public static final Block BLOCK_PARTIAL_ON = new BlockPartialBase("block_partial_on", Material.IRON);
	public static final Block BLOCK_PARTIAL = new BlockPartial("block_partial", Material.IRON);
	public static final Block BLOCK_VARIANTS = new BlockPartial("block_variants", Material.IRON);
}
