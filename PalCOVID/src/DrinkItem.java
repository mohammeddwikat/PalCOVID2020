
public class DrinkItem extends Item {
	public String type ;
	public int size;
	
	public DrinkItem(String _1, String _2, int x, float y) {
		super(_1, _2, x, y);
		// TODO Auto-generated constructor stub
		kindItem = _1;
		nameOfItem = _2;
		count =x;
		price = y;
		
	}
	
	String getType() {
		return type;
	}
	
	int getSize() {
		return size;
	}
	
	
}
