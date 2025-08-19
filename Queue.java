public class Queue {
    private int[] q;
    private int front = 0, rear = -1, size = 0;

    public Queue(int capacity) { q = new int[capacity]; }

    public void enqueue(int val) {
        if (size == q.length) System.out.println("Overflow");
        else {
            rear = (rear + 1) % q.length;
            q[rear] = val;
            size++;
        }
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Underflow");
            return -1;
        }
        int val = q[front];
        front = (front + 1) % q.length;
        size--;
        return val;
    }

    public int peek() { return size == 0 ? -1 : q[front]; }

    public boolean isEmpty() { return size == 0; }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20); // Overflow
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}