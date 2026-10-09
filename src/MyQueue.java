public class MyQueue<T> {
    Node<T> head;
    Node<T> tail;
    MyQueue(){
        head.next = tail;
    }

    void enqueue(T data) {
        Node<T> node= new Node<>
        if (head == null) {
            head = new Node<>(data);
            return;
        }

        Node<T> curr = head;
        while (curr.next != tail) {
            curr = curr.next;
        }
        curr.next = new Node<>(data);


    }

    // 1-2-3-4-null
    void dequeue() {
        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        T value = curr.data;
        curr = null;

        return value;
    }

    void print() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null\n");


    }
}
