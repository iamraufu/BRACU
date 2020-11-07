import java.util.Scanner;
public class Bin {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int c=0;c<a.length;c++) {
            a[c]=sc.nextInt();
        }
        System.out.println("Please enter a number");
        int elem=sc.nextInt();
        int left=0;
        int right=a.length-1;
        int mid=(right+left)/2;
        for(int c=left;left<=right;c++) {
        if(a[mid]==elem) {
            System.out.print("Element Found in ");
        }
        if(elem>a[mid]) {
            left=mid+1;
            mid=(left+right)/2;
        }
        else {
            right=mid-1;
            mid=(left+right)/2;
        }
        }  
    }  
}
