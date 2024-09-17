package net.chairmanfed.noxerna;

import com.mojang.logging.LogUtils;
import net.chairmanfed.noxerna.data.DataGenerators;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaCreativeModeTabs;
import net.chairmanfed.noxerna.registry.NoxernaItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

import java.util.Locale;

@Mod(TheNoxerna.MODID)
public class TheNoxerna
{
    public static final String MODID = "noxerna";
    public static ResourceLocation prefix(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name.toLowerCase(Locale.ROOT));
    }
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final GameRules.Key<GameRules.IntegerValue> RULE_MAX_QUAKE_MAGNITUDE =
            GameRules.register(
                    "maxQuakeMagnitude", GameRules.Category.UPDATES, GameRules.IntegerValue.create(10));

    public TheNoxerna(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);
        NoxernaBlocks.BLOCKS.register(modEventBus);
        NoxernaItems.ITEMS.register(modEventBus);
        NoxernaCreativeModeTabs.CREATIVE_TABS.register(modEventBus);
        modEventBus.addListener(this::buildContents);
        // modEventBus.addListener(DataGenerators::gatherData);
        NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    public void buildContents(BuildCreativeModeTabContentsEvent event) {
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
            event.accept(NoxernaItems.NOXSTONE_PICKAXE.get());
            event.accept(NoxernaItems.FERREBRIS_PICKAXE.get());
            event.accept(NoxernaItems.UMBURAM_PICKAXE.get());
            event.accept(NoxernaItems.ADAMUNA_PICKAXE.get());
            event.accept(NoxernaItems.NIHOXITE_PICKAXE.get());
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(NoxernaItems.NOBLEWOOD_SWORD.get());
            event.accept(NoxernaItems.NOBLEWOOD_AXE.get());
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
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
