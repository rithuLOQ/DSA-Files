package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void insertion(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            //arr.length-2 is becoz the j=i+1. if i=arr.length-2, then the j will be arr.length-1
            //it can also be written as i<arr.length-1
            for(int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    //checking if the numbers in the sorted arrays are smaller than the current j. if not just swap
                   swap(arr,j,j-1);
                }
                else {
                    //break state exits the j loop which is used to check if the elements of sorted array is
                    //smaller than the existing one. if the arr[j-1]<arr[j]
                    //we can automatically confirm that the elements before the j-1 are also smaller than the j
                    //hence were ignoring the checking part to reduce the time
                    break;
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
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
