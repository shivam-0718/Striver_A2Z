package Lec5;

public class _3_Print1ToN {
    //link: https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
    public static void print1ToN(int n){
        if(n == 0){
            return;
        }
        print1ToN(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        print1ToN(10);
    }
}
