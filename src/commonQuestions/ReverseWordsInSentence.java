package commonQuestions;

public class ReverseWordsInSentence {

    private static String reverseWords(String sentence) {

        if(sentence == null || sentence.isEmpty()) {
            throw new IllegalArgumentException("String is empty or null");
        }

        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        StringBuilder reversedWord;

        for(String word : words) {

            reversedWord = new StringBuilder();
            for(int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {

        String sentence = "Hello World";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}
