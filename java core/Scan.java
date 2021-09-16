
import java.io.*;
import java.util.Scanner;

class Scan {
    public static void main(String[] args) throws Exception {
        // Use BufferReader and InputStreamReader to scan from keyboard
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int a = Integer.parseInt(br.readLine());
        float f = Float.parseFloat(br.readLine());
        String s = br.readLine();
        float res = a + f;
        System.out.println("Total result :" + res + " " + s);

        // Use Scanner to scan from keyboard

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        float f1 = sc.nextFloat();
        float d = n1 + f1;
        System.out.print(d);

        // Use FileReader for scan from file
        FileReader fr = new FileReader("C:\\Users\\Ajay's\\Desktop\\java\\input.txt");
        BufferedReader b = new BufferedReader(fr);
        String s1 = b.readLine();
        System.out.print(s1);

        // Use of command line argument to scan from keyboard

        int no1 = Integer.parseInt(args[0]);
        float no2 = Float.parseFloat(args[1]);
        String w = args[2];
        System.out.print(no1 + " " + no2 + " " + w);

    }
}