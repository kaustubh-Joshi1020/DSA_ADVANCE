package Greedy;

import java.util.ArrayList;

public class Activities {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        int maxActivities = 1;

        ArrayList <Integer> ans  = new ArrayList<>();
        ans.add(0);
        int activityend = end[0];
        for (int i = 1; i < end.length; i++) {
                if(start[i] >= activityend){
                    maxActivities++;
                    ans.add(i);
                    activityend = end[i];
                }
        }
        System.out.println(maxActivities);
//        System.out.println(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
