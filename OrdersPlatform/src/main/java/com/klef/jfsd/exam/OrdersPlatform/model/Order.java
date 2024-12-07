package com.klef.jfsd.exam.OrdersPlatform.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="orderid",nullable=false)
	public int orderid;
	@Column(name="productname",nullable=false)
	public String productname;
	@Column(name="quantity",nullable=false)
	public String quantity;
	@Column(name="orderdate",nullable=false)
	public String orderdate;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", productname=" + productname + ", quantity=" + quantity + ", orderdate="
				+ orderdate + "]";
	}
	
}
