package Lec2;

public class Pattern_9 {
    //If we look carefully, Pattern 9 is combination of pattern 7 and pattern 8

    //Upward pyramid
    public static void patternUp(int n) {
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

    //Downward pyramid
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
        patternUp(5);
        patternDown(5);
    }
}
