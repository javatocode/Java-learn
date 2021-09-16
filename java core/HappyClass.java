import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Parent {
    int startElement;
    int endElement;

}

class ChildOne extends Parent {
    public static String fliter(int startElement, int endElement) {

        String primeNumbers = "";
        for (int i = startElement; i <= endElement; i++) {
            int num = 0;
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";

            }
        }

        return (primeNumbers);
    }

}

class ChildTwo extends ChildOne {

    public static String fliter(String primeNumbers, int startElement, int endElement) {
        String happyNumbers = "";
        for (int i = startElement; i <= endElement; i++) {
            int result = i;
            while (result != 1 && result != 4) {
                result = isHappyNumber(result);
            }

            if (result == 1)
                happyNumbers = happyNumbers + i + " ";
        }

        return happyNumbers;

    }

    public static int isHappyNumber(int num) {
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }

}

public class HappyClass {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int startElement = scanner.nextInt();
        int endElement = scanner.nextInt();
        String c = ChildOne.fliter(startElement, endElement);
        String cj = ChildTwo.fliter(c, startElement, endElement);
        System.out.println(c);
        System.out.println(cj);

    }
}
