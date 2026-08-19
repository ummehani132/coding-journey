package day2;

// Encapsulation

 public class Encapsulation {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }



    public static void main(String[] args) {

        Encapsulation test = new Encapsulation();

        test.setA(11);

        int value = test.getA();

        System.out.println("Value of a = " + value);
    }
}