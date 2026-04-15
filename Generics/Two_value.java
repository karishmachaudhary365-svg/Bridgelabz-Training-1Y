package Generic;
public class Two_value {
    public static <E> boolean isEqual(E a, E b) {
        return a.equals(b);
    }
    public static void main(String[] args) {
        System.out.println(isEqual(10, 10));
    }
}
