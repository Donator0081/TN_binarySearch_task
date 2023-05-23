package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    @DisplayName("Testing method searchIterative with valueToFind 3 should return 3")
    void searchIterative_shouldReturn3() {
        int[] values = {1, 1, 2, 3, 4, 10};
        int valueToFind = 3;
        int index = binarySearch.searchIterative(values, valueToFind);
        assertEquals(3, index);
    }

    @Test
    @DisplayName("Testing method searchIterative with valueToFind 0 should return 0")
    void searchIterative_shouldReturn0() {
        int[] values = {0, 1, 2, 3, 4, 10, 12, 18, 44};
        int valueToFind = 0;
        int index = binarySearch.searchIterative(values, valueToFind);
        assertEquals(0, index);
    }

    @Test
    @DisplayName("Testing method searchIterative with valueToFind 64 should return 9")
    void searchIterative_shouldReturn9() {
        int[] values = {1, 1, 2, 3, 4, 10, 10, 13, 55, 64};
        int valueToFind = 64;
        int index = binarySearch.searchIterative(values, valueToFind);
        assertEquals(9, index);
    }

    @Test
    @DisplayName("Testing method searchIterative with valueToFind 0 should return -1")
    void searchIterative_shouldReturnMinus1() {
        int[] values = {1, 1, 2, 3, 4, 10, 10, 13, 55, 64};
        int valueToFind = 0;
        int index = binarySearch.searchIterative(values, valueToFind);
        assertEquals(-1, index);
    }

    @Test
    @DisplayName("Testing method searchIterative with valueToFind 4 at empty array should return -1")
    void searchIterativeAtEmptyArray_shouldReturnMinus1() {
        int[] values = {};
        int valueToFind = 4;
        int index = binarySearch.searchIterative(values, valueToFind);
        assertEquals(-1, index);
    }

    @Test
    @DisplayName("Testing method searchRecursive with valueToFind 3 should return 3")
    void searchRecursive_shouldReturn3() {
        int[] values = {1, 1, 2, 3, 4, 10};
        int valueToFind = 3;
        int index = binarySearch.searchRecursive(values, valueToFind, 0, values.length - 1);
        assertEquals(3, index);
    }

    @Test
    @DisplayName("Testing method searchRecursive with valueToFind 0 should return 0")
    void searchRecursive_shouldReturn0() {
        int[] values = {0, 1, 2, 3, 4, 10, 12, 18, 44};
        int valueToFind = 0;
        int index = binarySearch.searchRecursive(values, valueToFind, 0, values.length - 1);
        assertEquals(0, index);
    }

    @Test
    @DisplayName("Testing method searchRecursive with valueToFind 64 should return 9")
    void searchRecursive_shouldReturn9() {
        int[] values = {1, 1, 2, 3, 4, 10, 10, 13, 55, 64};
        int valueToFind = 64;
        int index = binarySearch.searchRecursive(values, valueToFind, 0, values.length - 1);
        assertEquals(9, index);
    }

    @Test
    @DisplayName("Testing method searchRecursive with valueToFind 0 should return -1")
    void searchRecursive_shouldReturnMinus1() {
        int[] values = {1, 1, 2, 3, 4, 10, 10, 13, 55, 64};
        int valueToFind = 0;
        int index = binarySearch.searchRecursive(values, valueToFind, 0, values.length - 1);
        assertEquals(-1, index);
    }

    @Test
    @DisplayName("Testing method searchRecursive with valueToFind 4 at empty array should return -1")
    void searchRecursiveAtEmptyArray_shouldReturnMinus1() {
        int[] values = {};
        int valueToFind = 4;
        int index = binarySearch.searchRecursive(values, valueToFind, 0, values.length - 1);
        assertEquals(-1, index);
    }
}