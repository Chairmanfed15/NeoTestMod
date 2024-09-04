package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.data.providers.NoxernaBlockLootProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class NoxernaLootTables extends LootTableProvider{
    public NoxernaLootTables(PackOutput output, CompletableFuture<HolderLookup.Provider> Registries) {
        super(output, Set.of(),
                List.of(new SubProviderEntry(NoxernaBlockLootProvider::new, LootContextParamSets.BLOCK)), Registries);
    }
}
