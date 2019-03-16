package com.mrcrayfish.furniture.rift.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;

/**
 * Author: MrCrayfish
 */
public class BlockModernTable extends BlockFourLegTable
{
    public BlockModernTable()
    {
        super(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(1.0F, 1.0F));
        this.setDefaultState(this.getStateContainer().getBaseState().with(FORWARD, false).with(BACK, false).with(LEFT, false).with(RIGHT, false).with(WATERLOGGED, false));
    }
}
