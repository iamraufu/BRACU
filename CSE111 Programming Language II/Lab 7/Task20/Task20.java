import java.util.Scanner;
public class Task20{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter strings you want to concat");
        String s=sc.nextLine();
        String v=sc.nextLine();
        MyString s1= new MyString(s);
        MyString s2= new MyString(v);
        System.out.println(s1.concat(s2));
    }
}
        
        