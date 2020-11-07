 class Task9
{
    
    static void insertionSortRecursive(int arr[], int n)
    {
        
        if (n <= 1)
            return;
        insertionSortRecursive( arr, n-1 );
        int last = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
    public String toString() {
    String x=" ";
    for(int i=0;i<arr.length;++i){
    x+=arr[i];
    }
    return x;
    }
    public static void main(String[] args)
    {
        int arr[] = {12, 11, 13, 5, 6};
      Task9 a=new Task9(arr);
        a.insertionSortRecursive(arr, arr.length);
         
        System.out.println(a.toString(arr));
    }
}