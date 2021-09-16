
public class StringLife {
    public static void main(String args[]) {
        // String is immutable means can not be change or modify.
        // memory is wasted if we want

        String str = "Manohar";
        String ptr = "Hello";
        String ftr = "   ajay    ";
        String gtr = "I am ajay";
        String[] wo = gtr.split("\\s");
        for (String w : wo) {
            System.out.println(w);
        }
        String ctr = str.concat(ptr).concat(ftr);
        System.out.println(str.length() + " " + str.indexOf("o") + " " + str.charAt(4) + " " + str.replace("M", "P")
                + " " + str.toLowerCase() + " " + str.toUpperCase() + " " + str.compareTo(ptr) + " " + ftr.trim() + " "
                + ctr);

        // StringBuffer is mutable it means it can be change (synchronized) - safe
        // thread It means two threads can't call the methods of StringBuffer
        // simultaneously.

        StringBuffer sd = new StringBuffer("Welcome");
        sd.append("java");
        System.out.println(sd);
        sd.delete(2, 4);
        System.out.println(sd);
        System.out.println(sd.reverse());
        System.out.println(sd.insert(2, "HI"));

        // StringBuilder is mutable it means can be change (non-sunchronized) - not
        // thread safe
        // It means two threads can call the methods of StringBuilder simultaneously.

        StringBuilder sf = new StringBuilder("Django");
        sf.append("python");
        System.out.println(sf);
    }
}
