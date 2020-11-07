import java.util.Scanner;
public class Task9{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int [] n = new int [10];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        for(int j=0;j<n.length;j++){
            if(j%2==0){
                System.out.print(n[j]+" ");
            }  
        }
        for(int k=0;k<n.length;k++){
            if(k%2==1){
                System.out.print(n[k]+" ");
            }
        }
    }
}

