package src.main.java.Step_2_Sorting.Lec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1_MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        mergeSort(arr, 0, arr.length - 1);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        //merging elements while comparing first half and second half sorted arrays.
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        //adding remaining elements if in case first half/second half array exceeds
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }

    }
}
