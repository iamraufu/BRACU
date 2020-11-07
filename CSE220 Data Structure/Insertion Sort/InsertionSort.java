public class InsertionSort{
 void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; i++) { 
            int key = arr[i]; //key=13
            int j = i - 1; //j=1
            
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; //{ 11, 12, 13 ,5, 6 }
                j = j - 1;              //0   1   2  3  4
            } 
            arr[j + 1] = key; 
        } 
    } 


static void printArray(int arr[]) 
{ 
  int n = arr.length; 
  for (int i = 0; i < n; ++i) 
    System.out.print(arr[i] + " "); 
  
  System.out.println(); 
} 

public static void main(String args[]) 
{ 
  int arr[] = { 12, 11, 13, 5, 6 }; 
  
  InsertionSort ob = new InsertionSort(); 
  ob.sort(arr); 
  
  printArray(arr); 
 } 
}