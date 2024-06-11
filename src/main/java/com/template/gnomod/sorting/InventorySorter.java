package com.template.gnomod.sorting;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;

public class InventorySorter {

    private static int x = 0;

    private InventorySorter() {
        // Prevent instantiation of utility method
    }

    // Insertion sort
    public static void initializationSortInventory() {
        x = 0;
    }

    // Insertion sort
    public static void insertionSortInventory(Inventory inventory) {
        int size = inventory.size();
        for (int i = 0; i < size - 1; i++) {
            ItemStack currentStack = inventory.getStack(i);
            ItemStack nextStack = inventory.getStack(i + 1);
            if (compareItems(currentStack, nextStack) > 0) {
                inventory.setStack(i, nextStack);
                inventory.setStack(i + 1, currentStack);
                mergeItemsWithSameName(inventory);
                return;
            }
        }
    }

    // Bubble sort
    public static void bubbleSortInventory(Inventory inventory) {
        // One step of bubble sort
        int n = inventory.size();
        for (int i = 0; i < n - 1; i++) {
            if (compareItems(inventory.getStack(i), inventory.getStack(i + 1)) > 0) {
                ItemStack temp = inventory.getStack(i);
                inventory.setStack(i, inventory.getStack(i + 1));
                inventory.setStack(i + 1, temp);
                mergeItemsWithSameName(inventory);
            }
        }
    }

    // Merge sort
    public static void mergeSortInventory(Inventory inventory) {

        ItemStack[] items = new ItemStack[inventory.size()];

        for (int i = 0; i < inventory.size(); i++) {
            items[i] = inventory.getStack(i);
        }

        x++;
        System.out.println("iksz:"+x);

        if (x <= items.length - 1) {
            mergeSort(items, 0, x);
            System.out.println("if-be betérve:"+x);
        }
        if (x > items.length -1) {
            x = 0;
        }

        for (int i = 0; i < inventory.size(); i++) {
            inventory.setStack(i, items[i]);
        }

        mergeItemsWithSameName(inventory);
    }

    private static void mergeSort(ItemStack[] items, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(items, left, mid);
            mergeSort(items, mid + 1, right);
            merge(items, left, mid, right);
        }
    }

    private static void merge(ItemStack[] items, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        ItemStack[] L = new ItemStack[n1];
        ItemStack[] R = new ItemStack[n2];

        System.arraycopy(items, left, L, 0, n1);
        for (int j = 0; j < n2; ++j) {
            R[j] = items[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (compareItems(L[i], R[j]) <= 0) {
                items[k] = L[i];
                i++;
            } else {
                items[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            items[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            items[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick sort
    public static void quickSortInventory(Inventory inventory) {

        ItemStack[] items = new ItemStack[inventory.size()];

        for (int i = 0; i < inventory.size(); i++) {
            items[i] = inventory.getStack(i);
        }

        x++;
        System.out.println("iksz:"+x);

        if (x <= items.length - 1) {
            quickSort(items, 0, x);
            System.out.println("if-be betérve:"+x);
        }
        if (x > items.length -1) {
            x = 0;
        }

        for (int i = 0; i < inventory.size(); i++) {
            inventory.setStack(i, items[i]);
        }

        mergeItemsWithSameName(inventory);
    }

    private static void quickSort(ItemStack[] items, int low, int high) {
        if (low < high) {
            int pi = partition(items, low, high);
            System.out.println("quick pivot:"+pi);

            quickSort(items, low, pi - 1);
            quickSort(items, pi + 1, high);
        }
    }

    private static int partition(ItemStack[] items, int low, int high) {
        ItemStack pivot = items[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compareItems(items[j], pivot) < 0) {
                i++;
                ItemStack temp = items[i];
                items[i] = items[j];
                items[j] = temp;
            }
        }
        ItemStack temp = items[i + 1];
        items[i + 1] = items[high];
        items[high] = temp;
        return i + 1;
    }

    // Merging items with the same name after sorting
    private static void mergeItemsWithSameName(Inventory inventory) {
        for (int i = 0; i < inventory.size() - 1; i++) {
            ItemStack currentStack = inventory.getStack(i);
            ItemStack nextStack = inventory.getStack(i + 1);
            if (compareItems(currentStack, nextStack) == 0 && !currentStack.isEmpty()) {
                int totalStackSize = currentStack.getCount() + nextStack.getCount();
                currentStack.setCount(totalStackSize);
                inventory.setStack(i + 1, ItemStack.EMPTY);
            }
        }
    }

    private static int compareItems(ItemStack stack1, ItemStack stack2) {
        String name1 = stack1.getName().getString();
        String name2 = stack2.getName().getString();
        return name1.compareTo(name2);
    }

}
