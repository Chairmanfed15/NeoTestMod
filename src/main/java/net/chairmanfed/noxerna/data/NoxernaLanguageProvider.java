package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.advancements.Advancement;
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

    protected void addAdvancement(String id, String title, String description) {
        this.add("advancement." + TheNoxerna.MODID + "." + id + ".title", title);
        this.add("advancement." + TheNoxerna.MODID + "." + id + ".description", description);
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

        // Root + Enter Noxerna Storyline
        addAdvancement("root", "Noxerna", "Bring a Torch or 64");
        addAdvancement("find_abandoned_portal", "All Below!", "Find an Abandoned Railway Portal");
        addAdvancement("enter_noxerna", "Entry Number 17", "Light and enter a Noxerna Portal");
        // Explore Noxerna Storyline
        addAdvancement("explore_noblephyte_biomes", "A Sight to Dwell Upon and Never Forget!",
                "Find any of the 4 Noblephyte biomes");
        addAdvancement("breach_surface", "The Sun is a Deadly Lazer", "Breach Noxerna's Surface");
        addAdvancement("explore_noxerna", "Cavernous Grand Tour", "Explore all Noxerna biomes");
        // Automaton Storyline
        addAdvancement("caught_mining", "Busted!", "Get caught mining without a license");
        addAdvancement("get_license", "License to Mine",
                "Get a Drillaton ID Chip to safely mine in the Noxerna");
        addAdvancement("suspicion_five", "Marked for Death",
                "Resist the automated authority and escape with your life!");
        addAdvancement("survive_suspicion_reset", "Exception to the Rule",
                "Get yourself off the 'Kill on Sight' list by defying death");
        // Foods & Potions Storyline
        addAdvancement("all_noxerna_foods", "Dining in the Dark",
                "Eat all the food the Noxerna offers, even if its unsafe for you");
        addAdvancement("all_noxerna_potions", "Alchemical Connoisseur",
                "Have every potion effect sourced from the Noxerna applied all at once");
        addAdvancement("all_noxerna_effects", "Affliction of the Shadows",
                "Have every status effect sourced from the Noxerna applied all at once");
        // Rocks & Quakes Storyline
        addAdvancement("noxerna_tools", "A Better Tool for the Job",
                "Tools made from Noxerna's materials are better suited for mining!");
        addAdvancement("mine_hard_stone", "Hard Shadowy Rock",
                "Mine the hardened stones of the Noxerna");
        addAdvancement("all_stone_variants", "Deep Rock's Finest",
                "Rock and Stone, until it is done");
        addAdvancement("noxquake", "Get Ready to RUMBLE!!!", "Experience a Noxquake");
        addAdvancement("portable_seismometer", "GeoShakr",
                "Craft a Portable Seismometer to know the strength of upcoming Noxquakes");
        addAdvancement("magnitude_ten_noxquake", "Quake Pro",
                "Experience the strongest Noxquake possible");
        // Fishing Storyline
        addAdvancement("noxerna_fish", "New World, New Fish", "Catch a fish native to the Noxerna");
        addAdvancement("ride_flatfish", "Who Needs Boats?",
                "Ride a Volcanic Flatfish for the first time");
        addAdvancement("ride_flatfish_in_other_dimensions", "Not the Way Home",
                "Ride a Volcanic Flatfish a fair way in the Overworld, Nether and End");
        addAdvancement("superheated_lava_fish", "Hot Fishes on Your Line",
                "Catch a fish... From SUPERHEATED lava???");
        addAdvancement("liquefied_shadow_fish", "Fishing in the Deep",
                "There's even fish in the liquid void! It can't get any crazier, it can't right?");
        addAdvancement("catch_all_fish", "Angler Supreme",
                "Catch all of the fish native to the Noxerna");
        // Ferrebris Tool Storyline
        addAdvancement("smelt_ferrebris", "Acquire Darkware", "Smelt a Ferrebris Ingot");
        addAdvancement("mine_native_minerals", "Shadow Mineralogy",
                "Collect a sample of every shadow touched mineral");
        addAdvancement("attunement_alchemy", "Law of Equivalent Exchange",
                "Exchange a material for one of equal value through attunement alchemy");
        addAdvancement("superheated_lava_bucket", "Hotter Stuff",
                "Fill a Bucket with Superheated Lava");
        addAdvancement("season_radar", "Seasonal Knowledge",
                "Craft a Season Radar to know the current Season in the Noxerna");
        addAdvancement("full_noxerna_year", "A Year in the Noxerna",
                "Experience all of Noxerna's seasons");
        addAdvancement("ferrebris_armor", "Ferrum-Clad Defence",
                "Keep yourself safe with Ferrebris Armor");
        addAdvancement("full_ferrebris_armor", "Fullmetal Metallurgist",
                "Suit up in full Ferrebris Armor");
        addAdvancement("ferrebris_shield", "Pocket Bastion", "Craft a Ferrebris Shield");
        addAdvancement("ferrebris_tools", "A Ferre Pick Upgrade", "Forge a Ferrebris Pickaxe");
        // Adamuna Storyline
        addAdvancement("superthermal_meter", "How Hot is it Getting in Here?",
                "Craft a Superthermal Meter, and answer the question no one seems to ask");
        addAdvancement("super_heatwave", "Global Warming", "Experience a Super-Heatwave");
        addAdvancement("mine_adamuna", "Adamuna?", "Mine some Adamuna");
        addAdvancement("give_adamuna", "A Little Moon for You!",
                "Toss (or clumsily drop) an Adamuna for yourself, someone or something to pick up");
        addAdvancement("adamuna_armor", "Cover Me in Moons", "Adamuna armor can save lives...");
        addAdvancement("full_adamuna_armor", "Full Moon Defence",
                "...Especially if a full suit is worn!");
        // Nihoxite Storyline
        addAdvancement("mine_inperlum", "Hidden in the Void",
                "Mine Inperlum in the deepest and darkest of caves");
        addAdvancement("refine_nihoxite", "Blacker than Black",
                "Alloy Inperlum with Ferrebris and infuse it with liquid void");
        addAdvancement("nihoxite_hoe", "Abyssal Dedication",
                "Make a Nihoxite Hoe and instantly regret your decision");
        addAdvancement("nihoxite_armor", "Immovable Object", "Suit up in full Nihoxite armor");
        // Noxerna Boss Storyline (Megatomaton)
        addAdvancement("noxerna_railway", "An Old Gauge",
                "Stumble upon the ancient railways in the Noxerna");
        addAdvancement("ore_refinery", "From Rocks to Riches", "Discover an old ore refinery");
        addAdvancement("find_megatomaton_arena", "Where Machines Are Made",
                "Locate the Automaton Manufacturing Plant");
        addAdvancement("awaken_megatomaton", "Kaiju Buster",
                "Awaken Megatomaton, the Titanic Machine");
        addAdvancement("defeat_megatomaton", "Decommissioned",
                "Shut down Project Kingslayer for good");
        // Noxerna Boss Storyline (Sulfernus)
        addAdvancement("geothermal_outpost", "Resting Flame",
                "Stumble upon an old outpost overtaken by a geothermal hotspot");
        addAdvancement("ashen_village", "Civilization..?", "Discover the ashen remains of a village");
        addAdvancement("find_sulfernus_arena", "City of Cinders", "Find the city lost to lava and ash");
        addAdvancement("awaken_sulfernus", "Agni Kai",
                "Challenge Sulfernus, the Everburning Inferno");
        addAdvancement("defeat_sulfernus", "Extinguished",
                "Extinguish Sulfernus in the heart of the lost city");
        // Noxerna Boss Storyline (Void Tyrant)
        addAdvancement("ancient_fortress", "Stagnation",
                "Break into a fortress from a time long forgotten");
        addAdvancement("find_pale_castle", "Fallen Kingdom",
                "Enter the shining beacon of an ancient kingdom");
        addAdvancement("void_key", "No Cost Too Great", "Endure a harsh trial and earn the Void Key");
        addAdvancement("open_void_well", "Slide into the Void", "Open a Void Well and jump in...");
        addAdvancement("challenge_void_tyrant", "The End and The Beginning",
                "Disturb the old tyrant's slumber");
        addAdvancement("defeat_void_tyrant", "Embrace the Void",
                "Defeat the Void Tyrant at their throne");
        // Completionist Extras
        addAdvancement("kill_all_noxerna_mobs", "Story of Undertale",
                "Killed every mob in the Noxerna, who's the real monster now? You... You are.");
        addAdvancement("complete_all_challenges", "Master Cave Dweller",
                "Master the caves of the Noxerna... " +
                        "Now consider returning to the Overworld to mine some grass");
    }
}
