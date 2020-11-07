import java.util.Scanner;
public class Task02{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        MyString a1= new MyString(s);
        System.out.println("Which index to check?");
        int k = sc.nextInt();
        System.out.println(a1.charAt(k));
    }
}
        
    