package CodingQuestions;

public class ThreadDeamon implements Runnable {

    @Override
    public void run() {
        while (true) {
            sleep(1000);
            System.out.println("---");
        }
    }

    void sleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ThreadDeamon threadDeamon = new ThreadDeamon();
        Thread thread = new Thread(threadDeamon);
        thread.setDaemon(true);
        thread.start();
        threadDeamon.sleep(5000);

    }

}
