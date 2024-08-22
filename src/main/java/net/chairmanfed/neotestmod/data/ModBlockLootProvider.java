package net.chairmanfed.neotestmod.data;

import net.chairmanfed.neotestmod.block.ModBlock;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;

import java.util.Set;

public class ModBlockLootProvider extends BlockLootSubProvider {
    public ModBlockLootProvider(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlock.BLOCKS.getEntries().stream().map(e -> (Block) e.value()).toList();
    }
    protected void dropSlab(Block pSlabBlock){
        this.add(pSlabBlock, pDouble -> this.createSlabItemTable(pDouble));
    }
    @Override
    protected void generate() {
        dropSelf(ModBlock.NOXUM.get());
        dropSelf(ModBlock.POLISHED_NOXUM.get());
        dropSelf(ModBlock.NOXUM_STAIRS.get());
        dropSelf(ModBlock.POLISHED_NOXUM_STAIRS.get());
        dropSlab(ModBlock.NOXUM_SLAB.get());
        dropSlab(ModBlock.POLISHED_NOXUM_SLAB.get());
        dropSelf(ModBlock.NOXUM_WALL.get());
        dropSelf(ModBlock.POLISHED_NOXUM_WALL.get());
    }
}
