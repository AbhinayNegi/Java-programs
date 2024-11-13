package map;

import java.util.HashMap;
import java.util.Map;

public class ComparingMap {

    public static void main(String[] args){

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Alice", 23);
        map1.put("Bob", 27);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Alice", 23);
        map2.put("Bob", 27);

        System.out.println("Is map equal : " + map1.equals(map2));
    }
}
