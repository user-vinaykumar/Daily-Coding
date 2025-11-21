package PracticeDay03;

public class StopCarThread implements Runnable{

    private boolean flag = false;

    public void turnOff()
    {
        this.flag = true;
    }

    public boolean turnedOff()
    {
        return this.flag;
    }

    public void run()
    {
        System.out.println("car is moving...");
        while(!turnedOff())
        {
            sleep(1000);
            System.out.println("---");
        }
        System.out.println("car stopped completely");
    }

    public static void sleep(long milis)
    {
        try {
            Thread.sleep(milis);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StopCarThread stopCarThread = new StopCarThread();
        Thread thread = new Thread(stopCarThread);
        thread.start();

        StopCarThread.sleep(7000);

        System.out.println("Turn off the key to stop the car.");
        stopCarThread.turnOff();
        System.out.println("Key of the car turned off");
    }
}
