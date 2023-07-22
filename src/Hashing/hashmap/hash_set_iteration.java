package Hashing.hashmap;

import java.util.HashSet;
import java.util.Iterator;

public class hash_set_iteration {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("kaustubh");
        set.add("rushi");
        set.add("aadity");
        set.add("anex");
        set.add("sahil");

        // iteration with Iterator
        Iterator itr = set.iterator();

//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        //using for loop
//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(itr.next());
//        }

        //using for each loop
        for(String i : set){
            System.out.println(i);
        }

    }
}
