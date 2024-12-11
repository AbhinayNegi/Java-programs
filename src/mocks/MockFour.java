package mocks;

public class MockFour {

//    Find the second max in array
//    [5, 4 , 56, 4, 44]

    private static int findSecondMax(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;

        for(int current : arr) {

            if(current > max) {
                secondMaxValue = max;
                max = current;
            } else if(current > secondMaxValue && current < max){
                secondMaxValue = current;
            }
        }

        return secondMaxValue;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(findSecondMax(arr));
    }
}
