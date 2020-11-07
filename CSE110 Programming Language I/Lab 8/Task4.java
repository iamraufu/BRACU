import java.util.Scanner;
public class Task4{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int [] n = new int [20];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        for(int i=n.length-1;i>=0;i--){
            if(n[i]%2==0){
                System.out.print(n[i]+" ");
            }
        }
    }
}