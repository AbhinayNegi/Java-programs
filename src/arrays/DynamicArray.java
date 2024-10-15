package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(34);

        // Converting array to array list type

        Integer[] persons = {1, 2, 3, 4};

        List<Integer> newList = Arrays.asList(persons);

        for(Integer i : newList){
            System.out.println(i);
        }
    }
}
