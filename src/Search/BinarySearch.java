package Search;

public class BinarySearch {
    //Searching in the ascending order array
    public static int BinaryAscending(int[] arr,int target){
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
                return mid;
            }
        }
        //returning the index of the element that needs to be added if the target element isn't present
        for (int i=0;i<arr.length;i++){
            if (arr[i]<target && arr[i+1]>target){
                return i+1;
            }
        }
        return -1;
    }
    //Searching in the decending order array
    public static int BinaryDecending(int[] arr,int target){
        int start=arr.length-1;
        int end=0;
        while (start>=end){
            //int mid=start+(end-start)/2;
            int mid=end+(start-end)/2; //Both are the exact same
            if (arr[mid]>target){
                end=mid+1;
            } else if (arr[mid]<target) {
                start=mid-1;
            }
            else {
                return mid;
            }
        }
        //swapping the array to make it ascending and repeat the same process as ascending order array
        int[] arr1=swap(arr);
        //returning the index of the element that needs to be added if the target element isn't present
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]<target && arr1[i+1]>target){
                return arr.length-(i+1);// Since we changed it to ascending order, but the result should be in descending order the result i+1 is subtracted from the length of the array to extract the original position in the array
            }
        }
        return -1;
    }
    public static int[] swap(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static boolean Assif(int[] arr){
        return arr[0] < arr[arr.length-1];
    }
    public static int generalArray(int[] arr,int target){
        if (Assif(arr)){
           return BinaryAscending(arr,target);
        }
        else {
            return BinaryDecending(arr, target);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,5,6};
        int[] arr1={9,8,7,6,5,4,2,1,0,-54,-69};
        //int target=4;
        System.out.println(generalArray(arr,3));
        System.out.println(generalArray(arr1,3));
    }
}

// Code by ChatGPT
/*
class Solution {
    // returns index if found, otherwise insertion index
    public static int binarySearchInsertAscending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        // start is the insertion position
        return start;
    }

    // for descending-sorted array: returns index if found, otherwise insertion index
    public static int binarySearchInsertDescending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            // in descending order: if arr[mid] > target, target is to the right
            if (arr[mid] > target) start = mid + 1;
            else end = mid - 1;
        }
        // start is the insertion position (index where target should be placed to keep descending order)
        return start;
    }

    // helper to detect ascending
    public static boolean isAscending(int[] arr) {
        // handle edge cases
        if (arr == null || arr.length < 2) return true;
        return arr[0] < arr[arr.length - 1];
    }

    public int searchInsert(int[] arr, int target) {
        if (isAscending(arr)) {
            return binarySearchInsertAscending(arr, target);
        } else {
            return binarySearchInsertDescending(arr, target);
        }
    }
}
*/
