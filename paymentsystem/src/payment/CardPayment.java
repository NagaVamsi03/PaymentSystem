package payment;

public class CardPayment extends Pay {
	public void pay(double amount) {
		System.out.println("Card Payment Successfully");
		System.out.println("Amount Paid: "+amount);
	}
}
