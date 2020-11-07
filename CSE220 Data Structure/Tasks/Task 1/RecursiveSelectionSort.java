public class RselectSort{
    public static void main (String [] args){
        RselectSort rs = new RselectSort();
        int [] a = {300, 200, 500, 400000, 10};
        rs.sort(a,0);
        rs.print(a,0);
    }
    
    public static int minimum(int [] arr, int index, int min){
        if(index == arr.length){
            return min;
        }
        if(arr[index]<arr[min]){
            min = index;
        }
        return minimum(arr, index+1, min);
    }
    
    public static void sort(int [] arr, int i){
        if(i == arr.length){
            return;
        }
        int min = minimum(arr, i+1, i);
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
        sort(arr, i+1);
    }
    
    public void print(int [] arr, int i){
        if(i == arr.length){
            return;
        }
        else{
            System.out.print(arr[i] + " ");
        }
        print(arr, i+1);
    }
}
