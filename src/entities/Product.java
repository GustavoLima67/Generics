package entities;

import java.util.Date;

public class Product {

	private String name;
	private Double price;
	private Date valiDate;
	
	public Product() {
	}

	public Product(String name, Double price, Date valiDate) {
		this.name = name;
		this.price = price;
		this.valiDate = valiDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getValiDate() {
		return valiDate;
	}

	public void setValiDate(Date valiDate) {
		this.valiDate = valiDate;
	}
	
	
}
