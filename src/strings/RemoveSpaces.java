package strings;

public class RemoveSpaces {

    public static void main(String[] args){

        String str = " Hello ";
        System.out.println("Before trimming " + str);

        str = str.trim();
        System.out.println("After trimming " + str);
    }
}
