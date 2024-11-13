package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingMap {

    public static void usingEntrySet(Map<String, Integer> map) {

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void usingKeySet(Map<String, Integer> map) {

        for (String key : map.keySet()){
            System.out.println(map.get(key));
        }
    }

    public static void usingValues(Map<String, Integer> map) {

        System.out.println("Using values");
        for (Integer value : map.values()){
            System.out.println(value);
        }
    }

    public static void usingForEachLambda(Map<String, Integer> map) {

        System.out.println("Using for each lambda");

        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }

    public static void usingIterator(Map<String, Integer> map) {

        // Getting the entry set and then its iterator so that we can iterator over entry set of a map
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next(); // Getting the first entry set from the entry set iterator
            System.out.println(entry.getValue());

            if(entry.getValue() == 27) {
                iterator.remove();
            }
        }

        System.out.println("After removing from using iterator method");

        iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next(); // Getting the first entry set from the entry set iterator
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args){

        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 23);
        map.put("Bob", 27);
        map.put("Charlie", 31);

        usingEntrySet(map);
        usingKeySet(map);
        usingValues(map);
        usingForEachLambda(map);
        usingIterator(map);
    }
}
