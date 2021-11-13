package com.fakerac.JDN.core.registry;

import com.fakerac.JDN.JDN;
import com.fakerac.JDN.common.blocks.BlackstoneNylium;
import com.fakerac.JDN.common.blocks.DarkBasaltNylium;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class JDNBlocks {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JDN.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Regular Blocks
    public static final RegistryObject<Block> SOUL_SLATE = BLOCKS.register("soul_slate", () -> new Block(Block.Properties.create
            (Material.ROCK)
            .sound(SoundType.NETHER_ORE)
            .hardnessAndResistance(2F, 8F)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> SOUL_SLATE_BRICKS = BLOCKS.register("soul_slate_bricks", () -> new Block(Block.Properties.create
            (Material.ROCK)
            .sound(SoundType.NETHER_BRICK)
            .hardnessAndResistance(2F, 8F)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> SOUL_SLATE_BRICK_PILLAR = BLOCKS.register("soul_slate_brick_pillar", () -> new RotatedPillarBlock(Block.Properties.create
            (Material.ROCK)
            .sound(SoundType.NETHER_BRICK)
            .hardnessAndResistance(2F, 8F)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> SOUL_SLATE_BRICKS_CHISELED = BLOCKS.register("soul_slate_bricks_chiseled", () -> new Block(Block.Properties.create
            (Material.ROCK)
            .sound(SoundType.NETHER_BRICK)
            .hardnessAndResistance(2F, 8F)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> SOUL_SLATE_BRICKS_CRACKED = BLOCKS.register("soul_slate_bricks_cracked", () -> new Block(Block.Properties.create
            (Material.ROCK)
            .sound(SoundType.NETHER_BRICK)
            .hardnessAndResistance(2F, 8F)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> CRIMSON_BLACKSTONE_NYLIUM = BLOCKS.register("crimson_blackstone_nylium", () -> new BlackstoneNylium(Block.Properties.create
            (Material.ROCK)
            .hardnessAndResistance(2F, 6F)
            .sound(SoundType.NYLIUM)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(1)));

    public static final RegistryObject<Block> WARPED_BLACKSTONE_NYLIUM = BLOCKS.register("warped_blackstone_nylium", () -> new BlackstoneNylium(Block.Properties.create
            (Material.ROCK)
            .sound(SoundType.NYLIUM)
            .hardnessAndResistance(2F, 6F)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> SCARLET_NYLIUM = BLOCKS.register("scarlet_nylium", () -> new DarkBasaltNylium(Block.Properties.create
            (Material.ROCK)
            .sound(SoundType.NYLIUM)
            .hardnessAndResistance(2F, 6F)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> TWISTING_MOSS_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("twisting_moss_polished_blackstone_bricks", () -> new Block
            (Block.Properties.create(Material.ROCK)
            .sound(SoundType.STONE)
            .hardnessAndResistance(1.5F, 6F)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> WEEPING_MOSS_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("weeping_moss_polished_blackstone_bricks", () -> new Block
            (Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5F, 6F)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> BASALT_DUST = BLOCKS.register("basalt_dust", () -> new FallingBlock(Block.Properties.create
            (Material.SAND)
            .sound(SoundType.SAND)
            .hardnessAndResistance(0.8F, 0.8F)
            .harvestLevel(0)
            .harvestTool(ToolType.SHOVEL)));

    public static final RegistryObject<Block> DARK_BASALT = BLOCKS.register("dark_basalt", () -> new Block(Block.Properties.create
            (Material.ROCK)
            .sound(SoundType.BASALT)
            .hardnessAndResistance(3F, 6F)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> SOUL_HIVE = BLOCKS.register("soul_hive", () -> new Block(Block.Properties.create
            (Material.ORGANIC)
            .sound(SoundType.WOOD)
            .hardnessAndResistance(0.3F, 0.3F)
            .harvestLevel(0)
            .harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> RED_CRIMSON_STEM = BLOCKS.register("red_crimson_stem", () -> new RotatedPillarBlock(Block.Properties.create
            (Material.NETHER_WOOD)
            .sound(SoundType.HYPHAE)
            .hardnessAndResistance(2F, 10F)
            .harvestLevel(0)
            .harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> ENDER_WARPED_STEM = BLOCKS.register("ender_warped_stem", () -> new RotatedPillarBlock(Block.Properties.create
            (Material.NETHER_WOOD)
            .sound(SoundType.HYPHAE)
            .hardnessAndResistance(2F, 10F)
            .harvestLevel(0)
            .harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> RED_CRIMSON_PLANKS = BLOCKS.register("red_crimson_planks", () -> new Block(Block.Properties.create
            (Material.NETHER_WOOD)
            .sound(SoundType.WOOD)
            .hardnessAndResistance(2F, 3F)
            .harvestLevel(0)
            .harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> ENDER_WARPED_PLANKS = BLOCKS.register("ender_warped_planks", () -> new Block(Block.Properties.create
            (Material.NETHER_WOOD)
            .sound(SoundType.WOOD)
            .hardnessAndResistance(2F, 3F)
            .harvestLevel(0)
            .harvestTool(ToolType.AXE)));


    public static final RegistryObject<Block> SCARLET_CRYSTAL_BLOCK = BLOCKS.register("scarlet_crystal", () -> new Block(Block.Properties.create
            (Material.ROCK)
            .sound(SoundType.GLASS)
            .hardnessAndResistance(1.5F, 1.5F)
            .harvestLevel(0)
            .harvestTool(ToolType.PICKAXE)
            .setLightLevel((state) -> {
                return 9;
            })));

    public static final RegistryObject<Block> SOUL_MAGMA = BLOCKS.register("soul_magma", () -> new MagmaBlock(Block.Properties.create
            (Material.ROCK)
            .sound(SoundType.STONE)
            .hardnessAndResistance(0.5F, 0.5F)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE)
            .setLightLevel((state) -> {
                return 3;
            })));

    public static final RegistryObject<Block> WARPED_SHROOMLIGHT = BLOCKS.register("warped_shroomlight", () -> new Block(Block.Properties.create
            (Material.ORGANIC)
            .sound(SoundType.SHROOMLIGHT)
            .hardnessAndResistance(1F, 1F)
            .harvestLevel(0)
            .harvestTool(ToolType.HOE)
            .setLightLevel((state) -> {
                return 15;
            })));

    //Special Blocks

}
