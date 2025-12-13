package Practice;

import java.util.Arrays;

public class demo {
    static void prime(int num){
        int result=0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                result++;
            }
        }
        if (result>1){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
    public static String addBinaryStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0'; // Convert char to int
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0'; // Convert char to int
            }

            result.append(sum % 2); // Append the current bit (0 or 1)
            carry = sum / 2;       // Calculate the new carry
        }

        return result.reverse().toString(); // Reverse and return the result
    }

    public static void main(String[] args) {
        String rithul = "Rithul";
        System.out.println(rithul.length());
        String bin1 = "111"; // Binary 11
        String bin2 = "111"; // Binary 13
        String sum = addBinaryStrings(bin1, bin2);
        System.out.println("Sum of " + bin1 + " and " + bin2 + " is: " + sum);
        System.out.println(1/26);
    }
}

