package strings;
// Dealing with try catch
public class MockOne {

//    String str= "testtray"
//      Reverse the string and replace t with r
    
    private static void revers(String str) {
        try{
            if(!str.isEmpty()){
                String reversedString = "";
                String[] chars = str.split("");

                for (int i = chars.length - 1; i >= 0; i--){
                    reversedString = reversedString.concat(chars[i]);
                }

                reversedString = reversedString.replaceAll("t", "r");
                System.out.println(reversedString);

            } else {
                System.out.println("String is empty");
                return;
            }


        } catch(Exception e){
            System.out.println("Exception");
        }


    }
    

    public static void main(String[] args){

        revers("");
    }

}
