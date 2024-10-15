package arrays;

import java.util.Arrays;

public class CreatingCopyBackup {

    private static int[] createArrayCopy(int[] originalArray){
        try{
            if(originalArray == null || originalArray.length == 0){
                System.out.println("Array is empty or null");
                return null;
            }

            return Arrays.copyOf(originalArray, originalArray.length);
        } catch (Exception e) {
            System.out.println("Some exception");
            return null;
        }
    }

    public static void main(String[] args){

        int[] originalArray = {1, 2, 3, 4};

        int[] newArray = createArrayCopy(originalArray);

        System.out.println(Arrays.toString(newArray));
    }
}
