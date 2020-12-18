
public class DrinkItem extends Item {
	private String type ;
	private int size;
	
	public DrinkItem(String _1, String _2, int x, float y) {
		super(_1, _2, x, y);
		// TODO Auto-generated constructor stub
		kindItem = _1;
		nameOfItem = _2;
		count =x;
		price = y;
		
	}
	public void setType(String t) {
		type = t;
	}
	public void setSize(int s) {
		size = s;
	}
	public String getType() {
		return type;
	}
	
	public int getSize() {
		return size;
	}
	
	
}
