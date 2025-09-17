public class ATM {
    private double balance;
    public ATM(){
        this.balance=0;
    }
    public void deposit(int amount ) {
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


        atm.deposit(100);


        atm.deposit("CHK123456", 250);


        atm.deposit("+1-555-0123", 75.50);

        System.out.println();
        System.out.println("Final balance: $" + atm.getBalance());


        System.out.println("\n--- Additional Examples ---");


        atm.deposit(-50);


        atm.deposit("", 100);


        atm.deposit(null, 50.0);
    }

}
