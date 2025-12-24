package Arrays;

public class rotatedArray {
    public int search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+((end-start)/2);
            if (arr[mid]>arr[mid+1]){
                end=mid;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
