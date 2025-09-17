public class ATM {
    private double balance;
    public ATM(){
        this.balance=0;
    }
    public void  depost(int amount ) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " in cash. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount for cash deposit.");
        }
    }
    public void deposit(String checkNumber, int amount) {
        if (amount > 0 && checkNumber != null && !checkNumber.trim().isEmpty()) {
            balance += amount;
            System.out.println("Deposited $" + amount + " using check #" + checkNumber + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid check deposit information.");
        }
    }


    public void deposit(String phoneNumber, double amount) {
        if (amount > 0 && phoneNumber != null && !phoneNumber.trim().isEmpty()) {
            balance += amount;
            System.out.println("Deposited $" + amount + " via mobile transfer from " + phoneNumber + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid mobile transfer information.");
        }
    }


    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        ATM atm = new ATM();

        System.out.println("Initial balance: $" + atm.getBalance());
        System.out.println();

        // Deposit using cash
        atm.deposit(100);

        // Deposit using check
        atm.deposit("CHK123456", 250);

        // Deposit using mobile transfer
        atm.deposit("+1-555-0123", 75.50);

        System.out.println();
        System.out.println("Final balance: $" + atm.getBalance());

        // Additional examples with edge cases
        System.out.println("\n--- Additional Examples ---");

        // Invalid cash deposit
        atm.deposit(-50);

        // Invalid check deposit
        atm.deposit("", 100);

        // Invalid mobile transfer
        atm.deposit(null, 50.0);
    }

}
