package Lec5;

public class _1_PrintNoLoop {

    //link: https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops
    public static void printNos(int n) {
        // Base case
        if(n == 0){
            return;
        }

        //Recursive case
        printNos(n-1);

        //Print case
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printNos(10);
    }
}
