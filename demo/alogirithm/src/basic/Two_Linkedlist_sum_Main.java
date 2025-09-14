package basic;

public class Two_Linkedlist_sum_Main {
    public static void main(String[] args) {
        Two_Linkedlist_Sum tls = new Two_Linkedlist_Sum();

        Two_Linkedlist_Sum.LinkedList linked_list_1 = new Two_Linkedlist_Sum.LinkedList(6);
        linked_list_1.append(7);
        linked_list_1.append(8);

        Two_Linkedlist_Sum.LinkedList linked_list_2 = new Two_Linkedlist_Sum.LinkedList(3);
        linked_list_2.append(5);
        linked_list_2.append(4);

        System.out.println(tls.get_linked_list_sum(linked_list_1, linked_list_2));
    }
}
