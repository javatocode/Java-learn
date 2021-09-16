import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cgpa {
    public static void main(String[] args) {
        CgpaAbstarct c = new CgpaAbstarct();
        DecimalFormat df = new DecimalFormat("#.##");
        String allMark = "100 5,100 5,53 5,76 3|0,100,5";
        String[] allm = allMark.split("  |\\|");
        String s = allm[0];
        String r = allm[1];
        String[] d = s.split(",");
        String[] p = r.split(",");
        List<String> sb = new ArrayList<String>();
        List<String> sm = new ArrayList<String>();
        List<Integer> sk = new ArrayList<Integer>();
        List<Integer> so = new ArrayList<Integer>();
        sk.add(Integer.parseInt(p[2]));
        for (int i = 0; i < d.length; i++) {
            String[] k = d[i].split(" ");
            sb.add(k[0]);
            sk.add(Integer.parseInt(k[1]));
            sm.add(k[1]);
        }
        if (Integer.parseInt(p[0]) != 0) {
            sb.add(p[1]);
            sm.add(p[2]);
        }
        Integer max = Collections.max(sk);
        for (int u = 0; u < sk.size(); u++) {
            if (max <= sk.get(u)) {
                so.add(sk.get(u));
            }
            System.out.println(so.toString());
        }
        int usum = so.stream().mapToInt(Integer::intValue).sum();
        System.out.println(
                sb.toString() + "" + sm.toString() + "  " + sk.toString() + "" + max + "  " + so.toString() + usum);
        int csum = 0;
        float a[] = new float[sb.size()];
        String[] fb = new String[1];
        for (int j = 0; j < sb.size(); j++) {
            String q = sb.get(j);
            System.out.println(q);
            if (Integer.parseInt(q) < 40) {
                float grade = 0.0f;
                a[j] = Float.parseFloat(df.format(grade));
            } else if (Integer.parseInt(q) >= 40 && Integer.parseInt(q) <= 49) {
                float grade = 6.0f + (Integer.parseInt(q) - 40) * 0.1f;
                a[j] = Float.parseFloat(df.format(grade));
            } else if (Integer.parseInt(q) >= 50 && Integer.parseInt(q) <= 59) {
                float grade = 7.0f + (Integer.parseInt(q) - 50) * 0.1f;
                a[j] = Float.parseFloat(df.format(grade));
            } else if (Integer.parseInt(q) >= 60 && Integer.parseInt(q) <= 74) {
                float grade = 8.0f + (Integer.parseInt(q) - 60) * 0.07f;
                a[j] = Float.parseFloat(df.format(grade));
            }
            if (Integer.parseInt(q) >= 75 && Integer.parseInt(q) <= 100) {
                float grade = 9.0f + ((Integer.parseInt(q) - 75) * 0.04f);
                a[j] = Float.parseFloat(df.format(grade));
            }
            System.out.println(a[j]);
            csum = csum + Integer.parseInt(sm.get(j));
            System.out.println(q + "=" + a[j] + "credit = " + sm.get(j) + " sum = " + csum);
            float cgpa = 0.00f;
            for (int y = 0; y < a.length; y++) {
                System.out
                        .println(a[y] + " * " + Float.parseFloat(sm.get(y)) + " " + a[y] * Float.parseFloat(sm.get(y)));
                cgpa = cgpa + (a[y] * Float.parseFloat(sm.get(y)));
            }
            cgpa = cgpa / usum;
            System.out.println(cgpa);
            String dstr = String.format("%.02f", cgpa);
            fb[0] = dstr;

        }
        System.out.println(fb[0].toString());

    }
}
