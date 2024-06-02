package com.template.gnomod.item;

import com.template.gnomod.GnoModpack;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GnoModpack.MOD_ID, "benee6"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.GnoModpackGroup"))
                    .icon(() -> new ItemStack(ModItems.BENEE6_SPAWN_EGG))
                    .entries((displayContext, entries) -> {
                        for (Item item : new Item[]{ModItems.BENEE6_SPAWN_EGG, ModItems.DEUTSCHTOMI_SPAWN_EGG}) {
                            entries.add(item);
                        }
                    }).build());

    public static void registerItemGroups() {
        GnoModpack.LOGGER.info("Registering Item Groups for " + GnoModpack.MOD_ID);
    }

}
