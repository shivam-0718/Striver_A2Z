package Lec5;

import java.util.ArrayList;
import java.util.Scanner;

public class _6_FactN {

    //concept implementation
/*
        public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact*i;

        }
        System.out.println(fact);
    }
 */

    //recursion
    public static int factorial(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    //challenge
    //link: https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
    //factorial less than or equal to n
    public static ArrayList<Long> factorialNumbers(long N) {
        ArrayList<Long> ans = new ArrayList<>();
        long n = N;
        long fact = 1;
        for (long i = 1; i <= n; i++) {
            fact = fact*i;
            if(fact <= N){
                ans.add(fact);
            }
        }
        return ans;
    }

    //Optimized solution
    public static ArrayList<Integer> factorialNumbers(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int num = 1;
        while(factorial(num) <= n){
            ans.add(factorial(num));
            num++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number N: ");
        long N = sc.nextLong();
        ArrayList<Long> fact = factorialNumbers(N);
        System.out.println("Factorials greater than or equal to " + N + " are:");
        for (Long l : fact){
            System.out.print(l + " ");
        }
    }
}
