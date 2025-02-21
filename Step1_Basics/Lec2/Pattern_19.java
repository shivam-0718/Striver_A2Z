package Lec2;

import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initSpace = 0;
        for (int i = 1; i <= n; i++) {
            // half up pattern
            // stars
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < initSpace; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*");
            }
            initSpace += 2;
            System.out.println();
        }
        // halfdown pattern
        initSpace = 2*(n-1);
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < initSpace; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            initSpace -= 2;
            System.out.println();
        }
        sc.close();
    }
}
