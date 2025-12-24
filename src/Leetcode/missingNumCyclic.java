package Leetcode;

import java.util.Arrays;

public class missingNumCyclic {
    public static int missingNumber(int[] arr) {
       int i=0;
       while (i<arr.length){
           if(arr[i]<arr.length && arr[i]!=arr[arr[i]]){
               //arr[i]<arr.length means the element should be less than the length of array
               //because we need to ignore those elements which are equal to or greater than arr.length
               //so that the array will be sorted correctly at the end
               swap(arr,i,arr[i]);
           }
           else {
               i++;
           }
       }
       for (int index=0;index<arr.length;index++){
           if (index!=arr[index]){
               //since the elements start from the 0 to n similar to indexes
               //if something is been not in this parallelism then thats the element which is missing
               return index;
           }
       }
       return -1;
    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={4,0,2,1};
        System.out.println(missingNumber(arr));
    }
}
