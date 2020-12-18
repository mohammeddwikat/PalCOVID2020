
public class SaledItem extends Item{
	int countSaled;
	Customer customer;
	Store store;
	
	public SaledItem(String _1, String _2, int x, float y, int c, Customer cs, Store s) {
		super(_1, _2, x, y);
		if(c > x) {
			countSaled = x;
		}else
			countSaled = c;
		
		customer = cs;
		store = s;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public int getCountSaled() {
		return countSaled;
	}
	
	public void setCountSaled(int x) {
		countSaled = x;
	}
	
	public void showDetails() {
		System.out.print(nameOfItem);
		System.out.print(" ");
		System.out.print(kindItem);
		System.out.print(" ");
		System.out.print(price);
		System.out.print(" ");
		System.out.print(countSaled);
		System.out.print(" ");
		System.out.print(store.name);
		System.out.print(" ");
		System.out.println(store.email);
	}
	
}
