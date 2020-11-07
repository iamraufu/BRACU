import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]={10,25,15,5,20};
    for(int i=0;i<a.length-1;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[j]<a[i]){
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    System.out.println("enter a number");
    int n=sc.nextInt();
    System.out.println(binarySearch(a,0,a.length-1,n));
  }
  public static int binarySearch(int b[],int low,int high,int x){
    int mid=low+(high-low)/2;
    if(low>high){
      return -1;
    }
    else if(x==b[mid]){
      return mid;
    }
    else if(x>b[mid]){
      return binarySearch(b,mid+1,high,x);
    }
    else{
      return binarySearch(b,low,mid-1,x);
    }
  }
}
    
     