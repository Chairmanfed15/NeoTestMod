package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class NoxernaBlockLootProvider extends BlockLootSubProvider {
    public NoxernaBlockLootProvider(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NoxernaBlocks.BLOCKS.getEntries().stream().map(e -> (Block) e.value()).toList();
    }
    protected void dropSlab(Block pSlabBlock){
        this.add(pSlabBlock, pDouble -> this.createSlabItemTable(pDouble));
    }
    @Override
    protected void generate() {
        dropSelf(NoxernaBlocks.NOXUM.get());
        dropSelf(NoxernaBlocks.NOXUM_BRICKS.get());
        dropSelf(NoxernaBlocks.POLISHED_NOXUM.get());
        dropSelf(NoxernaBlocks.NOXUM_STAIRS.get());
        dropSelf(NoxernaBlocks.NOXUM_BRICK_STAIRS.get());
        dropSelf(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get());
        dropSlab(NoxernaBlocks.NOXUM_SLAB.get());
        dropSlab(NoxernaBlocks.NOXUM_BRICK_SLAB.get());
        dropSlab(NoxernaBlocks.POLISHED_NOXUM_SLAB.get());
        dropSelf(NoxernaBlocks.NOXUM_WALL.get());
        dropSelf(NoxernaBlocks.NOXUM_BRICK_WALL.get());
        dropSelf(NoxernaBlocks.POLISHED_NOXUM_WALL.get());
        dropSelf(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.NOXUM_PEBBLE.get());
    }
}
