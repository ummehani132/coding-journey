package day2;

// Hierarchical Inheritance

class HierarchicalGrandParent {

    void bp() {
        System.out.println("GrandParent: BP");
    }
}

class HierarchicalParent extends HierarchicalGrandParent {

    void cancer() {
        System.out.println("Parent: Cancer");
    }
}

class HierarchicalChild extends HierarchicalGrandParent {

    void diabetes() {
        System.out.println("Child: Diabetes");
    }
}

public class Hierarchical {

    public static void main(String[] args) {

        HierarchicalParent parent = new HierarchicalParent();
        HierarchicalChild child = new HierarchicalChild();

        System.out.println("Parent:");
        parent.bp();
        parent.cancer();

        System.out.println("\nChild:");
        child.bp();
        child.diabetes();
    }
}