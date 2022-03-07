import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Pattern;
public class Lab3 {
public void algo() throws FileNotFoundException{
      Scanner sc = new Scanner(new File("C:\\Users\\HP\\Desktop\\input.txt"));
      int x=sc.nextInt();
      sc.nextLine();
      String str[]=new String[x];
      for(int i=0;i<x;i++){
         str[i] = sc.nextLine().trim();
      }
      int y=sc.nextInt();
      sc.nextLine(); 
      for(int i=0;i<y;i++){
         boolean flag=false;
         String s="";
         String s1=sc.nextLine().trim();
         for(int j=0;j<x;j++){
            if(Pattern.matches(str[j],s1)){
               flag=true;
               s=s+(j+1)+" ";
            }
         }
         if(flag){
            System.out.println("Yes, "+s);
         }  
         else{
            System.out.println("No, "+0);
         }
      }
   }
   public static void main(String[] args) throws FileNotFoundException {
      Lab3 l= new Lab3();
      l.algo();
   }   
}