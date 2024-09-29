package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.data.PackOutput;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;
import net.neoforged.neoforge.registries.DeferredHolder;

import javax.annotation.Nullable;

public class NoxernaSoundDefinitions extends SoundDefinitionsProvider {
    public NoxernaSoundDefinitions(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, TheNoxerna.MODID, fileHelper);
    }

    @Override
    public void registerSounds() {
    }

    protected static SoundDefinition.Sound sound(final String name){
        return sound(TheNoxerna.prefix(name));
    }
    public void generateSubbedSound(DeferredHolder<SoundEvent, SoundEvent> event, int soundVariations, String subtitle){
    }
    public void generateSound(
            DeferredHolder<SoundEvent, SoundEvent> event,
            String baseDirectory, int soundVariations, @Nullable String subtitle) {
        SoundDefinition definition = SoundDefinition.definition();
    }
}
