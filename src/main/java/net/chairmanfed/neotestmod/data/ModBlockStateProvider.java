package net.chairmanfed.neotestmod.data;

import net.chairmanfed.neotestmod.NeoTestMod;
import net.chairmanfed.neotestmod.block.ModBlock;
import net.minecraft.world.level.block.Block;
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
    }

    private void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
