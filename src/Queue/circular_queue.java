package Queue;

import java.util.Arrays;

public class circular_queue {
    int front;
    int rear;
    int[] arr;
    int size;
    circular_queue(int n){
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    public boolean isfull(){
        return (rear+1)%size == front;
    }
    public boolean isempty(){
        return  front ==-1 && rear == -1;
    }
    public void add(int data){
        //check is the queue is full
        if(isfull()){
            System.out.println("queue is full");
            return;
        }
        //this is updation for first element
        if(front == -1){
            front = 0;
        }
        //adding elements
        rear = (rear+1) % size;
        arr[rear] = data;
    }
    public int remove(){
        if(isempty()){
            System.out.println("queue is empty");
            return -1;
        }
        int removed = arr[front];
        if(front == rear){
            front = rear = -1;
        }
        else {
            front = (front+1) % size;
        }
        return removed;
    }

    public void display() {

        if (isempty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(arr[i] + "-");
            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println("end");
        System.out.println();
    }

    public static void main(String[] args) {
        circular_queue q = new circular_queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.remove();
        q.display();
        q.add(6);
        q.add(7);
        q.display();
        q.remove();
        q.remove();
        q.display();
        q.add(9);
        q.add(10);
        q.display();


    }

}
