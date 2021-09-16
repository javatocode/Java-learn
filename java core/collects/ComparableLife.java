package collects;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableLife implements Comparable<ComparableLife> {
    int rollno;
    String name;
    int age;

    public ComparableLife(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(ComparableLife o) {
        return this.age - o.age;
    }

    public static void runs() {
        ArrayList<ComparableLife> al = new ArrayList<ComparableLife>();
        al.add(new ComparableLife(101, "Vijay", 23));
        al.add(new ComparableLife(106, "Ajay", 27));
        al.add(new ComparableLife(105, "Jai", 21));

        Collections.sort(al);
        for (ComparableLife st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
