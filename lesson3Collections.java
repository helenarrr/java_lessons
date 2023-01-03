package ru.geekbrains;

import java.util.Arrays;

public class lesson3Collections {
    public static void main(String[] args) {
        int[] array = new int[] {350, 2, 45, 45, 6, 90, 5, 10, 1, 11};
        sortCollections.quickSorting(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
