public class lab08task01{
  public static void main (String [] args){
    int[] arr = {50 , 2 , 6 , 87 , 12, 65};
    
    for (int i = 0 ; i<arr.length-1 ; i++){
      int minIndex = i;
      for(int j = i+1 ; j<arr.length ; j++){
        if(arr[j]<arr[minIndex]){
          minIndex = j;
        }
      }
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
    
    
    System.out.println("Sorted Array");
    for(int i = 0 ; i <arr.length ; i++){
      System.out.println(arr[i]);
    }
  }
}