package Search;

import java.util.ArrayList;

public class LinearSearch {
    //Returns the index of the first occurrence of the number
    public static int LS1(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    //Returns the indexes of the number if the number is present in more than one time
    public static ArrayList<Integer> LS2(int[] arr, int target){
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                arr1.add(i);
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr={4,7,2,5,9};
        int target=7;
        System.out.println(LS1(arr,target));
        System.out.print(LS2(arr,target));
    }
}
