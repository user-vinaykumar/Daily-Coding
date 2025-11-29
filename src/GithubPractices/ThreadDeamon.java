package GithubPractices;

public class ThreadDeamon implements Runnable{

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
        System.out.println("thread started");
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
        sleep(3100);
        System.out.println("stopped");
    }
}
