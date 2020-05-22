
public class StockInfo implements Comparable {
	public final String ticker;
	public final double price;

	public double getPrice() {
		return this.price;
		
	}
	
	public String getName() {
		return this.ticker;
		
	}
	
	public StockInfo(final String symbol, final double thePrice) {
		ticker = symbol;
		price = thePrice;
	}

	public String toString() {
		return ticker + " " + price;
	}
	@Override
	public int compareTo(Object m) {
        return (int) this.price - (int) ((StockInfo) m).getPrice(); 
	}
}

//Copyright Grrrrraaaaaaaahaaaaaam, 2020