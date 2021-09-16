
class Account {
    private int acc_no;

    public int get_acc_no() {
        return acc_no;
    }

    public void set_acc_no(int acc_no) {
        this.acc_no = acc_no;
    }
}

public class EncapsulationLife {

    // It is for binding or wrapping variable and methods in single unit.

    // By providing only a setter or getter method, you can make the class read-only
    // or write-only.

    // It is a way to achieve data hiding in Java because other class will not be
    // able to access the data through the private data members.

    public static void main(String[] args) {
        Account ac = new Account();
        ac.set_acc_no(123456789);
        System.out.println("MY account no is :" + ac.get_acc_no());
    }
}
