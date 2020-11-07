public class SelectSort{
    public static void main(String [] args){
        
        SelectSort s = new SelectSort();
        int [] a = {30,40,10,50,70};
        s.sort(a);
        s.print(a);
    } 
    public static void sort(int[]arr){
        for(int i=0; i<arr.length-1; ++i){
            int minIndex = i;
            for(int j=i+1; j<arr.length; ++j){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex < arr[i]){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    
    public void print(int [] arr){
        for(int i=0; i<arr.length; ++i){
            
            System.out.print(arr[i] + " ");
        }
    }
}





