package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class NoxernaItemTags extends ItemTagsProvider {
    public NoxernaItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                           CompletableFuture<TagLookup<Block>> blockTags,
                           ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, TheNoxerna.MODID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
        this.copy(BlockTags.SLABS, ItemTags.SLABS);
        this.copy(BlockTags.WALLS, ItemTags.WALLS);
        tag(NoxernaTags.ItemTags.COMPLETES_MINE_HARD_STONE_ADVANCEMENT)
                .addTag(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS);
        tag(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS)
                .add(NoxernaBlocks.NOXUM.get().asItem());
        tag(NoxernaTags.ItemTags.NOXUM_STONE_TYPE)
                .add(NoxernaBlocks.NOXUM.get().asItem()).add(NoxernaBlocks.NOXUM_STAIRS.get().asItem())
                .add(NoxernaBlocks.NOXUM_WALL.get().asItem()).add(NoxernaBlocks.POLISHED_NOXUM.get().asItem())
                .add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get().asItem())
                .add(NoxernaBlocks.POLISHED_NOXUM_WALL.get().asItem()).add(NoxernaBlocks.NOXUM_BRICKS.get().asItem())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get().asItem()).add(NoxernaBlocks.NOXUM_BRICK_WALL.get().asItem());
        this.copy(NoxernaTags.BlockTags.PEBBLES, NoxernaTags.ItemTags.PEBBLES);
    }
}