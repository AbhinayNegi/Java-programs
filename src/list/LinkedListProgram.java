package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {

    public static void main(String[] args){

        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(33);
        list.add(9);

        Collections.sort(list);
        for(Integer i : list){
            System.out.println(i);
        }
    }
}
