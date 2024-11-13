package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateWithoutSet {

    public static void removeDuplicate(List<Integer> items){

        for(int i = 0; i < items.size(); i++)  {
            for(int j = i + 1; j < items.size(); j++) {
                while(items.get(i).intValue() == items.get(j).intValue()){
                    items.remove(j);
                }
            }
        }
        for (Integer i : items){
            System.out.println(i.intValue());
        }
    }

    public static void main(String[] args){
        removeDuplicate(new ArrayList<>(Arrays.asList(23, 2, 2, 3, 23, 3)));
    }
}
