package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.item.NoxernaSmithingTemplateItem;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NoxernaItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheNoxerna.MODID);
    public static Supplier<Item> registerSimpleItem(String name, Item.Properties properties) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static Supplier<Item> registerBlockItem(String name, Supplier<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    @SuppressWarnings("Unused")
    // Intermediates
    public static final Supplier<Item> RAW_FERREBRIS = registerSimpleItem(
            "raw_ferrebris", new Item.Properties());
    public static final Supplier<Item> RAW_OBSCUPRUM = registerSimpleItem(
            "raw_obscuprum", new Item.Properties());
    public static final Supplier<Item> RAW_UMBURAM = registerSimpleItem(
            "raw_umburam", new Item.Properties());
    public static final Supplier<Item> RAW_INPERLUM = registerSimpleItem(
            "raw_inperlum", new Item.Properties());
    public static final Supplier<Item> TENERYL = registerSimpleItem(
            "teneryl", new Item.Properties());
    public static final Supplier<Item> ADAMUNA = registerSimpleItem(
            "adamuna", new Item.Properties());
    public static final Supplier<Item> VITRAGOR = registerSimpleItem(
            "vitragor", new Item.Properties());
    public static final Supplier<Item> FERREBRIS_NUGGET = registerSimpleItem(
            "ferrebris_nugget", new Item.Properties());
    public static final Supplier<Item> OBSCUPRUM_NUGGET = registerSimpleItem(
            "obscuprum_nugget", new Item.Properties());
    public static final Supplier<Item> UMBURAM_NUGGET = registerSimpleItem(
            "umburam_nugget", new Item.Properties());
    public static final Supplier<Item> INPERLUM_NUGGET = registerSimpleItem(
            "inperlum_nugget", new Item.Properties());
    public static final Supplier<Item> NIHOXITE_NUGGET = registerSimpleItem(
            "nihoxite_nugget", new Item.Properties());
    public static final Supplier<Item> FERREBRIS_INGOT = registerSimpleItem(
            "ferrebris_ingot", new Item.Properties());
    public static final Supplier<Item> OBSCUPRUM_INGOT = registerSimpleItem(
            "obscuprum_ingot", new Item.Properties());
    public static final Supplier<Item> UMBURAM_INGOT = registerSimpleItem(
            "umburam_ingot", new Item.Properties());
    public static final Supplier<Item> INPERLUM_INGOT = registerSimpleItem(
            "inperlum_ingot", new Item.Properties());
    public static final Supplier<Item> NIHOXITE_INGOT = registerSimpleItem(
            "nihoxite_ingot", new Item.Properties());
    public static final Supplier<Item> NOBLEWOOD_STICK = registerSimpleItem(
            "noblewood_stick", new Item.Properties());
    public static final Supplier<Item> NIHOXITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register(
            "nihoxite_upgrade_smithing_template", () -> NoxernaSmithingTemplateItem.createNihoxiteUpgradeTemplate());

    // Tools, sorted by tier
    // Noblewood
    public static final Supplier<Item> NOBLEWOOD_SHOVEL = ITEMS.register(
            "noblewood_shovel", () -> new ShovelItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 1.5f, -3.2f))));
    public static final Supplier<Item> NOBLEWOOD_PICKAXE = ITEMS.register(
            "noblewood_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 1, -3.2f))));
    public static final Supplier<Item> NOBLEWOOD_AXE = ITEMS.register(
            "noblewood_axe", () -> new AxeItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 4.5f, -3.2f))));
    public static final Supplier<Item> NOBLEWOOD_HOE = ITEMS.register(
            "noblewood_hoe", () -> new HoeItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 1, -2.0f))));
    public static final Supplier<Item> NOBLEWOOD_SWORD = ITEMS.register(
            "noblewood_sword", () -> new SwordItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 2, -2.8f))));
    // Noxstone
    public static final Supplier<Item> NOXSTONE_AXE = ITEMS.register(
            "noxstone_axe", () -> new AxeItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 4.5f, -3.2f))));
    public static final Supplier<Item> NOXSTONE_HOE = ITEMS.register(
            "noxstone_hoe", () -> new HoeItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 1, -2.0f))));
    public static final Supplier<Item> NOXSTONE_PICKAXE = ITEMS.register(
            "noxstone_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 1, -3.2f))));
    public static final Supplier<Item> NOXSTONE_SHOVEL = ITEMS.register(
            "noxstone_shovel", () -> new ShovelItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 1.5f, -3.2f))));
    public static final Supplier<Item> NOXSTONE_SWORD = ITEMS.register(
            "noxstone_sword", () -> new SwordItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 3, -2.8f))));
    // Ferrebris
    public static final Supplier<Item> FERREBRIS_AXE = ITEMS.register(
            "ferrebris_axe", () -> new AxeItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 5.5f, -3.2f))));
    public static final Supplier<Item> FERREBRIS_HOE = ITEMS.register(
            "ferrebris_hoe", () -> new HoeItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 0, -2.0f))));
    public static final Supplier<Item> FERREBRIS_PICKAXE = ITEMS.register(
            "ferrebris_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 1, -3.2f))));
    public static final Supplier<Item> FERREBRIS_SHOVEL = ITEMS.register(
            "ferrebris_shovel", () -> new ShovelItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 1.5f, -3.2f))));
    public static final Supplier<Item> FERREBRIS_SWORD = ITEMS.register(
            "ferrebris_sword", () -> new SwordItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 3, -2.8f))));
    // Umburam
    public static final Supplier<Item> UMBURAM_AXE = ITEMS.register(
            "umburam_axe", () -> new AxeItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 4.5f, -3.2f))));
    public static final Supplier<Item> UMBURAM_HOE = ITEMS.register(
            "umburam_hoe", () -> new HoeItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 1, -2.0f))));
    public static final Supplier<Item> UMBURAM_PICKAXE = ITEMS.register(
            "umburam_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 1, -3.2f))));
    public static final Supplier<Item> UMBURAM_SHOVEL = ITEMS.register(
            "umburam_shovel", () -> new ShovelItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 1.5f, -3.2f))));
    public static final Supplier<Item> UMBURAM_SWORD = ITEMS.register(
            "umburam_sword", () -> new SwordItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 2, -2.8f))));
    // Adamuna
    public static final Supplier<Item> ADAMUNA_AXE = ITEMS.register(
            "adamuna_axe", () -> new AxeItem(NoxernaToolMaterials.ADAMUNA,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, 4.5f, -3.2f))));
    public static final Supplier<Item> ADAMUNA_HOE = ITEMS.register(
            "adamuna_hoe", () -> new HoeItem(NoxernaToolMaterials.ADAMUNA,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, -1, -2.0f))));
    public static final Supplier<Item> ADAMUNA_PICKAXE = ITEMS.register(
            "adamuna_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.ADAMUNA,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, 1, -3.2f))));
    public static final Supplier<Item> ADAMUNA_SHOVEL = ITEMS.register(
            "adamuna_shovel", () -> new ShovelItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, 1.5f, -3.2f))));
    public static final Supplier<Item> ADAMUNA_SWORD = ITEMS.register(
            "adamuna_sword", () -> new SwordItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, 3, -2.8f))));
    // Nihoxite
    public static final Supplier<Item> NIHOXITE_AXE = ITEMS.register(
            "nihoxite_axe", () -> new AxeItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, 4.5f, -3.2f))));
    public static final Supplier<Item> NIHOXITE_HOE = ITEMS.register(
            "nihoxite_hoe", () -> new HoeItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, -2, -2.0f))));
    public static final Supplier<Item> NIHOXITE_PICKAXE = ITEMS.register(
            "nihoxite_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, 1, -3.2f))));
    public static final Supplier<Item> NIHOXITE_SHOVEL = ITEMS.register(
            "nihoxite_shovel", () -> new ShovelItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, 1.5f, -3.2f))));
    public static final Supplier<Item> NIHOXITE_SWORD = ITEMS.register(
            "nihoxite_sword", () -> new SwordItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, 3, -2.8f))));

    // Block Items
    // Xenon Wood set
    public static final Supplier<Item> XENON_LOG = registerBlockItem(
            "xenon_log", NoxernaBlocks.XENON_LOG);
    public static final Supplier<Item> XENON_WOOD = registerBlockItem(
            "xenon_wood", NoxernaBlocks.XENON_WOOD);
    public static final Supplier<Item> STRIPPED_XENON_LOG = registerBlockItem(
            "stripped_xenon_log", NoxernaBlocks.STRIPPED_XENON_LOG);
    public static final Supplier<Item> STRIPPED_XENON_WOOD = registerBlockItem(
            "stripped_xenon_wood", NoxernaBlocks.STRIPPED_XENON_WOOD);
    public static final Supplier<Item> XENON_PLANKS = registerBlockItem(
            "xenon_planks", NoxernaBlocks.XENON_PLANKS);
    public static final Supplier<Item> XENON_STAIRS = registerBlockItem(
            "xenon_stairs", NoxernaBlocks.XENON_STAIRS);
    public static final Supplier<Item> XENON_SLAB = registerBlockItem(
            "xenon_slab", NoxernaBlocks.XENON_SLAB);
    public static final Supplier<Item> XENON_FENCE = registerBlockItem(
            "xenon_fence", NoxernaBlocks.XENON_FENCE);
    public static final Supplier<Item> XENON_FENCE_GATE = registerBlockItem(
            "xenon_fence_gate", NoxernaBlocks.XENON_FENCE_GATE);
    public static final Supplier<Item> XENON_DOOR = registerBlockItem(
            "xenon_door", NoxernaBlocks.XENON_DOOR);
    public static final Supplier<Item> XENON_TRAPDOOR = registerBlockItem(
            "xenon_trapdoor", NoxernaBlocks.XENON_TRAPDOOR);
    public static final Supplier<Item> XENON_PRESSURE_PLATE = registerBlockItem(
            "xenon_pressure_plate", NoxernaBlocks.XENON_PRESSURE_PLATE);
    public static final Supplier<Item> XENON_BUTTON = registerBlockItem(
            "xenon_button", NoxernaBlocks.XENON_BUTTON);
    // Krypton Wood set
    public static final Supplier<Item> KRYPTON_LOG = registerBlockItem(
            "krypton_log", NoxernaBlocks.KRYPTON_LOG);
    public static final Supplier<Item> KRYPTON_WOOD = registerBlockItem(
            "krypton_wood", NoxernaBlocks.KRYPTON_WOOD);
    public static final Supplier<Item> STRIPPED_KRYPTON_LOG = registerBlockItem(
            "stripped_krypton_log", NoxernaBlocks.STRIPPED_KRYPTON_LOG);
    public static final Supplier<Item> STRIPPED_KRYPTON_WOOD = registerBlockItem(
            "stripped_krypton_wood", NoxernaBlocks.STRIPPED_KRYPTON_WOOD);
    public static final Supplier<Item> KRYPTON_PLANKS = registerBlockItem(
            "krypton_planks", NoxernaBlocks.KRYPTON_PLANKS);
    public static final Supplier<Item> KRYPTON_STAIRS = registerBlockItem(
            "krypton_stairs", NoxernaBlocks.KRYPTON_STAIRS);
    public static final Supplier<Item> KRYPTON_SLAB = registerBlockItem(
            "krypton_slab", NoxernaBlocks.KRYPTON_SLAB);
    public static final Supplier<Item> KRYPTON_FENCE = registerBlockItem(
            "krypton_fence", NoxernaBlocks.KRYPTON_FENCE);
    public static final Supplier<Item> KRYPTON_FENCE_GATE = registerBlockItem(
            "krypton_fence_gate", NoxernaBlocks.KRYPTON_FENCE_GATE);
    public static final Supplier<Item> KRYPTON_DOOR = registerBlockItem(
            "krypton_door", NoxernaBlocks.KRYPTON_DOOR);
    public static final Supplier<Item> KRYPTON_TRAPDOOR = registerBlockItem(
            "krypton_trapdoor", NoxernaBlocks.KRYPTON_TRAPDOOR);
    public static final Supplier<Item> KRYPTON_PRESSURE_PLATE = registerBlockItem(
            "krypton_pressure_plate", NoxernaBlocks.KRYPTON_PRESSURE_PLATE);
    public static final Supplier<Item> KRYPTON_BUTTON = registerBlockItem(
            "krypton_button", NoxernaBlocks.KRYPTON_BUTTON);

    public static final Supplier<Item> NOXUM = registerBlockItem(
            "noxum", NoxernaBlocks.NOXUM);
    public static final Supplier<Item> NOXUM_BRICKS = registerBlockItem(
            "noxum_bricks", NoxernaBlocks.NOXUM_BRICKS);
    public static final Supplier<Item> POLISHED_NOXUM = registerBlockItem(
            "polished_noxum", NoxernaBlocks.POLISHED_NOXUM);
    public static final Supplier<Item> FERREBRIS_BLOCK = registerBlockItem(
            "ferrebris_block", NoxernaBlocks.FERREBRIS_BLOCK);
    public static final Supplier<Item> FERREBRIS_PLATING = registerBlockItem(
            "ferrebris_plating", NoxernaBlocks.FERREBRIS_PLATING);
    public static final Supplier<Item> FERREBRIS_PLATING_STAIRS = registerBlockItem(
            "ferrebris_plating_stairs", NoxernaBlocks.FERREBRIS_PLATING_STAIRS);
    public static final Supplier<Item> FERREBRIS_PLATING_SLAB = registerBlockItem(
            "ferrebris_plating_slab", NoxernaBlocks.FERREBRIS_PLATING_SLAB);
    public static final Supplier<Item> FERREBRIS_PLATING_WALL = registerBlockItem(
            "ferrebris_plating_wall", NoxernaBlocks.FERREBRIS_PLATING_WALL);
    public static final Supplier<Item> UMBURAM_BLOCK = registerBlockItem(
            "umburam_block", NoxernaBlocks.UMBURAM_BLOCK);
    public static final Supplier<Item> UMBURAM_PLATING = registerBlockItem(
            "umburam_plating", NoxernaBlocks.UMBURAM_PLATING);
    public static final Supplier<Item> TENERYL_BLOCK = registerBlockItem(
            "teneryl_block", NoxernaBlocks.TENERYL_BLOCK);
    public static final Supplier<Item> ADAMUNA_BLOCK = registerBlockItem(
            "adamuna_block", NoxernaBlocks.ADAMUNA_BLOCK);
    public static final Supplier<Item> INPERLUM_BLOCK = registerBlockItem(
            "inperlum_block", NoxernaBlocks.INPERLUM_BLOCK);
    public static final Supplier<Item> INPERLUM_PLATING = registerBlockItem(
            "inperlum_plating", NoxernaBlocks.INPERLUM_PLATING);
    public static final Supplier<Item> NIHOXITE_BLOCK = registerBlockItem(
            "nihoxite_block", NoxernaBlocks.NIHOXITE_BLOCK);
    public static final Supplier<Item> NIHOXITE_PLATING = registerBlockItem(
            "nihoxite_plating", NoxernaBlocks.NIHOXITE_PLATING);
    public static final Supplier<Item> VITRAGOR_BLOCK = registerBlockItem(
            "vitragor_block", NoxernaBlocks.VITRAGOR_BLOCK);
    public static final Supplier<Item> OBSCUPRUM_BLOCK = registerBlockItem(
            "obscuprum_block", NoxernaBlocks.OBSCUPRUM_BLOCK);
    public static final Supplier<Item> EXPOSED_OBSCUPRUM_BLOCK = registerBlockItem(
            "exposed_obscuprum_block", NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK);
    public static final Supplier<Item> WEATHERED_OBSCUPRUM_BLOCK = registerBlockItem(
            "weathered_obscuprum_block", NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK);
    public static final Supplier<Item> OXIDIZED_OBSCUPRUM_BLOCK = registerBlockItem(
            "oxidized_obscuprum_block", NoxernaBlocks.OXIDIZED_OBSCUPRUM_BLOCK);
    public static final Supplier<Item> CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "cut_obscuprum_block", NoxernaBlocks.CUT_OBSCUPRUM_BLOCK);
    public static final Supplier<Item> EXPOSED_CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "exposed_cut_obscuprum_block", NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK);
    public static final Supplier<Item> WEATHERED_CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "weathered_cut_obscuprum_block", NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK);
    public static final Supplier<Item> OXIDIZED_CUT_OBSCUPRUM_BLOCK = registerBlockItem(
            "oxidized_cut_obscuprum_block", NoxernaBlocks.OXIDIZED_CUT_OBSCUPRUM_BLOCK);
    public static final Supplier<Item> OBSCUPRUM_BRICKS = registerBlockItem(
            "obscuprum_bricks", NoxernaBlocks.OBSCUPRUM_BRICKS);
    public static final Supplier<Item> EXPOSED_OBSCUPRUM_BRICKS = registerBlockItem(
            "exposed_obscuprum_bricks", NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS);
    public static final Supplier<Item> WEATHERED_OBSCUPRUM_BRICKS = registerBlockItem(
            "weathered_obscuprum_bricks", NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS);
    public static final Supplier<Item> OXIDIZED_OBSCUPRUM_BRICKS = registerBlockItem(
            "oxidized_obscuprum_bricks", NoxernaBlocks.OXIDIZED_OBSCUPRUM_BRICKS);
    public static final Supplier<Item> OBSCUPRUM_PLATING = registerBlockItem(
            "obscuprum_plating", NoxernaBlocks.OBSCUPRUM_PLATING);
    public static final Supplier<Item> EXPOSED_OBSCUPRUM_PLATING = registerBlockItem(
            "exposed_obscuprum_plating", NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING);
    public static final Supplier<Item> WEATHERED_OBSCUPRUM_PLATING = registerBlockItem(
            "weathered_obscuprum_plating", NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING);
    public static final Supplier<Item> OXIDIZED_OBSCUPRUM_PLATING = registerBlockItem(
            "oxidized_obscuprum_plating", NoxernaBlocks.OXIDIZED_OBSCUPRUM_PLATING);
    public static final Supplier<Item> VOIDROCK = registerBlockItem(
            "voidrock", NoxernaBlocks.VOIDROCK);

    public static final Supplier<Item> NOXUM_STAIRS = registerBlockItem(
            "noxum_stairs", NoxernaBlocks.NOXUM_STAIRS);
    public static final Supplier<Item> NOXUM_BRICK_STAIRS = registerBlockItem(
            "noxum_brick_stairs", NoxernaBlocks.NOXUM_BRICK_STAIRS);
    public static final Supplier<Item> POLISHED_NOXUM_STAIRS = registerBlockItem(
            "polished_noxum_stairs", NoxernaBlocks.POLISHED_NOXUM_STAIRS);
    public static final Supplier<Item> NOXUM_SLAB = registerBlockItem(
            "noxum_slab", NoxernaBlocks.NOXUM_SLAB);
    public static final Supplier<Item> NOXUM_BRICK_SLAB = registerBlockItem(
            "noxum_brick_slab", NoxernaBlocks.NOXUM_BRICK_SLAB);
    public static final Supplier<Item> POLISHED_NOXUM_SLAB = registerBlockItem(
            "polished_noxum_slab", NoxernaBlocks.POLISHED_NOXUM_SLAB);

    public static final Supplier<Item> NOXUM_WALL = registerBlockItem(
            "noxum_wall", NoxernaBlocks.NOXUM_WALL);
    public static final Supplier<Item> NOXUM_BRICK_WALL = registerBlockItem(
            "noxum_brick_wall", NoxernaBlocks.NOXUM_BRICK_WALL);
    public static final Supplier<Item> POLISHED_NOXUM_WALL = registerBlockItem(
            "polished_noxum_wall", NoxernaBlocks.POLISHED_NOXUM_WALL);
    public static final Supplier<Item> NOXUM_PRESSURE_PLATE = registerBlockItem(
            "noxum_pressure_plate", NoxernaBlocks.NOXUM_PRESSURE_PLATE);
    public static final Supplier<Item> NOXUM_BUTTON = registerBlockItem(
            "noxum_button", NoxernaBlocks.NOXUM_BUTTON);
    public static final Supplier<Item> NOXUM_PEBBLE = registerBlockItem(
            "noxum_pebble", NoxernaBlocks.NOXUM_PEBBLE);
}
