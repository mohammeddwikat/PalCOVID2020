import java.util.*;

public class Customer {
	private String name;
	private String email;
	private int phoneNumber;
	private String password;
	private String address;
	private PaymentSystem paymentMethod;	
	private ArrayList <Order> currentOrders;
	
	public Customer(String _1, String _2, int pn, String _3, String _4, PaymentSystem _5){
		name = _1;
		email = _2;
		phoneNumber = pn;
		password = _3;
		address = _4;
		paymentMethod = _5;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public ArrayList <Order> getCurrentOrder() {
		return currentOrders;
	}
	public PaymentSystem getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setEmail(String e) {
		email = e;
	}
	
	public void setPass(String p) {
		password = p;
	}
	
	public void setPN(int pn) {
		phoneNumber = pn; 
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public void setPaymentMethod(PaymentSystem a) {
		paymentMethod = a;
	}
	
	public void buyItem(SaledItem a) {
		if(currentOrders.size() == 0) {
			Order order = new Order();
			order.items.add(a);
			currentOrders.add(order);
		}
		for(int i=0; i<currentOrders.size(); i++) {
			if(currentOrders.get(i).storeName.equals(a.store.name)) {
				currentOrders.get(i).items.add(a);
				return;
			}
		}
		Order order = new Order();
		order.items.add(a);
		currentOrders.add(order);
		
	}
	
	public void removeItem(SaledItem a, Order r) {
		for(int i=0 ; i < currentOrders.size(); i++) {
			if(r.equals(currentOrders.get(i))) {
				for(int j=0; j< currentOrders.get(i).items.size(); j++) {
					if(currentOrders.get(i).items.get(j).equals(a)) {
						currentOrders.get(i).items.remove(j);
						return;
					}
				}
				
			}
		}
	}
	
	public void showDetails() {
		System.out.println(name);
		System.out.println(email);
		System.out.println(phoneNumber);
		System.out.println(address);
		System.out.println(paymentMethod);
	}
	
	public void currentOrdersDetails() {
		int n = currentOrders.size();
		if(n == 0)
			System.out.println("No Orders");
		else
			for(int i=0 ; i<n;i++) {
				currentOrders.get(i).showDetails();
				currentOrders.get(i).showItems();
			}
	}
}
