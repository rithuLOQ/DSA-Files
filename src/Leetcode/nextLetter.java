package Leetcode;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1861350968/?envType=problem-list-v2&envId=binary-search
public class nextLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (letters[mid]>target){
                end=mid-1;
            } else{
                start=mid+1;
            }
            //here i didn't include an option for letter[mid]==target because the question want the next element of the target
            //the start will always point to the next element of the target even letter[mid]==target because
            //the if condition is only meant for letters[mid]>target but the else condition is for both equals to and <
        }
        //the % operator gives modulo of the length of the array since the question wants to circulate the array next element if the
        //target is exceeding the array limit
        return letters[start%letters.length];
    }

    public static void main(String[] args) {
        char[] arr={'a','b'};
        if (arr[0]<arr[1]){
            System.out.println("Greater");
        }
        char[] arr1={'x','x','y','y'};
        char target='z';
        System.out.println(nextGreatestLetter(arr1,target));
    }
}
