public class Main {
    public static void main(String[] args) {
        BankAccount DemoAccount = new BankAccount("012345", 0.0, "Pranto", "nspranto6@gmail.com", "01884416949");
        DemoAccount.deposit(100);
        DemoAccount.deposit(150);
        DemoAccount.withdraw(200);
    }
}
