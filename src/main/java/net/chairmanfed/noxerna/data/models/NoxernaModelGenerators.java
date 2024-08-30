package net.chairmanfed.noxerna.data.models;

import com.google.gson.JsonElement;
import net.chairmanfed.noxerna.block.PebbleBlock;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class NoxernaModelGenerators {
    private BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput;
    private Consumer<BlockStateGenerator> blockStateOutput;

    private static Variant[] createRotatedVariants(ResourceLocation modelLocation) {
        return new Variant[]{
                Variant.variant().with(VariantProperties.MODEL, modelLocation),
                Variant.variant().with(VariantProperties.MODEL, modelLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90),
                Variant.variant().with(VariantProperties.MODEL, modelLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180),
                Variant.variant().with(VariantProperties.MODEL, modelLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)
        };
    }

    public void createSimpleFlatItemModel(Item flatItem) {
        ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(flatItem), TextureMapping.layer0(flatItem), this.modelOutput);
    }

    private ResourceLocation createPebbleModel(int pebbles, DeferredBlock<Block> block, TextureMapping textureMapping) {
        switch (pebbles) {
            case 1:
                return NoxernaModels.PEBBLE
                        .create(ModelLocationUtils.decorateBlockModelLocation(block + "_pebble"), textureMapping, this.modelOutput);
            case 2:
                return NoxernaModels.TWO_PEBBLES
                        .create(ModelLocationUtils.decorateBlockModelLocation("two_" + block + "_pebbles"), textureMapping, this.modelOutput);
            case 3:
                return NoxernaModels.THREE_PEBBLES
                        .create(ModelLocationUtils.decorateBlockModelLocation("three_" + block + "_pebbles"), textureMapping, this.modelOutput);
            case 4:
                return NoxernaModels.FOUR_PEBBLES
                        .create(ModelLocationUtils.decorateBlockModelLocation("four_" + block + "_pebbles"), textureMapping, this.modelOutput);
            default:
                throw new UnsupportedOperationException();
        }
    }
    public void createPebble(DeferredBlock<Block> block) {
        this.createSimpleFlatItemModel(block.get().asItem());
        this.blockStateOutput
                .accept(MultiVariantGenerator.multiVariant(block.get()).with(
                                        PropertyDispatch.property(PebbleBlock.PEBBLES)
                                                .select(1, Arrays.asList(createRotatedVariants(ModelLocationUtils.decorateBlockModelLocation(NoxernaModels.PEBBLE.toString()))))
                                                .select(2, Arrays.asList(createRotatedVariants(ModelLocationUtils.decorateBlockModelLocation(NoxernaModels.TWO_PEBBLES.toString()))))
                                                .select(3, Arrays.asList(createRotatedVariants(ModelLocationUtils.decorateBlockModelLocation(NoxernaModels.THREE_PEBBLES.toString()))))
                                                .select(4, Arrays.asList(createRotatedVariants(ModelLocationUtils.decorateBlockModelLocation(NoxernaModels.THREE_PEBBLES.toString()))))
                                )
                );
    }
    public void runBlocks(DeferredBlock<Block> block) {
        this.createPebble(NoxernaBlocks.NOXUM_PEBBLE);
    }
}
