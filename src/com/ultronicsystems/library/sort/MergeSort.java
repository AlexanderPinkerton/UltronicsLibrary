package com.ultronicsystems.library.sort;

/**
 * Created by Ace on 1/31/15.
 */


public class MergeSort {

    public static void mergeSort(int[] array, int start, int end){

        int[] leftArray = new int[array.length/2];
        int[] rightArray = new int[array.length%2];

        if(array.length != 1) {

            for (int i = 0; i < array.length / 2; i++) {
                leftArray[i] = array[i];
            }
            for (int i = 0; i < array.length % 2; i++) {
                rightArray[i] = array[i];
            }


            mergeSort(leftArray,leftArray[0],leftArray.length-1);
            mergeSort(rightArray,rightArray[0],rightArray.length-1);
            merge(array,leftArray,rightArray);


        }




    }

    public static void merge(int[] array, int[] start, int[] end){

    }



}
