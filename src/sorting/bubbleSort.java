package sorting;

import java.util.Arrays;
// time complexity of O(n²)
public class bubbleSort {
    public static void bubble(int[] arr){
        for (int i=0;i<arr.length;i++){//i is used for each iteration to place each largest element at the last. if i=0, find the largest element. if i=1, finding the second largest element and goes on
            for (int j=1;j<arr.length-i;j++){//j is used to find and keep the largest element at the particular iteration. helps the program to place the element at the end
                //arr.length-i is to ignore the already sorted part of the array
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
