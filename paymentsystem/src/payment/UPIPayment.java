package payment;

public class UPIPayment extends Pay {
	public void pay(double amount) {
		System.out.println("UPI Payment Successfully");
		System.out.println("Amount Paid: "+amount);
	}
}
