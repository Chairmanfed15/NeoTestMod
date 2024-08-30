package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class NoxernaTags {
    public static class ItemTags {
        public static TagKey<Item> localTag(String tagName) {
            return net.minecraft.tags.ItemTags.create(TheNoxerna.prefix(tagName));
        }
        public static TagKey<Item> commonTag(String tagName) {
            return net.minecraft.tags.ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
        public static final TagKey<Item> COMPLETES_MINE_HARD_STONE_ADVANCEMENT = localTag(
                "completes_mine_hard_stone_advancement");
        public static final TagKey<Item> NOXSTONE_TOOL_MATERIALS = localTag(
                "noxstone_tool_materials");
        public static final TagKey<Item> NOXUM_STONE_TYPE = localTag("stone_types/noxum");
        public static final TagKey<Item> PEBBLES = localTag("pebbles");
    }
    public static class BlockTags {
        public static TagKey<Block> localTag(String tagName) {
            return net.minecraft.tags.BlockTags.create(TheNoxerna.prefix(tagName));
        }
        public static TagKey<Block> commonTag(String tagName) {
            return net.minecraft.tags.BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
        public static final TagKey<Block> PEBBLES = localTag("pebbles");
        public static final TagKey<Block> QUAKE_IMMUNE = localTag("quake_immune");
    }
}
