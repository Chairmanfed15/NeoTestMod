package net.chairmanfed.noxerna.data.providers;

import net.chairmanfed.noxerna.block.PebbleBlock;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.List;
import java.util.Set;

public class NoxernaBlockLootProvider extends BlockLootSubProvider {
    public NoxernaBlockLootProvider(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NoxernaBlocks.BLOCKS.getEntries().stream().map(e -> (Block) e.value()).toList();
    }
    protected void dropSlab(Block slabBlock) {
        this.add(slabBlock, doubleSlab -> this.createSlabItemTable(doubleSlab));
    }
    protected LootTable.Builder createPebbleDrops(Block pebbleBlock) {
        return LootTable.lootTable()
                .withPool(
                        LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0f))
                                .add(this.applyExplosionDecay(pebbleBlock,
                                        LootItem.lootTableItem(pebbleBlock)
                                                .apply(List.of(2, 3, 4),
                                                        pebbleCount -> SetItemCountFunction.setCount(ConstantValue.exactly((float) pebbleCount.intValue()))
                                                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pebbleBlock)
                                                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                                .hasProperty(PebbleBlock.PEBBLES, pebbleCount.intValue()))))))
                );
    }

    protected void dropPebbles(Block pebbleBlock) {
        this.add(pebbleBlock, pebbleCount -> this.createPebbleDrops(pebbleCount));
    }

    @Override
    protected void generate() {
        dropSelf(NoxernaBlocks.XENON_LOG.get());
        dropSelf(NoxernaBlocks.XENON_WOOD.get());
        dropSelf(NoxernaBlocks.STRIPPED_XENON_LOG.get());
        dropSelf(NoxernaBlocks.STRIPPED_XENON_WOOD.get());
        dropSelf(NoxernaBlocks.XENON_PLANKS.get());
        dropSelf(NoxernaBlocks.XENON_STAIRS.get());
        // dropSelf(NoxernaBlocks.XENON_SLAB.get());
        // dropSelf(NoxernaBlocks.XENON_FENCE.get());
        // dropSelf(NoxernaBlocks.XENON_FENCE_GATE.get());
        // dropSelf(NoxernaBlocks.XENON_DOOR.get());
        // dropSelf(NoxernaBlocks.XENON_TRAPDOOR.get());
        // dropSelf(NoxernaBlocks.XENON_PRESSURE_PLATE.get());
        // dropSelf(NoxernaBlocks.XENON_BUTTON.get());

        dropSelf(NoxernaBlocks.NOXUM.get());
        dropSelf(NoxernaBlocks.NOXUM_STAIRS.get());
        dropSelf(NoxernaBlocks.NOXUM_BRICKS.get());
        dropSelf(NoxernaBlocks.POLISHED_NOXUM.get());
        noDrop(NoxernaBlocks.VOIDROCK.get());
        dropSelf(NoxernaBlocks.NOXUM_BRICK_STAIRS.get());
        dropSelf(NoxernaBlocks.POLISHED_NOXUM_STAIRS.get());
        dropSlab(NoxernaBlocks.NOXUM_SLAB.get());
        dropSlab(NoxernaBlocks.NOXUM_BRICK_SLAB.get());
        dropSlab(NoxernaBlocks.POLISHED_NOXUM_SLAB.get());
        dropSelf(NoxernaBlocks.NOXUM_WALL.get());
        dropSelf(NoxernaBlocks.NOXUM_BRICK_WALL.get());
        dropSelf(NoxernaBlocks.POLISHED_NOXUM_WALL.get());
        dropSelf(NoxernaBlocks.NOXUM_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.NOXUM_BUTTON.get());
        dropPebbles(NoxernaBlocks.NOXUM_PEBBLE.get());
    }

    private LootTable.Builder noDrop(Block block) {
        return LootTable.lootTable();
    }
}
