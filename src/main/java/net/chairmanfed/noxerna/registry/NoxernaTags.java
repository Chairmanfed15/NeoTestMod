package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class NoxernaTags {
    public static class ItemTags {
        // Local Tags
        public static final TagKey<Item> COMPLETES_MINE_HARD_STONE_ADVANCEMENT = localTag(
                "completes_mine_hard_stone_advancement");
        public static final TagKey<Item> COMPLETES_NOXERNA_TOOLS_ADVANCEMENT = localTag(
                "completes_noxerna_tools_advancement");
        public static final TagKey<Item> NOBLEWOOD_PLANKS = localTag("noblewood_planks");
        public static final TagKey<Item> ANY_IRON_INGOT = localTag("any_iron_ingot");
        public static final TagKey<Item> NOXSTONE_TOOL_MATERIALS = localTag("noxstone_tool_materials");
        public static final TagKey<Item> FERREBRIS_TOOL_MATERIALS = localTag("ferrebris_tool_materials");
        public static final TagKey<Item> UMBURAM_TOOL_MATERIALS = localTag("umburam_tool_materials");
        public static final TagKey<Item> ADAMUNA_TOOL_MATERIALS = localTag("adamuna_tool_materials");
        public static final TagKey<Item> NIHOXITE_TOOL_MATERIALS = localTag("nihoxite_tool_materials");
        public static final TagKey<Item> NOXUM_STONE_TYPE = localTag("stone_types/noxum");
        public static final TagKey<Item> FERREBRIS_METAL_PLATING = localTag("metal_plating/ferrebris");
        public static final TagKey<Item> PEBBLES = localTag("pebbles");
        public static final TagKey<Item> XENON_LOGS = localTag("xenon_logs");
        public static final TagKey<Item> KRYPTON_LOGS = localTag("krypton_logs");

        // Common Tags
        // Material Groupings
            // Storage Blocks
        public static final TagKey<Item> STORAGE_BLOCKS = commonTag("storage_blocks");
        public static final TagKey<Item> FERREBRIS_STORAGE_BLOCKS = commonTag("storage_blocks/ferrebris");
        public static final TagKey<Item> UMBURAM_STORAGE_BLOCKS = commonTag("storage_blocks/umburam");
        public static final TagKey<Item> TENERYL_STORAGE_BLOCKS = commonTag("storage_blocks/teneryl");
        public static final TagKey<Item> ADAMUNA_STORAGE_BLOCKS = commonTag("storage_blocks/adamuna");
        public static final TagKey<Item> INPERLUM_STORAGE_BLOCKS = commonTag("storage_blocks/inperlum");
        public static final TagKey<Item> NIHOXITE_STORAGE_BLOCKS = commonTag("storage_blocks/nihoxite");
        public static final TagKey<Item> VITRAGOR_STORAGE_BLOCKS = commonTag("storage_blocks/vitragor");
        public static final TagKey<Item> OBSCUPRUM_STORAGE_BLOCKS = commonTag("storage_blocks/obscuprum");
            // Raw Materials
        public static final TagKey<Item> RAW_MATERIALS = commonTag("raw_materials");
        public static final TagKey<Item> RAW_FERREBRIS_MATERIALS = commonTag("raw_materials/ferrebris");
        public static final TagKey<Item> RAW_OBSCUPRUM_MATERIALS = commonTag("raw_materials/obscuprum");
        public static final TagKey<Item> RAW_UMBURAM_MATERIALS = commonTag("raw_materials/umburam");
        public static final TagKey<Item> RAW_INPERLUM_MATERIALS = commonTag("raw_materials/inperlum");
            // Gems
        public static final TagKey<Item> GEMS = commonTag("gems");
        public static final TagKey<Item> TENERYL_GEMS = commonTag("gems/teneryl");
        public static final TagKey<Item> ADAMUNA_GEMS = commonTag("gems/adamuna");
        public static final TagKey<Item> VITRAGOR_GEMS = commonTag("gems/vitragor");
            // Nuggets
        public static final TagKey<Item> NUGGETS = commonTag("nuggets");
        public static final TagKey<Item> FERREBRIS_NUGGETS = commonTag("nuggets/ferrebris");
        public static final TagKey<Item> OBSCUPRUM_NUGGETS = commonTag("nuggets/obscuprum");
        public static final TagKey<Item> UMBURAM_NUGGETS = commonTag("nuggets/umburam");
        public static final TagKey<Item> INPERLUM_NUGGETS = commonTag("nuggets/inperlum");
        public static final TagKey<Item> NIHOXITE_NUGGETS = commonTag("nuggets/nihoxite");
            // Ingots
        public static final TagKey<Item> INGOTS = commonTag("ingots");
        public static final TagKey<Item> IRON_INGOTS = commonTag("ingots/iron");
        public static final TagKey<Item> FERREBRIS_INGOTS = commonTag("ingots/ferrebris");
        public static final TagKey<Item> OBSCUPRUM_INGOTS = commonTag("ingots/obscuprum");
        public static final TagKey<Item> UMBURAM_INGOTS = commonTag("ingots/umburam");
        public static final TagKey<Item> INPERLUM_INGOTS = commonTag("ingots/inperlum");
        public static final TagKey<Item> NIHOXITE_INGOTS = commonTag("ingots/nihoxite");
            // Rods
        public static final TagKey<Item> NOBLEWOOD_RODS = commonTag("rods/noblewood");
        public static final TagKey<Item> WOODEN_RODS = commonTag("rods/wooden");
        public static TagKey<Item> localTag(String tagName) {
            return net.minecraft.tags.ItemTags.create(TheNoxerna.prefix(tagName));
        }
        public static TagKey<Item> commonTag(String tagName) {
            return net.minecraft.tags.ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", tagName));
        }
    }
    public static class BlockTags {
        public static final TagKey<Block> BASE_STONE_NOXERNA = localTag("base_stone_noxerna");

        public static final TagKey<Block> INCORRECT_FOR_NOBLEWOOD_TOOL = localTag(
                "incorrect_for_noblewood_tool");
        public static final TagKey<Block> INCORRECT_FOR_NOXSTONE_TOOL = localTag(
                "incorrect_for_noxstone_tool");
        public static final TagKey<Block> INCORRECT_FOR_UMBURAM_TOOL = localTag(
                "incorrect_for_umburam_tool");
        public static final TagKey<Block> INCORRECT_FOR_FERREBRIS_TOOL = localTag(
                "incorrect_for_ferrebris_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADAMUNA_TOOL = localTag(
                "incorrect_for_adamuna_tool");
        public static final TagKey<Block> INCORRECT_FOR_NIHOXITE_TOOL = localTag(
                "incorrect_for_nihoxite_tool");
        public static final TagKey<Block> INFINIBURN_NOXERNA = localTag("infiniburn_noxerna");
        public static final TagKey<Block> NOXERNA_CARVER_REPLACEABLE = localTag("base_stone_noxerna");
        public static final TagKey<Block> NOXUM_ORES_REPLACEABLE = localTag("noxum_ores_replaceable");
        public static final TagKey<Block> PEBBLES = localTag("pebbles");
        public static final TagKey<Block> QUAKE_IMMUNE = localTag("quake_immune");
        public static final TagKey<Block> BOSS_IMMUNE = localTag("boss_immune");
        public static final TagKey<Block> XENON_LOGS = localTag("xenon_logs");
        public static final TagKey<Block> KRYPTON_LOGS = localTag("krypton_logs");

        public static final TagKey<Block> STORAGE_BLOCKS = commonTag("storage_blocks");
        public static final TagKey<Block> FERREBRIS_STORAGE_BLOCKS = commonTag("storage_blocks/ferrebris");
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
