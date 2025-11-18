package RoughCodingPractices;

public class DeamonThread implements Runnable{

    public void sleep(long milis)
    {
        try {
            Thread.sleep(milis);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public void run()
    {
        System.out.println("deamon thread started");
        while (true)
        {
            sleep(1000);
            System.out.println("---");
        }
    }
    public static void main(String[] args) {
        DeamonThread deamonThread = new DeamonThread();
        Thread thread = new Thread(deamonThread);
        thread.setDaemon(true);
        thread.start();

        deamonThread.sleep(5000);
    }

}
