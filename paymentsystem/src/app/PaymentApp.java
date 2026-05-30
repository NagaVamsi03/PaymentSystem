package app;
import java.util.*;
import payment.Pay;
import payment.UPIPayment;
import payment.CardPayment;
import payment.Netbanking;


public class PaymentApp {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***** PAYMENT SYSTEM *****");
		System.out.println("1.UPI");
		System.out.println("2.CARD");
		System.out.println("3.NET BANKING");
		
		System.out.println("Enter the Choice");
		int choice=sc.nextInt();
		
		System.out.println("Enter the Amount");
		double amount=sc.nextDouble();
		
		Pay pay=null;
		switch(choice) {
		case 1:
			pay=new UPIPayment();
			break;
		case 2:
			pay=new CardPayment();
			break;
		case 3:
			pay=new Netbanking();
			break;
		default:
			System.out.println("Invalid Choice");
			sc.close();
			return;
		}
		pay.pay(amount);
		sc.close();
	}
}
