package commonQuestions;

public class FindFirstAndLastOccurrence {

    private static void findFirstAndLast(int[] arr, int target) {

        boolean foundFirst = false;
        int firstFoundIndex = -1;
        int lastFoundIndex = -1;

        for(int i = 0; i < arr.length; i++) {

            if(!foundFirst) {
                if(arr[i] == target) {
                    foundFirst = true;
                    firstFoundIndex = i;
                }
            } else {
                if(arr[i] == target){
                    lastFoundIndex = i;
                }
            }

        }

        if(!foundFirst) {
            System.out.println("Target number does not exist in the array");
        } else if(lastFoundIndex == -1){
            System.out.println("First index: " + firstFoundIndex + " Last index: " + firstFoundIndex);
        } else {
            System.out.println("First index: " + firstFoundIndex + " Last index: " + lastFoundIndex);
        }

    }

    public static void main(String[] args){

        int[] arr = {1, 3, 5, 7, 9, 9, 9};

        findFirstAndLast(arr, 9);
    }
}
