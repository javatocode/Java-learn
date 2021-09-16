package collects;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLife {
    // hashset -> duplicated not allowed and order can be change
    // linkhashset -> having same order in which ele is added
    // treeset -> sorted and big -oh order(n)
    public void hash() {
        Set<Integer> s = new HashSet<>();
        Set<Integer> l = new LinkedHashSet<>();
        Set<Integer> k = new TreeSet<>();
        k.add(6);
        k.add(22);
        k.add(33);
        k.add(12);
        l.add(2);
        l.add(7);
        l.add(0);
        s.add(1);
        s.add(8);
        s.add(90);
        System.out.println("Tree with sorted  : " + k);
        System.out.println("linked hash set order not change  : " + l);
        System.out.println("set ele : " + s);
        System.out.println("set contain 8 ele : " + s.contains(8));
        s.remove(8);
        System.out.println("remove 8 ele : " + s);
        System.out.println("size of set : " + s.size());
        s.clear();
        System.out.println("clear set : " + s);
        System.out.println("set empty or not :" + s.isEmpty());
    }
}
