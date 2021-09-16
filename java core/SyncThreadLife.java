
class ExmapleThread {
    // sync keyword to method

    /* synchronized */ void display() {
        Thread t = Thread.currentThread();
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(t.getName() + " " + i);
            } catch (Exception e) {
            }
        }
        synchronized (this) {

            for (int i = 0; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(t.getName() + " " + i);
                } catch (Exception e) {
                }
            }
        }
    }

    synchronized static void show() {
        Thread t = Thread.currentThread();
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(t.getName() + " " + i);
            } catch (Exception e) {
            }
        }
    }
}

class SubThread extends Thread {
    ExmapleThread e;

    SubThread(ExmapleThread e) {
        this.e = e;
    }

    public void run() {
        e.display();
        ExmapleThread.show();
    }
}

public class SyncThreadLife {
    // Synchronization in java is the capability to control the access of multiple
    // threads to any shared resource

    // Thread sync -> synchronized keyword -> don't override run method -> create
    // new method with sync keyword

    // synchronized block use with inside method for few lines for restrict some
    // lines of codes

    // static synchronized -> no object created - > use with method..

    public static void main(String[] args) {
        ExmapleThread ex = new ExmapleThread();
        SubThread s1 = new SubThread(ex);
        SubThread s2 = new SubThread(ex);
        SubThread s3 = new SubThread(ex);
        s1.start();
        s2.start();
        s3.start();

    }
}
