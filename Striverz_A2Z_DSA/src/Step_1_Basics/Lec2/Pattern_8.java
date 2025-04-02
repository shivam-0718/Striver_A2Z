package Lec2;

import java.util.Scanner;

public class Pattern_8 {

    public static void patternDown(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j < ((2*n) - (2*i + 1)); j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking input
        int final_col = (2 * n) - 1; //calculating final columns based on input

        for (int i = n; i >= 1; i--) {
            int current_col = (2*i) - 1; //current columns where * will be printed
            int spaces = (final_col - current_col) / 2; //current columns where " " will be printed
            
            //printing spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //printing *
            for (int j = 1; j <= current_col; j++) {
                System.out.print("*");
            }

            //printing new line after printing * and " "
            System.out.println();
        }

        patternDown(5);

        sc.close();
    }
}
