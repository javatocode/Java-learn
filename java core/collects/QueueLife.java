package collects;

import java.util.*;

// remove , element, add -> it basically throws exception
// poll , peek, offer -> it return value is null or true/false
public class QueueLife {
    public void queuelife() {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> w = new PriorityQueue<>();
        ArrayDeque<Integer> e = new ArrayDeque<>();
        ArrayDeque<Integer> l = new ArrayDeque<>();

        Scanner cp = new Scanner(System.in);
        int c = cp.nextInt();
        // push ele
        for (int i = 0; i < c; i++) {
            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();
            q.offer(d);
            w.offer(d);
            e.offerFirst(d);
            l.offerLast(d);
        }
        System.out.println("Deque at first : " + e);
        System.out.println("Deque at last : " + l);
        System.out.println("queue ele : " + q + " priority queue ele : " + w);

        // pop ele
        int y = q.poll();
        int f = w.poll();
        int u = e.pollFirst();
        int b = l.pollLast();
        System.out.println("Deque at poll first : " + u);
        System.out.println("Deque at poll last : " + b);
        System.out.println("front value: " + y + " proirity front ele :" + f);

        // peek
        int x = q.peek();
        int v = w.peek();
        int r = e.peekFirst();
        int g = l.peekLast();
        System.out.println("Deque at peek first : " + r);
        System.out.println("Deque at peek last : " + g);
        System.out.println("Next element in queue : " + x + " Next ele in prority : " + v);
    }
}
