package map;

import java.util.HashMap;

public class AgeRecord {

    public static void main(String[] args){

        HashMap<String, Integer> personAge = new HashMap<>();

        personAge.put("Rohan", 12);
        personAge.put("James", 43);
        personAge.put("Jane", 11);

        System.out.println(personAge.get("Rohan"));

        System.out.println("Value removed: " + personAge.remove("Jane"));

        System.out.println("Does Rohan age exist in the map: " + personAge.containsKey("Rohan"));

        System.out.println("Does anyone with the age 43 exist in the map: " + personAge.containsValue(43));

        System.out.println("Total number of people exist in the age map: " + personAge.size());


    }
}
