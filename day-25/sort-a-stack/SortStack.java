import java.util.*;

public class SortStack {

    static void sortedInsert(
            Stack<Integer> stack,
            int x) {

        if(stack.isEmpty()
            || stack.peek() <= x) {

            stack.push(x);
            return;
        }

        int top = stack.pop();

        sortedInsert(
            stack,
            x
        );

        stack.push(top);
    }

    static void sortStack(
            Stack<Integer> stack) {

        if(stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        sortStack(stack);

        sortedInsert(
            stack,
            top
        );
    }

    public static void main(String[] args) {

        Stack<Integer> stack =
                new Stack<>();

        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println(
            "Before : " + stack
        );

        sortStack(stack);

        System.out.println(
            "After  : " + stack
        );
    }
}