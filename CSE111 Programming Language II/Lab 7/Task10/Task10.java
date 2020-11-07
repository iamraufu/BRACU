import java.util.Scanner;
public class Task10{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Strings to check");
        String k=sc.nextLine();
        String m=sc.nextLine();
        MyString p= new  MyString(k);
        MyString v= new  MyString(m);
        System.out.println(p.equals(v));
    }
}