package Lec2;

import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < (2*n - 1); i++) {
            for (int j = 0; j < (2*n - 1); j++) {
                int top = i;
                int left = j;
                int right = (2*n - 1) - 1 - j;
                int bottom = (2*n - 1) - 1 - i;
               System.out.print(n - (int)(Math.min(Math.min(top, bottom), Math.min(left, right))));
            }
            System.out.println();
        }


        sc.close();
    }
}
