package Basic;

import java.util.Arrays;

public class Rotate_array {

    public static int[] rotate_arr(int[] arr , int k) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[(i+k)% arr.length] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        System.out.println(Arrays.toString(rotate_arr(arr,k)));
    }

}
