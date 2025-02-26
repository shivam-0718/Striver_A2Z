package Lec4;
import java.util.Scanner;

public class _2_ReverseNumber {

    public static int reverse (int n){
        //link: https://leetcode.com/problems/reverse-integer/description/
        //Reverse a number, and check while reversing a number, it is going out of the limits or not
        
        long rev = 0;
        while (n != 0) {
            int temp = n % 10;
            rev = (rev*10) + temp; //Imp formulae
            if(rev > Integer.MAX_VALUE){
                return 0;
            }
            if(rev < Integer.MIN_VALUE){
                return 0;
            }
            n /= 10;
        }
        return (int) rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println("reverse of " + n + " is " + result);
        sc.close();

    }
}
/*
 * // My implementation for concept learning (first solved on my own, then moved to the question)
 * Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int rev = 0;
        while (n > 0) {
            int temp = n % 10;
            rev = (rev*10) + temp;
            n /= 10;
        }
        System.out.println("reverse of " + copy + " is " + rev);
        
        sc.close();
 */
