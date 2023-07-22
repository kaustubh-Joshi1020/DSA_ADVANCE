package Hashing.hashmap;

import java.util.HashMap;


public class hash_functions {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("kj", 90);
        map1.put("anex", 80);
        map1.put("rushi", 70);
        map1.put("aady", 60);
        System.out.println(map1);

        map2.put("kaustubh",90);
        map2.put("aniket",80);
        map2.put("abc",60);
        System.out.println(map2);
//
////        map.put("KJ", 100);  //key is case sensitive.
////        System.out.println(map);
//////        System.out.println(map.get("KJ"));
////        System.out.println(map.isEmpty());
////        map.remove("anex");
////        System.out.println(map);
////        System.out.println(map.clone());
//          map.forEach((name , marks) -> System.out.println("name: " + name +"\n"+ "marks: " + marks));
//
////        map.forEach( (key, value)-> map2.merge(key,value,(v1, v2)-> v1.equalsIgnoreCase(v2)? v1: v1 + ", " + v2));
//        map2.forEach((key, value)-> map1.merge(key,value,(v1, v2)-> v1.equalsIgnoreCase(v2)? v1: v1 + ", " + v2));
            }
        }