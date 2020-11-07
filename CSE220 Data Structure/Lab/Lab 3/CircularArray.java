import java.util.*;
public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    cir=new Object[lin.length];
    start=st;
    size=sz;
    int k=start;
    for(int i=0;i<lin.length;i++){
      cir[k]=lin[i];
      k=(k+1)%cir.length;
    }
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
    System.out.print("{");
    for(int i=0;i<cir.length;i++){
      System.out.print(cir[i]);
      if(i<cir.length-1){
        System.out.print(",");
      }
    }
    System.out.print("}");
    System.out.println();
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    int k=start;
    System.out.print("{");
    for(int i=0;i<size;i++){
      System.out.print(cir[k]);
      if(i<size-1){
        System.out.print(",");
      }
      k=(k+1)%cir.length;
    } 
    System.out.print("}");
    System.out.println();
  }
  
  
  public void printBackward(){
    int k=(start+size-1)%cir.length;
    System.out.print("{");
    for(int i=0;i<size;i++){
      System.out.print(cir[k]);
      if(i<size-1){
        System.out.print(",");
      }
      k--;
      if(k==-1){
        k=cir.length-1;
      }
    } 
    System.out.print("}");
  }
  
  // With no null cells
  public void linearize(){
    Object lin[]=new Object[size];
    int k=start;
    for(int i=0;i<size;i++){
      lin[i]=cir[k];
      k=(k+1)%cir.length;
    }
    cir=lin;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object lin[]=new Object[newcapacity];
    int k=start;
    int j=start;
    for(int i=0;i<size;i++){
      lin[k]=cir[j];
      k=(k+1)%lin.length;
      j=(j+1)%cir.length;
    }
    cir=lin;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    Object lin[]=new Object[newcapacity];
    int j=start;
    for(int i=0;i<size;i++){
      lin[i]=cir[j];
      j=(j+1)%cir.length;
    }
    cir=lin;
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    if(size==cir.length){
      resizeStartUnchanged(size+3);
    }
   int nshift=size-pos;
   int from=(start+size-1)%cir.length;
   int to=(from+1)%cir.length;
   for(int i=0;i<nshift;i++){
     cir[to]=cir[from];
     to=from;
     from=from-1;
     if(from==-1){
       from=cir.length;
     }
   }
     cir[start+pos]=elem;
     size++;
  }
  
  public void insertByLeftShift(Object elem, int pos){
    if(size==cir.length){
      resizeStartUnchanged(size+3);
    }
    int nshift=size-pos;
    int from=start;
    int to=from-1;
    for(int i=0;i<nshift;i++){
      cir[to]=cir[from];
      to=from;
      from=from+1;
    }
    cir[start+pos]=elem;
    size++;
    start--;
    if(start==-1){
      start=cir.length-1;
    }
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    int from=(pos+size-1)%cir.length;
    int to=cir.length-1;
    for(int i=1;i<=pos;i++){
      cir[to]=cir[from];
      to=from;
      from++;
    }
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    int k=(start+pos)%cir.length;
    for(int i=1;i<=pos;i++){
      cir[k]=cir[k-1];
      k--;
    }
    cir[pos]=null;
    start++;
    size--;
  }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
    int k=start;
    int end=(start+size-1)%cir.length;
    int i;
    for(i=0;i<size/2;i++){
      if(cir[k]!=cir[end]){
        System.out.println("this array is not a palindrome");
        break;
      }
      k=(k+1)%cir.length;
      end--;
      if(end==-1){
        end=cir.length-1;
      }
    }
    if(i==size/2){
      System.out.println("this array is a palindrome");
    }
  }
  
  
  //This method will sort the values by keeping the start unchanged
  public void sort(){
    Object lin[]=new Object[size];
    int a=lin.length-1;
    int c=0;
    int k=start;
    int j=(start+size-1)%cir.length;
    while(c<=size){
      for(int i=0;i<size;i++){
        if((int)cir[k]>(int)cir[j]){
        lin[a]=cir[k];
        }
        j--;
        if(j==-1){
          j=cir.length-1;
        }
      }
      a--;
      k=(k+1)%cir.length;
      c++;
    }
    cir=lin;
  }
  
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k){
    if(size!=k.size){
      return false;
    }
    int z=start;
    int j=k.start;
    for(int i=0;i<size;i++){
      if(k.cir[j]!=cir[z]){
        return false;
      }
      z=(z+1)%cir.length;
      j=(j+1)%k.cir.length;
    }
    return true;
  }
}