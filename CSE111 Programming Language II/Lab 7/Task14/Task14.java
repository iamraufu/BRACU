import java.util.Scanner;
public class Task14{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter value for String");
        String s=sc.nextLine();
        System.out.println("enter value for substring");
        int k=sc.nextInt();
        MyString s1= new MyString(s);
        System.out.println(s1.substring(k));
    }
}
       