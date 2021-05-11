package Lab3.Task1;

public class ThreadTwo extends Thread {

    @Override

    public void run() {
        System.out.println("Thread 2");

        for (int i = 11; i<=20; i++){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}