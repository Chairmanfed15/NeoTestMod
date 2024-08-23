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
