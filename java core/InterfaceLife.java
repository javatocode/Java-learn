
interface Rich {
    void rlive();

    abstract void nature();
}

interface Poor {
    void plive();
}

// inteface to inteface
interface NatureOfPoor extends Poor {
    void display();
}

// abstact class to interface
abstract class DetailOfFamily implements Rich, NatureOfPoor {
    @Override
    public void nature() {
        System.out.println("The nature of rich people is devil.");
    }

    @Override
    public void rlive() {
        System.out.println("I am from rich family.");
    }

    @Override
    public void plive() {
        System.out.println("I am from poor family.");
    }

    @Override
    public void display() {
        System.out.println("The nature of poor people is kind.");
    }
}

// class to class
public class InterfaceLife extends DetailOfFamily {

    // To achieve multiple inheritence and abstraction.
    // interface object is not created.

    public static void main(String[] args) {
        InterfaceLife i = new InterfaceLife();
        i.nature();
        i.rlive();
        i.display();
        i.plive();
    }
}
