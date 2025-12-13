package Arrays.practice;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Array of primitives
        int[] arr=new int[5];
        Scanner scan=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int j:arr){// for every element in the array print this
            System.out.print(j+" "); //Here j represents element of the array arr and elements of arr is int so j= int
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));// converts the given arrays to strings

        int[] arr2=new int[5];
        for (int i:arr2){
            arr2[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
    }
}
