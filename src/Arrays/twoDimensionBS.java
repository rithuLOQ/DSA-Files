package Arrays;

import java.util.Arrays;

public class twoDimensionBS {
    //Method 1 of search which gives O(N)
    public static int[] search(int[][] arr,int target){
        int row=0;
        int column=arr.length-1; //arr.length gives the number of element arrays in the array
        while (row<arr.length&&column>=0){
            if (arr[row][column]==target){
                return new int[]{row,column};
            } else if (arr[row][column]>target) {
                column--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
    //Method 2 of search which gives O(Log(N))
    public static int[] search1(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        //if there is no column in the array
        if (cols==0){
            return new int[]{-1,-1};
        }
        //if there is only one row in the array
        if (rows==1){
            return SimpleBinarySearch(arr,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=arr[0].length;
        int colMid=cols/2;
        //this while is to reduce the number of rows in the matrix to two. in which the target element is present
        while (rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if (arr[mid][colMid]==target){
                return new int[]{mid,colMid};
            }
            //if the middle element is < target
            if (arr[mid][colMid]<target){
                rStart=mid;
            }
            //if middle element is greater than the target
            else {
                rEnd=mid;
            }
        }
        //when the code gets out of this the rows if the matrix will probably be 2
        //checks the middle element of the first row of the matrix in 2 row matrix
        if (arr[rStart][colMid]==target){
            return new int[]{rStart,colMid};
        }
        //checks the middle element of the second row of the matrix in 2 row matrix
        if (arr[rStart+1][colMid]==target){
            return new int[]{rStart+1,colMid};
        }
        //checks 1st half
        if (target<=arr[rStart][colMid-1]){
            return SimpleBinarySearch(arr,rStart,0,colMid,target);
        }
        //checks 2nd half
        if (target>=arr[rStart][colMid+1]&&target<=arr[rStart][cols-1]){
            return SimpleBinarySearch(arr,rStart,colMid+1,cols,target);
        }
        //checks 3rd half
        if (target<=arr[rStart+1][colMid-1]){
            return SimpleBinarySearch(arr,rStart+1,0,colMid,target);
        }
        //checks 4th half
        else {
            return SimpleBinarySearch(arr,rStart+1,colMid+1,cols,target);
        }
    }
    //Kunal Method
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    public static int[] search2(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarySearch(matrix,0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
    public static int[] SimpleBinarySearch(int[][] arr, int row, int start, int end, int target){
        //'<=' used to access the last element of the array
        while (start<=end){
            int mid=start+((end-start)/2);
            if (arr[row][mid]>target){
                end=mid-1;
            } else if (arr[row][mid]<target) {
                start=mid+1;
            }
            else {
                return new int[]{row,mid};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {6,7,8,9},
                {11,12,13,14},
                {16,17,18,19}};
        System.out.println(arr[0].length);
        System.out.println(Arrays.toString(search(arr,14)));
        System.out.println(Arrays.toString(search1(arr,8)));
        System.out.println(Arrays.toString(search2(arr,2)));
    }
}
