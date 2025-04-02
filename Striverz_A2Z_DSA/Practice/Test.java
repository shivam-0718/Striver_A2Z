package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class Test {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums, com);
        System.out.println(nums);

        // Challenge
        Comparator<String> com1 = (s1, s2) -> s1.length() > s2.length() ? 1 : -1;
        {
            // if (s1.length() > s2.length()) {
            // return 1;
            // } else {
            // return -1;
            // }

        }
        ;
        List<String> names = Arrays.asList("Navin", "Harshit", "Abhinay", "Muhammad");
        Collections.sort(names);
        System.out.println(names);

        Collections.sort(names, com1);
        System.out.println(names);

        // Comparable
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Paul"));
        studs.add(new Student(20, "Kiran"));

        // Comparator<Student> com2 = new Comparator<Student>() {
        // public int compare(Student s1, Student s2) {
        // if (s1.age > s2.age) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        Collections.sort(studs);
        for (Student s : studs) {
            System.out.println(s);
        }
        System.out.println();
    }
}

/*
 * List:
 * List<Integer> numList = new ArrayList<Integer>();
 * numList.add(6);
 * numList.add(5);
 * numList.add(8);
 * numList.add(2);
 * numList.add(6);
 * // System.out.println(numList.get(1));
 * 
 * // System.out.println(numList);
 * // for (Object n : numList) {
 * // System.out.println((Integer)(n));
 * // }
 * numList.add(2, 12);
 * numList.addFirst(12);
 * numList.addLast(4);
 * System.out.println(numList);
 */

/*
 * Set
 * Set<Integer> numList = new HashSet<Integer>(); //If you want to get the
 * unique values without sorting
 * Set<Integer> numList = new TreeSet<>(); //To get the unique values with
 * sorting
 * numList.add(62);
 * numList.add(54);
 * numList.add(82);
 * numList.add(21);
 * System.out.println(numList);
 * 
 * Map:
 * Map<String, Integer> students = new HashMap<>();
 * students.put("Navin", 56);
 * students.put("Harsh", 23);
 * students.put("Sushil", 67);
 * students.put("Kiran", 92);
 * students.put("Harsh", 45);
 * 
 * System.out.println(students.keySet());
 * for(String name : students.keySet()){
 * System.out.println(name + ":" + students.get(name));
 * }stem.out.println(values.next());
 * }
 * 
 */