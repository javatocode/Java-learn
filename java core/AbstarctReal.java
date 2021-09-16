abstract class Bike1 {

    void repair() {
        System.out.println("I am reparing bike.");
    }
}

public class AbstarctReal extends Bike1 {

    public static void main(String[] args) {

        Bike1 b = new Bike1() {
            @Override
            void repair() {
                System.out.println("I am reparing bike2.");
            }
        };
        b.repair();

    }
}
