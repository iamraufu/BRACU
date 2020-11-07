public class RecursionExample{
    public static void main(String [] args){
        A(1);
        System.out.println("End");

    }
    
    public static void A(int x){
        System.out.println(x);
        x= x+1;
        if(x<5){
            A(x);
        }
        System.out.println(x);
    }
    
    
}