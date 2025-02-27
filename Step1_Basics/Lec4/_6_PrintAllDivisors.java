package Lec4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _6_PrintAllDivisors {
    //link: https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
    //Calculate the sum of total number of divisors
    /*
     * Input: n = 4
    Output: 15
    Explanation:
    F(1) = 1
    F(2) = 1 + 2 = 3
    F(3) = 1 + 3 = 4
    F(4) = 1 + 2 + 4 = 7
    So, F(1) + F(2) + F(3) + F(4) = 1 + 3 + 4 + 7 = 15
     */
    public static int sumOfDivisors(int n) {
        int totalSum = 0;
        for(int i=1; i<=n; i++){
            totalSum += sum(i);
        }
        return totalSum;
    }
    
    public static int sum(int num){
        int sum = 0;
        for(int i = 1; i<= num; i++){
            if(num%i == 0){
                sum += i;
            } else{
                continue;
            }            
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printDivisors(num);
        sc.close();
    }

    public static void printDivisors(int num){
        List<Integer> divisors = new ArrayList<>();
        for(int i = 1; i <= (int) Math.sqrt(num); i++){
            if(num%i == 0){
                divisors.add(i);
                if ((num / i) != i){
                    divisors.add(num / i);
                } 
            } 
                      
        }
        Collections.sort(divisors);
        for (Integer integer : divisors) {
            System.out.println(integer);
        }
    }
}
