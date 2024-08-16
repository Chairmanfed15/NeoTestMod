package net.chairmanfed.neotestmod.data;

import net.chairmanfed.neotestmod.NeoTestMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = NeoTestMod.MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(
                event.includeClient(),
                new ModBlockStateProvider(output, existingFileHelper)
        );
        generator.addProvider(
                event.includeClient(),
                new ModLanguageProvider(output, existingFileHelper)
        );
        generator.addProvider(
                event.includeServer(),
                new ModBlockTagProvider(output, lookupProvider, existingFileHelper)
        );
        generator.addProvider(
                event.includeServer(),
                new ModLootTableProvider(output, lookupProvider)
        );
    }
}
