import java.util.Arrays;

class InsertionSort
{
    public static void insertionSort(int[] arr, int i, int n)
    {
        int value = arr[i];
        int j = i;

        while (j > 0 && arr[j - 1] > value)
        {
            arr[j] = arr[j - 1];
            j--;
        }

        arr[j] = value;

        if (i + 1 <= n) {
            insertionSort(arr, i + 1, n);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 3, 8, 5, 4, 1, 9, -2 };
        insertionSort(arr, 1, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}