
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MakeMeRich {
	public static final List<String> symbols = Arrays.asList("AMD", "HPQ",
			"IBM", "TXN", "VMW", "XRX", "AAPL", "ADBE", "AMZN", "CRAY", "CSCO",
			"SNE", "GOOG", "INTC", "INTU", "MSFT", "ORCL", "TIBX", "VRSN",
			"YHOO");
	
	

	

	public static void main(String[] args) {

		// 1. Print these symbols using a Java 8 for-each and lambdas
		symbols.forEach(symbol -> {
			System.out.println(symbol);
		});
		// 2. Use the StockUtil class to print the price of Bitcoin
		System.out.println(StockUtil.getPrice("BTC-USD"));
		// 3. Create a new List of StockInfo that includes the stock price
		final List<StockInfo> info = new ArrayList<StockInfo>();
		symbols.forEach(symbol -> {
			StockInfo si = StockUtil.getPrice(symbol);
			info.add(si);
		});		
		// 4. Find the highest-priced stock under $500
		Object[] str = info.stream().filter(c -> c.price < 500).sorted().toArray();
		System.out.println(Arrays.toString(str));
		//Yaaay! 
		
	}

}