package Lec6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashingConcept3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element " + i);
            arr[i] = sc.nextInt();
        }

        //pre-compute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key))
                freq = mp.get(key); // fetching value from the map
            freq++;
            mp.put(key, freq);
            // inserting into the map
        }

        // fetch
        System.out.println("Enter the number of operations that you want to perform: ");
        int operations = sc.nextInt();

        while (operations-- > 0) {
            System.out.println("Enter the number for which you want to calculate the frequency: ");
            int freqValue = sc.nextInt();
            if(mp.containsKey(freqValue)){
                System.out.println(mp.get(freqValue));
            }
        }

        sc.close();
    }
}
