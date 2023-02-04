package com.sassy.projectgemstone.core.registry;

import com.sassy.projectgemstone.ProjectGemstone;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.function.ToIntFunction;

public class BlockRegistry {
    public static ToIntFunction<BlockState> setLightLevel = BlockState -> 12;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectGemstone.MODID);

    //Crystal Blocks
    public static final RegistryObject<Block> AMBER_BLOCK = BLOCKS.register("amber_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_ORANGE).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ALMANDINE_BLOCK = BLOCKS.register("almandine_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BROWN).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AQUAMARINE_BLOCK = BLOCKS.register("aquamarine_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_CYAN).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AZURITE_BLOCK = BLOCKS.register("azurite_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HEMATINE_BLOCK = BLOCKS.register("hematine_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLACK).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MALACHITE_BLOCK = BLOCKS.register("malachite_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_GREEN).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SPHENE_BLOCK = BLOCKS.register("sphene_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_LIGHT_GREEN).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> UVAROVITE_BLOCK = BLOCKS.register("uvarovite_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_LIGHT_GREEN).strength(5.0f, 6.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    //Flowers
    public static final RegistryObject<Block> AMBER_FLOWER_BLOCK = BLOCKS.register("amber_flower_block", () -> new FlowerBlock(MobEffects.GLOWING, 5, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).lightLevel(setLightLevel)));
    public static final RegistryObject<Block> POTTED_AMBER_FLOWER_BLOCK = BLOCKS.register("potted_amber_flower_block",() -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BlockRegistry.AMBER_FLOWER_BLOCK,BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).lightLevel(setLightLevel)));
}
