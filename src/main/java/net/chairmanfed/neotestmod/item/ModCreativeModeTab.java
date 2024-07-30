package net.chairmanfed.neotestmod.item;

import net.chairmanfed.neotestmod.NeoTestMod;
import net.chairmanfed.neotestmod.block.ModBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(
            BuiltInRegistries.CREATIVE_MODE_TAB, NeoTestMod.MODID);

    public static final Supplier<CreativeModeTab> MOD_TAB = CREATIVE_TABS.register(
            "mod_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + NeoTestMod.MODID + ".mod_tab"))
                    .icon(()-> new ItemStack(ModBlock.NOXUM.get()))
                    .build()
    );
}
