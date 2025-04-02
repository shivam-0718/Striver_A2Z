package Lec4;

import java.util.Scanner;

public class _4_GCD_LCM {
    //concept1
    public static int gcd_brute(int n1, int n2) {
        int gcd = 0;
        for (int i = 1; i <= (int) Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            } else
                continue;
        }
        return gcd;
    }

    //concept2
    public static int gcd_simplify(int n1, int n2) {
        int gcd = 0;
        for (int i = (int) Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    /*
     * Euclidean algorithm
     * Given 2 numbers n1 and n2, with n1 > n2
     * GCD (n1, n2) = GCD (n1-n2, n2).......one of them becomes 0, the other one is
     * GCD
     * But this one has a catch, it does not improve the linear complexity leading
     * to too many steps
     * This can also be done through modulo operator
     * 
     * GCD (n1, n2) = GCD (n1%n2, n2).......one of them becomes 0, the other one is
     * GCD
     * 
     * Time complexity: When there is extraction of digits happening / there is
     * division involved in it,
     * then the number of iterations will be in terms of logarithm.
     * 
     * TC = O(log (phi) min(a,b ))
     */
    //concept3 **IMP**
    public static int gcd_euclid(int n1, int n2) {
        int gcd = 0;
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
            if (n1 == 0) {
                gcd = n2;
            } else {
                gcd = n1;
            }
        }
        return gcd;
    }

    //Question
    //link: https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
    //Find GCD and LCM of 2 numbers
    public static int[] gcdandlcm(int n1, int n2){
        int[] ans = new int[2];
        int gcd = 0;
        int multi = n1*n2;
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
            if (n1 == 0) {
                gcd = n2;
            } else {
                gcd = n1;
            }
        }
        ans[0] = multi/gcd; //lcm = (n1*n2)/gcd;
        ans[1] = gcd;
        return ans;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers whose GCD and LCM you want to find: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        // int gcd = gcd_brute(n1, n2);
        int[] answer = gcdandlcm(n1, n2);
        System.out.println("GCD and LCM of " + n1 + " and " + n2 + " is: ");
        for (int ans : answer){
            System.out.print(ans + " ");
        }
        sc.close();
    }
}
