import java.util.Scanner;
public class task9{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ten Numbers");
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Another Number");
        int n=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                System.out.println("Yes");
                break;
            }
        }
        if(a.length==n){
            System.out.println("No");
        }
    }
}
