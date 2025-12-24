package Leetcode;

public class findSqrt {
    public static int mySqrt(int x) {
        int start=1;
        int end=x;
        while (start<=end){
            int mid=start+(end-start)/2;
            long mid1=(long) mid*mid;
            if (mid1>x){
                end=mid-1;
            } else if (mid1<x) {
                start=mid+1;
            }
            else {
                return mid;
            }

        }
        return end;
    }

    public static void main(String[] args) {
        System.out.print(mySqrt(8));
    }
}
