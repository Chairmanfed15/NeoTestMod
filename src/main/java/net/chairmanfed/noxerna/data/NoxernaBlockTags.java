package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaItems;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.checkerframework.checker.units.qual.N;

import java.util.concurrent.CompletableFuture;

public class NoxernaBlockTags extends BlockTagsProvider {
    public NoxernaBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                            ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheNoxerna.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        // Minecraft Tags
        // World Generation
        tag(BlockTags.FEATURES_CANNOT_REPLACE)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(BlockTags.GEODE_INVALID_BLOCKS)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE)
                .add(NoxernaBlocks.VOIDROCK.get());
        // Mining Logic
            // Valid Tools
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(NoxernaBlocks.NOXUM.get()).add(NoxernaBlocks.NOXUM_STAIRS.get())
                .add(NoxernaBlocks.NOXUM_SLAB.get()).add(NoxernaBlocks.NOXUM_WALL.get())
                .add(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get()).add(NoxernaBlocks.POLISHED_NOXUM.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get()).add(NoxernaBlocks.POLISHED_NOXUM_SLAB.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_WALL.get()).add(NoxernaBlocks.NOXUM_BRICKS.get())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get()).add(NoxernaBlocks.NOXUM_BRICK_SLAB.get())
                .add(NoxernaBlocks.NOXUM_BRICK_WALL.get()).add(NoxernaBlocks.NOXUM_PEBBLE.get())
                .add(NoxernaBlocks.FERREBRIS_BLOCK.get()).add(NoxernaBlocks.FERREBRIS_PLATING.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING_STAIRS.get()).add(NoxernaBlocks.FERREBRIS_PLATING_SLAB.get())
                .add(NoxernaBlocks.FERREBRIS_PLATING_WALL.get());
            // Incorrect Tool tiers
        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(NoxernaBlocks.FERREBRIS_BLOCK.get());
        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(NoxernaBlocks.FERREBRIS_BLOCK.get());
        // Logic
            // Entity Interaction
        tag(BlockTags.BLOCKS_WIND_CHARGE_EXPLOSIONS)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(BlockTags.DRAGON_IMMUNE)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(BlockTags.WITHER_IMMUNE)
                .add(NoxernaBlocks.VOIDROCK.get());
            // MultiBlock Formation
        tag(BlockTags.BEACON_BASE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS);
            // Block Replacement
        tag(BlockTags.SCULK_REPLACEABLE)
                .add(NoxernaBlocks.NOXUM.get());
        // Block Variations
        tag(BlockTags.STAIRS)
                .add(NoxernaBlocks.NOXUM_STAIRS.get()).add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get()).add(NoxernaBlocks.FERREBRIS_PLATING_STAIRS.get());
        tag(BlockTags.SLABS)
                .add(NoxernaBlocks.NOXUM_SLAB.get()).add(NoxernaBlocks.POLISHED_NOXUM_SLAB.get())
                .add(NoxernaBlocks.NOXUM_BRICK_SLAB.get()).add(NoxernaBlocks.FERREBRIS_PLATING_SLAB.get());
        tag(BlockTags.WALLS)
                .add(NoxernaBlocks.NOXUM_WALL.get()).add(NoxernaBlocks.POLISHED_NOXUM_WALL.get())
                .add(NoxernaBlocks.NOXUM_BRICK_WALL.get()).add(NoxernaBlocks.FERREBRIS_PLATING_WALL.get());
        tag(BlockTags.STONE_PRESSURE_PLATES)
                .add(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get());
        tag(BlockTags.STONE_BUTTONS)
                .add(NoxernaBlocks.NOXUM_BUTTON.get());
        // Wooden Blocks
        tag(BlockTags.LOGS)
                .addTag(NoxernaTags.BlockTags.XENON_LOGS)
                .addTag(NoxernaTags.BlockTags.KRYPTON_LOGS);
        tag(BlockTags.PLANKS)
                .add(NoxernaBlocks.XENON_PLANKS.get())
                .add(NoxernaBlocks.KRYPTON_PLANKS.get());
            // Wooden Block Variations
        tag(BlockTags.WOODEN_STAIRS)
                .add(NoxernaBlocks.XENON_STAIRS.get());
        tag(BlockTags.WOODEN_SLABS)
                .add(NoxernaBlocks.XENON_SLAB.get());
        tag(BlockTags.WOODEN_FENCES)
                .add(NoxernaBlocks.XENON_FENCE.get());
        tag(BlockTags.FENCE_GATES)
                .add(NoxernaBlocks.XENON_FENCE_GATE.get());
        tag(BlockTags.WOODEN_DOORS)
                .add(NoxernaBlocks.XENON_DOOR.get());
        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(NoxernaBlocks.XENON_TRAPDOOR.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(NoxernaBlocks.XENON_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_BUTTONS)
                .add(NoxernaBlocks.XENON_BUTTON.get());
        // Common Tags
        // Material Storage Blocks
        tag(NoxernaTags.BlockTags.STORAGE_BLOCKS)
                .addTag(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS);
        tag(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS)
                .add(NoxernaBlocks.FERREBRIS_BLOCK.get());
        // Noxerna Tags
        // Logic
            // Entity Interaction
        tag(NoxernaTags.BlockTags.BOSS_IMMUNE)
                .addTag(BlockTags.WITHER_IMMUNE);
            // World Changes
        tag(NoxernaTags.BlockTags.INFINIBURN_NOXERNA)
                .addTag(BlockTags.INFINIBURN_OVERWORLD)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(NoxernaTags.BlockTags.QUAKE_IMMUNE)
                .addTag(NoxernaTags.BlockTags.PEBBLES);
        // Mining Logic
            // Incorrect Tool Tiers
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_NOBLEWOOD_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_WOODEN_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_NOXSTONE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_STONE_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_FERREBRIS_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_UMBURAM_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_GOLD_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_ADAMUNA_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);
        tag(NoxernaTags.BlockTags.INCORRECT_FOR_NIHOXITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);
        // Block Variations
        tag(NoxernaTags.BlockTags.PEBBLES)
                .add(NoxernaBlocks.NOXUM_PEBBLE.get());
        // Wooden Blocks
        tag(NoxernaTags.BlockTags.XENON_LOGS)
                .add(NoxernaBlocks.XENON_LOG.get()).add(NoxernaBlocks.XENON_WOOD.get())
                .add(NoxernaBlocks.STRIPPED_XENON_LOG.get()).add(NoxernaBlocks.STRIPPED_XENON_WOOD.get());
        tag(NoxernaTags.BlockTags.KRYPTON_LOGS)
                .add(NoxernaBlocks.KRYPTON_LOG.get()).add(NoxernaBlocks.KRYPTON_WOOD.get())
                .add(NoxernaBlocks.STRIPPED_KRYPTON_LOG.get()).add(NoxernaBlocks.STRIPPED_KRYPTON_WOOD.get());
    }
}