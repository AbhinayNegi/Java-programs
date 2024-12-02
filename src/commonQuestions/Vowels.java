package commonQuestions;

/*
* Write a program to count the number of vowels in a given string. The program should handle both uppercase and
* lowercase letters and ignore any non-alphabetic characters. Additionally, provide functionality to read the string
* from a file if required.
 */

import java.util.HashMap;
import java.util.HashSet;

/*
    * First approach is that i can have a HashSet to store the vowels characters as the key. Then we can iterate through
    * the string and check if current character exists as a key in the hashset, if true we will increase the counter for
    * vowels counter
 */
public class Vowels {

    private static int countVowelsHashMap(String str) {

        if(str == null ) {
            throw new IllegalArgumentException("String is null");
        }
        if(str.isEmpty()) {
            return 0;
        }

        HashMap<Character, Integer> vowelsLetters = new HashMap<>();
        vowelsLetters.put('a', null);
        vowelsLetters.put('e', null);
        vowelsLetters.put('i', null);
        vowelsLetters.put('o', null);
        vowelsLetters.put('u', null);

        int counter = 0;

        str = str.toLowerCase();
        str = removeNonAlphabetCharacters(str);

        for (char c : str.toCharArray()) {
            if(vowelsLetters.containsKey(c)) {
                counter++;
            }
        }

        return counter;
    }

    private static int countVowelsHashSet(String str) {
//      Use hashset for better space management
        if(str == null ) {
            throw new IllegalArgumentException("String is null");
        }
        if(str.isEmpty()) {
            return 0;
        }

        HashSet<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');

        int counter = 0;

        str = str.toLowerCase();
        str = removeNonAlphabetCharacters(str);

        for (char c : str.toCharArray()) {
            if(vowelSet.contains(c)) {
                counter++;
            }
        }

        return counter;
    }

    private static String removeNonAlphabetCharacters(String str) {

        if(str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String is null or empty");
        }

        return str.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args) {

        String s1 = "aBHINAY123!!!";

        System.out.println(countVowelsHashSet(s1));
    }
}
