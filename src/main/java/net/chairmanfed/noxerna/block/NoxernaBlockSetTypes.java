package net.chairmanfed.noxerna.block;

import net.chairmanfed.noxerna.TheNoxerna;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class NoxernaBlockSetTypes {
    public static final BlockSetType XENON_BLOCK_SET = BlockSetType.register(
            new BlockSetType(TheNoxerna.prefix("xenon").toString(),
                    true, true, true,
                    BlockSetType.PressurePlateSensitivity.EVERYTHING, SoundType.CHERRY_WOOD,
                    SoundEvents.CHERRY_WOOD_DOOR_CLOSE, SoundEvents.CHERRY_WOOD_DOOR_OPEN,
                    SoundEvents.CHERRY_WOOD_TRAPDOOR_CLOSE, SoundEvents.CHERRY_WOOD_TRAPDOOR_OPEN,
                    SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON,
                    SoundEvents.CHERRY_WOOD_BUTTON_CLICK_OFF, SoundEvents.CHERRY_WOOD_BUTTON_CLICK_ON));
    public static final WoodType XENON_WOOD_SET =WoodType.register(
            new WoodType(TheNoxerna.prefix("xenon").toString(), XENON_BLOCK_SET));
    public static final BlockSetType KRYPTON_BLOCK_SET = BlockSetType.register(
            new BlockSetType(TheNoxerna.prefix("krypton").toString(),
                    true, true, true,
                    BlockSetType.PressurePlateSensitivity.EVERYTHING, SoundType.CHERRY_WOOD,
                    SoundEvents.CHERRY_WOOD_DOOR_CLOSE, SoundEvents.CHERRY_WOOD_DOOR_OPEN,
                    SoundEvents.CHERRY_WOOD_TRAPDOOR_CLOSE, SoundEvents.CHERRY_WOOD_TRAPDOOR_OPEN,
                    SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON,
                    SoundEvents.CHERRY_WOOD_BUTTON_CLICK_OFF, SoundEvents.CHERRY_WOOD_BUTTON_CLICK_ON));
    public static final WoodType KRYPTON_WOOD_SET =WoodType.register(
            new WoodType(TheNoxerna.prefix("krypton").toString(), KRYPTON_BLOCK_SET));
    public static final BlockSetType NOXUM_BLOCK_SET = BlockSetType.register(
            new BlockSetType(TheNoxerna.prefix("noxum").toString(),
                    true, true, false,
                    BlockSetType.PressurePlateSensitivity.MOBS, SoundType.DEEPSLATE,
                    SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN,
                    SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN,
                    SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON,
                    SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON));
}
