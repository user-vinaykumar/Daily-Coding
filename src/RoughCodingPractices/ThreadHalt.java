package RoughCodingPractices;

public class ThreadHalt implements Runnable {
    private boolean flag = false;

    public void turnOff() {
        this.flag = true;
    }

    public boolean turnedOff() {
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
        System.out.println("threadhalt started");
        while (!turnedOff()) {
            sleep(1000);
            System.out.println("---");
        }
        System.out.println("threadhalt stopped");
    }


    public static void main(String[] args) {
        ThreadHalt threadHalt = new ThreadHalt();
        Thread thread = new Thread(threadHalt);
        thread.start();

        threadHalt.sleep(7000);
        System.out.println("initiating to stop the threadhalt");
        threadHalt.turnOff();
        System.out.println("threadHalt stopping initiation successful.");
    }

}
