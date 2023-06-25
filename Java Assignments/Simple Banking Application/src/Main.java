import java.util.Scanner;
class TestAmount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount();
        System.out.println("\n");
        System.out.println("Welcome to XYZ bank!");
        int a = sc.nextInt();
        String n = sc.next();
        float amt = sc.nextFloat();
        b1.insert(a, n, amt);  
        
        b1.checkbalance();
        System.out.println();
        
        System.out.print("Enter amount for deposit: ");
        float d =sc.nextFloat();
        b1.deposit(d);
        b1.checkbalance();
        System.out.println();

        System.out.println("Enter amount for withdraw: ");
        float w = sc.nextFloat();
        b1.withdraw(w);
        b1.checkbalance();
        sc.close();
        
    }
}