package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class NoxernaLanguageProvider extends LanguageProvider {
    public NoxernaLanguageProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheNoxerna.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TheNoxerna.MODID + ".building_blocks", "Noxerna Building Blocks");
        add("gamerule.maxQuakeMagnitude", "Maximum Quake Magnitude");

        addBlock(NoxernaBlocks.NOXUM, "Noxum");
        addBlock(NoxernaBlocks.NOXUM_BRICKS, "Noxum Bricks");
        addBlock(NoxernaBlocks.NOXUM_BRICK_STAIRS, "Noxum Brick Stairs");
        addBlock(NoxernaBlocks.NOXUM_BRICK_SLAB, "Noxum Brick Slab");
        addBlock(NoxernaBlocks.NOXUM_BRICK_WALL, "Noxum Brick Wall");
        addBlock(NoxernaBlocks.NOXUM_PRESSURE_PLATE, "Noxum Pressure Plate");
        addBlock(NoxernaBlocks.NOXUM_STAIRS, "Noxum Stairs");
        addBlock(NoxernaBlocks.NOXUM_SLAB, "Noxum Slab");
        addBlock(NoxernaBlocks.NOXUM_WALL, "Noxum Wall");

        addBlock(NoxernaBlocks.POLISHED_NOXUM, "Polished Noxum");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_STAIRS, "Polished Noxum Stairs");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_SLAB, "Polished Noxum Slab");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_WALL, "Polished Noxum Wall");
    }
}
