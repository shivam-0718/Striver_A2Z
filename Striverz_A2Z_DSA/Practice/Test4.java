package Practice;

import java.util.Collection;
import java.util.Iterator;
// import java.util.Set;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(62); 
        nums.add(54); 
        nums.add(82); 
        nums.add(21);

        // for (int n : nums) {
        //     System.out.println(n);
        // }
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}
