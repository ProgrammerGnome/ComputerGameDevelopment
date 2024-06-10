package com.template.gnomod.sorting;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;

import java.util.*;

public class InventorySorter {
    private InventorySorter() {
        // Prevent instantiation of utility method
    }

    private static boolean isSorted;

    // Insertion Sort
    public static void insertionSortInventory(Inventory inventory) {
        if (!isSorted) {
            Map<Integer, ItemStack> inventoryMap = convertInventoryToMap(inventory);
            List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted = new ArrayList<>(inventoryMap.entrySet());
            insertionSort(entriesWithValueSorted);
            isSorted = true;
        }
        shuffleInventory(inventory);
    }

    // Merge Sort
    public static void mergeSortInventory(Inventory inventory) {
        if (!isSorted) {
            Map<Integer, ItemStack> inventoryMap = convertInventoryToMap(inventory);
            List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted = new ArrayList<>(inventoryMap.entrySet());
            mergeSort(entriesWithValueSorted);
            isSorted = true;
        }
        shuffleInventory(inventory);
    }

    // Bubble Sort
    public static void bubbleSortInventory(Inventory inventory) {
        if (!isSorted) {
            Map<Integer, ItemStack> inventoryMap = convertInventoryToMap(inventory);
            List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted = new ArrayList<>(inventoryMap.entrySet());
            bubbleSort(entriesWithValueSorted);
            isSorted = true;
        }
        shuffleInventory(inventory);
    }

    // Quick Sort
    public static void quickSortInventory(Inventory inventory) {
        if (!isSorted) {
            Map<Integer, ItemStack> inventoryMap = convertInventoryToMap(inventory);
            List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted = new ArrayList<>(inventoryMap.entrySet());
            quickSort(entriesWithValueSorted, 0, entriesWithValueSorted.size() - 1);
            isSorted = true;
        }
        shuffleInventory(inventory);
    }

    // Heap Sort
    public static void heapSortInventory(Inventory inventory) {
        if (!isSorted) {
            Map<Integer, ItemStack> inventoryMap = convertInventoryToMap(inventory);
            List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted = new ArrayList<>(inventoryMap.entrySet());
            heapSort(entriesWithValueSorted);
            isSorted = true;
        }
        shuffleInventory(inventory);
    }

    // Radix Sort
    public static void radixSortInventory(Inventory inventory) {
        if (!isSorted) {
            Map<Integer, ItemStack> inventoryMap = convertInventoryToMap(inventory);
            List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted = new ArrayList<>(inventoryMap.entrySet());
            radixSort(entriesWithValueSorted);
            isSorted = true;
        }
        shuffleInventory(inventory);
    }

    // Bucket Sort
    public static void bucketSortInventory(Inventory inventory) {
        if (!isSorted) {
            Map<Integer, ItemStack> inventoryMap = convertInventoryToMap(inventory);
            List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted = new ArrayList<>(inventoryMap.entrySet());
            bucketSort(entriesWithValueSorted);
            isSorted = true;
        }
        shuffleInventory(inventory);
    }

    // Gnome Sort
    public static void gnomeSortInventory(Inventory inventory) {
        if (!isSorted) {
            Map<Integer, ItemStack> inventoryMap = convertInventoryToMap(inventory);
            List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted = new ArrayList<>(inventoryMap.entrySet());
            gnomeSort(entriesWithValueSorted);
            isSorted = true;
        }
        shuffleInventory(inventory);
    }

    private static void shuffleInventory(Inventory inventory) {
        int size = inventory.size();
        for (int i = 0; i < size - 1; i++) {
            ItemStack currentStack = inventory.getStack(i);
            ItemStack nextStack = inventory.getStack(i + 1);
            if (compareItems(currentStack, nextStack) > 0) {
                inventory.setStack(i, nextStack);
                inventory.setStack(i + 1, currentStack);
                return;
            }
        }
        isSorted = false;
    }

    private static int compareItems(ItemStack stack1, ItemStack stack2) {
        String name1 = stack1.getName().getString();
        String name2 = stack2.getName().getString();
        return name1.compareTo(name2);
    }

    private static Map<Integer, ItemStack> convertInventoryToMap(Inventory inventory) {
        Map<Integer, ItemStack> inventoryMap = new HashMap<>(inventory.size());
        for (int i = 0; i < inventory.size(); i++) {
            ItemStack stack = inventory.getStack(i);
            inventoryMap.put(i, stack);
        }
        return inventoryMap;
    }


    // Core algorithms

    private static void insertionSort(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted) {
        int n = entriesWithValueSorted.size();
        for (int i = 1; i < n; ++i) {
            Map.Entry<Integer, ItemStack> key = entriesWithValueSorted.get(i);
            int j = i - 1;

            while (j >= 0 && compareEntries(entriesWithValueSorted.get(j), key) > 0) {
                entriesWithValueSorted.set(j + 1, entriesWithValueSorted.get(j));
                j = j - 1;
            }
            entriesWithValueSorted.set(j + 1, key);
        }
    }

