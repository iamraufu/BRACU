package Lab3.Task2;

import java.text.MessageFormat;
import java.util.ArrayList;

public class TaskTwo {
      
    public static void main(String[] args) {
          
        ArrayList<Threading> arrayList = new ArrayList<>();
        int end = 0;
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

        int max = 0;
        int maxInt = 1;

        for (Threading i :
                arrayList) {
            /*System.out.println("Thread number "+i.getThreadNumber()
                    +" and largest number of divisors "+i.getMaxCount()
                    +" starting point is "+i.getStart()
            );*/
            if(i.getMaxCount() > max) {
                max = i.getMaxCount();
                maxInt = i.getMaxVal();
            }
        }

        System.out.println(MessageFormat.format("Integer is {0} and largest divisor is {1}", maxInt, max));

    }
}