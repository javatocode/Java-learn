
public class ConvertType {
    public static void main(String[] args) {
        // String to Int
        int a = Integer.parseInt("100");
        int b = Integer.parseInt("200");
        int c = Integer.valueOf("400");
        System.out.println(" String to Int : " + (a + b + c));

        // String to long

        long d = Long.valueOf("111111111");
        long e = Long.parseLong("222222222");
        System.out.println(" String to Long : " + (d + e));

        // String to Float and float to string
        float p = 6.333f;
        float f = Float.parseFloat("77.33");
        float g = Float.valueOf("33.77");
        String o = Float.toString(p);
        System.out.println(" String to Float : " + (f + g) + " Float to String : " + o);

        // String to Double

        double h = Double.parseDouble("23.5555555");
        double i = Double.valueOf("11.11111111");
        System.out.println(" String to Double : " + (i + h));

        // int to float and float to int
        float j = Float.valueOf(2);
        int k = (int) 33.2f;
        System.out.println(" Int to Float : " + (j) + " Float to Int : " + (k));

        // char to int :
        char n = 'a';
        int x = n;
        System.out.println(" Char to Int : " + x);
    }
}
