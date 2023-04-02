public class CreditCard {
    private int accountNumber;
    private double currentAmount;

    public CreditCard(int accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public void charge(double amount) {
        currentAmount += amount;
    }

    public void withdraw(double amount) {
        if (currentAmount >= amount) {
            currentAmount -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Amount: " + currentAmount);
    }
}

