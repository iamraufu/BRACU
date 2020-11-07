public class ArrayInsertSort{
    public static void main (String [] args){
        
        ArrayInsertSort as = new ArrayInsertSort();
        int [] a = {30,40,10,50,70};
        as.insertsort(a);
        as.print(a);
    }
    public static int[] insertsort(int [] arr){
        for(int i=0; i<arr.length; ++i){
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
    
    public void print(int [] arr){
        for(int i=0; i<arr.length; ++i){
            
            System.out.print(arr[i] + " ");
        }
    }
}

