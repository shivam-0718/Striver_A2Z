package Lec1;
import java.util.Scanner;

public class _5_WhileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number whose table you want: ");
        int n = sc.nextInt();
        int i = 10;
        while (i > 0){
            System.out.print((n * i) + " ");
            i--;
        }

        //using for loop
        for (int j = 10; j >= 1; j--){
            System.out.print((n * j) + " ");
        }
        System.out.println();
    }
}
//link: https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1