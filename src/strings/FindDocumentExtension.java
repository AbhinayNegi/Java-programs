package strings;

public class FindDocumentExtension {

    public static String getFileExtension(String fileName){

        int start = fileName.lastIndexOf('.');

        return fileName.substring(start);
    }

    public static void main(String[] args){

        String file = "user.txt";

        System.out.println(getFileExtension(file));
    }


}
