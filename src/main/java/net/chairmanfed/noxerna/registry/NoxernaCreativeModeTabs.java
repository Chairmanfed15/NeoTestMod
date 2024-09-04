package net.chairmanfed.noxerna.registry;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NoxernaCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(
            BuiltInRegistries.CREATIVE_MODE_TAB, TheNoxerna.MODID);

    public static final Supplier<CreativeModeTab> BUILDING_BLOCKS = CREATIVE_TABS.register(
            "mod_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".building_blocks"))
                    .icon(()-> new ItemStack(NoxernaBlocks.NOXUM_BRICKS.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaBlocks.NOXUM);
                        output.accept(NoxernaBlocks.NOXUM_STAIRS);
                        output.accept(NoxernaBlocks.NOXUM_SLAB);
                        output.accept(NoxernaBlocks.NOXUM_WALL);
                        output.accept(NoxernaBlocks.NOXUM_PRESSURE_PLATE);
                        // output.accept(NoxernaBlocks.NOXUM_BUTTON);
                        output.accept(NoxernaBlocks.NOXUM_PEBBLE);
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
}
