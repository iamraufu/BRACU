package Lab3.Task2(Bonus);

import Lab3.Task2(Bonus).Threading;

import java.util.ArrayList;

public class Task2(Bonus) {

    public static void main(String[] args) {
          
        ArrayList<Threading> arrayList = new ArrayList<>();
        int end = 0;
        System.out.println("Single Threaded");

        long timeStart = System.currentTimeMillis();

        for(int i = 0; i < 10; i++) {
            int finalPoint = (i+1)*10000;
            Threading t = new Threading(end+1,finalPoint,i);
            t.run();
            arrayList.add(t);
            end = finalPoint;
        }

        long timeEnd = System.currentTimeMillis();

        System.out.println("Single threaded took " + (timeEnd-timeStart));

        end = 0;
        arrayList.clear();
        System.out.println("Multithreaded");

        timeStart = System.currentTimeMillis();

        for(int i = 0; i < 10; i++) {
            int finalPoint = (i+1)*10000;
            Threading t = new Threading(end+1,finalPoint,i);
            t.start();
            arrayList.add(t);
            end = finalPoint;
        }

        for (Threading i :
                arrayList) {
            try {
                i.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        timeEnd = System.currentTimeMillis();

        System.out.println("Multithreaded took " + (timeEnd-timeStart));
    }
}