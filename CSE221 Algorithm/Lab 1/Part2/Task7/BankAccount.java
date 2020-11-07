public class BankAccount 
{
    
    private String name;
    protected String address;
    private String accountID;
    private double balance;
    
    public BankAccount(String n, String a, String acI, double b)
    {
        name = n;
        address = a;
        accountID = acI;
        balance = b;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name=n;
    }
    
    public String getAccountID()
    {
        return accountID;
    }
    
    public void setAccountID(String i)
    {
        accountID=i;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String a)
    {
        address=a;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void setBalance(double c)
    {
        balance=c;
    }
    
    public void addInterest()
    {
        balance = balance+ balance* 0.07;
    } 
    
    public String toString()
    {
     return "Name: "+name+" \nAddress: "+address+" \nID: "+accountID+" \nBalance: "+balance+"\n";
    }
}