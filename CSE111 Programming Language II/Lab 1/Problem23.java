import java.util.Scanner;
public class Problem23{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int spC=1;spC<i;spC++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                if(i==1 || i==n || j==n || j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }  
    }
}

