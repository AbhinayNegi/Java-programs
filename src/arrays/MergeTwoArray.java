package arrays;

import java.util.Arrays;

public class MergeTwoArray {

    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) throws IllegalArgumentException {

        if(arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0){

            System.out.println("One of the array is null or empty");
            return null;
        }

        if(isSorted(arr1)){
            Arrays.sort(arr1);
        }
        if(isSorted(arr2)){
            Arrays.sort(arr2);
        }

        int i = 0, j = 0, mergedArrayCounter = 0;
        int[] mergedArray = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                mergedArray[mergedArrayCounter++] = arr1[i++];
            }else {
                mergedArray[mergedArrayCounter++] = arr2[j++];
            }
        }

        while(i < arr1.length){
            mergedArray[mergedArrayCounter++] = arr1[i++];
        }

        while(j < arr2.length){
            mergedArray[mergedArrayCounter++] = arr2[j++];
        }

        return mergedArray;
    }

    private static boolean isSorted(int[] arr){

        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] > arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr1 = {23, 34, 3 ,7, 9};
        int[] arr2 = {99, 32, 7};

        System.out.println(Arrays.toString(mergeTwoSortedArray(arr1, arr2)));
    }
}
