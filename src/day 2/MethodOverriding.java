package day2;
//Polymorphism
//Method Overriding

class Parent {

 void property() {
     System.out.println("Property inherited from parent");
 }

 void marry() {
     System.out.println("Family selected girl/boy");
 }
}

public class MethodOverriding extends Parent {

 @Override
 void marry() {
     System.out.println("Campus selected girl/boy");
 }

 public static void main(String[] args) {

     MethodOverriding test = new MethodOverriding();

     test.marry();
     test.property();
 }
}
