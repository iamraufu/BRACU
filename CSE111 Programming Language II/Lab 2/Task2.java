import java.util.Scanner;
public class Task2{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int []n= new int[10];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
            System.out.print("You have entered ");
            for(int j=0;j<=i;j++){
                System.out.print(n[j]);
                if(n[i]==n[j]){
                    System.out.print("");
                }
                else{
                    System.out.print(",");
                }
            }
        }
    }
}