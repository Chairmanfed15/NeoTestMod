package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBiomes;
import net.chairmanfed.noxerna.registry.NoxernaDimension;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class NoxernaRegistries extends DatapackBuiltinEntriesProvider {
    public NoxernaRegistries(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider, BUILDER, Set.of("minecraft", TheNoxerna.MODID));
    }
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.BIOME, NoxernaBiomes::bootstrap)
            .add(Registries.LEVEL_STEM, NoxernaDimension::bootstrapStem)
            .add(Registries.DIMENSION_TYPE, NoxernaDimension::bootstrapType)
            .add(Registries.NOISE_SETTINGS, NoxernaDimension::bootstrapNoise);
}
