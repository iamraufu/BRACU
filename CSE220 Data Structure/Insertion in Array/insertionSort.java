public class insertionSort{
    public static void main(String []args){
        int a[]={3,2,8,5,7,9,4};
        Sort(a,1,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    
    public static void Sort(int a[],int start,int end){
        if(start>end)
            return;
        swap(a, start-1, a[start]);
        Sort(a, start+1, end);
    }
    
    public static void swap(int a[], int start, int n){
        if(start<0)
            return;
        if(a[start]>n){
            a[start+1] = a[start];
            a[start] = n;
        }
        swap(a, start-1, n);   
        
    }
}
    