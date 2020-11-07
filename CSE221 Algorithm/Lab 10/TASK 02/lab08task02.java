public class lab08task02{
  public static void main (String[]args){
    int[] arr = {52, 45, 2 ,0, -8 ,1000, 36, 28,20, -34};
    
    for(int i = 0 ; i<arr.length ; i++){
      int temp = arr[i];
      int j = i;
      while (j>0 && arr[j-1]>temp){
        arr[j] = arr[j-1];
        j--;
      }
      arr[j] = temp;
    }
    
    System.out.println("Sorted Array");
    for(int i = 0 ; i <arr.length ; i++){
      System.out.println(arr[i]);
    }
    
    
  }
}