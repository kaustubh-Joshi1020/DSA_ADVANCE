import java.util.*;

class Solution {

    public static double findmid(){
        int[] arr1 = {6,7,8};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = new int[arr1.length + arr2.length];

        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        if(arr3.length%2==0){
            double mid1 = arr3[arr3.length/2];
            double mid2 = arr3[(arr3.length/2)-1];
            double mid3 = (mid1 + mid2)/2;
            return mid3;
        }

        return (double) arr3[arr3.length/2];
    }

    public static void main(String[] args) {
        System.out.println(findmid());
    }
}
