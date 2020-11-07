import java.util.Scanner;
public class bubbleSort1{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int []x={1,3,2,5,4};
        int temp;
        for(int i=0;i<x.length;i++){    
            int flag=0;
            for(int j=0;j<x.length-1-i;j++){
                if(x[j]>x[j+1]){
                    temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                    flag=1;
                }
            }
            if (flag==0){
                break;
            }
        }
        System.out.println(x[j]);
    }
}