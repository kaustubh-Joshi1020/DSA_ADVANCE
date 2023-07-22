package Stacks;

import java.util.ArrayList;

public class stacks {
    public static class stack{
       static ArrayList<Integer> list = new ArrayList<>();
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if (isempty()){
                return -1;
            }
            int last_element = list.get(list.size()-1);
            list.remove(list.size()-1);
            return last_element;
        }
        //peek
        public static int peek(){
            if (isempty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

        public static boolean isempty(){
           return list.size() == 0;
        }

        public static void display(){
            if (isempty()){
                System.out.println("stack is empty");
            }
//            while(!isempty()){
//                System.out.println(peek());
//                pop();
//            }
            for (int i = list.size()-1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
        }

    }

    public static void main(String[] args) {

        stack s = new stack();
        System.out.println("before pop");
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.display();
        System.out.println("after pop 2");
        s.pop();
        s.pop();
        s.display();
        System.out.println("top element is:"+ s.peek());



    }
}
