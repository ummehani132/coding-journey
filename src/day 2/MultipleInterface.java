package day2;

interface AtmDeposit {
    void depo();
}

interface AtmMinimum {
    void min();
}

public class MultipleInterface implements AtmDeposit, AtmMinimum {

    public void depo() {
        System.out.println("dep");
    }

    public void min() {
        System.out.println("min");
    }

    public static void main(String[] args) {

        MultipleInterface v = new MultipleInterface();

        v.min();
        v.depo();
    }
}