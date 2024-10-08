package strings;

public class StringFormatting {

    public static void main(String[] args){
        String name = "Den";
        int age = 12;
        float weight = 50.234f;

        System.out.printf("My name is %s and my age is %d and my weight is %.2f %n", name, age, weight);

        String display = String.format("%-10s %-10d %.2f", name,age,weight);

        System.out.printf(display);
    }

}
