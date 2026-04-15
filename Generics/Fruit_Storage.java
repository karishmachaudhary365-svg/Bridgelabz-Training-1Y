package Generic;

import java.util.*;

class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<E extends Fruit> {
    List<E> list = new ArrayList<>();

    public void add(E fruit) {
        list.add(fruit);
    }

    public void Print() {
        System.out.println(list);
    }


}
public class Fruit_Storage {
    public static void main(String[] args) {

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.Print();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango());
        mangoBox.Print();
    }
}
