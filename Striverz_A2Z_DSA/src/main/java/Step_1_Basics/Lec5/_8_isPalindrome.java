package Lec5;

public class _8_isPalindrome {
    //2 pointer approach
    //link: https://leetcode.com/problems/valid-palindrome/description/
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left<right)
        {
            char l = s.charAt(left), r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            } else if(!Character.isLetterOrDigit(r)){
                right--;
            } else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            } else{
                left++;
                right--;
            }
        }
        return true;
    }

    //using recursion
    public static boolean isPalindrome(int i, String s){
        //Base condition
        //If i exceeds half of string length, it means we have viewed the string
        if(i >= s.length()/2){
            return true;
        }

        //Condition
        if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
            return false;
        }

        //recursion
        return isPalindrome(i+1, s);
    }

    public static void main(String[] args) {
        String s = "malayalam";
        boolean ans = isPalindrome(0, s);
        if(ans){
            System.out.println("It is a palindrome");
        } else{
            System.out.println("It is not a palindrome");
        }
    }
}
