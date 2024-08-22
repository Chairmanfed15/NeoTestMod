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
    public static Supplier<Item> registerBlockItem(String name, Supplier<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static final Supplier<Item> NOXUM = registerBlockItem("noxum", ModBlock.NOXUM);
    public static final Supplier<Item> POLISHED_NOXUM = registerBlockItem("polished_noxum", ModBlock.POLISHED_NOXUM);
    public static final Supplier<Item> NOXUM_STAIRS = registerBlockItem("noxum_stairs", ModBlock.NOXUM_STAIRS);
    public static final Supplier<Item> POLISHED_NOXUM_STAIRS = registerBlockItem("polished_noxum_stairs",
            ModBlock.POLISHED_NOXUM_STAIRS);
    public static final Supplier<Item> NOXUM_SLAB = registerBlockItem("noxum_slab", ModBlock.NOXUM_SLAB);
    public static final Supplier<Item> POLISHED_NOXUM_SLAB = registerBlockItem("polished_noxum_slab", ModBlock.POLISHED_NOXUM_SLAB);
    public static final Supplier<Item> NOXUM_WALL = registerBlockItem("noxum_wall", ModBlock.NOXUM_WALL);
    public static final Supplier<Item> POLISHED_NOXUM_WALL = registerBlockItem("polished_noxum_wall", ModBlock.POLISHED_NOXUM_WALL);
}
