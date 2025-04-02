package Lec5;

public class _4_PrintNto1 {
    //link: https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-n-to-1-without-loop
    public static void printNto1(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNto1(n-1);
    }

    public static void main(String[] args) {
        printNto1(10);
    }
}
