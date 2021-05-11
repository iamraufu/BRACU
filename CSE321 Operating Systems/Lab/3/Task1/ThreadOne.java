package Lab3.Task1;

public class ThreadOne extends Thread {

    @Override
    
    public void run() {
        System.out.println("Thread 1");

        for (int i = 1; i<=10; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        ThreadTwo threadTwo  = new ThreadTwo();

        threadTwo.start();

        try {
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread 1");

        for (int i = 21; i<=30; i++){
            System.out.print(i+" ");
        }

        System.out.println();

    }
}