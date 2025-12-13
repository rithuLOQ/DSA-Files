package Arrays.practice;

public class noColFix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };
        System.out.println(arr.length); //No. of element in the array. In this the elements are the arrays in the arr
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { //arr[row].length is the length of the array of the particular row. eg. arr[0]=4, arr[1]=2,arr[2]=3
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
