package strings;

public class FindNumberOfSubStringOccurrence {

    public static int findOccurrence(String str, String sub){

        int startIndex = 0;
        int occurrence =  0;
        int index = str.indexOf(sub, startIndex);

        // Index of return the index of first occurrence of the substring, if it returns -1 that means the substring does
        // not exist in the string. startIndex argument will tell index of method from where it should start searching for
        // the substring in the given string. Once we find the first occurrence of substring we will increment occurrence
        // variable and also update the startIndex variable so that next time we will search another occurrence of substring
        // after the last character of the previously found substring
        while(index != -1){
            occurrence++;
            startIndex = index + sub.length();

            // Find the next occurrence of the substring starting from the updated startIndex
            index = str.indexOf(sub, startIndex);
        }

        return occurrence;
    }

    public static void main(String[] args){

        String str = "Hello world world";
        String sub = "world";

        int occurrence = findOccurrence(str, sub);
        System.out.println("Occurrence " + occurrence);
    }
}
