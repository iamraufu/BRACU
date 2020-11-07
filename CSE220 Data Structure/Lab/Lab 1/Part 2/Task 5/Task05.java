public class Task05{
    public static void main(String args[])
   {
    MyReader m = new MyReader();
         int x;
         try{
             x=m.readInteger();
             System.out.println("User gave "+x);
         }
         catch(EitaIntegerNoiException e){
          
             System.out.println("parlam na "+e);
         }
     
   }
}
