package Collection;

import java.util.LinkedList;
import java.util.Stack;

public class collections {
    public static void main(String[] args) {
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(11 );
//        ll.add(12);
//        ll.add(2,12);
//        ll.addFirst(10);
//        ll.addLast(13);
//        System.out.println(ll);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);


    }


}
