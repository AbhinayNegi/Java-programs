package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratingList {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3));
        ListIterator<Integer> it = list.listIterator();

        Integer i = null;
        while (it.hasNext()) {
            i = it.next();
            if (i == 2) {
                it.set(93); // Replacing the last element returned by next
            }
        }
    }
}
