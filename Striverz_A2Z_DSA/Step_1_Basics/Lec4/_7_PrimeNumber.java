package Lec4;

import java.util.Scanner;

public class _7_PrimeNumber {
    //link: https://www.naukri.com/code360/problems/check-prime_624934?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    public static boolean isPrime(int num) {
		int count = 0;
		for(int i = 1; i<= (int)Math.sqrt(num); i++){
			if(num % i == 0){
				count++;
				if((num/i) != i){
					count++;
				}
			}
		}
		return count == 2;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        if(ans){
            System.out.println("It is a prime number.");
        } else{
            System.out.println("It is not a prime number.");
        }
        sc.close();
    }
}
