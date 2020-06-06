package basic.stack;

import java.util.Stack;

public class MyStackTest {

    public static void printStack(Stack<Integer> integerStack){
        System.out.print("My Stack is: ");
        int size = integerStack.size();
        while(size>0){
            Integer current = integerStack.pop();
            size = integerStack.size();
            System.out.print(current.intValue() + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(90);
        myStack.push(45);
        myStack.push(85);
        myStack.push(15);

        printStack(myStack);
    }
}
