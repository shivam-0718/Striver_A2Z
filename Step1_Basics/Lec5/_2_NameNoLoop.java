package Lec5;

public class _2_NameNoLoop {
    public static void printNames(int n){
        if(n == 0){
            return;
        }
        System.out.print("Shivam ");
        printNames(n-1);
    }
    public static void main(String[] args) {

    }
}
