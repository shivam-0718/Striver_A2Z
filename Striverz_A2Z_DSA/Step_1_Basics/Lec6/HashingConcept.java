package Lec6;

import java.util.Scanner;

public class HashingConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter the number for which you want to calculate the frequency: ");
        int freqValue = sc.nextInt();
        System.out.println("Enter the number of operations that you want to perform: ");
        int operations = sc.nextInt();

        //answer
        int ans = numberFreq(numbers, freqValue, operations);
        System.out.println("the number of times of " + freqValue + " in the array is " + ans);
    }

    public static int numberFreq(int[] numbers, int freqValue, int operations){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        System.out.println("Enter the numbers into the array:");
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        //precompute
        int[] hash = new int[13];
        for(int i = 0; i<numbers.length; i++){
            hash[numbers[i]]+=1;
        }

        while(operations -- > 0){
            answer = hash[freqValue];
            //fetch
        }
        return answer;
    }
}
