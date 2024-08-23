package net.chairmanfed.noxerna.item;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NoxernaCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(
            BuiltInRegistries.CREATIVE_MODE_TAB, TheNoxerna.MODID);

    public static final Supplier<CreativeModeTab> MOD_TAB = CREATIVE_TABS.register(
            "mod_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + TheNoxerna.MODID + ".mod_tab"))
                    .icon(()-> new ItemStack(NoxernaBlocks.NOXUM.get()))
                    .displayItems((params, output) -> {
                        output.accept(NoxernaBlocks.NOXUM.get());
                        output.accept(NoxernaBlocks.NOXUM_STAIRS.get());
                        output.accept(NoxernaBlocks.NOXUM_SLAB.get());
                        output.accept(NoxernaBlocks.NOXUM_WALL.get());
                        // output.accept(ModBlock.NOXUM_PRESSURE_PLATE.get());
                        // output.accept(ModBlock.NOXUM_BUTTON.get());

                        output.accept(NoxernaBlocks.POLISHED_NOXUM.get());
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_STAIRS);
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_SLAB.get());
                        output.accept(NoxernaBlocks.POLISHED_NOXUM_WALL.get());
                    }).build()
    );
}
