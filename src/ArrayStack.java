public class ArrayStack<T> {

    private T[] arr;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    // Time Complexity: O(1)
    public void push(T data) {

        if (isFull()) {
            System.out.println("Stack dolu!");
            return;
        }

        arr[++top] = data;
    }

    // Time Complexity: O(1)
    public T pop() {

        if (isEmpty()) {
            System.out.println("Stack bos!");
            return null;
        }

        return arr[top--];
    }

    public T peek() {

        if (isEmpty()) {
            return null;
        }

        return arr[top];
    }
}