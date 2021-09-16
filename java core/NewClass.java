import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CipherDecipher1 {
    /**
     * 
     * @param normal
     * @return the ciphered message
     */
    public String ciphering(String normal) {
        StringBuffer newStr = new StringBuffer(normal);
        // convert upper to lower vise versa
        for (int i = 0; i < normal.length(); i++) {
            if (Character.isLowerCase(normal.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(normal.charAt(i)));
            } else if (Character.isUpperCase(normal.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(normal.charAt(i)));
            }
        }

        // revrese string
        StringBuffer reverseStr = newStr.reverse();

        // convert space to *
        char ch = '*';
        String rstr = new String(reverseStr);
        rstr = rstr.replace(' ', ch);

        // convert string to ascii
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rstr.length(); i++) {
            if (i % 2 != 0) {
                int m = rstr.charAt(i);
                sb.append(m);
            } else {
                sb.append(rstr.charAt(i));
            }
        }

        // append 3 to last string
        String a = "3";
        String astr = (sb.toString()) + a;

        return astr;

    }

    /**
     * This method is used to get the normal text by the reverse process of
     * ciphering.
     * 
     * @param ciphered
     * @return the deciphered message
     */
    public String deciphering(String ciphered) {

        // remove 3 from last string
        char ch = ' ';
        StringBuffer sm = new StringBuffer(ciphered);
        sm.deleteCharAt(sm.length() - 1);

        // ascii to string

        StringBuffer se = new StringBuffer();
        StringBuffer so = new StringBuffer();

        for (int i = 0; i < sm.length(); i++) {
            if (Character.isDigit(sm.charAt(i))) {
                se.append(sm.charAt(i));

            } else {
                so.append(sm.charAt(i));
            }

        }
        String istr = new String(sm);

        String regex = "((?<=[a-zA-Z-*-/?-^\\s'-/!])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z-*-/?-^\\s'-/!]))";
        List<String> f = Arrays.asList(istr.split(regex));
        System.out.println(f);
        for (int g = 0; g < f.size(); g++) {
            if (g % 2 != 0) {
                // if (f.get(g) == "*") {
                // f.set(g, "*");
                // } else {
                System.out.println(f);
                int h = Integer.parseInt(f.get(g));
                System.out.println(h);
                String d = Character.toString((char) h);
                System.out.println(d);
                f.set(g, d);

            }
        }
        System.out.println(f);
        String rf = String.join(", ", f);
        String h = rf.replace(",", "").replaceAll("\\s+", "");
        // convert * to space
        char cs = '*';
        String rstr = new String(h);
        rstr = rstr.replace(cs, ' ');

        // revrese string
        StringBuffer neStr = new StringBuffer(rstr);
        StringBuffer rvStr = neStr.reverse();

        // convert upper to lower vise versa
        for (int i = 0; i < rvStr.length(); i++) {
            if (Character.isLowerCase(rvStr.charAt(i))) {
                rvStr.setCharAt(i, Character.toUpperCase(rvStr.charAt(i)));
            } else if (Character.isUpperCase(rvStr.charAt(i))) {
                rvStr.setCharAt(i, Character.toLowerCase(rvStr.charAt(i)));
            }
        }

        return rvStr.toString();

    }

}

public class NewClass {

    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        String normal = readInput.nextLine();
        String ciphered = readInput.nextLine();

        CipherDecipher1 cipherOrDecipher = new CipherDecipher1();
        System.out.println(cipherOrDecipher.ciphering(normal));
        System.out.println(cipherOrDecipher.deciphering(ciphered));

    }

}