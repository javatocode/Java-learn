
class Teacher {
    int teacher_id = 201;
}

class Student {
    char stud_division;

    Student() {
        System.out.println("Student constuctor is running");
    }

    // Student(char stud_division) {
    // this();
    // this.stud_division = stud_division;
    // }
    Student s;

    void stud_status(Student s) {
        System.out.println("I am on leave today");
    }

    void display_status() {
        stud_status(this);
    }
}

class Var {

    // use of local variable -> within methods and direct access
    // use of instance variable -> inside a class and access through object
    // use of static variable -> memory alloted onecs and directly access and use
    // static keyword -> no object

    int a = 10; // instance var
    static int b = 20; // static var
    static final int r = 10;
    static String stud_college = "VIT";

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display_status();
        // Student s2 = new Student(102);
        // Student s100 = new Student(103);

        System.out.println("Student id : " + stud_college);
        // System.out.println("Student id : " + s2.stud_id);
        // System.out.println("Student id : " + s100.stud_id);

        Teacher t = new Teacher();

        System.out.println("Teacher id : " + t.teacher_id);
    }

}
