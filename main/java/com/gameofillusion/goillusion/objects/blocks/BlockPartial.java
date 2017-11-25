package com.gameofillusion.goillusion.objects.blocks;

//import com.gameofillusion.goillusion.Main;
import com.gameofillusion.goillusion.init.BlockInit;
import com.gameofillusion.goillusion.init.ItemInit;
import com.gameofillusion.goillusion.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPartial extends BlockBase {
	
  public BlockPartial(String name, Material material) 
	{
		super(name, material);
		
  }

  @SideOnly(Side.CLIENT)
  public BlockRenderLayer getBlockLayer()
  {
    return BlockRenderLayer.SOLID;
  }

  @Override
  public boolean isOpaqueCube(IBlockState iBlockState) {
    return false;
  }

  @Override
  public boolean isFullCube(IBlockState iBlockState) {
    return false;
  }

  @Override
  public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
    return EnumBlockRenderType.MODEL;
  }

  @Override
  public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess worldIn, BlockPos pos)
  {
    return NULL_AABB;
  }

}
