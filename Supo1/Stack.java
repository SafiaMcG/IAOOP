public class Stack {

    private int[] items;
    private int top;
    private int maxSize;

    public Stack (int size) {
        items = new int[size];
        maxSize = size;
        top = -1;
    }

    public boolean isEmpty () {
        return top == -1;
    }

    public boolean isFull () {
        return top == maxSize - 1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            items[++top] = x;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            int item = items[top--];
            return item;
        }
        return 0;
    }

    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.push(5);
        System.out.println(s1.pop());
    }

}
