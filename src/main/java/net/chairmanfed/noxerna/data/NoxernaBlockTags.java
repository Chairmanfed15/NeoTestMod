package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class NoxernaBlockTags extends BlockTagsProvider {
    public NoxernaBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                            ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheNoxerna.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(NoxernaBlocks.NOXUM.get()).add(NoxernaBlocks.NOXUM_STAIRS.get())
                .add(NoxernaBlocks.NOXUM_SLAB.get()).add(NoxernaBlocks.NOXUM_WALL.get())
                .add(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get()).add(NoxernaBlocks.POLISHED_NOXUM.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get()).add(NoxernaBlocks.POLISHED_NOXUM_SLAB.get())
                .add(NoxernaBlocks.POLISHED_NOXUM_WALL.get()).add(NoxernaBlocks.NOXUM_BRICKS.get())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get()).add(NoxernaBlocks.NOXUM_BRICK_SLAB.get())
                .add(NoxernaBlocks.NOXUM_BRICK_WALL.get()).add(NoxernaBlocks.NOXUM_PEBBLE.get());
        tag(BlockTags.SCULK_REPLACEABLE)
                .add(NoxernaBlocks.NOXUM.get());
        tag(BlockTags.STAIRS)
                .add(NoxernaBlocks.NOXUM_STAIRS.get()).add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get());
        tag(BlockTags.SLABS)
                .add(NoxernaBlocks.NOXUM_SLAB.get()).add(NoxernaBlocks.POLISHED_NOXUM_SLAB.get())
                .add(NoxernaBlocks.NOXUM_BRICK_SLAB.get());
        tag(BlockTags.WALLS)
                .add(NoxernaBlocks.NOXUM_WALL.get()).add(NoxernaBlocks.POLISHED_NOXUM_WALL.get())
                .add(NoxernaBlocks.NOXUM_BRICK_WALL.get());
        tag(BlockTags.STONE_PRESSURE_PLATES)
                .add(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get());
        tag(BlockTags.GEODE_INVALID_BLOCKS)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(BlockTags.WITHER_IMMUNE)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(BlockTags.DRAGON_IMMUNE)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(BlockTags.BLOCKS_WIND_CHARGE_EXPLOSIONS)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(BlockTags.FEATURES_CANNOT_REPLACE)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(NoxernaTags.BlockTags.BOSS_IMMUNE)
                .addTag(BlockTags.WITHER_IMMUNE);
        tag(NoxernaTags.BlockTags.INFINIBURN_NOXERNA)
                .addTag(BlockTags.INFINIBURN_OVERWORLD)
                .add(NoxernaBlocks.VOIDROCK.get());
        tag(NoxernaTags.BlockTags.PEBBLES)
                .add(NoxernaBlocks.NOXUM_PEBBLE.get());
        tag(NoxernaTags.BlockTags.QUAKE_IMMUNE)
                .addTag(NoxernaTags.BlockTags.PEBBLES);
    }
}