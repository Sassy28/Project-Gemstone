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

    //Blockitems
    public static final RegistryObject<Item> AMBER_BLOCK_ITEM = ITEMS.register("amber_block", () -> new BlockItem(BlockRegistry.AMBER_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
