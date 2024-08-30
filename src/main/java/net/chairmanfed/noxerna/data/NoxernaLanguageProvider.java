package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.function.Supplier;

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
        addBlock(NoxernaBlocks.NOXUM_PEBBLE, "Noxum Pebble");
        addBlock(NoxernaBlocks.NOXUM_PRESSURE_PLATE, "Noxum Pressure Plate");
        addBlock(NoxernaBlocks.NOXUM_STAIRS, "Noxum Stairs");
        addBlock(NoxernaBlocks.NOXUM_SLAB, "Noxum Slab");
        addBlock(NoxernaBlocks.NOXUM_WALL, "Noxum Wall");

        addBlock(NoxernaBlocks.POLISHED_NOXUM, "Polished Noxum");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_STAIRS, "Polished Noxum Stairs");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_SLAB, "Polished Noxum Slab");
        addBlock(NoxernaBlocks.POLISHED_NOXUM_WALL, "Polished Noxum Wall");

        add(NoxernaTags.ItemTags.NOXUM_STONE_TYPE, "Any Noxum Stone");
        add(NoxernaTags.ItemTags.COMPLETES_MINE_HARD_STONE_ADVANCEMENT, "Completes Hard Shadowy Rock");
        add(NoxernaTags.ItemTags.NOXSTONE_TOOL_MATERIALS, "Noxstone Tool Materials");

        // Root
        add("advancement." + TheNoxerna.MODID + ".root.title",
                "Noxerna");
        add("advancement." + TheNoxerna.MODID + ".root.description",
                "Bring a torch or 64");
        // Enter Noxerna Storyline
        add("advancement." + TheNoxerna.MODID + ".find_abandoned_portal.title",
                "All Below!");
        add("advancement." + TheNoxerna.MODID + ".find_abandoned_portal.description",
                "Find an Abandoned Railway Portal");
        add("advancement." + TheNoxerna.MODID + ".enter_noxerna.title",
                "Entry Number 17");
        add("advancement." + TheNoxerna.MODID + ".enter_noxerna.description",
                "Light and enter a Noxerna Portal");
        // Explore Noxerna Storyline
        add("advancement." + TheNoxerna.MODID + ".explore_noble_gas_biomes.title",
                "A Sight to Dwell Upon and Never Forget!");
        add("advancement." + TheNoxerna.MODID + ".explore_noble_gas_biomes.description",
                "Find any of the 4 Noblephyte biomes");
        add("advancement." + TheNoxerna.MODID + ".breach_surface.title",
                "The Sun is a Deadly Lazer");
        add("advancement." + TheNoxerna.MODID + ".breach_surface.description",
                "Breach Noxerna's Surface");
        add("advancement." + TheNoxerna.MODID + ".explore_noxerna.title",
                "Cavernous Grand Tour");
        add("advancement." + TheNoxerna.MODID + ".explore_noxerna.description",
                "Explore all Noxerna biomes");
        // Automaton Storyline
        add("advancement." + TheNoxerna.MODID + ".caught_mining.title",
                "Busted!");
        add("advancement." + TheNoxerna.MODID + ".caught_mining.description",
                "Get caught mining without a license");
        add("advancement." + TheNoxerna.MODID + ".get_license.title",
                "License to Mine");
        add("advancement." + TheNoxerna.MODID + ".get_license.description",
                "Get a Drillaton ID Chip to safely mine in the Noxerna");
        add("advancement." + TheNoxerna.MODID + ".suspicion_five.title",
                "Marked for Death");
        add("advancement." + TheNoxerna.MODID + ".suspicion_five.description",
                "Resist the automated authority and escape with your life!");
        add("advancement." + TheNoxerna.MODID + ".survive_suspicion_reset.title",
                "Exception to the Rule");
        add("advancement." + TheNoxerna.MODID + ".survive_suspicion_reset.description",
                "Get yourself off the 'Kill on Sight' list by defying death");
        // Foods & Potions Storyline
        add("advancement." + TheNoxerna.MODID + ".all_noxerna_foods.title",
                "Dining in the Dark");
        add("advancement." + TheNoxerna.MODID + ".all_noxerna_foods.description",
                "Eat all the food the Noxerna offers, even if its unsafe for you");
        add("advancement." + TheNoxerna.MODID + ".all_noxerna_potions.title",
                "Alchemical Connoisseur");
        add("advancement." + TheNoxerna.MODID + ".all_noxerna_potions.description",
                "Have every potion effect sourced from the Noxerna applied all at once");
        add("advancement." + TheNoxerna.MODID + ".all_noxerna_effects.title",
                "Affliction of the Shadows");
        add("advancement." + TheNoxerna.MODID + ".all_noxerna_effects.description",
                "Have every status effect sourced from the Noxerna applied all at once");
        // Rocks & Quakes Storyline
        add("advancement." + TheNoxerna.MODID + ".noxerna_tools.title",
                "A Better Tool for the Job");
        add("advancement." + TheNoxerna.MODID + ".noxerna_tools.description",
                "Tools made from Noxerna's materials are better suited for mining!");
        add("advancement." + TheNoxerna.MODID + ".mine_hard_stone.title",
                "Hard Shadowy Rock");
        add("advancement." + TheNoxerna.MODID + ".mine_hard_stone.description",
                "Mine the hardened stones of the Noxerna");
    }
}
