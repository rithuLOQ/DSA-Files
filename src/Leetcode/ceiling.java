package Leetcode;

public class ceiling {
        //Finding the smallest element that is greater than the target or target element
        //What i did
        public static int neighbour(int[] arr,int target){
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if (arr[mid]<target){
                    if (arr[mid+1]>target){
                        return arr[mid+1];
                    }
                    start=mid+1;
                } else if (arr[mid]>target) {
                    if (arr[mid-1]<target){
                        return arr[mid];
                    }
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
        //actual method
    public static int actual(int[] arr,int target){
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
        //returning the index of the element that needs to be added if the target element isn't present
        for (int i=0;i<arr.length;i++){
            if (arr[i]<target && arr[i+1]>target){
                return arr[i+1];
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,6,9,14,16,18};
        int[] arr1={447,536,558,635};
        System.out.println(neighbour(arr,5));
        System.out.println(neighbour(arr1,559));
        System.out.println(actual(arr1,559));
    }
}

