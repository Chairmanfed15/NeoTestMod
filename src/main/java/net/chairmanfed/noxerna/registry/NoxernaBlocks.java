package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.block.NoxernaBlockSetTypes;
import net.chairmanfed.noxerna.block.PebbleBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoxernaBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TheNoxerna.MODID);

    // Registers Blocks and assigns properties
    // Xenon Noblewood Set
    public static final DeferredBlock<Block> XENON_LOG = BLOCKS.register(
            "xenon_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(2.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 7)));
    public static final DeferredBlock<Block> XENON_WOOD = BLOCKS.register(
            "xenon_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(XENON_LOG.get())));
    public static final DeferredBlock<Block> STRIPPED_XENON_LOG = BLOCKS.register(
            "stripped_xenon_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(2.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 7)));
    public static final DeferredBlock<Block> STRIPPED_XENON_WOOD = BLOCKS.register(
            "stripped_xenon_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(STRIPPED_XENON_LOG.get())));
    public static final DeferredBlock<Block> XENON_PLANKS = BLOCKS.register(
            "xenon_planks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(3.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 12)));
    public static final DeferredBlock<Block> XENON_STAIRS = BLOCKS.register(
            "xenon_stairs", () -> new StairBlock(XENON_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_SLAB = BLOCKS.register(
            "xenon_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_FENCE = BLOCKS.register(
            "xenon_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_FENCE_GATE = BLOCKS.register(
            "xenon_fence_gate", () -> new FenceGateBlock(NoxernaBlockSetTypes.XENON_WOOD_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_DOOR = BLOCKS.register(
            "xenon_door", () -> new DoorBlock(NoxernaBlockSetTypes.XENON_BLOCK_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get()).noOcclusion()));
    public static final DeferredBlock<Block> XENON_TRAPDOOR = BLOCKS.register(
            "xenon_trapdoor", () -> new TrapDoorBlock(NoxernaBlockSetTypes.XENON_BLOCK_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_PRESSURE_PLATE = BLOCKS.register(
            "xenon_pressure_plate", () -> new PressurePlateBlock(NoxernaBlockSetTypes.XENON_BLOCK_SET,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    public static final DeferredBlock<Block> XENON_BUTTON = BLOCKS.register(
            "xenon_button", () -> new ButtonBlock(NoxernaBlockSetTypes.XENON_BLOCK_SET, 30,
                    BlockBehaviour.Properties.ofFullCopy(XENON_PLANKS.get())));
    // Krypton Wood set
    public static final DeferredBlock<Block> KRYPTON_PLANKS = BLOCKS.register(
            "krypton_planks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.5f).explosionResistance(3.0f)
                    .sound(SoundType.CHERRY_WOOD).ignitedByLava().lightLevel(state -> 12)));
    // Noxum Stone set
    public static final DeferredBlock<Block> NOXUM = BLOCKS.register(
            "noxum", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(4.5f).explosionResistance(6.0f)
                    .sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NOXUM_STAIRS = BLOCKS.register(
            "noxum_stairs", () -> new StairBlock(NOXUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_SLAB = BLOCKS.register(
            "noxum_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_WALL = BLOCKS.register(
            "noxum_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_BRICK_WALL = BLOCKS.register(
            "noxum_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> POLISHED_NOXUM = BLOCKS.register(
            "polished_noxum", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(4.5f).explosionResistance(6.0f)
                    .sound(SoundType.POLISHED_DEEPSLATE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_NOXUM_STAIRS = BLOCKS.register(
            "polished_noxum_stairs", () -> new StairBlock(POLISHED_NOXUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(POLISHED_NOXUM.get())));
    public static final DeferredBlock<Block> POLISHED_NOXUM_SLAB = BLOCKS.register(
            "polished_noxum_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_NOXUM.get())));
    public static final DeferredBlock<Block> POLISHED_NOXUM_WALL = BLOCKS.register(
            "polished_noxum_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_NOXUM.get())));

    public static final DeferredBlock<Block> NOXUM_BRICKS = BLOCKS.register(
            "noxum_bricks", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(4.5f).explosionResistance(6.0f)
                    .sound(SoundType.DEEPSLATE_BRICKS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NOXUM_BRICK_STAIRS = BLOCKS.register("noxum_brick_stairs", () -> new StairBlock(NOXUM.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_BRICK_SLAB = BLOCKS.register("noxum_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));

    // Resource Storage Blocks
    public static final DeferredBlock<Block> FERREBRIS_BLOCK = BLOCKS.register(
            "ferrebris_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(6.5f).explosionResistance(7.5f)
                    .sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()));
    // Voidrock
    public static final DeferredBlock<Block> VOIDROCK = BLOCKS.register(
        "voidrock", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<Block> NOXUM_PRESSURE_PLATE = BLOCKS.register(
            "noxum_pressure_plate", () ->
                    new PressurePlateBlock(NoxernaBlockSetTypes.NOXUM_BLOCK_SET,
                            BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));
    public static final DeferredBlock<Block> NOXUM_BUTTON = BLOCKS.register(
            "noxum_button", () ->
                    new ButtonBlock(NoxernaBlockSetTypes.NOXUM_BLOCK_SET, 20,
                            BlockBehaviour.Properties.ofFullCopy(NOXUM.get())));

    public static final DeferredBlock<Block> NOXUM_PEBBLE = BLOCKS.register("noxum_pebble", () ->
            new PebbleBlock(BlockBehaviour.Properties.ofFullCopy(NOXUM.get())
                    .noOcclusion().pushReaction(PushReaction.DESTROY)));
}
