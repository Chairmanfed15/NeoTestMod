package net.chairmanfed.noxerna.data;

import com.google.gson.JsonElement;
import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.block.NoxernaBlockStateProperties;
import net.chairmanfed.noxerna.block.PebbleBlock;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.MultiPartBlockStateBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class NoxernaBlockStateProvider extends BlockStateProvider {
    private BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput;
    private Consumer<BlockStateGenerator> blockStateOutput;
    public NoxernaBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheNoxerna.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(NoxernaBlocks.NOXUM);
        blockWithItem(NoxernaBlocks.NOXUM_BRICKS);
        blockWithItem(NoxernaBlocks.POLISHED_NOXUM);
        blockWithItem(NoxernaBlocks.VOIDROCK);
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
        pebbleBlock(NoxernaBlocks.NOXUM_PEBBLE, NoxernaBlocks.NOXUM);
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

    public void pebbleBlock(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        // This shit ugly as sin, like actual fucking yandev code kind of ugly,
        // but it works and that's all I care about rn.
        // I mean, this doesn't even matter to the performance of the mod (I think), because all it's for is
        // generating pebble models
        MultiPartBlockStateBuilder multipartBuilder = getMultipartBuilder(block.get());
        multipartBuilder.part()
                .modelFile(this.models()
                .withExistingParent(block.getId().getPath(), this.modLoc("block/pebble"))
                .texture("all", this.blockTexture(baseBlock.get())))
                .addModel()
                .condition(NoxernaBlockStateProperties.PEBBLE, 1)
                .condition(NoxernaBlockStateProperties.WATERLOGGED, false)
                .end();
        multipartBuilder.part()
                .modelFile(this.models()
                        .withExistingParent(block.getId().getPath(), this.modLoc("block/pebble"))
                        .texture("all", this.blockTexture(baseBlock.get())))
                .addModel()
                .condition(NoxernaBlockStateProperties.PEBBLE, 1)
                .condition(NoxernaBlockStateProperties.WATERLOGGED, true)
                .end();
        multipartBuilder.part()
                .modelFile(this.models()
                        .withExistingParent(
                                "two_" + block.getId().getPath() + "s",
                                this.modLoc("block/two_pebbles"))
                        .texture("all", this.blockTexture(baseBlock.get())))
                .addModel()
                .condition(NoxernaBlockStateProperties.PEBBLE, 2)
                .condition(NoxernaBlockStateProperties.WATERLOGGED, false)
                .end();
        multipartBuilder.part()
                .modelFile(this.models()
                        .withExistingParent(
                                "two_" + block.getId().getPath() + "s",
                                this.modLoc("block/two_pebbles"))
                        .texture("all", this.blockTexture(baseBlock.get())))
                .addModel()
                .condition(NoxernaBlockStateProperties.PEBBLE, 2)
                .condition(NoxernaBlockStateProperties.WATERLOGGED, true)
                .end();
        multipartBuilder.part()
                .modelFile(this.models()
                        .withExistingParent(
                                "three_" + block.getId().getPath() + "s",
                                this.modLoc("block/three_pebbles"))
                        .texture("all", this.blockTexture(baseBlock.get())))
                .addModel()
                .condition(NoxernaBlockStateProperties.PEBBLE, 3)
                .condition(NoxernaBlockStateProperties.WATERLOGGED, false)
                .end();
        multipartBuilder.part()
                .modelFile(this.models()
                        .withExistingParent(
                                "three_" + block.getId().getPath() + "s",
                                this.modLoc("block/three_pebbles"))
                        .texture("all", this.blockTexture(baseBlock.get())))
                .addModel()
                .condition(NoxernaBlockStateProperties.PEBBLE, 3)
                .condition(NoxernaBlockStateProperties.WATERLOGGED, true)
                .end();
        multipartBuilder.part()
                .modelFile(this.models()
                        .withExistingParent(
                                "four_" + block.getId().getPath() + "s",
                                this.modLoc("block/four_pebbles"))
                        .texture("all", this.blockTexture(baseBlock.get())))
                .addModel()
                .condition(NoxernaBlockStateProperties.PEBBLE, 4)
                .condition(NoxernaBlockStateProperties.WATERLOGGED, false)
                .end();
        multipartBuilder.part()
                .modelFile(this.models()
                        .withExistingParent(
                                "four_" + block.getId().getPath() + "s",
                                this.modLoc("block/four_pebbles"))
                        .texture("all", this.blockTexture(baseBlock.get())))
                .addModel()
                .condition(NoxernaBlockStateProperties.PEBBLE, 4)
                .condition(NoxernaBlockStateProperties.WATERLOGGED, true)
                .end();
        this.itemModels().buttonInventory(block.getId().toString(), this.blockTexture(baseBlock.get()));
    }

    public void createSimpleFlatItemModel(Item flatItem) {
        ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(flatItem), TextureMapping.layer0(flatItem), this.modelOutput);
    }
}
