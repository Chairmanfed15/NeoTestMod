package net.chairmanfed.neotestmod.data;

import net.chairmanfed.neotestmod.NeoTestMod;
import net.chairmanfed.neotestmod.block.ModBlock;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NeoTestMod.MODID, existingFileHelper);
    }
    public static TagKey<Block> localTag(String tagName) {
        return BlockTags.create(NeoTestMod.prefix(tagName));
    }
    public static TagKey<Block> commonTag(String tagName) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", tagName));
    }
    public static final TagKey<Block> NOXUM_STONE_TYPE = localTag("stone_types/noxum");

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlock.NOXUM.get()).add(ModBlock.NOXUM_STAIRS.get()).add(ModBlock.NOXUM_SLAB.get()).add(ModBlock.NOXUM_WALL.get())
                .add(ModBlock.POLISHED_NOXUM.get()).add(ModBlock.POLISHED_NOXUM_STAIRS.get()).add(ModBlock.POLISHED_NOXUM_SLAB.get()).add(ModBlock.POLISHED_NOXUM_WALL.get());
        tag(BlockTags.STAIRS)
                .add(ModBlock.NOXUM_STAIRS.get()).add(ModBlock.POLISHED_NOXUM_STAIRS.get());
        tag(BlockTags.SLABS)
                .add(ModBlock.NOXUM_SLAB.get()).add(ModBlock.POLISHED_NOXUM_SLAB.get());
        tag(BlockTags.WALLS)
                .add(ModBlock.NOXUM_WALL.get()).add(ModBlock.POLISHED_NOXUM_WALL.get());
        /*
         This tag doesn't include slabs because the item tag doesn't.
        */
        tag(NOXUM_STONE_TYPE)
                .add(ModBlock.NOXUM.get()).add(ModBlock.NOXUM_STAIRS.get()).add(ModBlock.NOXUM_WALL.get())
                .add(ModBlock.POLISHED_NOXUM.get()).add(ModBlock.POLISHED_NOXUM_STAIRS.get()).add(ModBlock.POLISHED_NOXUM_WALL.get());
    }
}
