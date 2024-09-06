package net.chairmanfed.noxerna.data.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;


public class NoxernaRecipeProvider extends RecipeProvider {
    public NoxernaRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    // Shaped Recipes
    public ShapedRecipeBuilder makeBricks(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
                .pattern("##")
                .pattern("##")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public  ShapedRecipeBuilder makeStairs(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeSlab(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                .pattern("###")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeSlabIntoBlock(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("#")
                .pattern("#")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder makeWall(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                .pattern("###")
                .pattern("###")
                .define('#', input)
                .unlockedBy("has_" + input, has(input));
    }
    public ShapedRecipeBuilder packing3x3(Item input, ItemLike result) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', input)
                .unlockedBy("has" + input, has(input));
    }
    public ShapedRecipeBuilder packing3x3(Item input, ItemLike result, Item tagInput) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("###")
                .pattern("#$#")
                .pattern("###")
                .define('#', input)
                .define('$', tagInput)
                .unlockedBy("has" + input, has(input));
    }
    // Shapeless Recipes
    public ShapelessRecipeBuilder unpacking3x3(Item input, ItemLike result) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 9)
                .requires(input)
                .unlockedBy("has_" + input, has(input));
    }
    // Stonecutter Recipes
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
