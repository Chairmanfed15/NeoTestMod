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
        basicItem(NoxernaItems.RAW_FERREBRIS.get());
        basicItem(NoxernaItems.RAW_OBSCUPRUM.get());
        basicItem(NoxernaItems.RAW_UMBURAM.get());
        basicItem(NoxernaItems.RAW_INPERLUM.get());
        basicItem(NoxernaItems.TENERYL.get());
        basicItem(NoxernaItems.ADAMUNA.get());
        basicItem(NoxernaItems.VITRAGOR.get());
        basicItem(NoxernaItems.FERREBRIS_NUGGET.get());
        basicItem(NoxernaItems.OBSCUPRUM_NUGGET.get());
        basicItem(NoxernaItems.UMBURAM_NUGGET.get());
        basicItem(NoxernaItems.INPERLUM_NUGGET.get());
        basicItem(NoxernaItems.NIHOXITE_NUGGET.get());
        basicItem(NoxernaItems.FERREBRIS_INGOT.get());
        basicItem(NoxernaItems.OBSCUPRUM_INGOT.get());
        basicItem(NoxernaItems.UMBURAM_INGOT.get());
        basicItem(NoxernaItems.INPERLUM_INGOT.get());
        basicItem(NoxernaItems.NIHOXITE_INGOT.get());
        basicItem(NoxernaItems.NOBLEWOOD_STICK.get());
        basicItem(NoxernaItems.NIHOXITE_UPGRADE_SMITHING_TEMPLATE.get());

        toolItem(NoxernaItems.NOBLEWOOD_AXE);
        toolItem(NoxernaItems.NOBLEWOOD_HOE);
        toolItem(NoxernaItems.NOBLEWOOD_PICKAXE);
        toolItem(NoxernaItems.NOBLEWOOD_SHOVEL);
        toolItem(NoxernaItems.NOBLEWOOD_SWORD);

        toolItem(NoxernaItems.NOXSTONE_AXE);
        toolItem(NoxernaItems.NOXSTONE_HOE);
        toolItem(NoxernaItems.NOXSTONE_PICKAXE);
        toolItem(NoxernaItems.NOXSTONE_SHOVEL);
        toolItem(NoxernaItems.NOXSTONE_SWORD);

        toolItem(NoxernaItems.FERREBRIS_AXE);
        toolItem(NoxernaItems.FERREBRIS_HOE);
        toolItem(NoxernaItems.FERREBRIS_PICKAXE);
        toolItem(NoxernaItems.FERREBRIS_SHOVEL);
        toolItem(NoxernaItems.FERREBRIS_SWORD);

        toolItem(NoxernaItems.UMBURAM_AXE);
        toolItem(NoxernaItems.UMBURAM_HOE);
        toolItem(NoxernaItems.UMBURAM_PICKAXE);
        toolItem(NoxernaItems.UMBURAM_SHOVEL);
        toolItem(NoxernaItems.UMBURAM_SWORD);

        toolItem(NoxernaItems.ADAMUNA_AXE);
        toolItem(NoxernaItems.ADAMUNA_HOE);
        toolItem(NoxernaItems.ADAMUNA_PICKAXE);
        toolItem(NoxernaItems.ADAMUNA_SHOVEL);
        toolItem(NoxernaItems.ADAMUNA_SWORD);

        toolItem(NoxernaItems.NIHOXITE_AXE);
        toolItem(NoxernaItems.NIHOXITE_HOE);
        toolItem(NoxernaItems.NIHOXITE_PICKAXE);
        toolItem(NoxernaItems.NIHOXITE_SHOVEL);
        toolItem(NoxernaItems.NIHOXITE_SWORD);
    }

    public void toolItem(Supplier<Item> item) {
        this.withExistingParent(BuiltInRegistries.ITEM.getKey(item.get()).getPath(), mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/" + BuiltInRegistries.ITEM.getKey(item.get()).getPath()));
    }
}
