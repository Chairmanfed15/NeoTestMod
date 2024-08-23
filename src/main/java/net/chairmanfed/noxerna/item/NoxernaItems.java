package net.chairmanfed.noxerna.item;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NoxernaItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(TheNoxerna.MODID);
    public static Supplier<Item> registerBlockItem(String name, Supplier<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static final Supplier<Item> NOXUM = registerBlockItem("noxum", NoxernaBlocks.NOXUM);
    public static final Supplier<Item> POLISHED_NOXUM = registerBlockItem("polished_noxum", NoxernaBlocks.POLISHED_NOXUM);
    public static final Supplier<Item> NOXUM_STAIRS = registerBlockItem("noxum_stairs", NoxernaBlocks.NOXUM_STAIRS);
    public static final Supplier<Item> POLISHED_NOXUM_STAIRS = registerBlockItem("polished_noxum_stairs",
            NoxernaBlocks.POLISHED_NOXUM_STAIRS);
    public static final Supplier<Item> NOXUM_SLAB = registerBlockItem("noxum_slab", NoxernaBlocks.NOXUM_SLAB);
    public static final Supplier<Item> POLISHED_NOXUM_SLAB = registerBlockItem("polished_noxum_slab", NoxernaBlocks.POLISHED_NOXUM_SLAB);
    public static final Supplier<Item> NOXUM_WALL = registerBlockItem("noxum_wall", NoxernaBlocks.NOXUM_WALL);
    public static final Supplier<Item> POLISHED_NOXUM_WALL = registerBlockItem("polished_noxum_wall", NoxernaBlocks.POLISHED_NOXUM_WALL);
}
