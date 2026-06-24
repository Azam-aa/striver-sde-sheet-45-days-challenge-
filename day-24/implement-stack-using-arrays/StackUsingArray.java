public class StackUsingArray {

    int[] stack;
    int top;

    StackUsingArray(int size){

        stack = new int[size];
        top = -1;
    }

    void push(int x){

        stack[++top] = x;
    }

    int pop(){

        return stack[top--];
    }

    int peek(){

        return stack[top];
    }

    public static void main(String[] args){

        StackUsingArray st =
            new StackUsingArray(10);

        st.push(10);
        st.push(20);

        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}