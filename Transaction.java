// Transaction class
class Transaction extends Bank {
    public String typeOfTransaction;

    public Transaction(String typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    public void getTransactionDetails(int amount, Customer customer) {
        if (this.typeOfTransaction.equalsIgnoreCase("Withdrawal")) {
            if (customer.BankBalance >= amount) {
                customer.BankBalance -= amount; // Update customer balance directly
                System.out.println("Withdrawal successful. Balance: " + customer.BankBalance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else if (this.typeOfTransaction.equalsIgnoreCase("Deposit")) {
            customer.BankBalance += amount; // Update customer balance directly
            System.out.println("Deposit successful. Balance: " + customer.BankBalance);
        } else if (this.typeOfTransaction.equalsIgnoreCase("CheckBalance")) {
            System.out.println("Available Balance: " + customer.BankBalance);
        } else {
            System.out.println("Invalid transaction type.");
        }
    }
}
