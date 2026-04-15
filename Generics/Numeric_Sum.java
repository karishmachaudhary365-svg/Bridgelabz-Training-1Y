package Generic;

import java.util.*;

public class Numeric_Sum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
        System.out.println(sumNumbers(l1));
        List<Double> l2 = Arrays.asList(2.5, 3.5, 4.0);
        System.out.println(sumNumbers(l2));
    }
}
