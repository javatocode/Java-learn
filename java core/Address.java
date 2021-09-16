import java.util.Map;

public class Address {
    private Map<String, String> info;

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }

    public Address(Map<String, String> info) {
        super();
        this.info = info;
    }

    public Address() {
        super();
    }

    @Override
    public String toString() {
        return "Address [info=" + info + "]";
    }
}
