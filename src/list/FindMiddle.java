package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMiddle {

    public static int findMiddleValue(List<Integer> items){

        if(items.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }

        int slowPointer = 0;
        int fastPointer = 0;

        while(fastPointer < items.size() - 1){
            slowPointer++;
            fastPointer += 2;
        }

        return items.get(slowPointer);
    }

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 4, 9));

        System.out.println(findMiddleValue(list));
    }
}
