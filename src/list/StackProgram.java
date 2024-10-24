package list;

import java.util.Stack;

public class StackProgram {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(44);
        stack.push(733);

        for(Integer i : stack){
            System.out.println(i);
        }

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());

        stack.add(3, 23);

        for(Integer i : stack){
            System.out.println(i);
        }
    }
}
