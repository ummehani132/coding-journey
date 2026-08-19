package day2;

interface Atm {
    void depo();
    void with();
}

abstract class AbstractAtm implements Atm {

    public void depo() {
        System.out.println("Depos");
    }
}

public class AbstractClass extends AbstractAtm {

    public void with() {
        System.out.println("With");
    }

    public static void main(String[] args) {

        AbstractClass v = new AbstractClass();

        v.depo();
        v.with();
    }
}