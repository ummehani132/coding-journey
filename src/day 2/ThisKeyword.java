package day2;

// Demonstration of this keyword

public class ThisKeyword {

    int a = 20;
    int b = 10;

    void m1(int a, int b) {

        System.out.println("Instance variables: " + (this.a + this.b));

        System.out.println("Local variables: " + (a + b));
    }

    public static void main(String[] args) {

        ThisKeyword test = new ThisKeyword();

        test.m1(4, 3);
    }
}