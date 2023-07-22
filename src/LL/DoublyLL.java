package LL;

public class DoublyLL {
        class Node{
            int data;
            Node Next;
            Node Previous;
            Node(int data){
                this.data  = data;
                this.Next = null;
                this.Previous = null;
            }
        }
    public static Node Head;
    public static Node Tail;

    public void add_node_first(int data){
        if (Head == null){
            Node new_node = new Node(data);
            Head  = Tail = new_node;
            return;
        }
        Node new_node = new Node(data);
        new_node.Next = Head;
        Head.Previous = new_node;
        Head = new_node;
    }

    public void add_node_last(int data){
        if (Head == null){
            Node new_node = new Node(data);
            Head  = Tail = new_node;
            return;
        }
        Node new_node = new Node(data);
        new_node.Previous = Tail;
        Tail.Next = new_node;
        Tail = new_node;

    }
    public void remove_node_first(){
        if(sizeofll() == 1){
            Head = Tail = null;
        }
        if(Head == null){
            System.out.println("list is empty");
            return;
        }
        Head = Head.Next;
        Head.Previous = null;
    }
    public void remove_node_last(){
//        if(sizeofll() == 1){
//            Head = Tail = null;
//        }
        if(Head == null){
            System.out.println("list is empty");
            return;
        }
        Tail = Tail.Previous;
        Tail.Next = null;
    }
    public void print_list(){
        Node temp;
        temp = Head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.Next;
        }
        System.out.println("null");
    }

    public static int sizeofll(){

        if(Head == null){
            return -1;
        }
        int count = 0;
        Node temp = Head;
        while (temp != null){
            count++;
            temp = temp.Next;
        }
        return count;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.add_node_first(11);
        dll.add_node_first(12);
//        dll.add_node_first(13);
//        dll.add_node_first(14);
//        dll.add_node_last(10);
        dll.print_list();
        System.out.println(sizeofll());
        dll.remove_node_first();
        dll.print_list();
        System.out.println(sizeofll());
        dll.remove_node_last();
        dll.print_list();
        System.out.println(sizeofll());

    }

}
