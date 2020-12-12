
public class SaledItem extends Item{
	int countSaled;
	Customer customer;
	
	public SaledItem(String _1, String _2, int x, float y, int c, Customer cs) {
		super(_1, _2, x, y);
		if(c > x) {
			countSaled = x;
		}else
			countSaled = c;
		
		customer = cs;
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
	
	
}
