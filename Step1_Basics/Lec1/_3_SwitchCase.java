package Lec1;

import java.util.List;

public class _3_SwitchCase {
    static double switchCase(int choice, List<Double> arr) {
        double value = 0;
        switch (choice) {
            case 1:
                double R = arr.get(0);
                value = Math.PI * R * R;
                break;

            case 2:
                double L = arr.get(0);
                double B = arr.get(1);
                value = L * B;
                break;

            default:
                break;
        }
        return value;
    }
}

//link: https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1
