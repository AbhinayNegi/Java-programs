package strings;

public class StringPool {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // Comparing the reference of string it should return true since both has same string
        System.out.println(s1 == s2);

        // One is string literal and another is string object,
        // string object will always be created new even if identical string exist already
        System.out.println(s1 == s3);
    }

}
