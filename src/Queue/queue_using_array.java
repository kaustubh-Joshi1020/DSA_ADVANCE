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
        return rear == -1;
    }

    public void add(int data){
        if (rear == size-1){
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public int remove(){
        if(rear == -1){
            System.out.println("queue is empty");
            return -1;
        }
        int removed = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i+1];
        }
        rear--;
        return removed;
    }

    public void display(){
        if(rear == -1){
            System.out.println("queue is empty");
            return;
        }
        for (int i = 0; i < rear+1; i++) {
            System.out.print(arr[i] + "<-");
        }
        System.out.println("end");
    }

    public int peek(){
        return arr[0];
    }

    public static void main(String[] args) {
       queue_using_array q = new queue_using_array(5);
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
      q.display();
    }

}
