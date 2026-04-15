package Generic;
public class Maximum_of_Three {

    public static <E extends Comparable<E>> E maximum(E x, E y, E z) {
        E max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximum(10, 20, 15));
        System.out.println(maximum(5.5, 2.2, 9.1));
        System.out.println(maximum("Apple", "Orange", "Mango"));
    }
}

