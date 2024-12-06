package commonQuestions;

import java.util.HashSet;

public class FindFirstRepeatingElement {

    private static Integer findFirstRepeatingElement(int[] arr) {

        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is either null or empty");
        }

        HashSet<Integer> uniqueValues = new HashSet<>();

        for(int current : arr) {
            if(!uniqueValues.contains(current)) {
                uniqueValues.add(current);
            } else {
                return current;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Integer result = findFirstRepeatingElement(new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3});

        if(result != null) {
            System.out.println(result);
        } else {
            System.out.println("No repeating value");
        }
    }
}
