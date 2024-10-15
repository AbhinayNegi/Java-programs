package arrays;

import java.util.Arrays;

public class SearchingSortingArray {

    private static int searchElement(int[] arr, int key){
        try {
            if(arr.length == 0){
                System.out.println("The array is empty");
                return -1;
            }
            Arrays.sort(arr);
            int index = Arrays.binarySearch(arr, key);
            if(index < 0){
                return -1;
            }else {
                return index;
            }
        } catch (Exception e){
            System.out.println("Some exception");
        }
        return -1;
    }

    public static void main(String[] args){

        int[] numbers = {5, 3, 8, 1, 2};

//        Arrays.sort(numbers);
//
//        for(int n : numbers){
//            System.out.println(n);
//        }

        System.out.println(searchElement(new int[0], 2));
    }

}
