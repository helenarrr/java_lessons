package ru.geekbrains;

public class sortCollections {
    public static void quickSorting(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            quickSorting(arr, from, divideIndex - 1);
            quickSorting(arr, divideIndex, to);
        }
    }

        public static int partition(int[] arr, int from, int to) { // от 0 до 9
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex ++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex --;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex ++;
                rightIndex --;
            }
        }
        return leftIndex;

}


    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}