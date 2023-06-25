public interface AccountOperations {
    void withdraw(double WithdrawlAmmount);
    void deposit(double depositAmount);
    void transfer(double transferAmount, BankAccount destinationAccount);
}
