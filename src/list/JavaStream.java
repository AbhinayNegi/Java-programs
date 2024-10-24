package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {

    public static List<Integer> getEvenNumbers(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        return list.stream().filter(n -> n % 2 == 0).toList();
    }

    public static List<Integer> mulitplyData(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        return list.stream().map(n -> n * 2).toList();
    }

    public static int sumOfList(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        // It takes initial value of accumulator, then (a, b) where a is accumulated result so far and b is current element
        return list.stream().reduce(0, (a, b) -> a + b);
    }

    public static List<String> convertUpperCase(List<String> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        return list.stream().map(n -> n.toUpperCase()).toList();
    }

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> alpha = Arrays.asList("abhinay", "singh", "negi");

        System.out.println(getEvenNumbers(list));

        System.out.println(mulitplyData(list));

        System.out.println(sumOfList(list));

        System.out.println(convertUpperCase(alpha));
    }
}
