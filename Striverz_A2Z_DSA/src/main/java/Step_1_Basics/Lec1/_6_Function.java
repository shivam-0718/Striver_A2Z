package Lec1;

public class _6_Function {
    static int[] passedBy(int a, int b) {
        int[] answer = new int[] { a + 1, b + 2 };
        return answer;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        int[] answer = passedBy(a, b);
        System.out.println(answer[0] + " " + answer[1]);
    }
}
//link: https://www.geeksforgeeks.org/problems/pass-by-reference-and-value/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pass-by-reference-and-value