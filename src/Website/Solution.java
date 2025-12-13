package Website;

import java.util.ArrayList;

class Solution {
//        public String addBinaryStrings(String a, String b) {
//
//            return a;
//        }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        int start=0;
        int end=s.length()-1;
//        if (s.length()%2!=0){
//            return false;
//        }
        while(start<end){
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String convertToTitle(int num){
        StringBuilder str=new StringBuilder();
        while(num>0){
            num--;
            int remainder=num%26;
            str.append((char) ('A'+remainder));
            num/=26;
            }
        return str.reverse().toString();
    }
    public int convertToNumber(String s){
        int num=0;
        for (int i=0;i<s.length();i++){
            num=(num*26)+(s.charAt(i)-'A'+1);
        }
        return num;
    }
    public String findKthPositive(int[] arr, int k) {
        ArrayList<Integer> notin=new ArrayList();
        for (int i=1;i<arr.length;i++){
            
        }
        return notin.toString();
    }
    public static void main(String[] args) {
        Solution solution=new Solution();
        String[] arr={"Leet","Code"};

        //System.out.println(solution.addBinaryStrings("1011", "1101"));
        boolean t=solution.isPalindrome("A man, a plan, a canal: Panama");
        //System.out.println(t);
        int str=62;
        //System.out.println(solution.convertToNumber("AA"));
        int[] arr1 = {2,3,4,7,11};
        int k = 5;

        System.out.println(solution.findKthPositive(arr1,k));

    }
}