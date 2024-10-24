package list;

import java.util.LinkedList;

public class StackLinkedList {

    public static void main(String[] args){

        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(1);
        stack.push(3);
        stack.push(43);

        System.out.println(stack);
    }
}
