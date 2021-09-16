package collects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserDefine {
    int rollno;
    String name;
    int age;

    public UserDefine(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public static void show() {
        Scanner c = new Scanner(System.in);
        int ch = c.nextInt();
        for (int i = 0; i <= ch; i++) {
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            String n = sc.next();
            int ag = sc.nextInt();
            UserDefine u = new UserDefine(r, n, ag);
            ArrayList<UserDefine> al = new ArrayList<UserDefine>();
            al.add(u);
            Iterator itr = al.iterator();
            // traversing elements of ArrayList object
            while (itr.hasNext()) {
                UserDefine st = (UserDefine) itr.next();
                System.out.println(st.rollno + " " + st.name + " " + st.age);
            }
        }
    }

}
