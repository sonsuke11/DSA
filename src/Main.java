import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Node first = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
//
//        MyStack stack = new MyStack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        Node poppedItem = stack.pop();
//        stack.print();
//        System.out.printf("%d", poppedItem.data);

        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.print();

        System.out.printf("%s",queue.offer());
        queue.print();

//        first.next = second;
//        second.next = third;
////        third.next = second;
//        LinkList l = new LinkList();
//        l.head = first;


//        l.print();
//        l.head =l.reverse(l.head);
//
//        l.print();
//        System.out.printf("Length %b", l.hasCycle(l.head));
    }
}