package collects;

import java.util.Arrays;

public class ArraysLife {
    public void arraylife() {
        int[] n = { 1, 2, 3, 4, 5 };
        int search = Arrays.binarySearch(n, 3);
        System.out.println("search ele is present at index : " + search);

        int[] b = { 2, 10, 1, 0, 34, 3, 2, 23, 11, 134 };
        Arrays.sort(b);
        for (int h : b) {
            System.out.println(h + " ");
        }

        Arrays.fill(b, 12);
        for (int h : b) {
            System.out.println(h + " ");
        }

    }
}
