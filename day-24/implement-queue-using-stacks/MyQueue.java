import java.util.*;

public class MyQueue {

    Stack<Integer> input =
        new Stack<>();

    Stack<Integer> output =
        new Stack<>();

    void push(int x){

        input.push(x);
    }

    int peek(){

        if(output.isEmpty()){

            while(!input.isEmpty()){

                output.push(
                    input.pop()
                );
            }
        }

        return output.peek();
    }

    int pop(){

        peek();

        return output.pop();
    }

    public static void main(String[] args){

        MyQueue q =
            new MyQueue();

        q.push(10);
        q.push(20);

        System.out.println(
            q.pop()
        );
    }
}