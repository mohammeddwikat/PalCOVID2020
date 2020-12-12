
public class Custoemr {
	String name;
	String email;
	int phoneNumber;
	String password;
	String address;
	String paymentMethod;
	
	Order currentOrder;
	
	public Custoemr(String _1, String _2, int pn, String _3, String _4, String _5){
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
	
	public void buyItem(Item a) {
		if(currentOrder == null) {
			currentOrder = new Order();
		}
		currentOrder.items.add(a);
		/// pass
	}
	
	public void removeItem(Item a) {
		for(int i=0 ; i < currentOrder.items.size(); i++) {
			if(a.equals(currentOrder.items.get(i))) {
				currentOrder.items.remove(i);
			}
		}
	}
	
	public void showDetails() {
		
	}
	
	
}
