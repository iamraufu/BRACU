public class CheckingAccount extends Account{
    public static int numberOfAccount=0;
    CheckingAccount(){
        super(0.0);
        ++numberOfAccount;
    }
    CheckingAccount(double r){
        super(r);
        ++numberOfAccount;
    }
}