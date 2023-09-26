package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_on_matrix {

  static void binarysearch(int[][] arr, int key){
      int start = 0;
      int end = arr[0].length;
       while (start < end){
           int mid = (start + end)/2;
            int i =0;
           for (i = 0; i < end; i++) {
               if(arr[mid][i] == key){
                   System.out.println(mid + " " +i);
                   break;
               }
           }
           if(arr[mid][i] > key){
               end = mid-1;
           }
           if(arr[mid][i] < key){
               start = mid+1;
           }

       }
   }

    public static void main(String[] args) {
        int[][] arr = { {1,2,3} ,
                        {4,5,6},
                        {7,8,9}
                        };

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter key to search");
        int key = 3;
        binarysearch(arr , key);
    }
}
