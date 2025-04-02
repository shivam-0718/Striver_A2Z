package Lec5;

public class _9_FibonacciNumber {

    //logic: fib(i) = fib(i - 1) + fib(i - 2)
    public static void fibonacciSeries(int N){
        int[] series = new int[N+1];
        if(N == 0){
            System.out.println(0);
        }
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i < series.length; i++) {
            series[i] = series[i-1] + series[i-2];
        }
        System.out.println("Printing the fibonacci series");
        for(int i : series){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //using recursion
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }

    //using iteration (Good approach)
    public static int fibo(int n){
        if(n <= 1){
            return n;
        }
        int sum = 0;
        int last = 0, slast = 1;
        while (n -- > 1){
            sum = last + slast;
            last = slast;
            slast = sum;
        }
        return slast;
    }


    public static void main(String[] args) {
        fibonacciSeries(10);
        System.out.println(fibo(10));

    }
}
