package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NoxernaBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TheNoxerna.MODID);

    // Registers Blocks and assigns properties
    public static final DeferredBlock<Block> NOXUM = BLOCKS.register(
            "noxum", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(4.5f).explosionResistance(6.0f)
                    .sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NOXUM_BRICKS = BLOCKS.register(
            "noxum_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(4.5f).explosionResistance(6.0f)
                    .sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_NOXUM = BLOCKS.register(
            "polished_noxum", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(4.5f).explosionResistance(6.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NOXUM_STAIRS = BLOCKS.register(
            "noxum_stairs", () -> new StairBlock(NOXUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_BRICK_STAIRS = BLOCKS.register(
            "noxum_brick_stairs", () -> new StairBlock(NOXUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> POLISHED_NOXUM_STAIRS = BLOCKS.register(
            "polished_noxum_stairs", () -> new StairBlock(POLISHED_NOXUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_SLAB = BLOCKS.register(
            "noxum_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_BRICK_SLAB = BLOCKS.register(
            "noxum_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> POLISHED_NOXUM_SLAB = BLOCKS.register(
            "polished_noxum_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_WALL = BLOCKS.register(
            "noxum_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_BRICK_WALL = BLOCKS.register(
            "noxum_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> POLISHED_NOXUM_WALL = BLOCKS.register(
            "polished_noxum_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_PRESSURE_PLATE = BLOCKS.register(
            "noxum_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE,BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
}
