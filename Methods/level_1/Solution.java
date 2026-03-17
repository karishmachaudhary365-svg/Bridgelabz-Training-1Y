package com.gla.method;

public class Solution {
    public static void area(double radius){
        double areaOfCircle=Math.PI*radius*radius;
        System.out.println(areaOfCircle);

    }
    public void circum(double radius ){
        double result=2*Math.PI*radius;
        System.out.println(result);

    }
    public static void main(){
        Solution S1=new Solution();
        S1.area(10);
        S1.circum(20);

    }

}
