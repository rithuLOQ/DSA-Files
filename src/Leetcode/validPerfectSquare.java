package Leetcode;
//https://leetcode.com/problems/valid-perfect-square/?envType=problem-list-v2&envId=binary-search
public class validPerfectSquare {
    public static boolean isPerfectSquare(int num){
        int start=0;
        int end=num;
        while (start<=end){
            int mid=start+(end-start)/2;
            int msquare=mid*mid;
            if (msquare==num){
                return true;
            } else if (msquare>num) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(12));
    }
}
