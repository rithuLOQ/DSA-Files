package Leetcode;

public class LongCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String a=strs[0];
        for (int i=0;i<strs.length;i++){
            for (int j=0;j<strs[i].length();i++){
                if (a.charAt(j)==strs[i].charAt(j)){
                    System.out.println(a.charAt(j));
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String[] str={"Rithul","Rith"};
        longestCommonPrefix(str);
    }
}
