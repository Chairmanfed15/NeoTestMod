package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaItems;
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
        this.copy(BlockTags.LOGS, ItemTags.LOGS);
        tag(ItemTags.PICKAXES)
                .add(NoxernaItems.NOBLEWOOD_PICKAXE.get()).add(NoxernaItems.UMBURAM_PICKAXE.get())
                .add(NoxernaItems.NOXSTONE_PICKAXE.get()).add(NoxernaItems.FERREBRIS_PICKAXE.get())
                .add(NoxernaItems.ADAMUNA_PICKAXE.get()).add(NoxernaItems.NIHOXITE_PICKAXE.get());
        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .addTag(NoxernaTags.ItemTags.COMPLETES_MINE_HARD_STONE_ADVANCEMENT);
        tag(NoxernaTags.ItemTags.GEMS)
                .addTag(NoxernaTags.ItemTags.ADAMUNA_GEMS);
        tag(NoxernaTags.ItemTags.INGOTS)
                .addTag(NoxernaTags.ItemTags.FERREBRIS_INGOTS).addTag(NoxernaTags.ItemTags.UMBURAM_INGOTS)
                .addTag(NoxernaTags.ItemTags.NIHOXITE_INGOTS);
        tag(NoxernaTags.ItemTags.ADAMUNA_GEMS)
                .add(NoxernaItems.ADAMUNA.get());
        tag(NoxernaTags.ItemTags.FERREBRIS_INGOTS)
                .add(NoxernaItems.FERREBRIS_INGOT.get());
        tag(NoxernaTags.ItemTags.UMBURAM_INGOTS)
                .add(NoxernaItems.UMBURAM_INGOT.get());
        tag(NoxernaTags.ItemTags.NIHOXITE_INGOTS)
                .add(NoxernaItems.NIHOXITE_INGOT.get());
        tag(NoxernaTags.ItemTags.WOODEN_RODS)
                .addTag(NoxernaTags.ItemTags.NOBLEWOOD_RODS);
        tag(NoxernaTags.ItemTags.COMPLETES_MINE_HARD_STONE_ADVANCEMENT)
                .addTag(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS);
        tag(NoxernaTags.ItemTags.COMPLETES_NOXERNA_TOOLS_ADVANCEMENT)
                .add(NoxernaItems.NOBLEWOOD_PICKAXE.get()).add(NoxernaItems.UMBURAM_PICKAXE.get())
                .add(NoxernaItems.NOXSTONE_PICKAXE.get()).add(NoxernaItems.FERREBRIS_PICKAXE.get())
                .add(NoxernaItems.ADAMUNA_PICKAXE.get()).add(NoxernaItems.NIHOXITE_PICKAXE.get());
        tag(NoxernaTags.ItemTags.NOBLEWOOD_RODS)
                .add(NoxernaItems.NOBLEWOOD_STICK.get());
        tag(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS)
                .add(NoxernaBlocks.XENON_PLANKS.get().asItem());
        tag(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS)
                .add(NoxernaBlocks.NOXUM.get().asItem());
        tag(NoxernaTags.ItemTags.FERREBRIS_TOOL_MATERIALS)
                .addTag(NoxernaTags.ItemTags.FERREBRIS_INGOTS);
        tag(NoxernaTags.ItemTags.UMBURAM_TOOL_MATERIALS)
                .addTag(NoxernaTags.ItemTags.UMBURAM_INGOTS);
        tag(NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS)
                .addTag(NoxernaTags.ItemTags.ADAMUNA_GEMS);
        tag(NoxernaTags.ItemTags.NIHOXITE_TOOL_MATERIALS)
                .addTag(NoxernaTags.ItemTags.NIHOXITE_INGOTS);
        tag(NoxernaTags.ItemTags.NOXUM_STONE_TYPE)
                .add(NoxernaBlocks.NOXUM.get().asItem()).add(NoxernaBlocks.NOXUM_STAIRS.get().asItem())
                .add(NoxernaBlocks.NOXUM_WALL.get().asItem()).add(NoxernaBlocks.POLISHED_NOXUM.get().asItem())
                .add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get().asItem())
                .add(NoxernaBlocks.POLISHED_NOXUM_WALL.get().asItem()).add(NoxernaBlocks.NOXUM_BRICKS.get().asItem())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get().asItem()).add(NoxernaBlocks.NOXUM_BRICK_WALL.get().asItem());
        this.copy(NoxernaTags.BlockTags.PEBBLES, NoxernaTags.ItemTags.PEBBLES);
        this.copy(NoxernaTags.BlockTags.XENON_LOGS, NoxernaTags.ItemTags.XENON_LOGS);
    }
}