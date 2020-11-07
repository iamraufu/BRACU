import java.util.Scanner;
public class Problem11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int spC=1;spC<=n-i;spC++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j>1&&j<2*i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j);
                    
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int spC=1;spC<=n-i;spC++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j>1&&j<2*i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j);
                    
                }
            }
            System.out.println();
        }
        
        
    }
}

