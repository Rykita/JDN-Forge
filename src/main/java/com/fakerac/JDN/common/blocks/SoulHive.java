package com.fakerac.JDN.common.blocks;

import com.fakerac.JDN.core.registry.JDNBlocks;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

import static net.minecraft.state.properties.BlockStateProperties.FACING;


public class SoulHive extends Block {
    public SoulHive() {
        super(Block.Properties.create
                (Material.NETHER_PLANTS)
                .sound(SoundType.WOOD)
                .harvestTool(ToolType.AXE)
                .harvestLevel(0)
                .hardnessAndResistance(0.3F, 0.3F));
        this.setDefaultState(this.stateContainer.getBaseState().with(HONEY_LEVEL, Integer.valueOf(0)).with(FACING, Direction.NORTH));
    }

    public static final IntegerProperty HONEY_LEVEL = BlockStateProperties.HONEY_LEVEL;

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(HONEY_LEVEL);
    }


    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        return super.onBlockActivated(state = JDNBlocks.SOUL_HIVE.get().getDefaultState().with(HONEY_LEVEL, Integer.valueOf(1)), worldIn, pos, player, handIn, hit);
    }
}
