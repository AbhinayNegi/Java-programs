package arrays;

public class MultiDimensionArray {

    public static void main(String[] args){

        int[][] arrays = new int[3][3];

        for (int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                arrays[i][j] = i * j;
            }
        }

        for (int i = 0; i < arrays.length; i++){
            for(int j = 0; j < arrays[i].length; j++){
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }
    }

}
