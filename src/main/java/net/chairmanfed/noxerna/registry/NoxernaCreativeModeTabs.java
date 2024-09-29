package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NoxernaCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(
            BuiltInRegistries.CREATIVE_MODE_TAB, TheNoxerna.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_BUILDING_BLOCKS = CREATIVE_TABS.register(
            "noxerna_building_blocks", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".building_blocks"))
                    .icon(()-> new ItemStack(NoxernaBlocks.NOXUM_BRICKS.get()))
                    .displayItems((params, output) -> {
                        // Wood Sets
                        // Xenon
                        output.accept(NoxernaBlocks.XENON_LOG);
                        output.accept(NoxernaBlocks.XENON_WOOD);
                        output.accept(NoxernaBlocks.STRIPPED_XENON_LOG);
                        output.accept(NoxernaBlocks.STRIPPED_XENON_WOOD);
                        output.accept(NoxernaBlocks.XENON_PLANKS);
                        output.accept(NoxernaBlocks.XENON_STAIRS);
                        output.accept(NoxernaBlocks.XENON_SLAB);
                        output.accept(NoxernaBlocks.XENON_FENCE);
                        output.accept(NoxernaBlocks.XENON_FENCE_GATE);
                        output.accept(NoxernaBlocks.XENON_DOOR);
                        output.accept(NoxernaBlocks.XENON_TRAPDOOR);
                        output.accept(NoxernaBlocks.XENON_PRESSURE_PLATE);
                        output.accept(NoxernaBlocks.XENON_BUTTON);
                        // Krypton
                        output.accept(NoxernaBlocks.KRYPTON_LOG);
                        output.accept(NoxernaBlocks.KRYPTON_WOOD);
                        output.accept(NoxernaBlocks.STRIPPED_KRYPTON_LOG);
                        output.accept(NoxernaBlocks.STRIPPED_KRYPTON_WOOD);
                        output.accept(NoxernaBlocks.KRYPTON_PLANKS);
                        // Stone Sets
                        // Noxum
                        output.accept(NoxernaBlocks.NOXUM);
                        output.accept(NoxernaBlocks.NOXUM_STAIRS);
                        output.accept(NoxernaBlocks.NOXUM_SLAB);
                        output.accept(NoxernaBlocks.NOXUM_WALL);
                        output.accept(NoxernaBlocks.NOXUM_PRESSURE_PLATE);
                        output.accept(NoxernaBlocks.NOXUM_BUTTON);
                            // Polished
                        output.accept(NoxernaBlocks.POLISHED_NOXUM);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_STAIRS);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_SLAB);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_WALL);
                            // Bricks
                        output.accept(NoxernaBlocks.NOXUM_BRICKS);
                        output.accept(NoxernaBlocks.NOXUM_BRICK_STAIRS);
                        output.accept(NoxernaBlocks.NOXUM_BRICK_SLAB);
                        output.accept(NoxernaBlocks.NOXUM_BRICK_WALL);
                        // Material Storage & Decoration Blocks
                        // Ferrebris
                        output.accept(NoxernaBlocks.FERREBRIS_BLOCK);
                        output.accept(NoxernaBlocks.FERREBRIS_PLATING);
                        output.accept(NoxernaBlocks.FERREBRIS_PLATING_STAIRS);
                        output.accept(NoxernaBlocks.FERREBRIS_PLATING_SLAB);
                        output.accept(NoxernaBlocks.FERREBRIS_PLATING_WALL);
                        // Umburam
                        output.accept(NoxernaBlocks.UMBURAM_BLOCK);
                        output.accept(NoxernaBlocks.UMBURAM_PLATING);
                        // Teneryl
                        output.accept(NoxernaBlocks.TENERYL_BLOCK);
                        // Adamuna
                        output.accept(NoxernaBlocks.ADAMUNA_BLOCK);
                        // Inperlum
                        output.accept(NoxernaBlocks.INPERLUM_BLOCK);
                        output.accept(NoxernaBlocks.INPERLUM_PLATING);
                        // Nihoxite
                        output.accept(NoxernaBlocks.NIHOXITE_BLOCK);
                        output.accept(NoxernaBlocks.NIHOXITE_PLATING);
                        // Vitragor
                        output.accept(NoxernaBlocks.VITRAGOR_BLOCK);
                        // Obscuprum
                            // Unaffected
                        output.accept(NoxernaBlocks.OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.OBSCUPRUM_BRICKS);
                        output.accept(NoxernaBlocks.OBSCUPRUM_PLATING);
                            // Exposed
                        output.accept(NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS);
                        output.accept(NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING);
                            // Weathered
                        output.accept(NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS);
                        output.accept(NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING);
                            // Oxidized
                        output.accept(NoxernaBlocks.OXIDIZED_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.OXIDIZED_CUT_OBSCUPRUM_BLOCK);
                        output.accept(NoxernaBlocks.OXIDIZED_OBSCUPRUM_BRICKS);
                        output.accept(NoxernaBlocks.OXIDIZED_OBSCUPRUM_PLATING);
                        // Waxed Obscuprum
                            // Unaffected
                            // Exposed
                            // Weathered
                            // Oxidized
                    }).build()
    );
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_NATURAL_BLOCKS = CREATIVE_TABS.register(
            "noxerna_natural_blocks", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".natural_blocks"))
                    .icon(()-> new ItemStack(NoxernaBlocks.NOXUM.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaBlocks.NOXUM);
                        output.accept(NoxernaBlocks.NOXUM_PEBBLE);
                        output.accept(NoxernaBlocks.XENON_LOG);
                        output.accept(NoxernaBlocks.VOIDROCK);
                    })
                    .withTabsBefore(NOXERNA_BUILDING_BLOCKS.getKey()).build()
    );
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_TOOLS_AND_UTILITIES = CREATIVE_TABS.register(
            "noxerna_tools_and_utilities", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".tools_and_utilities"))
                    .icon(()-> new ItemStack(NoxernaItems.ADAMUNA_PICKAXE.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaItems.NOBLEWOOD_SHOVEL.get());
                        output.accept(NoxernaItems.NOBLEWOOD_PICKAXE.get());
                        output.accept(NoxernaItems.NOBLEWOOD_AXE.get());
                        output.accept(NoxernaItems.NOBLEWOOD_HOE.get());
                        output.accept(NoxernaItems.NOXSTONE_SHOVEL.get());
                        output.accept(NoxernaItems.NOXSTONE_PICKAXE.get());
                        output.accept(NoxernaItems.NOXSTONE_AXE.get());
                        output.accept(NoxernaItems.NOXSTONE_HOE.get());
                        output.accept(NoxernaItems.FERREBRIS_SHOVEL.get());
                        output.accept(NoxernaItems.FERREBRIS_PICKAXE.get());
                        output.accept(NoxernaItems.FERREBRIS_AXE.get());
                        output.accept(NoxernaItems.FERREBRIS_HOE.get());
                        output.accept(NoxernaItems.UMBURAM_SHOVEL.get());
                        output.accept(NoxernaItems.UMBURAM_PICKAXE.get());
                        output.accept(NoxernaItems.UMBURAM_AXE.get());
                        output.accept(NoxernaItems.UMBURAM_HOE.get());
                        output.accept(NoxernaItems.ADAMUNA_SHOVEL.get());
                        output.accept(NoxernaItems.ADAMUNA_PICKAXE.get());
                        output.accept(NoxernaItems.ADAMUNA_AXE.get());
                        output.accept(NoxernaItems.ADAMUNA_HOE.get());
                        output.accept(NoxernaItems.NIHOXITE_SHOVEL.get());
                        output.accept(NoxernaItems.NIHOXITE_PICKAXE.get());
                        output.accept(NoxernaItems.NIHOXITE_AXE.get());
                        output.accept(NoxernaItems.NIHOXITE_HOE.get());
                    })
                    .withTabsBefore(NOXERNA_NATURAL_BLOCKS.getKey()).build()
    );
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_COMBAT = CREATIVE_TABS.register(
            "noxerna_combat", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".combat"))
                    .icon(()-> new ItemStack(NoxernaItems.NOXSTONE_SWORD.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaItems.NOBLEWOOD_SWORD.get());
                        output.accept(NoxernaItems.NOBLEWOOD_AXE.get());
                        output.accept(NoxernaItems.NOXSTONE_SWORD.get());
                        output.accept(NoxernaItems.NOXSTONE_AXE.get());
                        output.accept(NoxernaItems.FERREBRIS_SWORD.get());
                        output.accept(NoxernaItems.FERREBRIS_AXE.get());
                        output.accept(NoxernaItems.UMBURAM_SWORD.get());
                        output.accept(NoxernaItems.UMBURAM_AXE.get());
                        output.accept(NoxernaItems.ADAMUNA_SWORD.get());
                        output.accept(NoxernaItems.ADAMUNA_AXE.get());
                        output.accept(NoxernaItems.NIHOXITE_SWORD.get());
                        output.accept(NoxernaItems.NIHOXITE_AXE.get());
                    })
                    .withTabsBefore(NOXERNA_TOOLS_AND_UTILITIES.getKey()).build()
    );
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab>
            NOXERNA_INGREDIENTS = CREATIVE_TABS.register(
            "noxerna_ingredients", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".ingredients"))
                    .icon(()-> new ItemStack(NoxernaItems.FERREBRIS_INGOT.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaItems.RAW_FERREBRIS.get());
                        output.accept(NoxernaItems.RAW_OBSCUPRUM.get());
                        output.accept(NoxernaItems.RAW_UMBURAM.get());
                        output.accept(NoxernaItems.RAW_INPERLUM.get());
                        output.accept(NoxernaItems.TENERYL.get());
                        output.accept(NoxernaItems.ADAMUNA.get());
                        output.accept(NoxernaItems.VITRAGOR.get());
                        output.accept(NoxernaItems.FERREBRIS_NUGGET.get());
                        output.accept(NoxernaItems.OBSCUPRUM_NUGGET.get());
                        output.accept(NoxernaItems.UMBURAM_NUGGET.get());
                        output.accept(NoxernaItems.INPERLUM_NUGGET.get());
                        output.accept(NoxernaItems.NIHOXITE_NUGGET.get());
                        output.accept(NoxernaItems.FERREBRIS_INGOT.get());
                        output.accept(NoxernaItems.OBSCUPRUM_INGOT.get());
                        output.accept(NoxernaItems.UMBURAM_INGOT.get());
                        output.accept(NoxernaItems.INPERLUM_INGOT.get());
                        output.accept(NoxernaItems.NIHOXITE_INGOT.get());
                        output.accept(NoxernaItems.NOBLEWOOD_STICK.get());
                        output.accept(NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE.get());
                    })
                    .withTabsBefore(NOXERNA_COMBAT.getKey()).build()
    );

    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            // Wood Sets
            // Xenon
            event.accept(NoxernaBlocks.XENON_LOG.get());
            event.accept(NoxernaBlocks.XENON_WOOD.get());
            event.accept(NoxernaBlocks.STRIPPED_XENON_LOG.get());
            event.accept(NoxernaBlocks.STRIPPED_XENON_WOOD.get());
            event.accept(NoxernaBlocks.XENON_PLANKS.get());
            event.accept(NoxernaBlocks.XENON_STAIRS.get());
            event.accept(NoxernaBlocks.XENON_SLAB.get());
            event.accept(NoxernaBlocks.XENON_FENCE.get());
            event.accept(NoxernaBlocks.XENON_FENCE_GATE.get());
            event.accept(NoxernaBlocks.XENON_DOOR.get());
            event.accept(NoxernaBlocks.XENON_TRAPDOOR.get());
            event.accept(NoxernaBlocks.XENON_PRESSURE_PLATE.get());
            event.accept(NoxernaBlocks.XENON_BUTTON.get());
            // Krypton
            event.accept(NoxernaBlocks.KRYPTON_LOG.get());
            event.accept(NoxernaBlocks.KRYPTON_WOOD.get());
            event.accept(NoxernaBlocks.STRIPPED_KRYPTON_LOG.get());
            event.accept(NoxernaBlocks.STRIPPED_KRYPTON_WOOD.get());
            event.accept(NoxernaBlocks.KRYPTON_PLANKS.get());
            event.accept(NoxernaBlocks.KRYPTON_STAIRS.get());
            event.accept(NoxernaBlocks.KRYPTON_SLAB.get());
            event.accept(NoxernaBlocks.KRYPTON_FENCE.get());
            event.accept(NoxernaBlocks.KRYPTON_FENCE_GATE.get());
            event.accept(NoxernaBlocks.KRYPTON_DOOR.get());
            event.accept(NoxernaBlocks.KRYPTON_TRAPDOOR.get());
            event.accept(NoxernaBlocks.KRYPTON_PRESSURE_PLATE.get());
            event.accept(NoxernaBlocks.KRYPTON_BUTTON.get());
            // Stone Sets
            // Noxum
            event.accept(NoxernaBlocks.NOXUM.get());
            event.accept(NoxernaBlocks.NOXUM_STAIRS.get());
            event.accept(NoxernaBlocks.NOXUM_SLAB.get());
            event.accept(NoxernaBlocks.NOXUM_WALL.get());
            event.accept(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get());
            event.accept(NoxernaBlocks.NOXUM_BUTTON.get());
            event.accept(NoxernaBlocks.POLISHED_NOXUM.get());
            event.accept(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get());
            event.accept(NoxernaBlocks.POLISHED_NOXUM_SLAB.get());
            event.accept(NoxernaBlocks.POLISHED_NOXUM_WALL.get());
            event.accept(NoxernaBlocks.NOXUM_BRICKS.get());
            event.accept(NoxernaBlocks.NOXUM_BRICK_STAIRS.get());
            event.accept(NoxernaBlocks.NOXUM_BRICK_SLAB.get());
            event.accept(NoxernaBlocks.NOXUM_BRICK_WALL.get());
            event.accept(NoxernaBlocks.FERREBRIS_BLOCK.get());
            event.accept(NoxernaBlocks.FERREBRIS_PLATING.get());
            event.accept(NoxernaBlocks.FERREBRIS_PLATING_STAIRS.get());
            event.accept(NoxernaBlocks.FERREBRIS_PLATING_SLAB.get());
            event.accept(NoxernaBlocks.FERREBRIS_PLATING_WALL.get());
            event.accept(NoxernaBlocks.UMBURAM_BLOCK.get());
            event.accept(NoxernaBlocks.UMBURAM_PLATING.get());
            event.accept(NoxernaBlocks.ADAMUNA_BLOCK.get());
            event.accept(NoxernaBlocks.INPERLUM_BLOCK.get());
            event.accept(NoxernaBlocks.INPERLUM_PLATING.get());
            event.accept(NoxernaBlocks.NIHOXITE_BLOCK.get());
            event.accept(NoxernaBlocks.NIHOXITE_PLATING.get());
            event.accept(NoxernaBlocks.OBSCUPRUM_BLOCK.get());
            event.accept(NoxernaBlocks.CUT_OBSCUPRUM_BLOCK.get());
            event.accept(NoxernaBlocks.OBSCUPRUM_BRICKS.get());
            event.accept(NoxernaBlocks.OBSCUPRUM_PLATING.get());
            event.accept(NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK.get());
            event.accept(NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK.get());
            event.accept(NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS.get());
            event.accept(NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING.get());
            event.accept(NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK.get());
            event.accept(NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK.get());
            event.accept(NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS.get());
            event.accept(NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING.get());
            event.accept(NoxernaBlocks.OXIDIZED_OBSCUPRUM_BLOCK.get());
            event.accept(NoxernaBlocks.OXIDIZED_CUT_OBSCUPRUM_BLOCK.get());
            event.accept(NoxernaBlocks.OXIDIZED_OBSCUPRUM_BRICKS.get());
            event.accept(NoxernaBlocks.OXIDIZED_OBSCUPRUM_PLATING.get());
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(NoxernaBlocks.NOXUM.get());
            event.accept(NoxernaBlocks.NOXUM_PEBBLE.get());
            event.accept(NoxernaBlocks.XENON_LOG.get());
            event.accept(NoxernaBlocks.VOIDROCK.get());
        }
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {}
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(NoxernaItems.NOBLEWOOD_SHOVEL.get());
            event.accept(NoxernaItems.NOBLEWOOD_PICKAXE.get());
            event.accept(NoxernaItems.NOBLEWOOD_AXE.get());
            event.accept(NoxernaItems.NOBLEWOOD_HOE.get());
            event.accept(NoxernaItems.NOXSTONE_SHOVEL.get());
            event.accept(NoxernaItems.NOXSTONE_PICKAXE.get());
            event.accept(NoxernaItems.NOXSTONE_AXE.get());
            event.accept(NoxernaItems.NOXSTONE_HOE.get());
            event.accept(NoxernaItems.FERREBRIS_SHOVEL.get());
            event.accept(NoxernaItems.FERREBRIS_PICKAXE.get());
            event.accept(NoxernaItems.FERREBRIS_AXE.get());
            event.accept(NoxernaItems.FERREBRIS_HOE.get());
            event.accept(NoxernaItems.UMBURAM_SHOVEL.get());
            event.accept(NoxernaItems.UMBURAM_PICKAXE.get());
            event.accept(NoxernaItems.UMBURAM_AXE.get());
            event.accept(NoxernaItems.UMBURAM_HOE.get());
            event.accept(NoxernaItems.ADAMUNA_SHOVEL.get());
            event.accept(NoxernaItems.ADAMUNA_PICKAXE.get());
            event.accept(NoxernaItems.ADAMUNA_AXE.get());
            event.accept(NoxernaItems.ADAMUNA_HOE.get());
            event.accept(NoxernaItems.NIHOXITE_SHOVEL.get());
            event.accept(NoxernaItems.NIHOXITE_PICKAXE.get());
            event.accept(NoxernaItems.NIHOXITE_AXE.get());
            event.accept(NoxernaItems.NIHOXITE_HOE.get());
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(NoxernaItems.NOBLEWOOD_SWORD.get());
            event.accept(NoxernaItems.NOBLEWOOD_AXE.get());
            event.accept(NoxernaItems.NOXSTONE_SWORD.get());
            event.accept(NoxernaItems.NOXSTONE_AXE.get());
            event.accept(NoxernaItems.FERREBRIS_SWORD.get());
            event.accept(NoxernaItems.FERREBRIS_AXE.get());
            event.accept(NoxernaItems.UMBURAM_SWORD.get());
            event.accept(NoxernaItems.UMBURAM_AXE.get());
            event.accept(NoxernaItems.ADAMUNA_SWORD.get());
            event.accept(NoxernaItems.ADAMUNA_AXE.get());
            event.accept(NoxernaItems.NIHOXITE_SWORD.get());
            event.accept(NoxernaItems.NIHOXITE_AXE.get());
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(NoxernaItems.RAW_FERREBRIS.get());
            event.accept(NoxernaItems.RAW_OBSCUPRUM.get());
            event.accept(NoxernaItems.RAW_UMBURAM.get());
            event.accept(NoxernaItems.RAW_INPERLUM.get());
            event.accept(NoxernaItems.TENERYL.get());
            event.accept(NoxernaItems.ADAMUNA.get());
            event.accept(NoxernaItems.VITRAGOR.get());
            event.accept(NoxernaItems.FERREBRIS_NUGGET.get());
            event.accept(NoxernaItems.OBSCUPRUM_NUGGET.get());
            event.accept(NoxernaItems.UMBURAM_NUGGET.get());
            event.accept(NoxernaItems.INPERLUM_NUGGET.get());
            event.accept(NoxernaItems.NIHOXITE_NUGGET.get());
            event.accept(NoxernaItems.FERREBRIS_INGOT.get());
            event.accept(NoxernaItems.OBSCUPRUM_INGOT.get());
            event.accept(NoxernaItems.UMBURAM_INGOT.get());
            event.accept(NoxernaItems.INPERLUM_INGOT.get());
            event.accept(NoxernaItems.NIHOXITE_INGOT.get());
            event.accept(NoxernaItems.NOBLEWOOD_STICK.get());
            event.accept(NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE.get());
        }
    }
}
