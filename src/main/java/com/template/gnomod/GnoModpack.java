package com.template.gnomod;

import com.template.gnomod.entity.ModEntities;
import com.template.gnomod.entity.server.Benee6Entity;
import com.template.gnomod.item.ModItemGroups;
import com.template.gnomod.item.ModItems;
import com.template.gnomod.sorting.InventorySorter;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GnoModpack implements ModInitializer {

    public static final String MOD_ID = "gnomod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Identifier INSERTION_SORT_REQUEST_ID = new Identifier(MOD_ID, "insertion-sort-request");
    public static final Identifier MERGE_SORT_REQUEST_ID = new Identifier(MOD_ID, "merge-sort-request");
    public static final Identifier BUBBLE_SORT_REQUEST_ID = new Identifier(MOD_ID, "bubble-sort-request");
    public static final Identifier QUICK_SORT_REQUEST_ID = new Identifier(MOD_ID, "quick-sort-request");
    public static final Identifier HEAP_SORT_REQUEST_ID = new Identifier(MOD_ID, "heap-sort-request");
    public static final Identifier RADIX_SORT_REQUEST_ID = new Identifier(MOD_ID, "radix-sort-request");
    public static final Identifier BUCKET_SORT_REQUEST_ID = new Identifier(MOD_ID, "bucket-sort-request");
    public static final Identifier GNOME_SORT_REQUEST_ID = new Identifier(MOD_ID, "gnome-sort-request");


    @Override
    public void onInitialize() {

        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();

        FabricDefaultAttributeRegistry.register(ModEntities.BENEE6, Benee6Entity.createBenee6Attributes());


        ServerPlayNetworking.registerGlobalReceiver(INSERTION_SORT_REQUEST_ID, (server, player, handler, buf, responseSender) -> server.execute(() -> sortCurrentlyOpenInventory(player)));

        ServerPlayNetworking.registerGlobalReceiver(MERGE_SORT_REQUEST_ID, (server, player, handler, buf, responseSender) -> server.execute(() -> sortCurrentlyOpenInventory2(player)));

        ServerPlayNetworking.registerGlobalReceiver(BUBBLE_SORT_REQUEST_ID, (server, player, handler, buf, responseSender) -> server.execute(() -> sortCurrentlyOpenInventory3(player)));

        ServerPlayNetworking.registerGlobalReceiver(QUICK_SORT_REQUEST_ID, (server, player, handler, buf, responseSender) -> server.execute(() -> sortCurrentlyOpenInventory4(player)));

        ServerPlayNetworking.registerGlobalReceiver(HEAP_SORT_REQUEST_ID, (server, player, handler, buf, responseSender) -> server.execute(() -> sortCurrentlyOpenInventory5(player)));

        ServerPlayNetworking.registerGlobalReceiver(RADIX_SORT_REQUEST_ID, (server, player, handler, buf, responseSender) -> server.execute(() -> sortCurrentlyOpenInventory6(player)));

        ServerPlayNetworking.registerGlobalReceiver(BUCKET_SORT_REQUEST_ID, (server, player, handler, buf, responseSender) -> server.execute(() -> sortCurrentlyOpenInventory7(player)));

        ServerPlayNetworking.registerGlobalReceiver(GNOME_SORT_REQUEST_ID, (server, player, handler, buf, responseSender) -> server.execute(() -> sortCurrentlyOpenInventory8(player)));
    }

    private void sortCurrentlyOpenInventory(ServerPlayerEntity player) {
        try {
            ScreenHandler screenHandler = player.currentScreenHandler;
            if (screenHandler == null) {
                return;
            }
            if (screenHandler instanceof GenericContainerScreenHandler genericContainerScreenHandler) {
                if (canPlayerUse(player, screenHandler)) return;

                Inventory containerInventory = genericContainerScreenHandler.getInventory();
                InventorySorter.insertionSortInventory(containerInventory);
                containerInventory.markDirty();
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    private void sortCurrentlyOpenInventory2(ServerPlayerEntity player) {
        try {
            ScreenHandler screenHandler = player.currentScreenHandler;
            if (screenHandler == null) {
                return;
            }
            if (screenHandler instanceof GenericContainerScreenHandler genericContainerScreenHandler) {
                if (canPlayerUse(player, screenHandler)) return;

                Inventory containerInventory = genericContainerScreenHandler.getInventory();
                InventorySorter.mergeSortInventory(containerInventory);
                containerInventory.markDirty();
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    private void sortCurrentlyOpenInventory3(ServerPlayerEntity player) {
        try {
            ScreenHandler screenHandler = player.currentScreenHandler;
            if (screenHandler == null) {
                return;
            }
            if (screenHandler instanceof GenericContainerScreenHandler genericContainerScreenHandler) {
                if (canPlayerUse(player, screenHandler)) return;

                Inventory containerInventory = genericContainerScreenHandler.getInventory();
                InventorySorter.bubbleSortInventory(containerInventory);
                containerInventory.markDirty();
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    private void sortCurrentlyOpenInventory4(ServerPlayerEntity player) {
        try {
            ScreenHandler screenHandler = player.currentScreenHandler;
            if (screenHandler == null) {
                return;
            }
            if (screenHandler instanceof GenericContainerScreenHandler genericContainerScreenHandler) {
                if (canPlayerUse(player, screenHandler)) return;

                Inventory containerInventory = genericContainerScreenHandler.getInventory();
                InventorySorter.quickSortInventory(containerInventory);
                containerInventory.markDirty();
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    private void sortCurrentlyOpenInventory5(ServerPlayerEntity player) {
        try {
            ScreenHandler screenHandler = player.currentScreenHandler;
            if (screenHandler == null) {
                return;
            }
            if (screenHandler instanceof GenericContainerScreenHandler genericContainerScreenHandler) {
                if (canPlayerUse(player, screenHandler)) return;

                Inventory containerInventory = genericContainerScreenHandler.getInventory();
                InventorySorter.heapSortInventory(containerInventory);
                containerInventory.markDirty();
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    private void sortCurrentlyOpenInventory6(ServerPlayerEntity player) {
        try {
            ScreenHandler screenHandler = player.currentScreenHandler;
            if (screenHandler == null) {
                return;
            }
            if (screenHandler instanceof GenericContainerScreenHandler genericContainerScreenHandler) {
                if (canPlayerUse(player, screenHandler)) return;

                Inventory containerInventory = genericContainerScreenHandler.getInventory();
                InventorySorter.radixSortInventory(containerInventory);
                containerInventory.markDirty();
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    private void sortCurrentlyOpenInventory7(ServerPlayerEntity player) {
        try {
            ScreenHandler screenHandler = player.currentScreenHandler;
            if (screenHandler == null) {
                return;
            }
            if (screenHandler instanceof GenericContainerScreenHandler genericContainerScreenHandler) {
                if (canPlayerUse(player, screenHandler)) return;

                Inventory containerInventory = genericContainerScreenHandler.getInventory();
                InventorySorter.bucketSortInventory(containerInventory);
                containerInventory.markDirty();
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    private void sortCurrentlyOpenInventory8(ServerPlayerEntity player) {
        try {
            ScreenHandler screenHandler = player.currentScreenHandler;
            if (screenHandler == null) {
                return;
            }
            if (screenHandler instanceof GenericContainerScreenHandler genericContainerScreenHandler) {
                if (canPlayerUse(player, screenHandler)) return;

                Inventory containerInventory = genericContainerScreenHandler.getInventory();
                InventorySorter.gnomeSortInventory(containerInventory);
                containerInventory.markDirty();
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }


    private boolean canPlayerUse(ServerPlayerEntity player, ScreenHandler screenHandler) {
        if (!screenHandler.canUse(player)) {
            LOGGER.info("Failed to sort, because player cannot use the container anymore.");
            return true;
        }
        return false;
    }
}
