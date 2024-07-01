public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts = 0;
    private static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    public BankAccount(double initialCheckingBalance, double initialSavingsBalance) {
        checkingBalance = initialCheckingBalance;
        savingsBalance = initialSavingsBalance;
        accounts++;
        totalMoney += (initialCheckingBalance + initialSavingsBalance);
    }

    // GETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getNumberOfAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
        System.out.println("Deposited $" + amount + " into " + accountType + " account.");
    }

    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoney -= amount;
                System.out.println("Withdrawn $" + amount + " from " + accountType + " account.");
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoney -= amount;
                System.out.println("Withdrawn $" + amount + " from " + accountType + " account.");
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }

    public void getBalance() {
        System.out.println("Checking Balance: $" + checkingBalance);
        System.out.println("Savings Balance: $" + savingsBalance);
        System.out.println("Total Balance: $" + (checkingBalance + savingsBalance));
    }
}