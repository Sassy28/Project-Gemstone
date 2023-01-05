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
}
