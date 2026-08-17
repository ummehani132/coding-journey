package codingjourney;

public class Demo {

    // Instance variable
    int a = 66;

    // Static variable
    static int cc = 99;

    // Method
    void m1() {
        // Local variable
        int a = 10;

        System.out.println("Local variable a = " + a);
    }

    // Constructor
    public Demo() {
        int b = 10;

        System.out.println("Constructor variable b = " + b);
    }

    public static void main(String[] args) {

        // Creating an object
        Demo test = new Demo();

        // Calling the method
        test.m1();

        // Accessing the instance variable
        System.out.println("Instance variable a = " + test.a);

        // Accessing the static variable
        System.out.println("Static variable cc = " + cc);

        // Static variable can also be accessed using the class name
        System.out.println("Static variable using class name = " + Demo.cc);
    }
}
