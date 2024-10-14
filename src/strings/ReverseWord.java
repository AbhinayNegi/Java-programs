package strings;

public class ReverseWord {

    public static void main(String[] args){

        String s1 = "This is a test";
        StringBuilder reversedString = new StringBuilder();

//        We are splitting the string in spaces because that way it will become easier to work on one word at a time
        String[] words = s1.split(" ");

        for(String currentWord: words){
            reversedString.append(new StringBuilder(currentWord).reverse());
            reversedString.append(" ");
        }

        System.out.println(reversedString.toString().trim());
    }

}
