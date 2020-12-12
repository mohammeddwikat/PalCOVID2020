
public class Customer {
	String name;
	String email;
	int phoneNumber;
	String password;
	String address;
	String paymentMethod;
	
	Order currentOrder;
	
	public Customer(String _1, String _2, int pn, String _3, String _4, String _5){
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
	
	public Order getCurrentOrder() {
		return currentOrder;
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
	
	public void setPaymentMethod(String a) {
		paymentMethod = a;
	}
	
	public void buyItem(SaledItem a) {
		if(currentOrder == null) {
			currentOrder = new Order();
		}
		currentOrder.items.add(a);
		/// pass
	}
	
	public void removeItem(SaledItem a) {
		for(int i=0 ; i < currentOrder.items.size(); i++) {
			if(a.equals(currentOrder.items.get(i))) {
				currentOrder.items.remove(i);
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
	
	public void currentOrderDetails() {
		if(!currentOrder.equals(null)) {
			System.out.println(currentOrder.storeName);
			System.out.println(currentOrder.phoneNumber);
			System.out.println(currentOrder.timePlaced);
			System.out.println(currentOrder.totalPrice);
			System.out.println(currentOrder.pointGained);
			System.out.println(currentOrder.addressDeliver);
			System.out.println(currentOrder.PaymentInformation);
		}else {
			System.out.println("No orders");
		}

	}
	
	
	
}
