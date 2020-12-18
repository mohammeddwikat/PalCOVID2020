
public class Item {
	protected String kindItem;
	protected String nameOfItem;
	protected int count;
	protected float price;
	
	public Item(String _1, String _2, int x, float y) {
		kindItem = _1;
		nameOfItem = _2;
		count =x;
		price = y;
	}
	public int getCount() {
		return count;
	}
	public String getName() {
		return nameOfItem;
	}
	public String getKind() {
		return kindItem;
	}
	public float getPrice() {
		return price;
	}
	public void setCount(int x) {
		count = x;
	}
	public void setName(String na) {
		nameOfItem = na;
	}
	public void setPrice(float x) {
		price = x;
	}
}
