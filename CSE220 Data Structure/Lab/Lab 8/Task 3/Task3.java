public class Task3{
  public static void main(String[]args){
    int arr[]={1,2,3,4,5};
    printArray(arr,arr.length-1);
  }
  public static void printArray(int b[],int a){
    if(a>=0){
      printArray(b,a-1);
      System.out.println(b[a]);
    }
  }
}