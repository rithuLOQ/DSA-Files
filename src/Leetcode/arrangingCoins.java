package Leetcode;
//https://leetcode.com/problems/arranging-coins/description/?envType=problem-list-v2&envId=binary-search
public class arrangingCoins {
    public static int arrangeCoins(int n) {
        long left = 1, right = n;
        long firstTrueIndex = 0;//stores the actual number of rows that is filled correctly

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coinsNeeded = mid * (mid + 1) / 2;//math formula to calculate the number of coins actually needed for the number of mid rows
            if (coinsNeeded <= n) {
                //the number of coins needed is less than the actual total coins means the mid no.of rows are filled correctly
                //so the firsttruevalue is mid
                //further explanation: since the coinsneeded is less than the total coins. the program conforms that the steps are filled
                firstTrueIndex = mid;
                left = mid + 1;
            } else {
                right = mid - 1;

            }
        }

        return (int) firstTrueIndex;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(3));
    }
}
