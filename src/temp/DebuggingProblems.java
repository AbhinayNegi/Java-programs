package temp;

public class DebuggingProblems {

    public static void reverseWordsOptimized(char[] chars) {
        // Reverse the entire sentence
        reverse(chars, 0, chars.length - 1);

        // Reverse each word
        int wordStart = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, wordStart, i - 1);
                wordStart = i + 1;
            }
        }

        // Reverse the last word
        reverse(chars, wordStart, chars.length - 1);
    }

    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        char[] chars = sentence.toCharArray();
        reverseWordsOptimized(chars);
        System.out.println("Reversed Sentence: " + new String(chars));
    }
}
