package Leetcode;
//https://leetcode.com/problems/missing-number/
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class missingNumber {
    public static int findNum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;//the question is to find the numbers equal or less than the arr.length is present
        int i = 0;
        while (n >= 0) {
            i = SimpleBinarySearch(arr, n);// this to find whether the element is present
            //in the given array.
            // if the element is found then the binary search returns -1
            if (i!=-1){
                //the binary search returns any number only if
                // the element isn't found in the given array
                return i;
            }
            n--;
        }
        return -1;
    }
    public static int SimpleBinarySearch(int[] arr,int target){
        //'<=' used to access the last element if the array
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+((end-start)/2);
            if (arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
               return -1;
            }
        }
        return target;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,4,5};
       // System.out.println(Arrays.toString(arr1));
        //System.out.println(arr1.length);
        //System.out.println(SimpleBinarySearch(arr1,2));
        System.out.println(findNum(arr1));
    }
}
