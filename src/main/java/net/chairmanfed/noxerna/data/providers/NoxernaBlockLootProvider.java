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
        this.add(slabBlock, this::createSlabItemTable);
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

    protected void dropDoor(Block doorBlock) {
        this.add(doorBlock, this::createDoorTable);
    }

    protected void dropPebbles(Block pebbleBlock) {
        this.add(pebbleBlock, this::createPebbleDrops);
    }

    @Override
    protected void generate() {
        dropSelf(NoxernaBlocks.XENON_LOG.get());
        dropSelf(NoxernaBlocks.XENON_WOOD.get());
        dropSelf(NoxernaBlocks.STRIPPED_XENON_LOG.get());
        dropSelf(NoxernaBlocks.STRIPPED_XENON_WOOD.get());
        dropSelf(NoxernaBlocks.XENON_PLANKS.get());
        dropSelf(NoxernaBlocks.XENON_STAIRS.get());
        dropSlab(NoxernaBlocks.XENON_SLAB.get());
        dropSelf(NoxernaBlocks.XENON_FENCE.get());
        dropSelf(NoxernaBlocks.XENON_FENCE_GATE.get());
        dropDoor(NoxernaBlocks.XENON_DOOR.get());
        dropSelf(NoxernaBlocks.XENON_TRAPDOOR.get());
        dropSelf(NoxernaBlocks.XENON_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.XENON_BUTTON.get());

        dropSelf(NoxernaBlocks.KRYPTON_LOG.get());
        dropSelf(NoxernaBlocks.KRYPTON_WOOD.get());
        dropSelf(NoxernaBlocks.STRIPPED_KRYPTON_LOG.get());
        dropSelf(NoxernaBlocks.STRIPPED_KRYPTON_WOOD.get());
        dropSelf(NoxernaBlocks.KRYPTON_PLANKS.get());
        dropSelf(NoxernaBlocks.KRYPTON_STAIRS.get());
        dropSlab(NoxernaBlocks.KRYPTON_SLAB.get());
        dropSelf(NoxernaBlocks.KRYPTON_FENCE.get());
        dropSelf(NoxernaBlocks.KRYPTON_FENCE_GATE.get());
        dropDoor(NoxernaBlocks.KRYPTON_DOOR.get());
        dropSelf(NoxernaBlocks.KRYPTON_TRAPDOOR.get());
        dropSelf(NoxernaBlocks.KRYPTON_PRESSURE_PLATE.get());
        dropSelf(NoxernaBlocks.KRYPTON_BUTTON.get());

        dropSelf(NoxernaBlocks.NOXUM.get());
        dropSelf(NoxernaBlocks.NOXUM_STAIRS.get());
        dropSelf(NoxernaBlocks.NOXUM_BRICKS.get());
        dropSelf(NoxernaBlocks.POLISHED_NOXUM.get());

        dropSelf(NoxernaBlocks.FERREBRIS_BLOCK.get());
        dropSelf(NoxernaBlocks.FERREBRIS_PLATING.get());
        dropSelf(NoxernaBlocks.FERREBRIS_PLATING_STAIRS.get());
        dropSlab(NoxernaBlocks.FERREBRIS_PLATING_SLAB.get());
        dropSelf(NoxernaBlocks.FERREBRIS_PLATING_WALL.get());
        dropSelf(NoxernaBlocks.UMBURAM_BLOCK.get());
        dropSelf(NoxernaBlocks.UMBURAM_PLATING.get());
        dropSelf(NoxernaBlocks.TENERYL_BLOCK.get());
        dropSelf(NoxernaBlocks.ADAMUNA_BLOCK.get());
        dropSelf(NoxernaBlocks.INPERLUM_BLOCK.get());
        dropSelf(NoxernaBlocks.INPERLUM_PLATING.get());
        dropSelf(NoxernaBlocks.NIHOXITE_BLOCK.get());
        dropSelf(NoxernaBlocks.NIHOXITE_PLATING.get());
        dropSelf(NoxernaBlocks.VITRAGOR_BLOCK.get());
        dropSelf(NoxernaBlocks.OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.EXPOSED_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.WEATHERED_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.OXIDIZED_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.CUT_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.EXPOSED_CUT_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.WEATHERED_CUT_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.OXIDIZED_CUT_OBSCUPRUM_BLOCK.get());
        dropSelf(NoxernaBlocks.OBSCUPRUM_BRICKS.get());
        dropSelf(NoxernaBlocks.EXPOSED_OBSCUPRUM_BRICKS.get());
        dropSelf(NoxernaBlocks.WEATHERED_OBSCUPRUM_BRICKS.get());
        dropSelf(NoxernaBlocks.OXIDIZED_OBSCUPRUM_BRICKS.get());
        dropSelf(NoxernaBlocks.OBSCUPRUM_PLATING.get());
        dropSelf(NoxernaBlocks.EXPOSED_OBSCUPRUM_PLATING.get());
        dropSelf(NoxernaBlocks.WEATHERED_OBSCUPRUM_PLATING.get());
        dropSelf(NoxernaBlocks.OXIDIZED_OBSCUPRUM_PLATING.get());
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
