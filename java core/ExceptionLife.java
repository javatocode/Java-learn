
class ExceptionHandle {
    void handle() {
        arithmaticException();
        nullpointerException();
        numberformatException();
        arrayindexoutofboundException();
        stringoutofboundException();
        usethrow(11);
        System.out.println("I am out side of try and catch and finally....");

        try {
            System.out.print("I am nested try running...");
            try {
                Number[] a = new Double[2];
                a[0] = 4;
                System.out.println(a);
            } catch (ArrayStoreException as) {
                System.out.println(as);
            }
        } catch (Exception r) {
            System.out.println(r);
        } finally {
            System.out.println("finally block is always executed in nested...");
        }

    }

    void usethrow(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("not valid");

        } else {
            System.out.println("welcome to vote");
        }
    }

    void arithmaticException() {
        try {
            int a = 5 / 0;

            System.out.print(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println("Some other exception..");
        }
    }

    void nullpointerException() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException n) {
            System.out.println(n);
        } finally {
            System.out.println("finally block is always executed in null pointer");
        }
    }

    void numberformatException() {
        try {
            String s = "ajay";
            int s1 = Integer.parseInt(s);
            System.out.println(s1);
        } catch (NumberFormatException ne) {
            System.out.println(ne);
        }
    }

    void arrayindexoutofboundException() {
        try {
            int a[] = new int[3];
            a[4] = 5;
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println(ar);
        }
    }

    void stringoutofboundException() {
        try {
            String sr = "Manohar";
            System.out.println(sr.charAt(10));
        } catch (StringIndexOutOfBoundsException st) {
            System.out.println(st);
        }
    }

}

class ExceptionLife {

    // Exception is to maintain the normal flow of the application.
    // handle the runtime errors

    // try -> write exception code
    // catch -> The "catch" block is used to handle the exception.
    // finally -> run everytime and write important code in it
    // throw -> to throw exception
    // throws -> always with method and declare exception and doesn't throw
    // exception.

    // Throwable having exception.. -> ArithmaticException...
    // checked -> complie time
    // uncheck -> runtime
    public static void main(String[] args) {
        ExceptionHandle eh = new ExceptionHandle();
        eh.handle();
    }
}