    private static void mergeSort(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted) {
        if (entriesWithValueSorted.size() <= 1) {
            return;
        }

        int middle = entriesWithValueSorted.size() / 2;
        List<Map.Entry<Integer, ItemStack>> left = new ArrayList<>(entriesWithValueSorted.subList(0, middle));
        List<Map.Entry<Integer, ItemStack>> right = new ArrayList<>(entriesWithValueSorted.subList(middle, entriesWithValueSorted.size()));

        mergeSort(left);
        mergeSort(right);

        merge(entriesWithValueSorted, left, right);
    }

    private static void merge(List<Map.Entry<Integer, ItemStack>> result, List<Map.Entry<Integer, ItemStack>> left, List<Map.Entry<Integer, ItemStack>> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (compareEntries(left.get(i), right.get(j)) <= 0) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }

    private static void bubbleSort(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted) {
        int n = entriesWithValueSorted.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (compareEntries(entriesWithValueSorted.get(j), entriesWithValueSorted.get(j + 1)) > 0) {
                    Collections.swap(entriesWithValueSorted, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private static void quickSort(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted, int low, int high) {
        if (low < high) {
            int pi = partition(entriesWithValueSorted, low, high);
            quickSort(entriesWithValueSorted, low, pi - 1);
            quickSort(entriesWithValueSorted, pi + 1, high);
        }
    }

    private static int partition(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted, int low, int high) {
        Map.Entry<Integer, ItemStack> pivot = entriesWithValueSorted.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (compareEntries(entriesWithValueSorted.get(j), pivot) <= 0) {
                i++;
                Collections.swap(entriesWithValueSorted, i, j);
            }
        }
        Collections.swap(entriesWithValueSorted, i + 1, high);
        return i + 1;
    }

    private static void heapSort(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted) {
        int n = entriesWithValueSorted.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(entriesWithValueSorted, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            Collections.swap(entriesWithValueSorted, 0, i);
            heapify(entriesWithValueSorted, i, 0);
        }
    }

    private static void heapify(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && compareEntries(entriesWithValueSorted.get(left), entriesWithValueSorted.get(largest)) > 0) {
            largest = left;
        }
        if (right < n && compareEntries(entriesWithValueSorted.get(right), entriesWithValueSorted.get(largest)) > 0) {
            largest = right;
        }
        if (largest != i) {
            Collections.swap(entriesWithValueSorted, i, largest);
            heapify(entriesWithValueSorted, n, largest);
        }
    }

    private static void radixSort(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted) {
        int max = getMax(entriesWithValueSorted);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(entriesWithValueSorted, exp);
        }
    }

    private static int getMax(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted) {
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, ItemStack> entry : entriesWithValueSorted) {
            int value = entry.getValue().getCount();
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static void countingSort(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted, int exp) {
        int n = entriesWithValueSorted.size();
        List<Map.Entry<Integer, ItemStack>> output = new ArrayList<>(Collections.nCopies(n, null));
        int[] count = new int[10];

        for (Map.Entry<Integer, ItemStack> integerItemStackEntry : entriesWithValueSorted) {
            int index = (integerItemStackEntry.getValue().getCount() / exp) % 10;
            count[index]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = (entriesWithValueSorted.get(i).getValue().getCount() / exp) % 10;
            output.set(count[index] - 1, entriesWithValueSorted.get(i));
            count[index]--;
        }

        for (int i = 0; i < n; i++) {
            entriesWithValueSorted.set(i, output.get(i));
        }
    }

    private static void bucketSort(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted) {
        int max = getMax(entriesWithValueSorted);
        int bucketCount = max / 10 + 1;
        List<List<Map.Entry<Integer, ItemStack>>> buckets = new ArrayList<>(Collections.nCopies(bucketCount, null));

        for (int i = 0; i < bucketCount; i++) {
            buckets.set(i, new LinkedList<>());
        }

        for (Map.Entry<Integer, ItemStack> entry : entriesWithValueSorted) {
            int bucketIndex = entry.getValue().getCount() / 10;
            buckets.get(bucketIndex).add(entry);
        }

        for (List<Map.Entry<Integer, ItemStack>> bucket : buckets) {
            bucket.sort(Comparator.comparingInt(e -> e.getValue().getCount()));
        }

        int index = 0;
        for (List<Map.Entry<Integer, ItemStack>> bucket : buckets) {
            for (Map.Entry<Integer, ItemStack> entry : bucket) {
                entriesWithValueSorted.set(index++, entry);
            }
        }
    }

    private static void gnomeSort(List<Map.Entry<Integer, ItemStack>> entriesWithValueSorted) {
        int index = 0;
        while (index < entriesWithValueSorted.size()) {
            if (index == 0 || compareEntries(entriesWithValueSorted.get(index), entriesWithValueSorted.get(index - 1)) >= 0) {
                index++;
            } else {
                Collections.swap(entriesWithValueSorted, index, index - 1);
                index--;
            }
        }
    }

    private static int compareEntries(Map.Entry<Integer, ItemStack> entry1, Map.Entry<Integer, ItemStack> entry2) {
        String name1 = entry1.getValue().getName().getString();
        String name2 = entry2.getValue().getName().getString();
        return name1.compareTo(name2);
    }
}
