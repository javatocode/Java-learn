
class College {
    String location = "Mumbai";
    String name = "VIT";

    void collgerate() {
        int rate = 9;
        System.out.println("VIT college rate is " + rate);
    }

    College() {
        System.out.println("This is college constructor running ..");
    }
}

class Cs extends College {
    String location = "Delhi";

    // access immediadte parent instance variable
    void display() {

        System.out.println(super.location);

        // access parent class method
        super.collgerate();
    }

    // access parent constructor
    Cs() {
        super();

        System.out.println("This is Cs constructor running ..");
    }

}

public class SuperLife {

    // super is used in only child class
    public static void main(String[] args) {
        Cs c = new Cs();
        c.display();
    }
}
