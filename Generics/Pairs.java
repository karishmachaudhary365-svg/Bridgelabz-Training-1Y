package Generic;
class Pair<X, U> {
    private X first;
    private U second;

    public Pair(X first, U second) {
        this.first = first;
        this.second = second;
    }

    public X getFirst() { return first; }
    public U getSecond() { return second; }
}

public class Pairs {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Yash", 20);
        System.out.println(student.getFirst());
        System.out.println(student.getSecond());

        Pair<Integer, Double> p2 = new Pair<>(10, 5.5);
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());
    }
}

