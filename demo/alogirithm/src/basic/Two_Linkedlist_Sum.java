package basic;

public class Two_Linkedlist_Sum {

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public LinkedList(int value) {
            this.head = new Node(value);
        }

        public void append(int value) {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(value);
        }
    }

    public int get_linked_list_sum(LinkedList linked_list_1, LinkedList linked_list_2) {

        int a = get_linked_list_sum_original(linked_list_1);
        int b = get_linked_list_sum_original(linked_list_2);

        return a+b;
    }

    public int get_linked_list_sum_original(LinkedList linked_list) {
        int sum =0;
        Node cur = linked_list.head;

        sum += cur.data;
        cur = cur.next;
        while (cur != null) {
            sum  = sum * 10 + cur.data;
            cur = cur.next;
        }
        return sum;
    }
}