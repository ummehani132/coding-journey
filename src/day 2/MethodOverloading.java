package day2;


//Method Overloading

public class MethodOverloading {

 void m1() {
     System.out.println("Method without parameter");
 }

 void m1(int a) {
     System.out.println("Method with one parameter: " + a);
 }

 public static void main(String[] args) {

     MethodOverloading test = new MethodOverloading();

     test.m1();
     test.m1(3);
 }
}