
public class App {
	public static void main(String []args) {
		System.out.println("Hello Covid-19");
		System.out.println("Hello Covid-19");
		
		Customer customer1 = new Customer ("Crystel", "Dwikat.M@ieee.org", 599149227,"123456*/-", "Nablus", new JawwalPay());
		Customer customer2 = new Customer ("Imad", "Imad.S@ieee.org", 599149338,"789456*/-", "Tolkarm", new Cash());

		customer1.showDetails();
		customer2.showDetails();


	}
}
