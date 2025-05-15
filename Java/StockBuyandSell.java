//you have an array of prices for 1 stock. find max profit based on best day to buy and best day to sell 
package com.pkg.ag2.arr;

public class StockBuyandSell {
	
	static int findMaxProfit(int stockprices[]) {
		
		int maxProfit=0; //variable to track profit against each price
		int minSoFar= stockprices[0]; //variable to track lowest price to choose which day to buy
		
		for (int i=0; i<stockprices.length; i++) {
			
			minSoFar= Math.min(minSoFar, stockprices[i]);			//choose minimum buying cost
			
			int profit= stockprices[i]-minSoFar;					//calculate profit against each element
			
			maxProfit= Math.max(maxProfit, profit);					//choose maximum profit
		}
		System.out.print("Max profit that we can get for these prices are " + maxProfit);
		return maxProfit;
		
	}
	
	public static void main(String[] args) {
		int stockprices[]= {7,1,5,3,6,4};
		findMaxProfit(stockprices);
		

	}

}
