package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingSearching {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(111);
        list.add(930);

        Collections.sort(list);
        System.out.println(list.indexOf(2));

        for(Integer i : list){
            System.out.println(i);
        }
    }
}
