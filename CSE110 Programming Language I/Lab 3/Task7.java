import java.util.Scanner;
public class Task7{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("first is greater");
        }       
        else {
            if (num1 == num2){
                System.out.println("numbers are equal");
            }
            else{
                System.out.println("second is greater");
            }
        }
    }
}