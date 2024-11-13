package map;

import java.util.HashMap;
import java.util.Map;

public class NullValues {

    public static void main(String[] args){

        Map<String, Integer> map = new HashMap<>();

        map.put(null, 12);
        map.put("Opo", null);
        map.put("Brim", null);

        System.out.println(map.get(null));
        System.out.println(map.get("Brim"));

        // Removing null values, this removeIf method applies on each key value pair set
        map.entrySet().removeIf(entry -> entry.getValue() == null);

        // Replacing null values with default value, it replaces each key value pair with give function value
        map.replaceAll((key, value) -> {
            if(value == null)
                return 0;
            else
                return value;
        });

        // Checking if contains null key
        if(map.containsKey(null))
            System.out.println("Contains null values");

        System.out.println("Updated map: " + map);
    }
}
