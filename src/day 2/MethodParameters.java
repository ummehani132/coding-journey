package day2;

// Passing values through methods

public class MethodParameters {

    int a;
    int b;

    void m1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void m2() {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

        MethodParameters test = new MethodParameters();

        test.m1(4, 3);
        test.m2();
    }
}