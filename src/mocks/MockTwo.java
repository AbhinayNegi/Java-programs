package mocks;

import java.util.LinkedHashMap;
import java.util.Map;

public class MockTwo {

    public static int findFirstNonDuplicate(int[] arr) {
        /**
         * The reason for using LinkedHashMap is that it maintains the insertion order, which helps ensure that we
         * find the first non-duplicate element in the array. In contrast, a regular HashMap does not maintain order,
         * so it wouldn't guarantee that the first non-duplicate element is correctly identified.
         */
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int value = 0;

        for (int current : arr){
            // getOrDefault method will return if key value exists otherwise return default value 0.
            // And we will add value with 1 and put it in the map with the current index value of array
            // We are using array value as key and associating count value which represent how many times the value in
            // the array occurred.
            map.put(current, map.getOrDefault(current, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                value = entry.getKey();
                break;
            }
        }

        return value;
    }

    public static void main(String[] args){

        int[] arr = {4, 5, 1, 2, 0, 4, 2, 5};

        System.out.println(findFirstNonDuplicate(arr));
    }
}
