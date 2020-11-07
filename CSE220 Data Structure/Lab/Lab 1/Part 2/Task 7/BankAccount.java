public class BankAccount{
  String name,address,accountID;
  double balance;
  BankAccount(){
  }
  public String getName(){
  return name;
  }
  public void setName(String n){
  name=n;
  }
  public String getAccountID(){
  return accountID;
  }
  public void setAccountID(String id){
  accountID=id;
  }
  public String getAddress(){
  return address;
  }
  public void setAddress(String add){
  address=add;
  }
  public double getBalance(){
  return balance;
  }
  public void setBalance(double b){
  balance=b;
  }
  public void addInterest(){
  balance=(balance*(7.0/100.0))+balance;
  }
}