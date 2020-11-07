public class Task2{
  public static void main(String[]args){
    int a[]={10,25,5,20,15};
    insertionSort(a,1);
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
  public static void insertionSort(int a[],int i){
    if(i==a.length){
      return;
    }
    else{
      sort(a,i);
    }
    insertionSort(a,i+1);
  } 
  public static void sort(int b[],int j){
    if(j==0){
      return;
    }
    else{
      if(b[j]<b[j-1]){
        int temp=b[j];
        b[j]=b[j-1];
        b[j-1]=temp;
      }
      sort(b,j-1);
    }
  }
}