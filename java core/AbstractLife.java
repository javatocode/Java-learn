abstract class Bike {
    abstract void driving();

    void repair() {
        System.out.println("I am reparing bike...");
    }
}

abstract class Honda extends Bike {
    void driving() {
        super.repair();
        System.out.println("I am driving Honda bike...");
    }

    void modal() {
        System.out.println("I have 4 types of models...");
    }

    abstract void property();
}

abstract class Hornet extends Honda {
    void property() {
        super.driving();
        super.modal();
        System.out.println("I am Hornet model part of Honda bike...");
    }
}

class HondaDetail extends Hornet {
    void details() {
        System.out.println("I am proposing details of bike...");
    }
}

public class AbstractLife extends Bike {

    // show only functionalities / declarations and not details
    // abstract methods -> use abstract keyword
    // abstarct class -> object is not created , it can contain abstarct methods and
    // normal methods, implementation within subclass
    // concrete class -> implementaion of all abstarct methods , object is created.

    // if any class contain atleast on abstract methods that class also abstarct
    // class.

    void driving() {
        System.out.println("I am in main method for driving...");
    }

    public static void main(String[] args) {

        HondaDetail h = new HondaDetail();
        Bike b = new AbstractLife();

        Bike b1 = new Bike() {
            void driving() {
                System.out.println("I am anonymous abstract class method..");
            }
        };
        b1.driving();
        b.driving();
        h.details();
        h.property();

    }
}
