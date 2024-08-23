package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.block.NoxernaBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class NoxernaLanguageProvider extends LanguageProvider {
    public NoxernaLanguageProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheNoxerna.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TheNoxerna.MODID + ".mod_tab", "The Noxerna");

        addBlock(NoxernaBlocks.NOXUM, "Noxum");
        addBlock(NoxernaBlocks.NOXUM_STAIRS, "Noxum Stairs");
        addBlock(NoxernaBlocks.NOXUM_SLAB, "Noxum Slab");
        addBlock(NoxernaBlocks.NOXUM_WALL, "Noxum Wall");

        addBlock(NoxernaBlocks.POLISHED_NOXUM, "Polished Noxum");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_STAIRS, "Polished Noxum Stairs");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_SLAB, "Polished Noxum Slab");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_WALL, "Polished Noxum Wall");
    }
}
