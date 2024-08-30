package net.chairmanfed.noxerna.block;

import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class NoxernaBlockStateProperties extends BlockStateProperties {
    public static final IntegerProperty PEBBLE = IntegerProperty.create("pebbles", 1, 4);
}
