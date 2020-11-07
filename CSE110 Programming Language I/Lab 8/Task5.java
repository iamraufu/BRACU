import java.util.Scanner;
public class Task5{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int [] n = new int [10];
        Boolean flag=false;
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        int newN=sc.nextInt();
        for(int i=0;i<n.length;i++){
            if(n[i]==newN){
                flag=true;  
            }   
        }
        if(flag){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
