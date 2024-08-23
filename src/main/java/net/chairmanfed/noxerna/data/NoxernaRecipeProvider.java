package net.chairmanfed.noxerna.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;


public class NoxernaRecipeProvider extends RecipeProvider {
    public NoxernaRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    public SingleItemRecipeBuilder stonecutting(TagKey<Item> input, ItemLike result) {
        return SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, result)
                .unlockedBy("has_"+ input, has(input));
    }
    public SingleItemRecipeBuilder stonecutting(TagKey<Item> input, ItemLike result, int resultAmount) {
        return SingleItemRecipeBuilder.stonecutting(
                Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, result, resultAmount)
                .unlockedBy("has_"+ input, has(input));
    }
}
