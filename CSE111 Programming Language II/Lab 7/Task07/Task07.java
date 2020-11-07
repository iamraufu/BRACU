import java.util.Scanner;
public class Task07{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        System.out.println("enter which char to change with another char");
        String n=sc.nextLine();
        char [] k=n.toCharArray();
        char oldchar=k[0];
        String b=sc.nextLine();
        char [] m=b.toCharArray();
        char newchar=m[0];
        MyString s1= new MyString(s);
        s1.replaceLast(oldchar ,newchar);
        }
    }
        
        
        