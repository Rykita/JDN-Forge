package com.fakerac.JDN.core.registry;

import com.fakerac.JDN.JDN;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class JDNItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JDN.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Regular Items


    //Tools


    //Block Items
    public static final RegistryObject<Item> SOUL_SLATE_ITEM = ITEMS.register("soul_slate", () ->
            new BlockItem(JDNBlocks.SOUL_SLATE.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)
                    .isImmuneToFire()));

    public static final RegistryObject<Item> SOUL_SLATE_BRICKS_ITEM = ITEMS.register("soul_slate_bricks", () ->
            new BlockItem(JDNBlocks.SOUL_SLATE_BRICKS.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)
                    .isImmuneToFire()));

    public static final RegistryObject<Item> SOUL_SLATE_BRICK_PILLAR_ITEM = ITEMS.register("soul_slate_brick_pillar", () ->
            new BlockItem(JDNBlocks.SOUL_SLATE_BRICK_PILLAR.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)
                    .isImmuneToFire()));

    public static final RegistryObject<Item> SOUL_SLATE_BRICKS_CHISELED_ITEM = ITEMS.register("soul_slate_bricks_chiseled", () ->
            new BlockItem(JDNBlocks.SOUL_SLATE_BRICKS_CHISELED.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)
                    .isImmuneToFire()));

    public static final RegistryObject<Item> SOUL_SLATE_BRICKS_CRACKED_ITEM = ITEMS.register("soul_slate_bricks_cracked", () ->
            new BlockItem(JDNBlocks.SOUL_SLATE_BRICKS_CRACKED.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)
                    .isImmuneToFire()));

    public static final RegistryObject<Item> CRIMSON_BLACKSTONE_NYLIUM_ITEM = ITEMS.register("crimson_blackstone_nylium", () ->
            new BlockItem(JDNBlocks.CRIMSON_BLACKSTONE_NYLIUM.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WARPED_BLACKSTONE_NYLIUM_ITEM = ITEMS.register("warped_blackstone_nylium", () ->
            new BlockItem(JDNBlocks.WARPED_BLACKSTONE_NYLIUM.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> SCARLET_NYLIUM_ITEM = ITEMS.register("scarlet_nylium", () ->
            new BlockItem(JDNBlocks.SCARLET_NYLIUM.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> TWISTING_MOSS_POLISHED_BLACKSTONE_BRICKS_ITEM = ITEMS.register("twisting_moss_polished_blackstone_bricks", () ->
            new BlockItem(JDNBlocks.TWISTING_MOSS_POLISHED_BLACKSTONE_BRICKS.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WEEPING_MOSS_POLISHED_BLACKSTONE_BRICKS_ITEM = ITEMS.register("weeping_moss_polished_blackstone_bricks", () ->
            new BlockItem(JDNBlocks.WEEPING_MOSS_POLISHED_BLACKSTONE_BRICKS.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> BASALT_DUST_ITEM = ITEMS.register("basalt_dust", () ->
            new BlockItem(JDNBlocks.BASALT_DUST.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> DARK_BASALT_ITEM = ITEMS.register("dark_basalt", () ->
            new BlockItem(JDNBlocks.DARK_BASALT.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> SOUL_HIVE_ITEM = ITEMS.register("soul_hive", () ->
            new BlockItem(JDNBlocks.SOUL_HIVE.get(), new Item.Properties()
                    .group(ItemGroup.DECORATIONS)));

    public static final RegistryObject<Item> RED_CRIMSON_STEM_ITEM = ITEMS.register("red_crimson_stem", () ->
            new BlockItem(JDNBlocks.RED_CRIMSON_STEM.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> ENDER_WARPED_STEM_ITEM = ITEMS.register("ender_warped_stem", () ->
            new BlockItem(JDNBlocks.ENDER_WARPED_STEM.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> RED_CRIMSON_PLANKS_ITEM = ITEMS.register("red_crimson_planks", () ->
            new BlockItem(JDNBlocks.RED_CRIMSON_PLANKS.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> ENDER_WARPED_PLANKS_ITEM = ITEMS.register("ender_warped_planks", () ->
            new BlockItem(JDNBlocks.ENDER_WARPED_PLANKS.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> SCARLET_CRYSTAL_BLOCK_ITEM = ITEMS.register("scarlet_crystal_block", () ->
            new BlockItem(JDNBlocks.SCARLET_CRYSTAL_BLOCK.get(), new Item.Properties()
                    .group(ItemGroup.DECORATIONS)));

    public static final RegistryObject<Item> SOUL_MAGMA_ITEM = ITEMS.register("soul_magma", () ->
            new BlockItem(JDNBlocks.SOUL_MAGMA.get(), new Item.Properties()
                    .group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Item> WARPED_SHROOMLIGHT_ITEM = ITEMS.register("warped_shroomlight", () ->
            new BlockItem(JDNBlocks.WARPED_SHROOMLIGHT.get(), new Item.Properties()
                    .group(ItemGroup.DECORATIONS)));
}
