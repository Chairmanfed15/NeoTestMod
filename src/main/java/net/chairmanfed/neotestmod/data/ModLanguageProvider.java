package net.chairmanfed.neotestmod.data;

import net.chairmanfed.neotestmod.NeoTestMod;
import net.chairmanfed.neotestmod.block.ModBlock;
import net.chairmanfed.neotestmod.item.ModCreativeModeTab;
import net.minecraft.data.PackOutput;
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
    }
}
