package strings;

public class SubStringFind {

    public static boolean isContains(String str, String sub){

        return str.contains(sub);
    }

    public static void main(String[] args){

        String str = "Hello world";
        String sub = "world";

        boolean result = isContains(str, sub);

        System.out.println(result);
    }
}
