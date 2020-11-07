import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("How many Students you want to create");
        int n = sc.nextInt();
        Student s [] = new Student[n];
        for(int i=0 ; i<s.length ; i++){
            s[i] = new Student();
            System.out.println("Enter name");
            String b = sc.next();
            s[i].setName(b);
            System.out.println("Enter id");
            int v =sc.nextInt();
            s[i].setID(v);
            System.out.println("Enter address");
            String f = sc.next();
            s[i].setAddress(f);
            System.out.println(s[i].toString());
        }
    }
}
