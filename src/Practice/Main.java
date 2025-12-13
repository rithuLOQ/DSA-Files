package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr={3,2,4};
        int target = scan.nextInt();
        int[] arr1 =twoSum(arr,target);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr= new int[2];
        for (int i=0;i<nums.length;i++){
            if (nums[i]+nums[i+1]==target){
                arr[0]=i;
                arr[1]=i+1;
            }
        }
        return arr;
    }
}
