package Generic;
import java.util.*;

public class Copy_List_Elements {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (int i = 0; i < src.size(); i++) {
            dest.add(src.get(i));
        }
    }
    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(1, 2, 3);
        List<Number> destination = new ArrayList<>();
        copyList(destination, source);
        System.out.println(destination);
    }
}
