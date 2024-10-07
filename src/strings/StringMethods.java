package strings;

public class StringMethods {

    public static void print(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args){

        String s1 = "Hello";
        String s2 = s1.concat(" World");
        print(s2);

        String s3 = "Welcome to the Java programming";
        print(String.valueOf(s3.charAt(4)));

        String s4 = "ABCD";
        print(String.valueOf(s4.equalsIgnoreCase("abcd")));
        print("Length: " + s4.length());

        // Replace all occurrence of old character with new character
        String number = "38494003948";
        print(number.replace('0', '5'));

        String s5 = "Hello world is good";
        print(s5.substring(4));

        String upper = "ABSCONDER";
        print(upper.toLowerCase());

        String lower = "absconder";
        print(upper.toUpperCase());

        print(lower.toString());
    }
}
