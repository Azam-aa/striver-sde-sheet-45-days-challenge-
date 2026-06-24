public class QueueUsingArray {

    int[] queue;

    int front;
    int rear;

    QueueUsingArray(int size){

        queue = new int[size];

        front = 0;
        rear = 0;
    }

    void enqueue(int x){

        queue[rear++] = x;
    }

    int dequeue(){

        return queue[front++];
    }

    public static void main(String[] args){

        QueueUsingArray q =
            new QueueUsingArray(10);

        q.enqueue(10);
        q.enqueue(20);

        System.out.println(
            q.dequeue()
        );
    }
}