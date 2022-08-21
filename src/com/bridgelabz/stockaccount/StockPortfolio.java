package com.bridgelabz.stockaccount;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
	
	static int numOfStock;
	static int totalValue;
	static int stockValue;

	ArrayList<Stock> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	
	public void addStock() {
		
		System.out.println("Enter the number of stock want to buy :");
		numOfStock = sc.nextInt();
		 
		
		for(int i = 1; i <= numOfStock; i++ ) {
			Stock stock = new Stock();
			
			 System.out.println("Stock details of " +i+ " is :");
			 System.out.println("----------------------------");
			 System.out.println("Please enter stock name : ");
			 stock.setStockName(sc.next());
			 System.out.println("Please enter number of shares : ");
			 stock.setNumOfShare(sc.nextInt());
			 System.out.println("Please enter share price : ");
			 stock.setSharePrice(sc.nextInt());
			 
			 totalValue = stock.getNumOfShare()*stock.getSharePrice();
			 stock.setTotalValue(totalValue);
			 list.add(stock);
			 
			 stockValue = stockValue + totalValue; 
		}
		System.out.println(list);
		System.out.println("The value of total stock is :" +stockValue);
	}
}
