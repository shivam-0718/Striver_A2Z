package Lec4;
import java.util.Scanner;

public class _1_CountDigits {
    public static int evenlyDivides(int n) {
        // link: https://www.geeksforgeeks.org/problems/count-digits5716/1
        //Find number of digits which evenly divides the input number

        int copy = n;
        int count = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp == 0) {
                n /= 10;
                continue;
            }
            if (copy % temp == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans = evenlyDivides(n);
        System.out.println("Number of digits which evenly divides " + n + " is " + ans);
        sc.close();
    }
}
/*
     * // My implementation for concept learning (first solved on my own, then moved to the question)
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int copy = number;
        int count = 0;

        while (number > 0) {
            int temp = number % 10;
            count++;
            number /= 10;
        }
        System.out.println("Number of digits in " + copy + "  is: " + count);

        // method1
        int ans = countDigits(number);
        System.out.println("Number of digits in " + copy + "  is: " + ans);

        sc.close();
     */
