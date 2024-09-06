package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class NoxernaTags {
    public static class ItemTags {
        public static final TagKey<Item> COMPLETES_MINE_HARD_STONE_ADVANCEMENT = localTag(
                "completes_mine_hard_stone_advancement");
        public static final TagKey<Item> NOXSTONE_TOOL_MATERIALS = localTag(
                "noxstone_tool_materials");
        public static final TagKey<Item> NOXUM_STONE_TYPE = localTag("stone_types/noxum");
        public static final TagKey<Item> PEBBLES = localTag("pebbles");
        public static TagKey<Item> localTag(String tagName) {
            return net.minecraft.tags.ItemTags.create(TheNoxerna.prefix(tagName));
        }
        public static TagKey<Item> commonTag(String tagName) {
            return net.minecraft.tags.ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
    }
    public static class BlockTags {
        public static final TagKey<Block> BASE_STONE_NOXERNA = localTag("base_stone_noxerna");
        public static final TagKey<Block> INFINIBURN_NOXERNA = localTag("infiniburn_noxerna");
        public static final TagKey<Block> NOXERNA_CARVER_REPLACEABLE = localTag("base_stone_noxerna");
        public static final TagKey<Block> NOXUM_ORES_REPLACEABLE = localTag("noxum_ores_replaceable");
        public static final TagKey<Block> PEBBLES = localTag("pebbles");
        public static final TagKey<Block> QUAKE_IMMUNE = localTag("quake_immune");
        public static final TagKey<Block> BOSS_IMMUNE = localTag("boss_immune");
        public static final TagKey<Block> NOXUM_ORE_BEARING_GROUND = commonTag("ore_bearing_ground/noxum");
        public static TagKey<Block> localTag(String tagName) {
            return net.minecraft.tags.BlockTags.create(TheNoxerna.prefix(tagName));
        }
        public static TagKey<Block> commonTag(String tagName) {
            return net.minecraft.tags.BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
        public static TagKey<Block> neoforgeTag(String tagName) {
            return net.minecraft.tags.BlockTags.create(
                    ResourceLocation.fromNamespaceAndPath("neoforge", tagName));
        }
    }

    public static class FluidTags {
        public static TagKey<Fluid> localTag(String tagName) {
            return net.minecraft.tags.FluidTags.create(TheNoxerna.prefix(tagName));
        }
        public static TagKey<Fluid> commonTag(String tagName) {
            return net.minecraft.tags.FluidTags.create(ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
    }
    public static class EntityTags {
        public static final TagKey<EntityType<?>> AUTOMATONS = localTag("automatons");
        public static final TagKey<EntityType<?>> SENSITIVE_TO_DISMANTLE = localTag("sensitive_to_dismantle");
        public static final TagKey<EntityType<?>> SENSITIVE_TO_SHADOWBANE = localTag("sensitive_to_shadowbane");
        public static final TagKey<EntityType<?>> QUAKE_IMMUNE = localTag("quake_immune");
        public static TagKey<EntityType<?>> localTag(String tagName) {
            return TagKey.create(Registries.ENTITY_TYPE, TheNoxerna.prefix(tagName));
        }
        public static TagKey<EntityType<?>> commonTag(String tagName) {
            return TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
    }
}
