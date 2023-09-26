package Hashing.hashmap;

import java.util.HashMap;

public class frequency_count {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,9,8,7,6,5,4};

        HashMap<Integer , Integer>  map = new HashMap<>();


        for (int num : arr) {
            // If the number is already in the map, increment its frequency
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                // If the number is not in the map, add it with a frequency of 1
                map.put(num, 1);
            }
        }
        System.out.println(map.get(9));
        System.out.println(map);
    }
}
