import java.util.Scanner;
public class task11{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Ten Numbers");
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
        if(a[i]==i){
            a[i]=sc.nextInt();
        }
        if(a.length==i){
            System.out.println("Enter A Different Number");
        }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}