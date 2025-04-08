package Lec5;

public class _2_NameNoLoop {
    //link: https://www.geeksforgeeks.org/problems/print-gfg-n-times/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-gfg-n-times

    public static void printNames(int n){
        if(n == 0){
            return;
        }
        System.out.print("Shivam ");
        printNames(n-1);
    }
    public static void main(String[] args) {
        printNames(10);
    }
}
