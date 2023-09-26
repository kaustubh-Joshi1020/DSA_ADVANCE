package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_in_sorted {

    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
//        int[] end = {4,2,7,6,9,9};
        int maxActivities = 1;

        int[][] sorted_arr = new int[start.length][3];
        for (int i = 0; i < end.length; i++) {
            sorted_arr[i][0] = i;
            sorted_arr[i][1] = start[i];
            sorted_arr[i][2] = end[i];
        }

        Arrays.sort(sorted_arr , Comparator.comparingInt(a -> a[2]));

        ArrayList<Integer> ans  = new ArrayList<>();
        ans.add(sorted_arr[0][0]);
        int activityend = sorted_arr[0][2];
        for (int i = 1; i < end.length; i++) {
            if(sorted_arr[i][1] >= activityend){
                maxActivities++;
                ans.add(sorted_arr[i][0]);
                activityend = sorted_arr[i][2];
            }
        }
        System.out.println(maxActivities);
//        System.out.println(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
    }

}
