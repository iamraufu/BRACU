import java.util.Scanner;
public class Task08{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER UPPER CASE VALUE TO LOWERCASE");
        String s=sc.nextLine();
        MyString s1 =new MyString(s);
        s1.toLowerCase();
    }
}
            