package Leetcode;

import java.util.Arrays;

public class Search2D {
    public static int[] searching(int[][] arr, int target){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                int element=arr[i][j];
                if(target==element){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }
    //Similarly in For Each loop
    public static int[] searchingeach(int[][] arr, int target){
        for(int[] i:arr){
            for (int j:i){
                if (j==target){
                    return new int[]{};
                }
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 5;
        System.out.println(Arrays.toString(searching(arr,target)));
        System.out.println(Arrays.toString(searchingeach(arr,target)));
    }
}
