package Queue;


    public class CircularQueue {
        private int[] queueArray;
        private int front;
        private int rear;
        private int capacity;
        private int currentSize;

        public CircularQueue(int size) {
            capacity = size;
            queueArray = new int[capacity];
            front = 0;
            rear = -1;
            currentSize = 0;
        }

        public boolean isEmpty() {
            return currentSize == 0;
        }

        public boolean isFull() {
            return currentSize == capacity;
        }

        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue.");
                return;
            }

            rear = (rear + 1) % capacity;
            queueArray[rear] = item;
            currentSize++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1; // Return a default value if the queue is empty.
            }

            int dequeuedItem = queueArray[front];
            front = (front + 1) % capacity;
            currentSize--;
            return dequeuedItem;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot peek.");
                return -1; // Return a default value if the queue is empty.
            }

            return queueArray[front];
        }

        public int size() {
            return currentSize;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }

            int index = front;
            for (int i = 0; i < currentSize; i++) {
                System.out.print(queueArray[index] + " ");
                index = (index + 1) % capacity;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int queueSize = 5;
            CircularQueue queue = new CircularQueue(queueSize);

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);

            queue.display(); // Output: 1 2 3 4 5

            queue.dequeue();
            queue.dequeue();

            queue.display(); // Output: 3 4 5

            queue.enqueue(6);
            queue.enqueue(7);

            queue.display(); // Output: 3 4 5 6 7
        }
    }

