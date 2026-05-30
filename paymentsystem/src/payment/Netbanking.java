package payment;

public class Netbanking extends Pay {
	public void pay(double amount) {
		System.out.println("Netbanking Payment Successfully");
		System.out.println("Amount Paid: "+amount);
	}
}
