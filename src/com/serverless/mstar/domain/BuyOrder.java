package com.serverless.mstar.domain;

public class BuyOrder {

	
	private String stockname;
	private String quantity;
	private String custname;
	
	public BuyOrder(String stockname,String custname,String quantity){
		this.stockname=stockname;
		this.custname=custname;
		this.quantity=quantity;
	}

	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	
	
	
}
