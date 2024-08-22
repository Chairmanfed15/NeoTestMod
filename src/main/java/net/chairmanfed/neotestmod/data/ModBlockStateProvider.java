package net.chairmanfed.neotestmod.data;

import net.chairmanfed.neotestmod.NeoTestMod;
import net.chairmanfed.neotestmod.block.ModBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NeoTestMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlock.NOXUM);
        blockWithItem(ModBlock.POLISHED_NOXUM);
        stairBlockWithItem(ModBlock.NOXUM_STAIRS, ModBlock.NOXUM);
        stairBlockWithItem(ModBlock.POLISHED_NOXUM_STAIRS, ModBlock.POLISHED_NOXUM);
        slabBlockWithItem(ModBlock.NOXUM_SLAB, ModBlock.NOXUM);
        slabBlockWithItem(ModBlock.POLISHED_NOXUM_SLAB, ModBlock.POLISHED_NOXUM);
        wallBlockWithItem(ModBlock.NOXUM_WALL, ModBlock.NOXUM);
        wallBlockWithItem(ModBlock.POLISHED_NOXUM_WALL, ModBlock.POLISHED_NOXUM);
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
}
