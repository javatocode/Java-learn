
class Family {
    void care1() {
        System.out.println("I am Top Family class taking care of others .. ");
    }
}

class Brother extends Family {
    void care2() {
        super.care1();
        System.out.println("I am one of the part of family caring others.. ");
    }
}

public class OverridingLife {

    /*
     * if subclass is not satisfied by parent method then subclass can be override
     * parent method
     */
    // static and final method in parent is not override by subclass
    // paramter, method name , return type and scope is same as parent class
    // use in rutime polymorphism -> static binding

    public static void main(String[] args) {
        Brother b = new Brother();
        b.care1();
    }
}
