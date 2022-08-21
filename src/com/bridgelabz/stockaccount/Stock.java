package com.bridgelabz.stockaccount;

public class Stock {
	
	private String stockName;
	private int numOfShare;
	private int sharePrice;
	private int totalValue;
	
	
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumOfShare() {
		return numOfShare;
	}
	public void setNumOfShare(int numOfShare) {
		this.numOfShare = numOfShare;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public int getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	
	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", numOfShare=" + numOfShare + ", sharePrice=" + sharePrice
				+ ", totalValue=" + totalValue + "]";
	}
	
	
	

	
	
	

}
