package Lec2;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // alphabet
            // following the symmetry pattern
            char ch = 'A';
            int breakpoint = (2 * i - 1) / 2;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
