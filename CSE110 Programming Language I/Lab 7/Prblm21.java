import java.util.Scanner;
public class Prblm21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lineAmount = sc.nextInt();
        
        for(int lineCount=1; lineCount<=lineAmount-1; lineCount++){
            for(int spCount=1; spCount<= (lineAmount-lineCount);spCount++){
                System.out.print(" ");
            }
            for(int strCount=1; strCount<= lineCount*2-1; strCount++){
                if(strCount>1&&strCount<lineCount*2-1){
                System.out.print(" ");
                }else{
                    System.out.print(strCount);
                }
            }
            
            System.out.println();
        }
        for(int strCount=1; strCount<= lineAmount*2-1; strCount++){
                
                    System.out.print(strCount);
            }
        
    }
}