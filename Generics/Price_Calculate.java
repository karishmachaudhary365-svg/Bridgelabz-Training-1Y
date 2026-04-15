package Generic;
import java.util.*;

class Product {
    double price;
    public double getPrice() {
        return price;
    }
}
class Mobile extends Product {
    public Mobile(double price) {
        this.price = price;
    }
}
class Laptop extends Product {
    public Laptop(double price) {
        this.price = price;
    }
}


public class Price_Calculate {
    public static double calculateTotal(List<? extends Product> items) {
        double sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getPrice();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(
                new Mobile(10000),
                new Mobile(20000)
        );
        List<Laptop> laptops = Arrays.asList(
                new Laptop(50000),
                new Laptop(70000)
        );
        System.out.println(calculateTotal(mobiles));
        System.out.println(calculateTotal(laptops));
    }
}
