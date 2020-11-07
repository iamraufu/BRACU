public class Test{
  public static void main(String [] args){
  
  Test t=new Test();
    int [] a={5,4,3,2,1};
  //  t.selectionsort(a);
   // t.bubblesort(a);
    t.insertionsort(a);
    
    for(int i=0;i<a.length;i++){
    System.out.println(a[i]); 
    }
  
  }
  public void selectionsort(int [] a){
    for(int i=0;i<a.length-1;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[j]<a[i]){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        
        }
      
      }
    
    
    
    }
  
  }
  public void bubblesort(int [] a){
    for(int i=0;i<a.length-1;i++){
      for(int j=0;j<a.length-1;j++){
      
        if(a[j]>a[j+1]){
        int temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
        }
      }
    }
  
  }
  public void insertionsort(int [] a){
    for(int i=1;i<a.length;i++){
      for(int j=i;j>0;j--){
        if(a[j-1]>a[j]){
        int temp=a[j-1];
        a[j-1]=a[j];
        a[j]=temp;
        
        }
      
      }
    
    }
  }

}