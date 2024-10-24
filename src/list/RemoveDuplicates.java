package list;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args){
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        Set<Integer> set = new LinkedHashSet<>(items);

        items = new ArrayList<>(set);

        for(Integer i : items) {
            System.out.println(i);
        }

        Collections.reverse(items);

        System.out.println("After reverse");
        for(Integer i : items) {
            System.out.println(i);
        }
    }
}
