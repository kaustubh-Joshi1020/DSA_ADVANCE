package LL;

import com.sun.security.auth.UnixNumericGroupPrincipal;

public class LinkedList {
   public static class Node{
    int data;

    Node Next;

    Node(int data){
        this.data = data;
        this.Next = null;
    }
}
    public static Node Head;
    public static Node Tail;

    public void add_node_first(int data){
        Node new_node = new Node(data);
        if(Head  == null){
            Head = Tail = new_node;
            return;
        }
        new_node.Next = Head;
        Head = new_node;
    }
    public void add_node_last(int data){
        Node new_node = new Node(data);
        if(Head  == null){
            Head = Tail = new_node;
            return;
        }
        Tail.Next = new_node;
        Tail = new_node;
        Tail.Next = null;
    }

    public  void print_list(){
        Node temp;
        temp = Head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.Next;
        }
        System.out.println("NULL");
    }

    public void remove_from_first(){
        if(Head == null){
            System.out.println("list is empty");
            return;
        }
        Head = Head.Next;
    }
    public void remove_from_last(){
        if(Head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp;
        temp = Head;
        for (int i = 1; i < sizeofll()-1; i++) {
            temp = temp.Next;
        }
        Tail =temp;
        Tail.Next = null;
    }

    public int sizeofll(){
        int count = 0;
        Node temp;
        temp = Head;
        while (temp != null){
            count++;
            temp = temp.Next;
        }
        return count;
    }

    public void removeNthnode(int n){
//       int i = 1;
//        Node temp;
//       temp = Head;
//       int prevofith = sizeofll() - n;
//       while (i < prevofith){
//          temp = temp.Next;
//           i++;
//       }
//       temp.Next = temp.Next.Next;
//       return;

        if(n == 1){
            remove_from_first();
            return;
        }

        if (n == sizeofll()){
            remove_from_last();
            return;
        }

        Node temp;
        temp = Head;
        for (int i = 1; i < sizeofll()-n ; i++) {
            temp = temp.Next;
        }
        temp.Next = temp.Next.Next;
    }

    public  static  boolean iscycle(){
        Node slow = Head;
        Node fast = Head;
        while (fast != null && fast.Next == null){
            slow = slow.Next;
            fast = fast.Next.Next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public  void reverse(){
        Node previous = null;
        Node current = Tail = Head;
        Node next;
        while(current != null) {
            next = current.Next;
            current.Next = previous;
            previous = current;
            current = next;
        }
        Head = previous;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add_node_first(11);
        ll.add_node_first(12);
        ll.add_node_first(13);
        ll.add_node_first(14);
        ll.add_node_first(15);
//        ll.add_node_last(14);
//        ll.add_node_last(15);
        ll.print_list();
        ll.reverse();
        ll.print_list();
//        System.out.println(ll.sizeofll());
//        ll.remove_from_first();
//        ll.print_list();
//        ll.remove_from_last();
//        ll.print_list();
//        ll.removeNthnode(2);
//        ll.removeNthnode(1);
//        ll.removeNthnode(5);
//        ll.print_list();

    }
}