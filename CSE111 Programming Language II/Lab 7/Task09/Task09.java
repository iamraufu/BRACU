import java.util.Scanner;
public class Task09{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower case to turn into upper case");
        String s=sc.nextLine();
        MyString s1 =new MyString(s);
        s1.toLowerCase();
    }
}
            