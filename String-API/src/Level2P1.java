package level_2;

import java.util.*;
class L2P1{
static int myLen(String s){
int c=0;
try{ while(true){ s.charAt(c); c++; } }
catch(Exception e){}
return c;
}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println(myLen(s));
System.out.println(s.length());
}}
