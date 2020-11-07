public class insertionSort{
  public static void main(String[]args){
    int a[]={5,10,20,25,15};
    for(int i=1;i<a.length;i++){
      for(int j=i;j>0;j--){
        if(a[j]<a[j-1]){
          int temp=a[j];
          a[j]=a[j-1];
          a[j-1]=temp;
        }
      }
    }
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}