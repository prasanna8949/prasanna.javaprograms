public class Stack {
    private int[] Stack;
    private int top = -1;

    public Stack(int size) {
        Stack = new int[size];
    }

    public void push(int val) {
        if (top == Stack.length - 1) System.out.println("Stack Overflow");
        else Stack[++top] = val;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return Stack[top--];
    }

    public int peek() {
        return (top == -1) ? -1 : Stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(1); s.push(2); s.push(3);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}