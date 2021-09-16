
public class Constructor {

    // constructor name = class name
    // it doesn't have any return type
    // new -> create object
    // constructor() --> intialize object

    int a = 10;

    // default constructor
    String n;
    int r, roll_no;
    float pointer;

    Constructor() {
        n = "ajay";
        r = 21;
    }

    Constructor(int n1, float n2) {
        roll_no = n1;
        pointer = n2;
    }

    void display() {
        System.out.println("Student name : " + roll_no);
    }

    public static void main(String[] args) {

        // inbuild or simple constructor
        Constructor c = new Constructor();
        System.out.println(c.a);

        // default constructor
        System.out.println(c.n);
        System.out.println(c.r);

        // parameter constructor
        Constructor c1 = new Constructor(12, 22.21f);
        System.out.println(c1.roll_no + " " + c1.pointer);

        c1.display();

    }
}
