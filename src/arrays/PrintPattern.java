package arrays;

public class PrintPattern {

    private static void printPyramid() {

        int rows = 5;

        for(int i = 1; i <= rows; i++){

            // Print space by subtracting i from rows this will give use how many spaces to add in current row

            for(int j = 0; j < rows-i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){

        printPyramid();
    }
}
