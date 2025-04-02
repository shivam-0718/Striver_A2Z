package Lec6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_freqCount {
    public static void main(String[] args) {
        List<Integer> ans = freqCount(new int[]{3, 3, 3, 3});
        System.out.println(ans);
    }

    public static List<Integer> freqCount(int[] arr){

       int[] hashArr = new int[arr.length];
       for(int i = 0; i < hashArr.length; i++){
           hashArr[arr[i]-1] += 1;
       }
       List<Integer> freqCount = new ArrayList<>();
       for(int n : hashArr){
           freqCount.add(n);
       }
       return freqCount;

    }
}
