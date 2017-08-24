package technicalProblems.stacks;

import java.util.Stack;

public class GetMinStack {
    Stack<Integer> stack = new Stack<>();
    Integer minElement;

    void getMin() {
        if (stack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Min Element in stack is "+minElement);
    }

    void peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Integer top = stack.peek();

        System.out.print("Top Most Element is: ");
        if (top < minElement)
            System.out.println(minElement);
        else
            System.out.println(top);
    }

    void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Element popped: ");

        Integer top = stack.pop();

        if (top < minElement) {
            System.out.println(minElement);
            minElement = 2 * minElement - top;
        }
        else {
            System.out.println(top);
        }
    }

    void push(Integer x) {
        if (stack.isEmpty()) {
            minElement = x;
            stack.push(x);
            System.out.println("Number pushed: "+x);
            return;
        }

        if (x < minElement) {
            stack.push(2*x - minElement);
            minElement = x;
        }

        else {
            stack.push(x);
        }

        System.out.println("Number pushed: "+x);
    }
}
