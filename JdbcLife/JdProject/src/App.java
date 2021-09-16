import java.io.BufferedReader;
import java.io.InputStreamReader;

import studpack.Student;
import studpack.StudentDao;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Student managemnet app : ");
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);

        while (true) {
            System.out.println("1. Add Student Details : ");
            System.out.println("2. Display Student Details :");
            System.out.println("3. Delete Student Details : ");
            System.out.println("4. Update Student Details : ");
            System.out.println("5. Exit app");

            int ch = Integer.parseInt(br.readLine());
            if (ch == 1) {
                // Add Student Details
                System.out.println("Enter Student Name : ");
                String name = br.readLine();
                System.out.println("Enter Student City : ");
                String phone = br.readLine();
                System.out.println("Enter Student Phone : ");
                String city = br.readLine();

                // create student object to store student
                Student st = new Student(name, phone, city);
                boolean ans = StudentDao.insertStudentToDB(st);
                if (ans) {
                    System.out.println("Student is added successfully.");
                } else {
                    System.out.println("Something went wrong.");
                }
                System.out.println(st);

            } else if (ch == 2) {
                // Display Student Details
                StudentDao.showAllStudent();
            } else if (ch == 3) {
                // Delete Student Details
                System.out.println("Enter Student id to delete:");
                int userId = Integer.parseInt(br.readLine());
                boolean ans = StudentDao.deleteStudent(userId);
                if (ans) {
                    System.out.println("Student " + userId + " is deleted.");
                } else {
                    System.out.println("Something went wrong.");
                }
            } else if (ch == 4) {
                // update student details
                System.out.println("Enter Student id to update:");
                int userId = Integer.parseInt(br.readLine());
                System.out.println("Enter Student Name : ");
                String name = br.readLine();
                System.out.println("Enter Student City : ");
                String phone = br.readLine();
                System.out.println("Enter Student Phone : ");
                String city = br.readLine();
                Student st = new Student(name, phone, city);
                boolean ans = StudentDao.updateStudentToDB(st, userId);
                if (ans) {
                    System.out.println("Student is data updated successfully.");
                } else {
                    System.out.println("Something went wrong.");
                }
                System.out.println(st);
            } else if (ch == 5) {
                // exit app
                break;
            }
        }
        System.out.println("Thank You For using app.");
    }

}
