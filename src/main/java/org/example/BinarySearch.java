package org.example;

public class BinarySearch {
    public int searchIterative(int[] sortedArray, int valueToFind) {
        int low = 0;
        int high = sortedArray.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public int searchRecursive(int[] sortedArray, int valueToFind, int low, int high) {
        if (sortedArray.length == 0) {
            return -1;
        }
        if (low == high) {
            return (sortedArray[low] == valueToFind) ? low : -1;
        }

        int mid = low + (high - low) / 2;

        if (valueToFind > sortedArray[mid]) {
            return searchRecursive(sortedArray, valueToFind, mid + 1, high);
        } else if (sortedArray[mid] > valueToFind) {
            return searchRecursive(sortedArray, valueToFind, low, mid - 1);
        }
        return mid;
    }
}
