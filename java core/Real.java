class Bank1 {
    int getROI() {
        return 0;
    }
}

class SBI1 extends Bank1 {

    int getROI() {
        return 8;
    }
}

class ICICI extends Bank1 {
    int getROI() {
        return 7;
    }
}

class AXIS extends Bank1 {
    int getROI() {
        return 9;
    }
}

class CollectAllROI {

    void display() {
        SBI1 s = new SBI1();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getROI());
        System.out.println("ICICI Rate of Interest: " + i.getROI());
        System.out.println("AXIS Rate of Interest: " + a.getROI());
    }
}

public class Real {

    public static void main(String[] args) {
        CollectAllROI c = new CollectAllROI();
        c.display();
    }
}
