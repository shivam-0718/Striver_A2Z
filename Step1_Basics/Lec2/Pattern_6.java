package Lec2;

import java.util.Scanner;

public class Pattern_6 {
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

        sc.close();
    }
}
