package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreatingList {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Xrn");
        list.add("Banana");
        list.add("Grapes");
        list.add("Mango");

        list.add(0, "Pineapple"); // Add an element at 0th index and shift rest of the element to right

        for(String s : list){
            System.out.println(s);
        }

        list.set(0, "No");

        Collections.sort(list);
        for(String s : list){
            System.out.println(s);
        }
    }
}
