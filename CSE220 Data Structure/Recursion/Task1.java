import java.util.*;
public class Task1{
  public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  Task1 a=new Task1();
  System.out.println(a.Fact(n));
  
  }
  public int Fact(int b){
    int result;
    if(b==1){
    return 1;
    }
    
    result=b*Fact(b-1);
    return result;
    }
  }