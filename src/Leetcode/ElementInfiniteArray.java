package Leetcode;

public class ElementInfiniteArray {
    public static int BinarySearch(int[] arr,int target, int start,int end){
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
        return -1;
    }
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return BinarySearch(arr,target,start,end);
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,13,21,23,30};
        int target=7;
        System.out.println(ans(arr,target));
    }
}
