package src.main.java.Step_2_Sorting.Lec2;

import java.util.Scanner;

public class _3_RecursiveInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

//        insertionSort(arr);
//        recursiveBubbleSort(arr, arr.length);
        recursiveInsertionSort(arr, 0, arr.length);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void recursiveInsertionSort(int[] arr, int i, int n){
        if(i == n){
            return;
        }
        int j = i;
        while(j > 0 && arr[j - 1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursiveInsertionSort(arr, i+1, n);
    }
}
