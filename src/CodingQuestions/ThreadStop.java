package CodingQuestions;

public class ThreadStop implements Runnable {

    private boolean flag = false;

    public void turnOff()
    {
        this.flag = true;
    }

    public boolean turnedOff()
    {
        return this.flag;
    }


    public void sleep(long milis)
    {
        try {
            Thread.sleep(milis);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        System.out.println("Thread started");
        while(!turnedOff())
        {
            sleep(1000);
            System.out.println("---");
        }
        System.out.println("Thread stopped completely.");


    }


    public static void main(String[] args) {
        ThreadStop threadStop = new ThreadStop();
        Thread thread = new Thread(threadStop);
        thread.start();

        threadStop.sleep(5000);

        System.out.println("Hey developer stop the Thread!!");
        threadStop.turnOff();
        System.out.println("Okay, alright!! I'll stop now.");
    }
}