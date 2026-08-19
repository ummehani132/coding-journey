package day2;


 public class SingleInheritance{

    void cancer() {
        System.out.println("Parent method: Cancer");
    }

    void bp() {
        System.out.println("Parent method: BP");
    }


 

    public static void main(String[] args) {

        SingleInheritance obj = new SingleInheritance();

        obj.bp();
        obj.cancer();
    }
}