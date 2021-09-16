
// interface inside 
interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

// class to interface
class InterFaceClass {

    interface Jack {
        void prints();
    }
}

// interface to class
interface jangle {
    class Book {
        int v = 20;

        void learn() {
            System.out.println("I am Learning java..." + v);
        }
    }

}

class InterfaceInnerOuter implements Showable.Message, InterFaceClass.Jack {

    // class inside class
    class InnerInterface implements jangle {
        int v = 10;

        void learn1() {
            System.out.println("I am Learning java..." + v);
        }
    }

    public void prints() {
        System.out.println("I am printing...");
    }

    public void msg() {
        System.out.println("I am messging...");
    }

    void show() {
        System.out.println("I am showing something..");
    }

    public static void main(String args[]) {
        InterfaceInnerOuter i = new InterfaceInnerOuter();
        Showable.Message message = new InterfaceInnerOuter();
        InterFaceClass.Jack j = new InterfaceInnerOuter();

        InnerInterface b = i.new InnerInterface();
        jangle.Book bk = new jangle.Book();
        bk.learn();
        b.learn1();

        j.prints();
        message.msg();
        i.show();
    }
}
