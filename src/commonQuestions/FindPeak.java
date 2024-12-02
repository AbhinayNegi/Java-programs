package commonQuestions;

/*
    * Given an array of integers that first increases and then decreases, write a program to find the index of the peak
    * element (the element where the increase stops, and the decrease starts).
    * arr = [0, 1, 2, 3, 2, 1]. The element is: 3
    * Questions:
	• Can there be only one peak or multiple peak. And do we need to return highest peak or every peak
	• Can array strictly be increasing or decreasing
Can array be flat where there are no peaks
*/

import java.util.HashMap;

public class FindPeak {

    private static HashMap<Integer, Integer> findPeak(int[] arr) {

        HashMap<Integer, Integer> peakInfo = new HashMap<>();
        boolean foundPeak = false;
        int highestPeakIndexSoFar = -1;


        for (int i = 1; i < arr.length; i++) {

            // When there can be multiple peak, and we have to find the highest peak only
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                // If peak info hashmap is empty or we haven't recorded any peaks
                if(peakInfo.isEmpty()) {
                    highestPeakIndexSoFar = i;
                    peakInfo.put(highestPeakIndexSoFar, arr[i]);
                } else {
                    // If current peak is higher than the previously recorded peak then remove the lower peak from hashmap and add the highest one
                    if(arr[i] > peakInfo.get(highestPeakIndexSoFar)) {
                        peakInfo.remove(highestPeakIndexSoFar);
                        highestPeakIndexSoFar = i;
                        peakInfo.put(highestPeakIndexSoFar, arr[i]);
                    }
                }

            }

        }

        return peakInfo;
    }

    public static void main(String[] args){

        int[] arr = {1, 3, 2, 4, 3, 5, 1};

        System.out.println(findPeak(arr));
    }
}
