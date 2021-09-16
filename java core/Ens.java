import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ens {

    public static void main(String[] args) {
        S s = new S();
        Address a = new Address();
        System.out.println("student data : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll no :");
        int sid = sc.nextInt();
        System.out.println("Enter your name :");
        String sname = sc.next();
        System.out.println("Enter your branch :");
        String sbranch = sc.next();
        System.out.println("Enter your City :");
        String city = sc.next();
        System.out.println("Enter your State :");
        String state = sc.next();
        System.out.println("Enter your Zipcode :");
        String zip = sc.next();
        s.setSid(sid);
        s.setSname(sname);
        s.setSbranch(sbranch);
        Map<String, String> mMap = new HashMap<String, String>();
        mMap.put("city", city);
        mMap.put("state", state);
        mMap.put("zipcode", zip);
        a.setInfo(mMap);
        System.out.println("Roll No : " + s.getSid());
        System.out.println("Name : " + s.getSname());
        System.out.println("Branch : " + s.getSbranch());
        System.out.println("city : " + a.getInfo().get("city"));
        System.out.println("state : " + a.getInfo().get("state"));
        System.out.println("zipcode : " + a.getInfo().get("zipcode"));
    }
}
