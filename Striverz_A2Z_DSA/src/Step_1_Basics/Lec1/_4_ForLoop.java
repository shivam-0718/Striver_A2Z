package Lec1;

public class _4_ForLoop {
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n < 2) {
            return 1;
        }
        int a = 1, b = 1, ans = 0;

        // as first 2 elements are fixed as 1, 1, so we are adding elements from
        // position 3(so we need to omit 1 and 2 place)
        for (int i = 0; i < n - 2; i++) {
            ans = a + b;
            a = b; // updating a with value of b
            b = ans; // updating b with the latest value
        }
        return ans;
    }

    public static void main(String[] args) {
        int answer = fibonacci(6);
        System.out.println("Answer = " + answer);
    }
}
// link:
// https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf