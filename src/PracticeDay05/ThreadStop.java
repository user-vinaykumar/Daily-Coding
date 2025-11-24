package PracticeDay05;

public class ThreadStop implements Runnable {

    private boolean flag = false;

    public void turnoff() {
        this.flag = true;
    }

    public boolean turnedoff() {
        return this.flag;
    }

    public void sleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        System.out.println("started");
        while (!turnedoff()) {
            sleep(1000);
            System.out.println("---");
        }
        System.out.println("stopped");
    }


    public static void main(String[] args) {
        ThreadStop threadStop = new ThreadStop();
        Thread thread = new Thread(threadStop);
        thread.start();

        threadStop.sleep(5000);
        System.out.println("turn off");
        threadStop.turnoff();
        System.out.println("turned off");
    }

}
