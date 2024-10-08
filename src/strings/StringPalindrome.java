package strings;

public class StringPalindrome {

    public static boolean isPalindrome(String str){

        str = str.toLowerCase();

        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        while(leftIndex < (str.length() / 2)) {

            if(str.charAt(leftIndex) != str.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }

        return true;
    }

    public static void main(String[] args){

        String str = "Madam";

        System.out.println(isPalindrome(str));
    }

}
