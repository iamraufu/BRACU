import java.util.Scanner;

public class Task12 
{
    public static void before(int month1,int day1,int month2,int day2) 
    {
        if(month1<month2)
            System.out.println("True");
        else if(month1==month2)
        {
            if(day1<day2)
                System.out.println("True");
            else 
                System.out.println("False");
        }
        else
            System.out.println("False");
    }
    
    public static void main(String []args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter month and day respectively for two times");
        int month1=input.nextInt();
        int day1=input.nextInt();
        int month2=input.nextInt();
        int day2=input.nextInt();
        before(month1,day1,month2,day2);
    }
}