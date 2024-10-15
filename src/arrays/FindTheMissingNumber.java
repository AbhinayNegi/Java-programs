/*
    Given an array containing n - 1 unique numbers from the range 1 to n, write a function to find the missing number
    in the array.

    Example:
    Input:
    array = [1, 2, 4, 5], n = 5
    Output:
    3
    n represents the total number of elements
    The elements in the array are unique and range from 1 to n.
     n helps calculate the sum of the complete sequence:
     */
package arrays;

public class FindTheMissingNumber {

    private static int findMissingNumbers(int[] array, int n){
        int totalSum = 0;
        if(array.length == n){
            System.out.println("Array has same number of elements as the value of n");
        } else {
            totalSum = n * (n + 1) / 2;

            for(int current : array){
                totalSum -= current;
            }
        }
        return totalSum;
    }

    public static void main(String[] args){
        int[] arr = {1, 2};

        System.out.println(findMissingNumbers(arr, 3));
    }
}
