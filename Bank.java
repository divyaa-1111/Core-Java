public class Bank {
    double amount;

    // Parameterized constructor to initialize amount
    Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    // Method to deposit money
    void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposited: " + depositAmount);
    }

    // Method to withdraw money using ternary operator
    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdraw successful" : "Insufficient balance";
        
        System.out.println(message);
        
        // Update amount only if withdrawal was successful
        amount = (withdrawalAmount <= amount) ? (amount - withdrawalAmount) : amount;
    }

    void displayBalance() {
        System.out.println("Total balance: " + amount);
    }
    
    public static void main(String[] args) {
        // Initialize with 10000 as per lab instructions
        Bank myAccount = new Bank(10000);

        // Perform withdrawal (example)
        myAccount.withdraw(3000);

        // Deposit 5000 as per lab instructions
        myAccount.deposit(5000);

        // Display final balance
        myAccount.displayBalance();
    }
}