package net.chairmanfed.noxerna.data.models;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class NoxernaModels extends ModelTemplates {
    public static final ModelTemplate PEBBLE = create("pebble", TextureSlot.ALL);
    public static final ModelTemplate TWO_PEBBLES = create("two_pebbles", TextureSlot.ALL);
    public static final ModelTemplate THREE_PEBBLES = create("three_pebbles", TextureSlot.ALL);
    public static final ModelTemplate FOUR_PEBBLES = create("four_pebbles", TextureSlot.ALL);

    private static ModelTemplate create(String blockModelLocation, TextureSlot... requiredSlots) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(TheNoxerna.MODID, "block/" + blockModelLocation)), Optional.empty(), requiredSlots);
    }
}
