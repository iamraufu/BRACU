import java.util.Scanner;
public class Prblm24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num*2-1; i++){
            if(i<=num){
                System.out.print(i);
            }else{
                int j = num*2 - i;
                System.out.print(j);
            }
        }
        
    }
}
