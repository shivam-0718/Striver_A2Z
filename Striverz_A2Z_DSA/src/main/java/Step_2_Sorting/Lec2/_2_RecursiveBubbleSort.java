package src.main.java.Step_2_Sorting.Lec2;

import java.util.Scanner;

public class _2_RecursiveBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

//        insertionSort(arr);
        recursiveBubbleSort(arr, arr.length);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void recursiveBubbleSort(int[] arr, int range){
        if(range == 1){
            return;
        }
        for (int j = 0; j <= range - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        recursiveBubbleSort(arr, range-1);
    }


}
