public class Main {
    
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("Eftykhar", "Dhaka", "18", 12000.00);
        BankAccount acc2 = new BankAccount("Rahman", "Chandpur", "301", 1200.00);
        BankAccount acc3 = new BankAccount("Raufu", "Chittagong", "041", 120.00);
        
        acc1.addInterest();
        acc3.addInterest();
        
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        
    }
}
