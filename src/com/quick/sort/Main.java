package com.quick.sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,6,5,1,3,4,18,20,1,3,4,6,6,};
        Sorts.quickSort(arr);

        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println(" ");
    }
}
