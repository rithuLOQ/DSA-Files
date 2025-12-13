package Leetcode;

import java.util.Arrays;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    //My method of finding
    public static int evenMy(int[] arr){
        int count=0;
        String[] arr1=new String[arr.length];
        for (int i=0;i<arr.length;i++){
            arr1[i]=String.valueOf(arr[i]);
        }
        for (int i=0;i<arr1.length;i++){
            if (arr1[i].length()%2==0){
                count++;
            }
        }
        return count;
    }
    //Kunal Method
    public static int even(int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            int b=strLen(arr[i]);
            boolean c=evenchk(b);
            if (c){
                count++;
            }
        }
        return count;
    }
    //Checks the given integer is even or not
    public static boolean evenchk(int a){
        if (a%2==0){
            return true;
        }
        return false;
    }
    //returns the length of the given number
    public static int strLen(int a){
        return (int)(Math.log10(a)+1);
    }
    public static int strLenTC(int num){
        int count=0;
        if (num<0){
            num=num*-1;
        }
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={12,123,34,456,765};
        System.out.println(even(arr));

    }
}
