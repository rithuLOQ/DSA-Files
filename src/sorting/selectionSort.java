package sorting;

import java.util.Arrays;

public class selectionSort {
    public static void selection(int[] arr){
        for (int i=0;i<arr.length;i++){
            int limit=arr.length-1-i;
            int max=maximum(arr,0,limit);
            swap(arr,max,limit);
        }
    }
    public static int maximum(int[] arr,int start,int end){
        int max=0;
        for (int i=start;i<=end;i++){
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(new int[]{maximum(arr, 0, (arr.length - 1))}));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
