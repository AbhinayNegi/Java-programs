package arrays;

import java.util.*;

public class FindDuplicateElements {

    private static List<Integer> findDuplicate(int[] array){

        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int current : array){

            if(uniqueElements.contains(current)){
                duplicates.add(current);
            } else {
                uniqueElements.add(current);
            }
        }

        return duplicates;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 2, 32, 32, 78, 34, 33, 33};

        System.out.println(Arrays.toString(findDuplicate(arr).toArray()));
    }
}
