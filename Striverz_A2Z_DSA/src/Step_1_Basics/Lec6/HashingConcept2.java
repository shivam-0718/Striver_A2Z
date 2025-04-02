package Lec6;
import java.util.Scanner;

public class HashingConcept2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int size = str.length();

        // precompute
        int[] strArr = new int[26];
        for (int i = 0; i < strArr.length; i++) {
            if (i < (size - 1)) {
                strArr[str.charAt(i)]++;
            } else {
                break;
            }
        }

        // fetch
        System.out.println("Enter the number of operations that you want to perform: ");
        int operations = sc.nextInt();

        while (operations-- > 0) {
            System.out.println("Enter the character for which you want to calculate the frequency: ");
            char freqValue = sc.next().charAt(0);
            System.out.println(strArr[freqValue - 'a']);
        }
    }
}
