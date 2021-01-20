package CRMNextBaseProject;

public class ThreadSleep {

    public static void threadSleep(int seconds) {
        int milliseconds = seconds*1000;
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
