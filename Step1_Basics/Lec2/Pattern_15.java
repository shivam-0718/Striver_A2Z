package Lec2;

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}
