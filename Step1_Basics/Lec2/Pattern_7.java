package Lec2;

import java.util.Scanner;

public class Pattern_7 {

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking input as n -> number of rows
        int final_col = (2 * n) - 1; // calculating final columns based on input

        for (int i = 1; i <= n; i++) {
            int current_col = (2 * i) - 1; // current columns where * will be printed
            int spaces = (final_col - current_col) / 2; // current columns where " " will be printed

            // printing spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // printing *
            for (int j = 1; j <= current_col; j++) {
                System.out.print("*");
            }

            // printing new line after printing * and " "
            System.out.println();
        }

        pattern(5);

        sc.close();
    }
}
