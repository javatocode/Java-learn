public class Ex {
    public static void main(String args[]) {
        try {
            try {
                Number[] a = new Double[2];
                a[0] = 4;
                System.out.println(a);
            } catch (ArrayStoreException as) {
                System.out.println(as);
            } finally {
                System.out.println("I am inner finally block");
            }
        } catch (Exception r) {
            System.out.println(r);
        } finally {
            System.out.println("I am outer finally block");
        }
    }
}
