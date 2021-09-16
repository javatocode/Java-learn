package studpack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean insertStudentToDB(Student st) {
        // jdbc code
        boolean f = false;
        try {
            Connection con = Conn.createConn();
            String q = "insert into students(sname,sphone,scity) values(?,?,?)";
            // prepredstatement
            PreparedStatement pstmt = con.prepareStatement(q);
            // set the vale of parameter
            pstmt.setString(1, st.getName());
            pstmt.setString(2, st.getPhone());
            pstmt.setString(3, st.getCity());

            // execute
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userId) {
        boolean f = false;
        try {
            Connection con = Conn.createConn();
            String q = "delete from students where sid=?";
            // prepredstatement
            PreparedStatement pstmt = con.prepareStatement(q);
            // set the vale of parameter
            pstmt.setInt(1, userId);

            // execute
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static void showAllStudent() {
        try {
            Connection con = Conn.createConn();
            String q = "select * from students";
            // prepredstatement
            Statement stmt = con.createStatement();
            // set the vale of parameter
            ResultSet set = stmt.executeQuery(q);

            // execute and print

            while (set.next()) {
                int id = set.getInt(1);
                String name = set.getString("sname");
                String phone = set.getString("sphone");
                String city = set.getString("scity");

                System.out.println("Students Details : ");
                System.out.println("Id : " + id);
                System.out.println("Name: " + name);
                System.out.println("Phone: " + phone);
                System.out.println("city: " + city);

                System.out.println("+++++++++++++++++++++++++++++++");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static boolean updateStudentToDB(Student st, int userId) {
        // jdbc code
        boolean f = false;
        try {
            Connection con = Conn.createConn();
            String q = "update students set sname=? , sphone=?, scity=? where sid=?";
            // prepredstatement
            PreparedStatement pstmt = con.prepareStatement(q);
            // set the vale of parameter

            pstmt.setString(1, st.getName());
            pstmt.setString(2, st.getPhone());
            pstmt.setString(3, st.getCity());
            pstmt.setInt(4, userId);
            // execute
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

}
