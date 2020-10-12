package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="DRINK")
	private String drink;
	@Column(name="SIZE")
	private String size;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order(String drink, String size, Customer customer) {
		super();
		this.drink = drink;
		this.size = size;
		this.customer = customer;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDrink() {
		return drink;
	}


	public void setDrink(String drink) {
		this.drink = drink;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}
	
	public String returnOrderDetails(){
		return drink + ":" + size;
		}
	
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", drink= "	+ drink + " customer=" + customer + "]";
	}
}
