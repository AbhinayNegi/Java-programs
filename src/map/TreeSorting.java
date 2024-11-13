package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeSorting {
    /*
    *   A TreeMap is another type of map it stores data in key value pairs but also automatically sorts keys in natural
        order (like alphabetical order for strings or numerical order for numbers).
     */
    public static void main(String[] args){

        Map<String, Integer> data = new TreeMap<>();
        data.put("Brave", 90);
        data.put("Zebra", 30);
        data.put("Abagail", 12);

        System.out.println(data);
    }
}
