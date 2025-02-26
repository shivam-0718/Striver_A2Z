package Lec4;

import java.util.Scanner;

public class _3_Palindrome {

    public static boolean isPalindrome(int x) {
        //link: https://leetcode.com/problems/palindrome-number/
        int copy = x;
        int rev = 0;
        while (x > 0) {
            int temp = x % 10;
            rev = (rev*10) + temp;
            x /= 10;
        }
        return copy == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPalindrome(n);
        if(ans){
            System.out.println("Given number is a palindrome");
        } else{
            System.out.println("Given number is not a palindrome");
        }
        
        sc.close();
    }   
}
