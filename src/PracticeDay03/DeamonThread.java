package PracticeDay03;

public class DeamonThread implements Runnable{


    public static void sleep(long milis)
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

        deamonThread.sleep(3100);


    }
}
