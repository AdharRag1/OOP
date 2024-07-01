public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount(1000, 2000);
        BankAccount account2 = new BankAccount(500, 1500);
        BankAccount account3 = new BankAccount(2000, 4000);

        // Deposit Test
        account1.deposit(500, "checking");
        account2.deposit(1000, "savings");
        account3.deposit(1500, "checking");

        // Withdrawal Test
        account1.withdraw(200, "checking");
        account2.withdraw(300, "savings");
        account3.withdraw(5000, "checking"); // This should show insufficient funds

        // Static Test
        System.out.println("Number of Bank Accounts: " + BankAccount.getNumberOfAccounts());
        System.out.println("Total Money: $" + BankAccount.getTotalMoney());
    }
}