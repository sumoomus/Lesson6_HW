
public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(123456789, 1000.0);
        CreditCard card2 = new CreditCard(987654321, 500.0);
        CreditCard card3 = new CreditCard(456789123, 200.0);

        card1.charge(50.0);
        card2.charge(100.0);
        card3.withdraw(50.0);

        card1.display();
        card2.display();
        card3.display();
    }
}

