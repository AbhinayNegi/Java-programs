package strings;

public class SubDomainString {

    public static String getSubDomain(String url){

        int start = url.indexOf("://") + 3;
        int end = url.indexOf(".");

        return url.substring(start, end);
    }

    public static void main(String[] args){

        String url = "https://staging.blog.com";

        System.out.println(getSubDomain(url));
    }

}
