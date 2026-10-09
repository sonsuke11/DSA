public class MyStack<T> {
    Node<T> top;

    void push(T n) {
        Node<T> node = new Node<T>(n);
        node.next = top;
        top = node;
    }

    Node<T> pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty stack");
        }

        Node<T> curr = top;
        top = top.next;
        return curr;
    }

    T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Empty stack");
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    void print() {
        Node<T> curr = top;
        while (curr != null) {
            System.out.printf("->%s", curr.data);
            curr = curr.next;
        }
        System.out.println("null");
    }
}
