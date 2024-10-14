package arrays;

import java.util.Arrays;

public class AddingAndRemovingElements {

    public static void main(String[] args){

        int[] originalArray = {1,2,3};

        int newElement = 4;

        int[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);

        newArray[newArray.length - 1] = newElement;

        System.out.println(Arrays.toString(newArray));
    }
}
