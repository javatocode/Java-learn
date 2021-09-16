
public class ThisLife {

    // use to get current instance variable.
    int a = 10;

    void display() {
        int a = 20;
        System.out.println(a);
        System.out.println(this.a);
    }

    // it is used for current method call

    void extract() {
        System.out.println("I am extract running");
        this.display();

    }

    // use to invoke constructor by this
    ThisLife() {
        System.out.println("I am Thislife constructor running");
    }

    ThisLife(int a) {
        this();
        System.out.println("Parameter " + a);
    }

    public static void main(String[] args) {
        ThisLife t = new ThisLife();
        ThisLife t1 = new ThisLife(1);
        t.display();
        t.extract();
    }
}
