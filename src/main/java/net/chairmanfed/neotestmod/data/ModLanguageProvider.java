package net.chairmanfed.neotestmod.data;

import net.chairmanfed.neotestmod.NeoTestMod;
import net.chairmanfed.neotestmod.block.ModBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NeoTestMod.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + NeoTestMod.MODID + ".mod_tab", "NeoTest Tab");

        addBlock(ModBlock.NOXUM, "Noxum");
        addBlock(ModBlock.NOXUM_STAIRS, "Noxum Stairs");
        addBlock(ModBlock.NOXUM_SLAB, "Noxum Slab");
        addBlock(ModBlock.NOXUM_WALL, "Noxum Wall");

        addBlock(ModBlock.POLISHED_NOXUM, "Polished Noxum");
        addBlock(ModBlock.POLISHED_NOXUM_STAIRS, "Polished Noxum Stairs");
        addBlock(ModBlock.POLISHED_NOXUM_SLAB, "Polished Noxum Slab");
        addBlock(ModBlock.POLISHED_NOXUM_WALL, "Polished Noxum Wall");
    }
}
