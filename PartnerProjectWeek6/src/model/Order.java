package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ORDER_ID")
	private int orderID;
	
	@Column(name="ORDER_DATE")
	private LocalDate orderDate;
	
	@Column(name="Customer_ID")
	private int customerID;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="PRICE")
	private double price;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(LocalDate orderDate, int customerID, int quantity, double price) {
		super();
		this.orderDate = orderDate;
		this.customerID = customerID;
		this.quantity = quantity;
		this.price = price;
	}


	public Order(int orderID, LocalDate orderDate, int customerID, int quantity, double price) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.customerID = customerID;
		this.quantity = quantity;
		this.price = price;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	
}
