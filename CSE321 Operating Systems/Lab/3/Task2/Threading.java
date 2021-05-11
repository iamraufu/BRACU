package Lab3.Task2;

public class Threading extends Thread {

    private int start,end,maxCount,threadNumber,maxVal;


    public Threading(int start, int end,int threadNumber) {

        this.start = start;
        this.end = end;
        this.threadNumber = threadNumber;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getStart() {
        return start;
    }

    public int getMaxVal() {
        return maxVal;
    }

    public int getThreadNumber() {
        return threadNumber;
    }

    @Override

    public void run() {
        for (int i = start; i <= end; i++) {
            int c = getNumberDivisor(i);

            if (c > maxCount) {
                maxCount = c;
                maxVal = i;
            }
        }
    }

    private int getNumberDivisor(int value) {
        int count = 0;

        for (int i = 1; i<=value; i++) {
            if (value%i==0) {
                count++;
            }
        }

        return count;

    }
} 