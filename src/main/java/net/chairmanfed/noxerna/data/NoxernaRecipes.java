package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.data.providers.NoxernaRecipeProvider;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaItems;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class NoxernaRecipes extends NoxernaRecipeProvider {
    public NoxernaRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    private ResourceLocation name(String name) {
        return ResourceLocation.fromNamespaceAndPath(TheNoxerna.MODID, name);
    }
    @Override
    protected void buildRecipes (RecipeOutput output) {
        // Building Block Recipes
        makePlanks(NoxernaTags.ItemTags.XENON_LOGS, NoxernaBlocks.XENON_PLANKS.get().asItem())
                .group("planks")
                .save(output, name("crafting/xenon_planks"));
        makeStairs(NoxernaBlocks.NOXUM.get().asItem(), NoxernaBlocks.NOXUM_STAIRS.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_stairs"));
        makeSlab(NoxernaBlocks.NOXUM.get().asItem(), NoxernaBlocks.NOXUM_SLAB.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_slab"));
        makeSlabIntoBlock(NoxernaBlocks.NOXUM_SLAB.get().asItem(), NoxernaBlocks.NOXUM.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_from_slab"));
        makeWall(NoxernaBlocks.NOXUM.get().asItem(), NoxernaBlocks.NOXUM_WALL.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_wall"));
        unpacking3x3(NoxernaBlocks.NOXUM.get().asItem(), NoxernaBlocks.NOXUM_PEBBLE.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_pebble"));
        packing3x3(NoxernaBlocks.NOXUM_PEBBLE.get().asItem(), NoxernaBlocks.NOXUM.get().asItem())
                .group("noxum")
                .save(output, name("crafting/noxum_from_pebble"));
        makeBricks(NoxernaBlocks.NOXUM.get().asItem(), NoxernaBlocks.POLISHED_NOXUM.get().asItem())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum"));
        makeStairs(NoxernaBlocks.POLISHED_NOXUM.get().asItem(), NoxernaBlocks.POLISHED_NOXUM_STAIRS.get().asItem())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_stairs"));
        makeSlab(NoxernaBlocks.POLISHED_NOXUM.get().asItem(), NoxernaBlocks.POLISHED_NOXUM_SLAB.get().asItem())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_slab"));
        makeSlabIntoBlock(NoxernaBlocks.POLISHED_NOXUM_SLAB.get().asItem(), NoxernaBlocks.POLISHED_NOXUM.get().asItem())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_from_slab"));
        makeWall(NoxernaBlocks.POLISHED_NOXUM.get().asItem(), NoxernaBlocks.POLISHED_NOXUM_WALL.get().asItem())
                .group("polished_noxum")
                .save(output, name("crafting/polished_noxum_wall"));
        makeBricks(NoxernaBlocks.POLISHED_NOXUM.get().asItem(), NoxernaBlocks.NOXUM_BRICKS.get().asItem())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_bricks"));
        makeStairs(NoxernaBlocks.NOXUM_BRICKS.get().asItem(), NoxernaBlocks.NOXUM_BRICK_STAIRS.get().asItem())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_brick_stairs"));
        makeSlab(NoxernaBlocks.NOXUM_BRICKS.get().asItem(), NoxernaBlocks.NOXUM_BRICK_SLAB.get().asItem())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_brick_slab"));
        makeSlabIntoBlock(NoxernaBlocks.NOXUM_BRICK_SLAB.get().asItem(), NoxernaBlocks.NOXUM_BRICKS.get().asItem())
                .group("noxum_brick")
                .save(output, name("crafting/noxum_bricks_from_slab"));
        makeWall(NoxernaBlocks.POLISHED_NOXUM.get().asItem(), NoxernaBlocks.NOXUM_BRICK_WALL.get().asItem())
                .group("noxum_bricks")
                .save(output, name("crafting/noxum_brick_wall"));

        // Noblewood Alt Recipes
        makeCraftingTable(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, Items.CRAFTING_TABLE)
                .group("crafting_tables")
                .save(output, name("crafting/noblewood_crafting_table"));

        // Ingredient Recipes
        makeSticks(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_STICK.get())
                .group("sticks")
                .save(output, name("crafting/noblewood_stick"));

        // Tool Recipes
        makeAxe(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_AXE.get())
                .group("noblewood_tools")
                .save(output, name("crafting/noblewood_axe"));
        makeHoe(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_HOE.get())
                .group("noblewood_tools")
                .save(output, name("crafting/noblewood_hoe"));
        makePickaxe(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_PICKAXE.get())
                .group("noblewood_tools")
                .save(output, name("crafting/noblewood_pickaxe"));
        makeShovel(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_SHOVEL.get())
                .group("noblewood_tools")
                .save(output, name("crafting/noblewood_shovel"));
        makeSword(NoxernaTags.ItemTags.NOBLEWOOD_PLANKS, NoxernaItems.NOBLEWOOD_SWORD.get())
                .group("noblewood_tools")
                .save(output, name("crafting/noblewood_sword"));
        makeAxe(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS, NoxernaItems.NOXSTONE_AXE.get())
                .group("noxstone_tools")
                .save(output, name("crafting/noxstone_axe"));
        makePickaxe(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS, NoxernaItems.NOXSTONE_PICKAXE.get())
                .group("noxstone_tools")
                .save(output, name("crafting/noxstone_pickaxe"));
        makePickaxe(NoxernaTags.ItemTags.FERREBRIS_TOOL_MATERIALS, NoxernaItems.FERREBRIS_PICKAXE.get())
                .group("ferrebris_tools")
                .save(output, name("crafting/ferrebris_pickaxe"));
        makePickaxe(NoxernaTags.ItemTags.UMBURAM_TOOL_MATERIALS, NoxernaItems.UMBURAM_PICKAXE.get())
                .group("umburam_tools")
                .save(output, name("crafting/umburam_pickaxe"));
        makePickaxe(NoxernaTags.ItemTags.ADAMUNA_TOOL_MATERIALS, NoxernaItems.ADAMUNA_PICKAXE.get())
                .group("adamuna_tools")
                .save(output, name("crafting/adamuna_pickaxe"));
        nihoxiteUpgrade(NoxernaItems.ADAMUNA_PICKAXE.get(), NoxernaItems.NIHOXITE_PICKAXE.get())
                .save(output, name("smithing/nihoxite_pickaxe"));
        nihoxiteUpgrade(Items.DIAMOND_PICKAXE, NoxernaItems.NIHOXITE_PICKAXE.get())
                .save(output, name("smithing/diamond_nihoxite_pickaxe"));
        netheriteUpgrade(NoxernaItems.ADAMUNA_PICKAXE.get(), Items.NETHERITE_PICKAXE)
                .save(output, name("smithing/adamuna_netherite_pickaxe"));

        // Stonecutting Recipes
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM.get().asItem())
                .save(output, name("stonecutting/noxum_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_STAIRS.get().asItem())
                .save(output, name("stonecutting/noxum_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_SLAB.get().asItem(), 2)
                .save(output, name("stonecutting/noxum_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_WALL.get().asItem())
                .save(output, name("stonecutting/noxum_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_PEBBLE.get().asItem(), 9)
                .save(output, name("stonecutting/noxum_pebble_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.POLISHED_NOXUM.get().asItem())
                .save(output, name("stonecutting/polished_noxum_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.POLISHED_NOXUM_STAIRS.get().asItem())
                .save(output, name("stonecutting/polished_noxum_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.POLISHED_NOXUM_SLAB.get().asItem(), 2)
                .save(output, name("stonecutting/polished_noxum_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.POLISHED_NOXUM_WALL.get().asItem())
                .save(output, name("stonecutting/polished_noxum_wall_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_BRICKS.get().asItem())
                .save(output, name("stonecutting/noxum_bricks_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_BRICK_STAIRS.get().asItem())
                .save(output, name("stonecutting/noxum_brick_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_BRICK_SLAB.get().asItem())
                .save(output, name("stonecutting/noxum_bricks_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_BRICK_WALL.get().asItem())
                .save(output, name("stonecutting/noxum_bricks_wall_from_stonecutting"));
    }
}
