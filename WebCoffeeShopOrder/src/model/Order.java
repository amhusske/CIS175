package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order(String drink, String size) {
		super();
		this.drink = drink;
		this.size = size;
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


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}
	
	public String returnOrderDetails(){
		return drink + ":" + size;
		}
	
}
