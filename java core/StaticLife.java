
class SubStaticLife {
    static float sgpa = 9.30f;

    static void run() {
        System.out.println("I am sub static life running... ");
    }
}

public class StaticLife {

    void sub() {
        int a = 10;
        int b = 20;
        int c = a - b;
        System.out.println("Sum :" + c);
    }

    // Static variable -> access by directly (if single classes) or by classname (if
    // multiple classes)

    // Static blocks -> executed default without any explicit call
    // Static methods

    static int age = 21;

    static void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum :" + c);
    }

    static {
        System.out.println("I am static block running..");
    }

    public static void main(String args[]) {
        add();
        StaticLife sl = new StaticLife();
        sl.sub();

        System.out.println("My age :" + age);
        System.out.println("My sgpa :" + SubStaticLife.sgpa);
        SubStaticLife.run();
    }
}
