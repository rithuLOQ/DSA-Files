package sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void cyclic(int[] arr) {
        int i = 0;
        while (i <arr.length) {
            int correct = arr[i] - 1;//it is the correct position of the element in the arr[i]
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        //my working code
//        int i=0;
//        while (i>=0){
//            int correct=arr[i]-1;
//            if (arr[i]!=i+1){
//                swap(arr,i,correct);
//            }
//            if (arr[i]==i+1){
//                i++;
//            }
//            if (i== arr.length){
//                break;
//            }
//        }
    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}