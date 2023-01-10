package com.sassy.projectgemstone.core.registry;

import com.sassy.projectgemstone.ProjectGemstone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectGemstone.MODID);

    //Items
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ALMANDINE = ITEMS.register("almandine", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> AZURITE = ITEMS.register("azurite", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> HEMATINE = ITEMS.register("hematine", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> SPHENE = ITEMS.register("sphene", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> UVAROVITE = ITEMS.register("uvarovite", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> EMBEDDED_AMBER = ITEMS.register("embedded_amber", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> EMBEDDED_ALMANDINE = ITEMS.register("embedded_almandine", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> EMBEDDED_AQUAMARINE = ITEMS.register("embedded_aquamarine", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> EMBEDDED_AZURITE = ITEMS.register("embedded_azurite", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> EMBEDDED_HEMATINE = ITEMS.register("embedded_hematine", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> EMBEDDED_MALACHITE = ITEMS.register("embedded_malachite", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> EMBEDDED_SPHENE = ITEMS.register("embedded_sphene", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> EMBEDDED_UVAROVITE = ITEMS.register("embedded_uvarovite", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> AMETRINE = ITEMS.register("ametrine", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> EMBEDDED_AMETRINE = ITEMS.register("embedded_ametrine", () -> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS)));


    //Blockitems
    public static final RegistryObject<Item> AMBER_BLOCK_ITEM = ITEMS.register("amber_block", () -> new BlockItem(BlockRegistry.AMBER_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ALMANDINE_BLOCK_ITEM = ITEMS.register("almandine_block", () -> new BlockItem(BlockRegistry.ALMANDINE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> AQUAMARINE_BLOCK_ITEM = ITEMS.register("aquamarine_block", () -> new BlockItem(BlockRegistry.AQUAMARINE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> AZURITE_BLOCK_ITEM = ITEMS.register("azurite_block", () -> new BlockItem(BlockRegistry.AZURITE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> HEMATINE_BLOCK_ITEM = ITEMS.register("hematine_block", () -> new BlockItem(BlockRegistry.HEMATINE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MALACHITE_BLOCK_ITEM = ITEMS.register("malachite_block", () -> new BlockItem(BlockRegistry.MALACHITE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> SPHENE_BLOCK_ITEM = ITEMS.register("sphene_block", () -> new BlockItem(BlockRegistry.SPHENE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> UVAROVITE_BLOCK_ITEM = ITEMS.register("uvarovite_block", () -> new BlockItem(BlockRegistry.UVAROVITE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

}
