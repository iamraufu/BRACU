public class RecursiveArrayInsertSort{
    public static void main (String [] args){
        
        RecursiveArrayInsertSort ras = new RecursiveArrayInsertSort();
        int [] a = {30,40,10,50,70};
        ras.insertsort(a,0);
        ras.print(a,0);
    }
    public static int[] insertsort(int [] arr, int i){
        if(i == arr.length){
            return arr;
        }
        
        for(i=0; i<arr.length; ++i){
            int key = arr[i];
            int j = i-1;
            
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    
    public void print(int [] arr, int i){
        for(i=0; i<arr.length; ++i){
            
            System.out.print(arr[i] + " ");
        }
    }
}

