public class Task1{
  public static void main(String[]args){
    int a[]={10,25,5,20,15};
    selectionSort(a,0,a.length-1);
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
  public static void sort(int b[],int i,int j){
    if(j==b.length){
      return;
    }
    else{
      if(b[j]<b[i]){
        int temp=b[i];
        b[i]=b[j];
        b[j]=temp;
      }
      sort(b,i,j+1);
    }
  }
  public static void selectionSort(int a[],int i,int size){
    if(i==size){
      return;
    }
    else{
      sort(a,i,i+1);
    }
    
    selectionSort(a,i+1,a.length-1);
  }
}
