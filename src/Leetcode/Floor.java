package Leetcode;

public class Floor {
    public static int FloorNumber(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        //'<=' used to access the last element if the array
        while (start<=end){
            int mid=start+((end-start)/2);
            if (arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                return arr[mid];
            }
        }
//        //returning the index of the element that needs to be added if the target element isn't present
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]<target && arr[i+1]>target){
//                return arr[i+1];
//            }
//        }
        return arr[end];// arr[start] is because when the target isn't present in the array then the start will be mid plus 1. so the condition start < end breaks as the end and start points towards the same element in the previous iteration (before start + 1)
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,6,9,14,16,18};
        int[] arr1={447,536,558,635};
        System.out.println(FloorNumber(arr1,559));
    }
}
