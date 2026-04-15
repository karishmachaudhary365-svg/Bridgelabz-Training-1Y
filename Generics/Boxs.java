package Generic;
class Box<E> {
    private E value;
    public void set(E value) { this.value = value; }
    public E get() { return value; }
}

public class Boxs{
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(101);
        System.out.println(b1.get());

        Box<String> b2 = new Box<>();
        b2.set("JAVA program");
        System.out.println(b2.get());

        Box<Double> b3 = new Box<>();
        b3.set(5.5234);
        System.out.println(b3.get());
    }
}

