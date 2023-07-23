package Stacks;

import java.util.Stack;

public class StackPushAtBottom {

    public static void pushAtBottom(Stack<Integer> s , int data){
        //base
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s ,data);
        s.push(top);
    }

    public static void reversestring(String str){

    }

    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<>();
//        s.push(10);
//        s.push(11);
//        s.push(12);
//        s.push(13);
//        pushAtBottom(s , 9);
//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }
        reversestring("kaustubh");



    }

}
