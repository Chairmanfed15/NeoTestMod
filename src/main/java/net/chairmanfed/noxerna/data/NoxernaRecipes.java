package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.CompletableFuture;

public class NoxernaRecipes extends NoxernaRecipeProvider{
    public NoxernaRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    private ResourceLocation name(String name) {
        return ResourceLocation.fromNamespaceAndPath(TheNoxerna.MODID, name);
    }
    @Override
    protected void buildRecipes (RecipeOutput output) {
        // Building Block Recipes
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

        // Stonecutting Recipes
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM.get().asItem())
                .save(output, name("stonecutting/noxum_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_STAIRS.get().asItem())
                .save(output, name("stonecutting/noxum_stairs_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_SLAB.get().asItem(), 2)
                .save(output, name("stonecutting/noxum_slab_from_stonecutting"));
        stonecutting(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, NoxernaBlocks.NOXUM_WALL.get().asItem())
                .save(output, name("stonecutting/noxum_wall_from_stonecutting"));
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
