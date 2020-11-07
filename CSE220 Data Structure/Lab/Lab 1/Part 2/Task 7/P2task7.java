public class P2task7{
  public static void main(String[]args){
    BankAccount acc1=new BankAccount();
    BankAccount acc2=new BankAccount();
    BankAccount acc3=new BankAccount();
    
    acc1.setName("Saif");
    acc1.setAccountID("1234");
    acc1.setAddress("Gulshan");
    acc1.setBalance(1000.00);
    
    acc2.setName("Ehad");
    acc2.setAccountID("5678");
    acc2.setAddress("Banani");
    acc2.setBalance(2000.00);
    
    acc3.setName("Raj");
    acc3.setAccountID("987");
    acc3.setAddress("Dhaka");
    acc3.setBalance(3000.00);
    
    acc1.addInterest();
    acc3.addInterest();
    
    System.out.println("================");
    System.out.println("Name: "+acc1.getName()+"\n"+"address: "+acc1.getAddress()+"\n"+"AccountID: "+acc1.getAccountID()+"\n"+"Balance: "+acc1.getBalance());
    System.out.println("================");
    System.out.println("Name: "+acc2.getName()+"\n"+"address: "+acc2.getAddress()+"\n"+"AccountID: "+acc2.getAccountID()+"\n"+"Balance: "+acc2.getBalance());
    System.out.println("================");
    System.out.println("Name: "+acc3.getName()+"\n"+"address: "+acc3.getAddress()+"\n"+"AccountID: "+acc3.getAccountID()+"\n"+"Balance: "+acc3.getBalance());
  }
}