package src.main.java.Step_2_Sorting.Lec2;

import java.util.Scanner;

public class _4_QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low <= high){
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= pivot && i <= high - 1){
                i++;
            }

            while(arr[j] > pivot && j >= low + 1){
                j++;
            }
            if(i < j){
                swap(arr[i], arr[j]);
            }
        }
        swap(arr[low], arr[j]);
        return j;
    }

    private static void swap (int x, int y){
        int temp = y;
        y = x;
        x = temp;
    }
}
