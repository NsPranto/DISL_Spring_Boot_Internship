public class BankAccount {
    int customerid;
   String accountNumber;
   double balance;
   
public int getCustomerid() {
    return customerid;
}
public void setCustomerid(int customerid) {
    this.customerid = customerid;
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
float amount;
   
   void insert(int a, String n, float amt){ //method to initialize object
    customerid = a;
    accountNumber = n;
    balance = amt;
   }
   void deposit(float amt){
    balance = amount+amt;
    System.out.println("Deposit: "+amt);
   }
   void withdraw(float amt){
    if (amount<amt) {
        System.out.println("Ammount is insufficient");
    } else {
       amount=amount-amt;
       System.out.println("Withdraw: "+amt); 
    }
   }

   void checkbalance(){
    System.out.println("Balance is "+ amount);
   }
   void display(){
    System.out.println("\n" + "Account Details: "+"\n"+"Account Number: "+customerid+"\n"+"Account Name: "+accountNumber+"\n"+"Amount: "+amount);
   }
}

