package Queue;

public class queue_using_array {
    int[] arr;
    int rear;
    int size;

    queue_using_array(int n){
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public boolean isempty(){
        if (rear == -1){
            return true;
        }
        return false;
    }
    public boolean isfull(){
        return rear == size-1;
    }

    public void enqueue(int data){
        if(isfull()){
            System.out.println("the queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public int dequeue(){
        if (isempty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int removed = arr[0];
        for (int i = 1; i < rear; i++) {
            arr[i-1] = arr[i];
        }
        rear--;
        return removed;
    }


    public void display(){
        if (isempty()){
            System.out.println("queue is empty");
            return;
        }
        for (int i = 0; i < rear; i++) {
            System.out.print(arr[i] + "<-");
        }
        System.out.println("end");
//        System.out.println(Arrays.toString(arr));
        rear--;
    }

    public static void main(String[] args) {
        queue_using_array q = new queue_using_array(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
//        q.dequeue();
//        q.display();
//        q.dequeue();
//        q.display();

    }

}
