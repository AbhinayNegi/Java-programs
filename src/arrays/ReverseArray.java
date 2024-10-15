package arrays;

import java.util.Arrays;

public class ReverseArray {

    private static int[] reverseArray(int[] array){
        try{
            if(array == null || array.length == 0){
                System.out.println("Array is either null or empty");
                return null;
            }
        } catch (Exception e) {
            System.out.println("Some exception");
        }


        int leftIndex = 0, rightIndex = array.length - 1;
        int temp = 0, length = array.length;
//        [12, 45, 32]
        while (leftIndex < (length / 2)) {
            temp = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }

        return array;
    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
