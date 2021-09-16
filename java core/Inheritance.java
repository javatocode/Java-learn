
// Single inhertance 
class Bank {
    String branch_name = "Mumbai";
    int IFSC = 17101;

    void display() {
        System.out.println("I am parent of all bank..");
    }
}

class SBI extends Bank {
    String bank_name = "SBI";
    String location = "Chembur";
}

// Multilevel inheritance
class ChemburSBI extends SBI {
    String branch_name = "Mahul";

    void display() {
        System.out.println("I am chembur bank located in Mahul..");
    }
}

// Hierarichal inheritance

class Panjab extends Bank {
    String bank_name = "Panjab";
    String location = "Kurla";
}

public class Inheritance {

    // parent class -> super class -> base class
    // child class -> sub class -> derived class
    // single , multi level , hierarical inheritence can be acheived.

    public static void main(String[] args) {
        SBI s = new SBI();
        s.display();
        System.out.println(s.bank_name + " " + " " + s.branch_name + " " + s.location);

        ChemburSBI c = new ChemburSBI();
        c.display();
        System.out.println(c.bank_name + " " + c.branch_name + " " + c.IFSC);

        Panjab p = new Panjab();
        p.display();
        System.out.println(p.bank_name + " " + " " + p.branch_name + " " + p.location);
    }
}
