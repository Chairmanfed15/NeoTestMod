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
                        output.accept(NoxernaBlocks.XENON_LOG);
                        output.accept(NoxernaBlocks.XENON_WOOD);
                        output.accept(NoxernaBlocks.STRIPPED_XENON_LOG);
                        output.accept(NoxernaBlocks.STRIPPED_XENON_WOOD);
                        output.accept(NoxernaBlocks.XENON_PLANKS);
                        output.accept(NoxernaBlocks.XENON_STAIRS);
                        output.accept(NoxernaBlocks.NOXUM);
                        output.accept(NoxernaBlocks.NOXUM_STAIRS);
                        output.accept(NoxernaBlocks.NOXUM_SLAB);
                        output.accept(NoxernaBlocks.NOXUM_WALL);
                        output.accept(NoxernaBlocks.NOXUM_PRESSURE_PLATE);
                        output.accept(NoxernaBlocks.NOXUM_BUTTON);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_STAIRS);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_SLAB);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_WALL);
                        output.accept(NoxernaBlocks.NOXUM_BRICKS);
                        output.accept(NoxernaBlocks.NOXUM_BRICK_STAIRS);
                        output.accept(NoxernaBlocks.NOXUM_BRICK_SLAB);
                        output.accept(NoxernaBlocks.NOXUM_BRICK_WALL);
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
            event.accept(NoxernaBlocks.XENON_LOG.get());
            event.accept(NoxernaBlocks.XENON_WOOD.get());
            event.accept(NoxernaBlocks.STRIPPED_XENON_LOG.get());
            event.accept(NoxernaBlocks.STRIPPED_XENON_WOOD.get());
            event.accept(NoxernaBlocks.XENON_PLANKS.get());
            event.accept(NoxernaBlocks.XENON_STAIRS.get());
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
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(NoxernaBlocks.NOXUM.get());
            event.accept(NoxernaBlocks.NOXUM_PEBBLE.get());
            event.accept(NoxernaBlocks.XENON_LOG.get());
            event.accept(NoxernaBlocks.VOIDROCK.get());
        }
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get());
            event.accept(NoxernaBlocks.NOXUM_BUTTON.get());
        }
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
