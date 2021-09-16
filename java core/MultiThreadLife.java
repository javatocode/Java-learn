
// use inheritance for thread 
class SingleThread extends Thread {
    @Override
    public void run() {
        Thread p = currentThread();
        System.out.println("Status of thread : " + p.isAlive());
        for (int i = 0; i < 5; i++) {
            try {
                p.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception Handle");
            }
            System.out.println("I am run method run by start calling...");
        }
    }
}

// use interface for thread
class IntefaceThread implements Runnable {
    @Override
    public void run() {
        System.out.println("I am runnable method to run...");
    }
}

public class MultiThreadLife {

    // Multithreading in Java is a process of executing multiple threads
    // simultaneously. -> share common address space -> light weight ->
    // context switch is cost low -> it support in java

    // Multitasking is having multiple thred in program -> having diffrent address
    // space -> heavy weight -> context switch is cost high -> not used in java

    // Thread -> run individual part of program.

    // life cycle -> New -> Runnable (Ready to run) -> Running -> if interupt ->
    // waiting/block state else back to Runnable / Running -> stop

    // methods -> start() , run()
    // sleep() -> suspend thread for particular time -> static -> try catch
    // join() -> wait thread to complet it's execution -> multithrad -> try catch
    // getId() -> get id of thread
    // getName() -> thread name -> start from thread-0 ...
    // setName(string) -> change name of thread
    // getPriority() -> 1 - min, 5 - normal(defult) , 10 -max -> get priority
    // setPriority(int) -> set prority of thread
    // isAlive() -> status of thread -> return boolean

    public static void main(String[] args) {
        SingleThread s = new SingleThread();
        IntefaceThread i = new IntefaceThread();
        Thread t = new Thread(i);

        System.out.println("Id of thread : " + t.getId() + " " + "Name of thread :" + t.getName());
        t.setName("Ajay");
        System.out.print("New thread Name :" + t.getName());
        System.out.println("Priority of thread :" + t.getPriority());
        t.setPriority(10);
        System.out.println("New Priority of thread :" + t.getPriority());
        t.start();
        try {
            t.join();
        } catch (Exception e) {
            System.out.println("Exception is handle..");
        }
        s.start();

    }
}
