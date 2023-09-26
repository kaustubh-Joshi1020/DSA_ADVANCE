package Hashing.hashmap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class linked_and_tree_map {
    public static void main(String[] args) {

        LinkedHashMap<String , Integer> lmp = new LinkedHashMap<>(); // stored as per the insertion order.

        lmp.put("india",1);
        lmp.put("USA",2);
        lmp.put("UK",1);
        lmp.put("Germany",1);
        System.out.println(lmp);
//
//        TreeMap<String , Integer> tmp = new TreeMap<>(); // the nodes are stored as per the alphabetical order of key
//
//        tmp.put("d_india",4);
//        tmp.put("c_USA",2);
//        tmp.put("b_UK",3);
//        tmp.put("a_Germany",1);
//        System.out.println(tmp);



    }
}
