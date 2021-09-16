interface AddService {
    default void service(int a, int b) {
        System.out.println("Addition : " + (a + b));
    }
}

public class InterfaceService implements AddService {
    public static void main(String[] args) {
        InterfaceService i = new InterfaceService();
        int a = 10;
        int b = 20;
        i.service(a, b);
    }
}