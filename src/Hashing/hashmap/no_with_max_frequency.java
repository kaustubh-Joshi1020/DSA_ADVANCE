package Hashing.hashmap;

import java.util.HashMap;
import java.util.*;

public class no_with_max_frequency {
//Q - find the element with frequency is greater than arr.length/3
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,1,5,1,3,5,4,1,3,3,3,3};
        HashMap <Integer , Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i] , 1);
            }
        }
        Set<Integer> set = map.keySet(); //this methods only retuns only 1 element with high frequency with satisfying condition.
        for (int i: set) {
            if(map.get(i) > arr.length/3){
                System.out.println(i);
            }
        }

    }

}
