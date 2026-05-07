public class LinkedQueue<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(T data) {

        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public T dequeue() {

        if (isEmpty()) return null;

        T data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    public T peek() {

        if (isEmpty()) return null;

        return front.data;
    }
}