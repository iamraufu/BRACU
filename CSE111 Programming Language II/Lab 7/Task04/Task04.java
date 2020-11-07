import java.util.Scanner;
public class Task04{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        MyString a1= new MyString(s1);
        MyString a2= new MyString(s2);
        System.out.println(a1.endsWith(a2));
    }
}