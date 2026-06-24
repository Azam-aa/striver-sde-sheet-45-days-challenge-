import java.util.*;

public class MyStack {

    Queue<Integer> q;

    MyStack(){

        q = new LinkedList<>();
    }

    void push(int x){

        q.offer(x);

        for(int i=0;
            i<q.size()-1;
            i++){

            q.offer(q.poll());
        }
    }

    int pop(){

        return q.poll();
    }

    int top(){

        return q.peek();
    }

    public static void main(String[] args){

        MyStack st =
            new MyStack();

        st.push(10);
        st.push(20);

        System.out.println(
            st.pop()
        );
    }
}