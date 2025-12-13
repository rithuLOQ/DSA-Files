package Leetcode;

import java.util.Arrays;

public class Twosum {
        public static int[] twoSum(int[] nums, int target) {
            for (int i=0;i<nums.length;i++){
                for (int j=1;j<nums.length;j++){
                    if(i!=j){
                        if (nums[i]+nums[j]==target){
                            return new int[]{i,j};
                        }
                    }
                }
            }
            return new int[]{0,0};
        }

    public static void main(String[] args) {
        int[] arr={3,3};
        int target=6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

}
