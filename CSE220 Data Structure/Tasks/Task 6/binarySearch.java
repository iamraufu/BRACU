public class binarySearch{
  public static void main(String[]args){
    int a[]={5,15,60,25,35,40};
    for(int i=0;i<a.length-1;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[j]<a[i]){
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    System.out.println(binaryRecursion(a,0,a.length-1,35));
  }
  public static int binaryRecursion(int a[],int low,int high,int elem){
    int mid=low+(high-low)/2;
    if(low>high){
      return -1;
    }
    else if(elem==a[mid]){
      return mid;
    }
    else if(elem>a[mid]){
      return binaryRecursion(a,mid+1,high,35);
    }
    else{
      return binaryRecursion(a,low,mid-1,35);
    }
  }
}