package strings;

public class StringClasses {

    public static void main(String[] args){

        // Good for scenarios where string content are not changing frequent and requires thread safety as well
        String s = "Hello world";
        System.out.println(s + " Hello");

        // Better than String class in terms of performance, it is mutable and its methods are synchronized making it
        // thread safe
        StringBuffer s2 = new StringBuffer("Hello world");
        System.out.println(s2.append(" `World "));

        // Better than StringBuffer and String in terms of performance, but it is designed for multithreaded environment
        StringBuilder s3 = new StringBuilder("Hello world");
        System.out.println(s3.append(" `World "));
    }
}
