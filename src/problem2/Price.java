package problem2;

public class Price implements Comparable<Price>{
    private int onward_price;
    private int return_price;
	public Price() {
		super();
	}
	public Price(int onward_price, int return_price) {
		super();
		this.onward_price = onward_price;
		this.return_price = return_price;
	}
	public int getOnward_price() {
		return onward_price;
	}
	public void setOnward_price(int onward_price) {
		this.onward_price = onward_price;
	}
	public int getReturn_price() {
		return return_price;
	}
	public void setReturn_price(int return_price) {
		this.return_price = return_price;
	}
	@Override
	public int compareTo(Price arg0) {
		if(this.onward_price+this.return_price == arg0.onward_price+arg0.return_price)
			return this.onward_price-arg0.onward_price;
		return this.onward_price+this.return_price - arg0.onward_price+arg0.return_price;
	}
}
