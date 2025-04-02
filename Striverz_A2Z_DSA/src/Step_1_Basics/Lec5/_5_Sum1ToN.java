package Lec5;

public class _5_Sum1ToN {
    static int sum = 0;
    public static void sum(int n){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        sum(n - 1);
    }

    //link: https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
    static int ans = 0;
    public static int sumOfSeries(int n) {
        if(n == 0){
            return 0;
        }
        ans = (int) Math.pow(n, 3);
        return ans + sumOfSeries(n - 1);
    }

    public static void main(String[] args) {
        int ans = sumOfSeries(5);
        System.out.println(ans);
    }
}
