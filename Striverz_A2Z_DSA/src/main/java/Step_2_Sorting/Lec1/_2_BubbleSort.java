package src.main.java.Step_2_Sorting.Lec1;
import java.util.Scanner;

public class _2_BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length - 1; i >= 1; i--){
            boolean didSwap = false;
            for(int j = 0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap){
                break;
            }
        }
        //TC: O(n^2) -> Worst, average
        //TC: O(n) -> Best
    }
}
