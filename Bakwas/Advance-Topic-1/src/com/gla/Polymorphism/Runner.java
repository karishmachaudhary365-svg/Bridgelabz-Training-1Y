package com.gla.Polymorphism;

public class Runner {
    public static void main(String[] args){
        Calculator c1=new Calculator();
        int sum1= c1.add(11,22);
        System.out.println("sum of integer:-"+sum1);
        double sum2=c1.add(11.22,333.555);
        System.out.println("sum of double"+sum2);

    }
}
