package net.chairmanfed.noxerna.block;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class NoxernaBlockSetTypes {
    public static final BlockSetType XENON = BlockSetType.register(
            new BlockSetType(TheNoxerna.prefix("xenon").toString(),
                    true, true, true,
                    BlockSetType.PressurePlateSensitivity.EVERYTHING, SoundType.CHERRY_WOOD,
                    SoundEvents.CHERRY_WOOD_DOOR_CLOSE, SoundEvents.CHERRY_WOOD_DOOR_OPEN,
                    SoundEvents.CHERRY_WOOD_TRAPDOOR_CLOSE, SoundEvents.CHERRY_WOOD_TRAPDOOR_OPEN,
                    SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON,
                    SoundEvents.CHERRY_WOOD_BUTTON_CLICK_OFF, SoundEvents.CHERRY_WOOD_BUTTON_CLICK_ON));
    public static final BlockSetType NOXUM = BlockSetType.register(
            new BlockSetType(TheNoxerna.prefix("noxum").toString(),
                    true, true, false,
                    BlockSetType.PressurePlateSensitivity.MOBS, SoundType.DEEPSLATE,
                    SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN,
                    SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN,
                    SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON,
                    SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON));
}
