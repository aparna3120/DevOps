package com.jewel.model;

public class Product {
	
private String product_name;
private String product_id;
private String supplier_id;
private long price;
private int quantity;
private String decsription;
private String category;
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public String getProduct_id() {
	return product_id;
}
public void setProduct_id(String product_id) {
	this.product_id = product_id;
}
public String getSupplier_id() {
	return supplier_id;
}
public void setSupplier_id(String supplier_id) {
	this.supplier_id = supplier_id;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getDecsription() {
	return decsription;
}
public void setDecsription(String decsription) {
	this.decsription = decsription;
}
public Product(String product_name, String product_id, String supplier_id, long price, int quantity, String decsription,
		String category) {
super();
	this.product_name = product_name;
	this.product_id = product_id;
	this.supplier_id = supplier_id;
	this.price = price;
	this.quantity = quantity;
	this.decsription = decsription;
	this.category = category;
}

}

