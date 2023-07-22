package Stacks;

import java.util.Stack;

public class Stack_Using_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class stack{
    public static Node Head  = null;
    public static Node Tail = null;

    //push
    public void push(int data){
        if(Head == null){
            Node new_node = new Node(data);
            Head = Tail = new_node;
            return;
        }
        Node new_node = new Node(data);
        new_node.next = Head;
        Head = new_node;
    }

    //pop
    public void pop(){
        if(Head == null){
            System.out.println("list is empty");
            return;
        }
        Head = Head.next;
    }

    //peek
    public int peek(){
        if (Head == null){
            return -1;
        }
        return Head.data;
    }

    public boolean isstackempty(){
        if (Head == null){
            return true;
        }
        return false;
    }
    public int sizeofsstack(){
        if(Head == null){
            return 0;
        }
       int count=0;
        Node temp;
        temp = Head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;

    }

    public void pushatbottom(int data){
        if(Head == null){
            Node new_node = new Node(data);
            Head = Tail = new_node;
            return;
        }
        Node new_node = new Node(data);
        Tail.next = new_node;
        Tail = new_node;
    }

    public void display(){
        if (Head == null){
            System.out.println("stack is empty");
            return;
        }
        Node temp;
        temp = Head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("---------------------------------------");
    }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.display();
        s.pushatbottom(9);
        s.display();

    }

}

