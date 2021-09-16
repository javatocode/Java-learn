package collects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListLife {
    // used to store dynamic array
    public void arraylist() {
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> update_name = new ArrayList<String>();
        ArrayList<Integer> rate = new ArrayList<>();

        // add in array
        rate.add(10);
        rate.add(30);
        name.add("ajay");
        name.add("vijay");
        name.add("adual");
        System.out.println("Array elements : " + name + rate);

        // append to array
        update_name.add("dagadu");
        update_name.add("shamal");
        name.addAll(update_name);
        System.out.println("Update array : " + name);

        // check contain element

        System.out.println("Value is contain or not :" + name.contains("ajay"));

        // for loop array
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }

        // for each array

        for (Integer i : rate) {
            System.out.println(i);
        }

        // print using iterator

        Iterator<String> i = name.iterator();
        while (i.hasNext()) {
            System.out.println("name : " + i.next());
        }

        // sort
        Collections.sort(name);
        for (String k : name) {
            System.out.println(k);
        }

        // access element in array
        System.out.println("Get element at index: " + name.get(1));

        // to know array size
        System.out.println("Size :" + name.size());

        // change item
        name.set(0, "sonali");
        System.out.println("change item at index: " + name);

        // remove item
        name.remove(1);
        System.out.println("Remove item at index : " + name);

        // remove all element
        name.clear();
        System.out.println("Empty array: " + name);
    }

}