public class LinkList<T> {
    Node<T> head;

    void add(Node<T> node) {
        if(head==null){
            head = node;
            return;
        }

        Node<T> curr = head;
        while (curr != null) {
            if(curr.next ==null ) {
                curr.next = node;
                return;
            }else{
                curr= curr.next;
            }
        }
        curr.next = null;
    }

    // 1-2-3-null null<-1-<-2<-3

    /*

    */
    Node<T> reverse(Node<T> head){
        Node<T> prev = null;
        Node<T> curr = head;
        while(curr !=null){
            Node<T> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    void print() {
        Node<T> curr = head;
        while(curr!= null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null\n");


    }
    int length(Node<T> h){
        Node<T> curr = h;
        int len = 0;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        return len;
    }

    Node<T> findKFromEnd(Node<T> head, int k){
        int len = this.length(this.head);
        int targetIndex = len-k;
        int i=0;
        Node<T> curr=head;
        while(i<targetIndex){
            curr = curr.next;
            i++;
        }
        return curr;
    }

    Node<T> findKFromEnd2(Node<T> head, int k){
        Node<T> curr=head;
        Node<T> fast = head;
        int step = 0;
        while(fast!= null){
            if(step >=k){
                curr= curr.next;
            }
           fast = fast.next;
            step++;
        }
        return curr;
    }

    boolean hasCycle(Node<T> head) {
        Node<T> slow= head;
        Node<T> fast= head;
        while(fast !=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

}

class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
        this.next = null;
    }
}

