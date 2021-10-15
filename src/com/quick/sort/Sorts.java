package com.quick.sort;

import java.lang.reflect.Array;

public class Sorts {
    // uprimě namam nejmensi tuseni jak to muze fungovat ale nejak to funguje
    private static int parts(int[] arr, int left, int right, int pivot) {

        while (left <= right) {
            if(arr[left] < pivot) {
                left++;
                return parts(arr, left, right, pivot);
            }
            if (arr[right] > pivot) {
                right--;
                return parts(arr, left, right, pivot);
            }
            if (left <= right) {
                int helper = arr[left];
                arr[left] = arr[right];
                arr[right] = helper;

                left++;
                right--;
            }
        }
        return left ;
    }

    private static void quickSort(int[] arr, int startIndex, int endIndex, int pivotIndex) {
        int pivot = arr[pivotIndex];
        int index = parts(arr, startIndex, endIndex, pivot);

        if (startIndex < index - 1) {
            quickSort(arr, startIndex, index - 1, startIndex);
        }
        if (endIndex > index) {
            quickSort(arr, index, endIndex, index);
        }

    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1, 0);
    }
}
