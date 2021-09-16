package collects;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapLife {
    // hashap -> duplicate is not allowed if it contain then it's override value
    // treemap -> sorted and unique
    public void map() {
        Map<String, Integer> m = new HashMap<>();
        Map<String, Integer> n = new TreeMap<>();
        n.put("zzz", 2);
        n.put("aa", 3);
        n.put("ttteg", 11);
        m.put("ajay", 10);
        m.put("vijay", 20);
        m.put("sonali", 30);
        System.out.println("tree map value : " + n);
        System.out.println("before map value : " + m);
        if (!(m.containsKey("ajay"))) {
            m.put("ajay", 23);
            System.out.println("after map value : " + m);
        }
        System.out.println("check containe value :" + m.containsValue(null));

        // print
        for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        for (String s : m.keySet()) {
            System.out.println(s);
        }

        for (Integer i : m.values()) {
            System.out.println(i);
        }
    }
}
