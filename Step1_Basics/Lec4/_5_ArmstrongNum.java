package Lec4;

import java.util.Scanner;

public class _5_ArmstrongNum {
    public static int countDigits(int n) {
        //diff approach
        return (int)(Math.log10(n) + 1);
    }

    public static boolean isArmstrong(int n) {
        int copy = n;
        int count = countDigits(n);
        int sum = 0;

        while (n > 0) {
            int lastDigit = n%10;
            sum = sum + (int) (Math.pow(lastDigit, count));
            n /= 10;            
        }
        return copy == sum;
    }

    public static void main(String[] args) {
        // link:
        // https://www.naukri.com/code360/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        String answer = isArmstrong ? "Given number is an Armstrong number":"Given number is not an Armstrong number";
        System.out.println(answer);
        sc.close();
    }
}
