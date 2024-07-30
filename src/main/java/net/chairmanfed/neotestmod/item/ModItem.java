package net.chairmanfed.neotestmod.item;

import net.chairmanfed.neotestmod.NeoTestMod;
import net.chairmanfed.neotestmod.block.ModBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(NeoTestMod.MODID);
    public static final Supplier<Item> NOXUM = registerBlockItem("noxum", ModBlock.NOXUM);
    public static Supplier<Item> registerBlockItem(String name, Supplier<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
