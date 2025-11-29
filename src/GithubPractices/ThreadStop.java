package GithubPractices;

public class ThreadStop implements Runnable{

    private boolean flag = false;

    public void turnoff()
    {
        this.flag = true;
    }

    public boolean turnedOff()
    {
        return this.flag;
    }

    public static void sleep(long milis)
    {
        try {
            Thread.sleep(milis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void run()
    {
        System.out.println("thread started");
        while(!turnedOff())
        {
            ThreadStop.sleep(1000);
            System.out.println("---");
        }
        System.out.println("thread stopped");
    }

    public static void main(String[] args) {
        ThreadStop threadStop = new ThreadStop();
        Thread thread = new Thread(threadStop);
        thread.start();

        sleep(5000);

        System.out.println("try to stop");
        threadStop.turnoff();
        System.out.println("tried");
    }
}
