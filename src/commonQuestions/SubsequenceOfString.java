package commonQuestions;

public class SubsequenceOfString {

    private static boolean isSubsequenceOfString(String sub, String mainString) {

        if(sub == null || mainString == null || sub.isEmpty() || mainString.isEmpty()) {
            throw new IllegalArgumentException("Strings are empty or null");
        }

        if(mainString.length() < sub.length()) {
            throw new IllegalArgumentException("The main string is smaller than the sub string");
        }

        int subStringIndex =0;

        for(char currentChar : mainString.toCharArray()) {

            if(currentChar == sub.charAt(subStringIndex)) {
                subStringIndex++;
                if(subStringIndex == sub.length()) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Array of test cases: Each test case is a pair of strings [subsequence, main string]
        String[][] testCases = {
                {"abc", "aebdc"},         // True: "abc" is a subsequence of "aebdc"
                {"axc", "ahbgdc"},        // False: "axc" is not a subsequence of "ahbgdc"
                {"", "geeksforgeeks"},    // True: Empty string is a subsequence of any string
                {"geeks", ""},            // False: Non-empty string cannot be a subsequence of an empty string
                {"gks", "geeksforgeeks"}, // True: "gks" is a subsequence of "geeksforgeeks"
                {"123", "112233"},        // True: "123" is a subsequence of "112233"
                {"@#", "@a#b@c#"},        // True: "@#" is a subsequence of "@a#b@c#"
                {"abcd", "abdc"},         // False: Characters are out of order
                {"aabb", "ababab"},       // True: "aabb" appears in order in "ababab"
                {"abab", "aabb"},         // False: "abab" cannot be formed from "aabb"
                {"gksr%ek@@@", "geeksforge%eks@@@"}, // True: Special characters match
        };

        // Iterate through test cases
        for (String[] testCase : testCases) {
            String sub = testCase[0];
            String main = testCase[1];
            try {
                boolean result = isSubsequenceOfString(sub, main);
                System.out.printf("Subsequence: \"%s\", Main String: \"%s\" => Result: %b%n", sub, main, result);
            } catch (IllegalArgumentException e) {
                System.err.println("Subsequence: " + sub + " Main string: " + main + " Result => " + e.getMessage());
            }

        }
    }
}
