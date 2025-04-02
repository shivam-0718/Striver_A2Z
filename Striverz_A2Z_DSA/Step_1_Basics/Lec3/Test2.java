import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c, e) -> c+e);

        //Simplification for the above 4 lines
        int result2 = nums.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0, (c, e) -> c+e);
        // s1.forEach(n -> System.out.println(n));
        
        Stream<Integer> sortedValues = nums.stream().filter(n -> n%2 == 0).sorted();

        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));
        System.out.println(result);
        System.out.println(result2);
        sortedValues.forEach(n -> System.out.println(n));

    }
}

/**
 * int sum = 0;
 * // for (int n : nums) {
 * // if (n % 2 == 0) {
 * // n = n * 2;
 * // sum += n;
 * // }
 * // }
 * 
 * // for (int i= 0; i < nums.size(); i++) {
 * // System.out.println(nums.get(i));
 * // }
 * nums.forEach(n -> System.out.println(n));
 * 
 * 
 * forEach()
 * List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
 * 
 * nums.forEach((n) -> System.out.println(n));
 */