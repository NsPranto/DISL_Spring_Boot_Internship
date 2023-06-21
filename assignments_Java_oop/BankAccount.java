package assignments_Java_oop;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;
    private String Email;
    private String PhoneNumber;
    
    public BankAccount(String accountNumber, double balance, String ownerName, String Email, String PhoneNumber) { //setting constructors
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public void deposit(double DepositedAmmount) { //parameter
        this.balance+=DepositedAmmount;
        System.out.println("Deposited successfully! Your new balance is "+this.balance);
    }

    public void withdraw(double WithdrawlAmmount) {
        if (this.balance-WithdrawlAmmount<0) {
            System.out.println("Withdrawl isn't possible because only "+this.balance+" is left");
        } else {
            this.balance-=WithdrawlAmmount;
            System.out.println("Withdraw sucessfull! Your current balance is "+this.balance);
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    
}
