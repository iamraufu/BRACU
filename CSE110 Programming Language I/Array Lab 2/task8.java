import java.util.Scanner;
public class task8{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    String a[]={"Zero"," ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE"};
    System.out.println("Enter Number");
    int n= sc.nextInt();
    for(int i= 0;i<a.length;i++){
    a[i]=sc.nextString();
    }
    }
}