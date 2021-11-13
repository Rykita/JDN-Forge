package com.fakerac.JDN.common.blocks;

import com.fakerac.JDN.core.registry.JDNBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.NetherVegetationFeature;
import net.minecraft.world.gen.feature.TwistingVineFeature;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class BlackstoneNylium extends Block implements IGrowable {
    public BlackstoneNylium(Properties properties) {
        super(properties);
    }

    public static boolean canSurvive(BlockState state, IWorldReader world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.isSolid()) {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        super.randomTick(state, worldIn, pos, random);
        if (!canSurvive(state, worldIn, pos)) {
            worldIn.setBlockState(pos, Blocks.BLACKSTONE.getDefaultState());
        }

    }

    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return worldIn.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        BlockState blockState = worldIn.getBlockState(pos);
        BlockPos blockPos = pos.up();

        if (blockState.matchesBlock(JDNBlocks.CRIMSON_BLACKSTONE_NYLIUM.get())) {
            NetherVegetationFeature.func_236325_a_(worldIn, rand, blockPos, Features.Configs.CRIMSON_FOREST_VEGETATION_CONFIG, 3, 1);
        } else if (blockState.matchesBlock(JDNBlocks.WARPED_BLACKSTONE_NYLIUM.get())) {
            NetherVegetationFeature.func_236325_a_(worldIn, rand, blockPos, Features.Configs.WARPED_FOREST_VEGETATION_CONFIG, 3, 1);
            NetherVegetationFeature.func_236325_a_(worldIn, rand, blockPos, Features.Configs.NETHER_SPROUTS_CONFIG, 3, 1);
            if (rand.nextInt(8) == 0) {
                TwistingVineFeature.func_236423_a_(worldIn, rand, blockPos, 3, 1, 2);
            }
        }

    }



}
