package commonQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean isAnagram(String fString, String sString) {

        if(fString == null || sString == null) {
            throw new IllegalArgumentException("String is null");
        }

        if(fString.isEmpty() || sString.isEmpty()) {
            throw new IllegalArgumentException("String is empty");
        }

        fString = removeSpaces(fString);
        fString = removeSpecialCharacters(fString);
        sString = removeSpaces(sString);
        sString = removeSpecialCharacters(sString);

        fString = fString.toLowerCase();
        sString = sString.toLowerCase();

        if(fString.length() != sString.length()) {
            return false;
        }

        HashMap<Character, Integer> fMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        for(char current : fString.toCharArray()) {
            fMap.put(current, fMap.getOrDefault(current, 0) + 1);
        }
        for(char current : sString.toCharArray()) {
            sMap.put(current, sMap.getOrDefault(current, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : fMap.entrySet()) {
            char letter = entry.getKey();

            if(sMap.containsKey(letter)) {
                int firstStringOccurrence = fMap.get(letter);
                int secondStringOccurrence = sMap.get(letter);

                if(firstStringOccurrence != secondStringOccurrence) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static String removeSpaces(String str) {

        return str.replaceAll("\\s", "");
    }

    public static String removeSpecialCharacters(String str) {

        return str.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args){
        String[][] anagramInputs = {
                {"a gentleman", "elegant man!"},
                {"Listen", "Silent"},
                {"james", "jimmi"},
                {"", ""}
        };

        for (String[] currentRow : anagramInputs) {
            boolean result = isAnagram(currentRow[0], currentRow[1]);
            System.out.println(currentRow[0] + " and " + currentRow[1] + " " + result);
        }
    }
}

// Follow-up questions: 1. How would you handle cases when there are special characters in the string or both string
// contains different cases of characters
// I can use replaceAll("//s", "") this will replace any kind of whitespace from the string, and then we can proceed
// For removing special characters and keeping only letters we can use replaceAll with regex [^a-zA-Z]