package net.chairmanfed.noxerna.data;

import net.chairmanfed.noxerna.TheNoxerna;
import net.chairmanfed.noxerna.registry.NoxernaBlocks;
import net.chairmanfed.noxerna.registry.NoxernaItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class NoxernaItemModels extends ItemModelProvider {
    public NoxernaItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheNoxerna.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        basicItem(NoxernaItems.ADAMUNA.get());
        basicItem(NoxernaItems.FERREBRIS_INGOT.get());
        basicItem(NoxernaItems.UMBURAM_INGOT.get());
        basicItem(NoxernaItems.NIHOXITE_INGOT.get());
        basicItem(NoxernaItems.NOBLEWOOD_STICK.get());

        toolItem(NoxernaItems.NOBLEWOOD_AXE);
        toolItem(NoxernaItems.NOBLEWOOD_HOE);
        toolItem(NoxernaItems.NOBLEWOOD_PICKAXE);
        toolItem(NoxernaItems.NOBLEWOOD_SHOVEL);
        toolItem(NoxernaItems.NOBLEWOOD_SWORD);
        toolItem(NoxernaItems.UMBURAM_PICKAXE);
        toolItem(NoxernaItems.NOXSTONE_PICKAXE);
        toolItem(NoxernaItems.FERREBRIS_PICKAXE);
        toolItem(NoxernaItems.ADAMUNA_PICKAXE);
        toolItem(NoxernaItems.NIHOXITE_PICKAXE);
    }

    public void toolItem(Supplier<Item> item) {
        this.withExistingParent(BuiltInRegistries.ITEM.getKey(item.get()).getPath(), mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/" + BuiltInRegistries.ITEM.getKey(item.get()).getPath()));
    }
}
