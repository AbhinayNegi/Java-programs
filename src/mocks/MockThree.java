package mocks;

import java.util.HashMap;
import java.util.Map;

public class MockThree {

//    [1,2,3,2,3,3,4,5,1,7,7,7,7,8]

    private static Map<Integer, Integer> countOccurances(int[] arr) {

        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array either null or empty");
        }

        Map<Integer, Integer> mapOcc = new HashMap<>();

        for (int current : arr) {
            mapOcc.put(current, mapOcc.getOrDefault(current, 0) + 1);
        }

        return mapOcc;
    }

    private static void findEvenOdd(Map<Integer, Integer> mapOcc) {

        for(Map.Entry<Integer, Integer> entry : mapOcc.entrySet()) {

            int value = entry.getValue();

            if( value % 2 == 0) {
                System.out.println("Even value " + entry.getKey());
            } else {
                System.out.println("Odd value " + entry.getKey());
            }
        }
    }

    public static void main(String[] args){


        int[] arr = {1,2,3,2,3,3,4,5,1,7,7,7,7,8};

        Map<Integer, Integer> map = countOccurances(arr);
        findEvenOdd(map);
    }

}
