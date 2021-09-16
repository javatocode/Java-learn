package studpack;

public class Student {
    private int StudId;
    private String StudName;
    private String StudPhone;
    private String StudCity;

    public int getId() {
        return StudId;
    }

    public String getName() {
        return StudName;
    }

    public String getPhone() {
        return StudPhone;
    }

    public String getCity() {
        return StudCity;
    }

    public void setId(int StudId) {
        this.StudId = StudId;
    }

    public void setName(String StudName) {
        this.StudName = StudName;
    }

    public void setPhone(String StudPhone) {
        this.StudPhone = StudPhone;
    }

    public void setCity(String StudCity) {
        this.StudCity = StudCity;
    }

    public Student(int StudId, String StudName, String StudPhone, String StudCity) {
        super();
        this.StudId = StudId;
        this.StudName = StudName;
        this.StudCity = StudCity;
        this.StudPhone = StudPhone;
    }

    public Student(String StudName, String StudPhone, String StudCity) {
        super();
        this.StudName = StudName;
        this.StudCity = StudCity;
        this.StudPhone = StudPhone;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student[StudId=" + StudId + ", StudName=" + StudName + ",StudCity=" + StudCity + ", StudPhone="
                + StudPhone + "]";
    }
}
