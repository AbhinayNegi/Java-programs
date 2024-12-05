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

    private static Peak findSinglePeakWithoutHashMap(int[] arr) {

        if(arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int peakIndex = -1;
        int peakValue = Integer.MIN_VALUE;

        // To be able to have a peak the current value must be greater than its previous and next value which is only
        // possible if the array contains more than 2 elements. Having less than 3 elements does not help calculating the
        // peak
        if (arr.length < 3) {
            return null;
        }

        for (int i = 1; i < arr.length - 1; i++) {

            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {

                if(arr[i] > peakValue) {
                    peakIndex = i;
                    peakValue = arr[i];
                }
            }
        }

        if(peakIndex == -1) {
            return null;
        }
        return new Peak(peakIndex, peakValue);
    }

    public static void main(String[] args){
        Peak peakDetails;
        int[][] testCases = {
                {5},
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {2, 2, 2, 2},
                null,
                {1, 3, 2, 4, 3, 5, 1},
                {1, 2, 3, 2, 1}
        };

        for(int[] current : testCases) {
            try {
                peakDetails = findSinglePeakWithoutHashMap(current);

                if(peakDetails != null) {
                    System.out.println(peakDetails.peakIndex + " " + peakDetails.peakValue);
                } else {
                    System.out.println("No Peak exists");
                }
            }catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }

        }
    }
}

class Peak {
    int peakIndex = -1;
    int peakValue = Integer.MIN_VALUE;

    public Peak(int peakIndex, int peakValue) {
        this.peakIndex = peakIndex;
        this.peakValue = peakValue;
    }
}
