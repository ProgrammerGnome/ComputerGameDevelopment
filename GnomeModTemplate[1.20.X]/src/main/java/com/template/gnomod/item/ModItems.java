package com.template.gnomod.item;

import com.template.gnomod.GnoModpack;
import com.template.gnomod.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BENEE6_SPAWN_EGG = registerItem2(
            new SpawnEggItem(ModEntities.BENEE6, 0xa86518, 0x3b260f, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(BENEE6_SPAWN_EGG);
    }

    private static Item registerItem2(Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GnoModpack.MOD_ID, "benee6_spawn_egg"), item);
    }

    public static void registerModItems() {
        GnoModpack.LOGGER.info("Registering Mod Items for " + GnoModpack.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
