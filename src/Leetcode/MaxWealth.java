package Leetcode;
//https://leetcode.com/problems/richest-customer-wealth/submissions/1851600339/
public class MaxWealth {
    static int maximumWealth(int[][] arr){
        int maxi=0;
        for (int i=0;i<arr.length;i++){
            int a=addElements(arr[i]);
            if (maxi<a){
                maxi=a;
            }
        }
        return maxi;
    }
    //sum of all the elements in the array
    static int addElements(int[] arr){
        int summation=0;
        for (int i=0;i<arr.length;i++){
            summation=summation+arr[i];
        }
        return summation;
    }
    public static void main(String[] args) {
        int[][] arr={{1,3},{3,7},{7,5}};
        int[][] arr1={{5,1,7},{7,5,1}};
        System.out.println(maximumWealth(arr1));
    }
}
