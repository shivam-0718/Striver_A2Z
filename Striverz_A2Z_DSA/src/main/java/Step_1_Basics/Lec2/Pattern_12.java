package Lec2;

public class Pattern_12 {

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(); 
        }    

    }
    public static void main(String[] args) {
        pattern(4);
    }
}
