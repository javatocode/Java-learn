
public class InnerOuter {

    // Java inner class or nested class is a class which is declared inside the
    // class or interface.

    // Code Optimization

    // to develop more readable and maintainable code because it logically group
    // classes and interfaces in one place only.

    // it can access all the members (data members and methods) of outer class
    // including private

    // static , nonstatic ,local, anonymous class..

    // non static inner class
    private int a = 10;

    class InnerEx1 {
        void msg() {
            System.out.println("My Msg Integer :" + a);
        }
    }

    // static inner class

    static int b = 20;

    static class StaticInner {
        static void reply() {
            System.out.println("My Reply Integer :" + b);
        }

        static void chat() {
            System.out.println("I am chatting with local inner class..");
        }
    }

    // local inner class -> static class is not permited inside local inner classs
    // but i can access static var and method of outside class

    void show() {
        // non static class
        class LocalInner {
            void drink() {
                System.out.println("I am drinking " + a + " liters of water.");
            }
        }

        final class StaticLocalInner {
            void drink() {
                System.out.println("I am accessing static varible here - " + b);
                StaticInner.chat();
            }
        }

        LocalInner l = new LocalInner();
        StaticLocalInner s = new StaticLocalInner();
        s.drink();
        l.drink();
    }

    // A class that have no name is known as anonymous inner class in java.

    // use abstarct
    abstract class Printer {
        abstract void paper();

        void pencil() {
            System.out.println("I am pencil use for papers..");
        }
    }

    // use interface and write public to method
    interface Eatable {
        void eat();
    }

    public static void main(String[] args) {

        InnerOuter obj = new InnerOuter();
        InnerOuter.InnerEx1 i = obj.new InnerEx1();

        // abstract
        InnerOuter.Printer p = obj.new Printer() {
            void paper() {
                System.out.println("I am paper for printing..");
            }
        };

        p.paper();
        p.pencil();
        StaticInner.reply();
        i.msg();
        obj.show();

        // interface
        InnerOuter.Eatable e = new Eatable() {
            public void eat() {
                System.out.println("I am eating food.");
            }
        };
        e.eat();
    }
}
