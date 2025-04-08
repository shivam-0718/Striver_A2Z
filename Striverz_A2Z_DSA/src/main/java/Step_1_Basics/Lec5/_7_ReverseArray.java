package Lec5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _7_ReverseArray {
    //Reversing an array concept
    public static int[] reverseArray(int[] num){
        int n = num.length;
        for (int i = 0; i < n/2; i++) {
            int temp = num[i];
            num[i] = num[n - 1 - i];
            num[n - 1 - i] = temp;
        }
        return num;
    }

    //2 pointer approach
    //link: https://www.geeksforgeeks.org/problems/reverse-an-array/0
    public static void reverseArray(int[] num, int length){
        int p1 = 0;
        int p2 = length - 1; //n is the length of the array
        while(p1 < p2){
            int temp = num[p1];
            num[p1] = num[p2];
            num[p2] = temp;
            p1++;
            p2--;
        }
    }

    //using recursion
    public static void reverseArray(int[] num, int start, int end){
        if(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            reverseArray(num, start + 1, end - 1);
        }
    }

    //using libraries
    public static void reverseArray(Integer[] arr){
        Collections.reverse(Arrays.asList(arr));
    }

    //printing an array
    public static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //printing an array for Collections
    public static void printArray(Integer arr[]) {
        int n = arr.length;
        System.out.print("Reversed array is:- \n");
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num = {12, 3, 2, 67, 23, 21};

        //first approach
        int[] reverse = reverseArray(num);
        printArray(reverse, reverse.length);
        System.out.println("============================");

        //second approach
        int[] numbers = {4, 2, 34, 11, 54, 21};
        reverseArray(numbers, numbers.length);
        printArray(numbers, numbers.length);
        System.out.println("==============================");

        //third approach
        int[] number = {11, 2, 12, 9, 17, 7};
        reverseArray(number, 0, number.length - 1);
        printArray(number, number.length);
        System.out.println("==============================");

        //fourth approach
        Integer[] values = {22, 1, 32, 53, 91, 12};
        reverseArray(values);
        printArray(values);
        System.out.println("==============================");
    }
}
