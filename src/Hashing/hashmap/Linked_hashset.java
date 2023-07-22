package Hashing.hashmap;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linked_hashset {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("kaustubh");
        set.add("rushi");
        set.add("aadity");
        set.add("anex");
        set.add("sahil");
        System.out.println(set);

        LinkedHashSet<String> Lset = new LinkedHashSet<>(); // ordered in insertion way
        Lset.add("kaustubh");
        Lset.add("rushi");
        Lset.add("aadity");
        Lset.add("anex");
        Lset.add("sahil");
        System.out.println(Lset);

    }
}
