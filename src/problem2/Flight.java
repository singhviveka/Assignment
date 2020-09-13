package problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flight {
	void printCheapestFlights(int[] delhi_to_mumbai, int[] mumbai_to_delhi, int k) {
		List<Price> prices = new ArrayList<Price>();
		for(int i=0;i<delhi_to_mumbai.length;i++) {
			prices.add(new Price(delhi_to_mumbai[i],mumbai_to_delhi[i]));
		}	
		Collections.sort(prices);
		int count =0;
		for(int i=0;i<prices.size() && count<k;i++) {
			System.out.println(prices.get(i).getOnward_price()+" "+prices.get(i).getReturn_price());
		}
	}
}
