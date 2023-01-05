package com.sassy.projectgemstone.core.registry;

import com.sassy.projectgemstone.ProjectGemstone;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectGemstone.MODID);

    public static final RegistryObject<Block> AMBER_BLOCK = BLOCKS.register("amber_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_ORANGE).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ALMANDINE_BLOCK = BLOCKS.register("almandine_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BROWN).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AQUAMARINE_BLOCK = BLOCKS.register("aquamarine_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_CYAN).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AZURITE_BLOCK = BLOCKS.register("azurite_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HEMATINE_BLOCK = BLOCKS.register("hematine_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLACK).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MALACHITE_BLOCK = BLOCKS.register("malachite_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_GREEN).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SPHENE_BLOCK = BLOCKS.register("sphene_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_LIGHT_GREEN).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> URAVORITE_BLOCK = BLOCKS.register("uravorite_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_LIGHT_GREEN).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

}
