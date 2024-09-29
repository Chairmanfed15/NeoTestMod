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
        // Minecraft Tags
        // Copy from Block Tags
        this.copy(BlockTags.LOGS, ItemTags.LOGS);
        this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
        this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        this.copy(BlockTags.SLABS, ItemTags.SLABS);
        this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        this.copy(BlockTags.WALLS, ItemTags.WALLS);
        this.copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);
        this.copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
        this.copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);
        this.copy(BlockTags.STONE_BUTTONS, ItemTags.STONE_BUTTONS);
        // Tools
        tag(ItemTags.AXES)
                .add(NoxernaItems.NOBLEWOOD_AXE.get()).add(NoxernaItems.NOXSTONE_AXE.get())
                .add(NoxernaItems.FERREBRIS_AXE.get()).add(NoxernaItems.UMBURAM_AXE.get())
                .add(NoxernaItems.ADAMUNA_AXE.get()).add(NoxernaItems.NIHOXITE_AXE.get());
        tag(ItemTags.HOES)
                .add(NoxernaItems.NOBLEWOOD_HOE.get()).add(NoxernaItems.NOXSTONE_HOE.get())
                .add(NoxernaItems.FERREBRIS_HOE.get()).add(NoxernaItems.UMBURAM_HOE.get())
                .add(NoxernaItems.ADAMUNA_HOE.get()).add(NoxernaItems.NIHOXITE_HOE.get());
        tag(ItemTags.PICKAXES)
                .add(NoxernaItems.NOBLEWOOD_PICKAXE.get()).add(NoxernaItems.NOXSTONE_PICKAXE.get())
                .add(NoxernaItems.FERREBRIS_PICKAXE.get()).add(NoxernaItems.UMBURAM_PICKAXE.get())
                .add(NoxernaItems.ADAMUNA_PICKAXE.get()).add(NoxernaItems.NIHOXITE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(NoxernaItems.NOBLEWOOD_SHOVEL.get()).add(NoxernaItems.NOXSTONE_SHOVEL.get())
                .add(NoxernaItems.FERREBRIS_SHOVEL.get()).add(NoxernaItems.UMBURAM_SHOVEL.get())
                .add(NoxernaItems.ADAMUNA_SHOVEL.get()).add(NoxernaItems.NIHOXITE_SHOVEL.get());
        tag(ItemTags.SWORDS)
                .add(NoxernaItems.NOBLEWOOD_SWORD.get()).add(NoxernaItems.NOXSTONE_SWORD.get())
                .add(NoxernaItems.FERREBRIS_SWORD.get()).add(NoxernaItems.UMBURAM_SWORD.get())
                .add(NoxernaItems.ADAMUNA_SWORD.get()).add(NoxernaItems.NIHOXITE_SWORD.get());
        tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .addTag(NoxernaTags.ItemTags.COMPLETES_MINE_HARD_STONE_ADVANCEMENT);
        // Common tags
        // Copy from Block Tags
        this.copy(NoxernaTags.BlockTags.STORAGE_BLOCKS, NoxernaTags.ItemTags.STORAGE_BLOCKS);
        this.copy(NoxernaTags.BlockTags.FERREBRIS_STORAGE_BLOCKS, NoxernaTags.ItemTags.FERREBRIS_STORAGE_BLOCKS);
        // Ingredient Groupings
            // Raw Materials
        tag(NoxernaTags.ItemTags.RAW_MATERIALS)
                .addTag(NoxernaTags.ItemTags.RAW_FERREBRIS_MATERIALS)
                .addTag(NoxernaTags.ItemTags.RAW_OBSCUPRUM_MATERIALS)
                .addTag(NoxernaTags.ItemTags.RAW_UMBURAM_MATERIALS)
                .addTag(NoxernaTags.ItemTags.RAW_INPERLUM_MATERIALS);
        tag(NoxernaTags.ItemTags.RAW_FERREBRIS_MATERIALS)
                .add(NoxernaItems.RAW_FERREBRIS.get());
        tag(NoxernaTags.ItemTags.RAW_OBSCUPRUM_MATERIALS)
                .add(NoxernaItems.RAW_OBSCUPRUM.get());
        tag(NoxernaTags.ItemTags.RAW_UMBURAM_MATERIALS)
                .add(NoxernaItems.RAW_UMBURAM.get());
        tag(NoxernaTags.ItemTags.RAW_INPERLUM_MATERIALS)
                .add(NoxernaItems.RAW_INPERLUM.get());
            // Gems
        tag(NoxernaTags.ItemTags.GEMS)
                .addTag(NoxernaTags.ItemTags.ADAMUNA_GEMS);
        tag(NoxernaTags.ItemTags.ADAMUNA_GEMS)
                .add(NoxernaItems.ADAMUNA.get());
            // Nuggets
        tag(NoxernaTags.ItemTags.NUGGETS)
                .addTag(NoxernaTags.ItemTags.FERREBRIS_NUGGETS).addTag(NoxernaTags.ItemTags.OBSCUPRUM_NUGGETS)
                .addTag(NoxernaTags.ItemTags.UMBURAM_NUGGETS).addTag(NoxernaTags.ItemTags.NUGGETS)
                .addTag(NoxernaTags.ItemTags.NIHOXITE_NUGGETS);
            // Ingots
        tag(NoxernaTags.ItemTags.INGOTS)
                .addTag(NoxernaTags.ItemTags.FERREBRIS_INGOTS).addTag(NoxernaTags.ItemTags.OBSCUPRUM_INGOTS)
                .addTag(NoxernaTags.ItemTags.UMBURAM_INGOTS).addTag(NoxernaTags.ItemTags.INPERLUM_INGOTS)
                .addTag(NoxernaTags.ItemTags.NIHOXITE_INGOTS);
        tag(NoxernaTags.ItemTags.FERREBRIS_NUGGETS)
                .add(NoxernaItems.FERREBRIS_NUGGET.get());
        tag(NoxernaTags.ItemTags.OBSCUPRUM_NUGGETS)
                .add(NoxernaItems.OBSCUPRUM_NUGGET.get());
        tag(NoxernaTags.ItemTags.UMBURAM_NUGGETS)
                .add(NoxernaItems.UMBURAM_NUGGET.get());
        tag(NoxernaTags.ItemTags.INPERLUM_NUGGETS)
                .add(NoxernaItems.INPERLUM_NUGGET.get());
        tag(NoxernaTags.ItemTags.NIHOXITE_NUGGETS)
                .add(NoxernaItems.NIHOXITE_NUGGET.get());
        tag(NoxernaTags.ItemTags.FERREBRIS_INGOTS)
                .add(NoxernaItems.FERREBRIS_INGOT.get());
        tag(NoxernaTags.ItemTags.OBSCUPRUM_INGOTS)
                .add(NoxernaItems.OBSCUPRUM_INGOT.get());
        tag(NoxernaTags.ItemTags.UMBURAM_INGOTS)
                .add(NoxernaItems.UMBURAM_INGOT.get());
        tag(NoxernaTags.ItemTags.INPERLUM_INGOTS)
                .add(NoxernaItems.INPERLUM_INGOT.get());
        tag(NoxernaTags.ItemTags.NIHOXITE_INGOTS)
                .add(NoxernaItems.NIHOXITE_INGOT.get());
        tag(NoxernaTags.ItemTags.WOODEN_RODS)
                .addTag(NoxernaTags.ItemTags.NOBLEWOOD_RODS);
        tag(NoxernaTags.ItemTags.NOBLEWOOD_RODS)
                .add(NoxernaItems.NOBLEWOOD_STICK.get());
        // Noxerna Tags
        // Copy from Block Tags
        this.copy(NoxernaTags.BlockTags.PEBBLES, NoxernaTags.ItemTags.PEBBLES);
        this.copy(NoxernaTags.BlockTags.XENON_LOGS, NoxernaTags.ItemTags.XENON_LOGS);
        this.copy(NoxernaTags.BlockTags.KRYPTON_LOGS, NoxernaTags.ItemTags.KRYPTON_LOGS);
        // Advancement Logic
        tag(NoxernaTags.ItemTags.COMPLETES_MINE_HARD_STONE_ADVANCEMENT)
                .addTag(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS);
        tag(NoxernaTags.ItemTags.COMPLETES_NOXERNA_TOOLS_ADVANCEMENT)
                .add(NoxernaItems.NOBLEWOOD_PICKAXE.get()).add(NoxernaItems.NOXSTONE_PICKAXE.get())
                .add(NoxernaItems.FERREBRIS_PICKAXE.get()).add(NoxernaItems.UMBURAM_PICKAXE.get())
                .add(NoxernaItems.ADAMUNA_PICKAXE.get()).add(NoxernaItems.NIHOXITE_PICKAXE.get());
        // Tool Material Grouping
        tag(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS)
                .add(NoxernaItems.XENON_PLANKS.get())
                .add(NoxernaItems.KRYPTON_PLANKS.get());
        tag(NoxernaTags.ItemTags.ANY_IRON_INGOT)
                .addTag(NoxernaTags.ItemTags.IRON_INGOTS).addTag(NoxernaTags.ItemTags.FERREBRIS_INGOTS);
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
        // Interchangeable Block Types
        tag(NoxernaTags.ItemTags.NOXUM_STONE_TYPE)
                .add(NoxernaBlocks.NOXUM.get().asItem()).add(NoxernaBlocks.NOXUM_STAIRS.get().asItem())
                .add(NoxernaBlocks.NOXUM_WALL.get().asItem()).add(NoxernaBlocks.POLISHED_NOXUM.get().asItem())
                .add(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get().asItem())
                .add(NoxernaBlocks.POLISHED_NOXUM_WALL.get().asItem()).add(NoxernaBlocks.NOXUM_BRICKS.get().asItem())
                .add(NoxernaBlocks.NOXUM_BRICK_STAIRS.get().asItem()).add(NoxernaBlocks.NOXUM_BRICK_WALL.get().asItem());
        tag(NoxernaTags.ItemTags.FERREBRIS_METAL_PLATING)
                .add(NoxernaItems.FERREBRIS_PLATING.get()).add(NoxernaItems.FERREBRIS_PLATING_STAIRS.get())
                .add(NoxernaItems.FERREBRIS_PLATING_WALL.get());
    }
}