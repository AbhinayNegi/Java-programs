package strings;

public class ImmutabilityStringInAutomation {

    private static final String BASE_URL = "https://www.mysite.com";

    public static void main(String[] args){

        System.out.println("Home page url: " + BASE_URL);

        String dashboardPage = BASE_URL + "/dashboard";
        System.out.println("Home page url: " + dashboardPage);

        String profilePage = BASE_URL + "/profile";
        System.out.println("Profile page url: " + profilePage);
    }
}
