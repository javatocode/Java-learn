public class S {
    private int sid;
    private String sname;
    private String sbranch;

    private Address address;

    public int getSid() {
        return sid;
    }

    public int setSid(int sid) {
        return this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Address getAddress() {
        return address;
    }

    public String getSbranch() {
        return sbranch;
    }

    public void setSbranch(String sbranch) {
        this.sbranch = sbranch;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public S(int sid, String sname, String sbranch, Address address) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.sbranch = sbranch;
        this.address = address;

    }

    public S() {
        super();
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + ", address=" + address + "]";
    }
}
