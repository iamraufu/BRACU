import java.util.Scanner;
public class Problem7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int rowC=1;rowC<=row;rowC++){
            for(int colC=1;colC<=col;colC++){
                if(rowC==1 || rowC==row || colC==1 || colC==col){
                    System.out.print(colC);
                }
                else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }
}