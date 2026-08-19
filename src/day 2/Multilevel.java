package day2;

// Multilevel Inheritance

class MultiGrandParent {

    void bp() {
        System.out.println("understain bp");
    }
}

class MultiParent extends MultiGrandParent {

    void cancer() {
        System.out.println("understain");
    }
}

public class Multilevel extends MultiParent {

    public static void main(String[] args) {

        Multilevel bb = new Multilevel();

        bb.bp();
        bb.cancer();
    }
}