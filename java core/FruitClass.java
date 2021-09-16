import java.io.*;
import java.util.*;

class Register {

    private static Register register = null;
    private static Register reg = new Register();

    public static Register getInstance() {
        return reg;
    }

    public String getTotalBill(Map<String, Integer> itemDetails) {
        Map<String, Float> detail = new HashMap<String, Float>();
        detail.put("apple", 2.0f);
        detail.put("orange", 1.5f);
        detail.put("mango", 1.2f);
        detail.put("grape", 1.0f);
        Float sum = 0.0f;
        if ((itemDetails.containsKey("apple"))) {
            Float a = (float) itemDetails.get("apple");
            Float b = detail.get("apple");
            sum = sum + a * b;
        }
        if ((itemDetails.containsKey("orange"))) {
            Float a = (float) itemDetails.get("orange");
            Float b = detail.get("orange");
            sum = sum + a * b;
        }
        if ((itemDetails.containsKey("mango"))) {
            Float a = (float) itemDetails.get("mango");
            Float b = detail.get("mango");
            sum = sum + a * b;

        }
        if ((itemDetails.containsKey("grape"))) {
            Float a = (float) itemDetails.get("grape");
            Float b = detail.get("grape");
            sum = sum + a * b;
        }

        String d = sum.toString();
        return d;

        // Write your code here

    }

}

public class FruitClass {
    public static void main(String[] args) throws IOException {

        Scanner readInput = new Scanner(System.in);
        String[] input = readInput.nextLine().split(" ");
        Map<String, Integer> myItems = new HashMap<String, Integer>();
        for (int i = 0; i < input.length; i += 2) {
            myItems.put(input[i], Integer.parseInt(input[i + 1]));
        }
        Register regObj = Register.getInstance();
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();

    }
}

// apple 30 orange 10 mango 20
// o/p 99.0

// orange 10 grape 52 apple 14
// o/p 95.0