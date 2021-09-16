
public class OverloadLife {

    // same method name but different parameter
    // it is on complie time polymorphism
    /*
     * polymorphism (single task in many ways) can be achieve by 1. constructor
     * overloading 2. opreator overloading (+ is use for addition and concatination)
     * 3. method overloading -> dyanmic binding
     */

    // constructor overloading
    OverloadLife() {
        System.out.println("I am default constructor");
    }

    OverloadLife(int a) {
        System.out.println("I am parametr constructor with rate of " + a);
    }

    // method overloading
    float a, b;

    void add() {
        float a = 2.5f;
        float b = 2.5f;
        float c = a + b;
        System.out.println(c);
    }

    int add(int a, int b) {
        return a + b;

    }

    float add(float a, float b) {
        return a + b;

    }

    static void add(float a) {
        System.out.println(a);
    }

    int n1 = 3;
    int n2 = 5;

    public static void main(String[] args) {
        OverloadLife v = new OverloadLife();
        OverloadLife v1 = new OverloadLife(5);
        v.add(2.2f, 3.4f);
        v.add(2, 3);

        add(5.55f);

        // operator overloading

        System.out.println("n1+n2 = " + v.n1 + v.n2);
        System.out.print("n1+n2 = " + (v.n1 + v.n2));
    }
}