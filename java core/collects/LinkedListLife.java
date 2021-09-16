package collects;

import java.util.LinkedList;

public class LinkedListLife {
    // used to implement doubly linked list
    public void linkedlist() {
        LinkedList<String> a = new LinkedList<String>();
        // add value
        a.add("ajay");
        a.add("vijay");
        a.addFirst("gangu");
        a.addLast("jaggu");
        System.out.println(a);
        a.removeFirst();
        a.removeLast();
        System.out.println(a);
    }
}
