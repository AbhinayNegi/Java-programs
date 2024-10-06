package strings;

public class StringImmutability {

    public static void main(String[] args){
        String originalString = "Hello";
        System.out.println("Original string: " + originalString);

        String modifiedString = originalString.concat(" World");
        System.out.println("Modified string: " + modifiedString);

        System.out.println("Original string remains unchanged : " + originalString);
    }

}
