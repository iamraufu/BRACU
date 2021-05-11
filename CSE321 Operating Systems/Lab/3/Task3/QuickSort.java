package Lab3.Task3;

class QuickSort extends Thread {

    private int low,high;
    private int []arr;

    public QuickSort(int[] arr,int low, int high) {
        this.low = low;
        this.high = high;
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++)
        {

            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    @Override

    public void run() {

        if (low < high) {

            int partitionIndex = partition(arr, low, high);

            QuickSort leftPartThread = new QuickSort(arr, low, partitionIndex - 1);
            leftPartThread.start();

            QuickSort rightPartThread = new QuickSort(arr, partitionIndex + 1, high);
            rightPartThread.start();

            try {
                leftPartThread.join();
                rightPartThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}