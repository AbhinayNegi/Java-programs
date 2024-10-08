package strings;

public class ReverseWord {

    public static void main(String[] args){

        String s1 = "This is a test";
        StringBuilder reversedString = new StringBuilder();

        String[] words = s1.split(" ");

        for(String currentWord: words){
            reversedString.append(new StringBuilder(currentWord).reverse());
            reversedString.append(" ");
        }

        System.out.println(reversedString.toString().trim());
    }

}
