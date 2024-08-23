package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class NoxernaItemTagProvider extends ItemTagsProvider {
    public NoxernaItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, TheNoxerna.MODID, existingFileHelper);
    }
    public static TagKey<Item> localTag(String tagName) {
        return ItemTags.create(TheNoxerna.prefix(tagName));
    }

    public static final TagKey<Item> NOXUM_STONE_TYPE = localTag("stone_types/noxum");

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.copy(NoxernaBlockTagProvider.NOXUM_STONE_TYPE, NOXUM_STONE_TYPE);
    }
}
