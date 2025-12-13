package Arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        //No. of Rows are mandatory
        Scanner scan=new Scanner(System.in);

        //int[][] arr=new int[3][4];
//        for (int i=0;i<arr.length;i++){ //           We can't make int[3][3] as int[3][4] then use
//            for(int j=0;j<=arr[i].length;j++){ //    for j<'='arr[i].length which is equal to 4
//                arr[i][j]=scan.nextInt();//          because the jvm cant fit the element j=4 but there is only upto 3 where int[][4(0,1,2,3)]
//            }
//        }
        int[][] arr={{1,2,3},{6,4,5},{9,7,8}};
//        for (int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j]=scan.nextInt();
//            }
//        }
        for (int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
        for (int[] b:arr){ // since the datatype of the element of arr is array the int[] is mentioned as a array
            System.out.println(Arrays.toString(b));
        }

    }
}
