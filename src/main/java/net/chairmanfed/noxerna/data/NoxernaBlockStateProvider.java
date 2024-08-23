package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.registries.DeferredBlock;

public class NoxernaBlockStateProvider extends BlockStateProvider {
    public NoxernaBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheNoxerna.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(NoxernaBlocks.NOXUM);
        blockWithItem(NoxernaBlocks.NOXUM_BRICKS);
        blockWithItem(NoxernaBlocks.POLISHED_NOXUM);
        stairBlockWithItem(NoxernaBlocks.NOXUM_STAIRS, NoxernaBlocks.NOXUM);
        stairBlockWithItem(NoxernaBlocks.NOXUM_BRICK_STAIRS, NoxernaBlocks.NOXUM_BRICKS);
        stairBlockWithItem(NoxernaBlocks.POLISHED_NOXUM_STAIRS, NoxernaBlocks.POLISHED_NOXUM);
        slabBlockWithItem(NoxernaBlocks.NOXUM_SLAB, NoxernaBlocks.NOXUM);
        slabBlockWithItem(NoxernaBlocks.NOXUM_BRICK_SLAB, NoxernaBlocks.NOXUM_BRICKS);
        slabBlockWithItem(NoxernaBlocks.POLISHED_NOXUM_SLAB, NoxernaBlocks.POLISHED_NOXUM);
        wallBlockWithItem(NoxernaBlocks.NOXUM_WALL, NoxernaBlocks.NOXUM);
        wallBlockWithItem(NoxernaBlocks.NOXUM_BRICK_WALL, NoxernaBlocks.NOXUM_BRICKS);
        wallBlockWithItem(NoxernaBlocks.POLISHED_NOXUM_WALL, NoxernaBlocks.POLISHED_NOXUM);
        pressurePlateWithItem(NoxernaBlocks.NOXUM_PRESSURE_PLATE, NoxernaBlocks.NOXUM);
    }

    private void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    public void simpleBlockItem(DeferredBlock<Block> block) {
        this.itemModels().withExistingParent(block.getId().toString(), this.modLoc("block/" + block.getId().getPath()));
    }
    public void stairBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.stairsBlock((StairBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.simpleBlockItem(block);
    }
    public void slabBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.slabBlock((SlabBlock) block.get(), this.blockTexture(baseBlock.get()), this.blockTexture(baseBlock.get()));
        this.simpleBlockItem(block);
    }
    public void wallBlockWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.wallBlock((WallBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().wallInventory(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
    public void pressurePlateWithItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.pressurePlateBlock((PressurePlateBlock) block.get(), this.blockTexture(baseBlock.get()));
        this.itemModels().pressurePlate(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }
}
