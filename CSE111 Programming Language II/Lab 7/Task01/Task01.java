import java.util.Scanner;
public class Task01{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        MyString a1= new MyString(s);
        System.out.println(a1.length());
    }
}
        
    