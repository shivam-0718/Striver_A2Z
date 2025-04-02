//move the java file to Main folder to execute the code.
package Step_2_Sorting.Lec1;
import java.util.Scanner;

public class _1_SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int[] sortedArr = selectionSort(arr);

        for(int i = 0; i<n; i++){
            System.out.print(sortedArr[i] + " ");
        }
    }

    public static int[] selectionSort(int[] arr){
        for(int i = 0; i <= arr.length-2; i++){
            int mini = i;
            for(int j = i; j<arr.length; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}