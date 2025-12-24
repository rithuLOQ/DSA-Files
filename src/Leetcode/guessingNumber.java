package Leetcode;
//https://leetcode.com/problems/guess-number-higher-or-lower/submissions/1861302231/?envType=problem-list-v2&envId=binary-search
public class guessingNumber {
    public static int guessNumber(int n) {
        int start=1;
        int end=n;
        while (start<=end){
            int picked=start+(end-start)/2;
            if (picked>n){
                return 1;
            } else {
                return -1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(5));
    }
}

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

//public class Solution extends GuessGame {
//    public int guessNumber(int n) {
//        int start=1;
//        int end=n;
//        while (start<end){
//            int picked=start+(end-start)/2;
//            if (guess(picked)<=0){
//                end=picked;
//            } else {
//                start=picked+1;
//            }
//        }
//        return start;
//    }
//}