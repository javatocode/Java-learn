
public class ArrayLife {
    static void add(int a[], int b[]) {
        for (int j = 0; j <= 4; j++) {
            int res = a[j] + b[j];
            System.out.println("Sum of " + a[j] + " and " + b[j] + " is " + res);
        }
    }

    static int[] get() {
        return (new int[] { 11, 22, 33, 44, 55 });
    }

    public static void main(String[] args) {
        // declare array
        int a[] = new int[5];
        // intialization
        int b[] = { 10, 20, 30, 40, 50 };
        // return array from method
        int c[] = get();
        for (int k = 0; k < c.length; k++) {
            int g = c[k] * c[k];
            System.out.println("Mul of " + c[k] + " and " + c[k] + " is " + g);
        }
        for (int i = 0; i <= 4; i++) {
            a[i] = i * i;
            System.out.println("Array value at " + i + " is " + a[i] + " with " + b[i]);
        }
        add(a, b);

        // cloning of array
        int h[] = b.clone();
        for (int l : h) {
            System.out.println("Clone array :" + l);
        }
    }
}
