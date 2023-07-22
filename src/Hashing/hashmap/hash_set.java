package Hashing.hashmap;

import java.util.HashSet;
import java.util.Scanner;

public class hash_set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter no. of elements:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i+1) + " number element: ");
                set.add(sc.nextInt());
        }

        System.out.println(set);
    }
}
