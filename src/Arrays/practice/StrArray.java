package Arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StrArray {
    public static void main(String[] args) {
        //Array of objects
        Scanner scan=new Scanner(System.in);
        String[] arr=new String[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.next();
        }
        System.out.println(Arrays.toString(arr));
        //modify
        arr[0]="Rithul";
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Modify using function
    //Java has mutable functions where the functions can change the actual object ot real array
    static void change(String arr[]){
        arr[0]="Kanna";
    }
}
