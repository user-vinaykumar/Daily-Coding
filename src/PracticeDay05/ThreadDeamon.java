package PracticeDay05;

public class ThreadDeamon implements Runnable{

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
        while(true)
        {
            sleep(1000);
            System.out.println("---");
        }
    }

    public static void main(String[] args) {
        ThreadDeamon threadDeamon = new ThreadDeamon();
        Thread thread = new Thread(threadDeamon);
        thread.setDaemon(true);
        thread.start();

        threadDeamon.sleep(3100);
    }
}
