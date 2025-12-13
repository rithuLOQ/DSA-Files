package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse_swap {
    static void reverse(int[] arr){
        int[] arr1;
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[][] arrays={{1,2,3},{4,5},{6,7,8}};
        int[] testing={4,7,1,2,3,6,5,9};
        ArrayList arr=new ArrayList();
        arr.add("Sanjana");
        arr.add(444);
        System.out.println(arr);
        for (int[] out: arrays){ // out act as the object representing the data inside each index of array
            System.out.println(Arrays.toString(out));
        }
        System.out.println(testing.length);
        //swap(testing,1,0);
        reverse(testing);
        System.out.println(Arrays.toString(testing));
    }


}
