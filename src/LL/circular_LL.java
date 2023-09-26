package LL;

public class circular_LL {

        static class Node {
            int data;
            Node next;
        }
    
    public static LinkedList.Node Head;
    public static LinkedList.Node Tail;

    public void add_node_first(int data){
        LinkedList.Node new_node = new LinkedList.Node(data);
        if(Head  == null){
            Head = Tail = new_node;
            return;
        }
        new_node.Next = Head;
        Head = new_node;
    }
    public void add_node_last(int data){
        LinkedList.Node new_node = new LinkedList.Node(data);
        if(Head  == null){
            Head = Tail = new_node;
            return;
        }
        Tail.Next = new_node;
        Tail = new_node;
        Tail.Next = null;
    }

    public  void print_list(){
        LinkedList.Node temp;
        temp = Head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.Next;
        }
        System.out.println("NULL");
    }
}
