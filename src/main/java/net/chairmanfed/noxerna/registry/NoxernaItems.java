package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
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

    // Tools, sorted by tier
    // Noblewood
    public static final Supplier<Item> NOBLEWOOD_AXE = ITEMS.register(
            "noblewood_axe", () -> new AxeItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(AxeItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 4.5f, -3.2f))));
    public static final Supplier<Item> NOBLEWOOD_HOE = ITEMS.register(
            "noblewood_hoe", () -> new HoeItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(HoeItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 1, -3.2f))));
    public static final Supplier<Item> NOBLEWOOD_PICKAXE = ITEMS.register(
            "noblewood_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                    NoxernaToolMaterials.NOBLEWOOD, 1, -3.2f))));
    public static final Supplier<Item> NOBLEWOOD_SHOVEL = ITEMS.register(
            "noblewood_shovel", () -> new ShovelItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(ShovelItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 1.5f, -3.2f))));
    public static final Supplier<Item> NOBLEWOOD_SWORD = ITEMS.register(
            "noblewood_sword", () -> new SwordItem(NoxernaToolMaterials.NOBLEWOOD,
                    new Item.Properties().attributes(SwordItem.createAttributes(
                            NoxernaToolMaterials.NOBLEWOOD, 2, -2.8f))));
    // Noxstone
    public static final Supplier<Item> NOXSTONE_PICKAXE = ITEMS.register(
            "noxstone_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.NOXSTONE,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.NOXSTONE, 1, -3.2f))));
    // Ferrebris
    public static final Supplier<Item> FERREBRIS_PICKAXE = ITEMS.register(
            "ferrebris_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.FERREBRIS,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.FERREBRIS, 1, -3.2f))));
    // Umburam
    public static final Supplier<Item> UMBURAM_PICKAXE = ITEMS.register(
            "umburam_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.UMBURAM,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.UMBURAM, 1, -3.2f))));
    // Adamuna
    public static final Supplier<Item> ADAMUNA_PICKAXE = ITEMS.register(
            "adamuna_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.ADAMUNA,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.ADAMUNA, 1, -3.2f))));
    // Nihoxite
    public static final Supplier<Item> NIHOXITE_PICKAXE = ITEMS.register(
            "nihoxite_pickaxe", () -> new PickaxeItem(NoxernaToolMaterials.NIHOXITE,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(
                            NoxernaToolMaterials.NIHOXITE, 1, -3.2f))));

    // Block Items
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

    public static final Supplier<Item> NOXUM = registerBlockItem(
            "noxum", NoxernaBlocks.NOXUM);
    public static final Supplier<Item> NOXUM_BRICKS = registerBlockItem(
            "noxum_bricks", NoxernaBlocks.NOXUM_BRICKS);
    public static final Supplier<Item> POLISHED_NOXUM = registerBlockItem(
            "polished_noxum", NoxernaBlocks.POLISHED_NOXUM);
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
