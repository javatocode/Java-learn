package collects;

import java.util.Stack;
import java.util.*;

public class StackLife {
    public void stacklife() {
        Scanner cp = new Scanner(System.in);
        int c = cp.nextInt();
        Stack<Integer> s = new Stack<>();
        // push ele
        for (int i = 0; i < c; i++) {
            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();
            s.push(d);
        }
        System.out.println("statck ele : " + s);
        // pop ele
        int y = s.pop();
        System.out.println("POP value: " + y);
        // peek
        int x = s.peek();
        System.out.println("Top most element in statck : " + x);
    }
}
