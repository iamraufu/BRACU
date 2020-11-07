public class selectionSort{
    public static void main(String []args){
        int a[]={1,1,8,2,7,9,4};
        selectionSortR(a, 0, a.length-1);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
    
    public static void selectionSortR(int a[],int start,int end){
        if(start>=end) return;
        int m=findMinIndex(a,start+1,end);
        if(a[start]>a[m]){
            int temp=a[start];
            a[start]=a[m];
            a[m]=temp;
        }
        selectionSortR(a,start+1,end);
    }
    
    public static int findMinIndex(int a[],int start,int end){
        if(start==end) return start;
        int m=findMinIndex(a,start+1,end);
        if(a[m]>a[start])
            return start;
        return m;
    }
}





