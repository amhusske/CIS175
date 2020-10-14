import java.util.List;

import controller.CustomerHelper;
import controller.OrderHelper;
import model.Customer;
import model.Order;

public class CustomerTester {

	public static void main(String[] args) {
		Customer Me = new Customer("Abby");
		CustomerHelper ch = new CustomerHelper();
		ch.insertCustomer(Me);
		
		OrderHelper oh = new OrderHelper();
		
		Order newOrder = new Order("Pumkpin Spice", "small", Me);
		
		oh.insertOrder(newOrder);
		
		List<Customer>allCustomers = ch.showAllCustomers();
		for(Customer a: allCustomers) {
			System.out.println(a.toString());
		}
		
		List<Order> allOrders = oh.showAllOrders();
		for(Order a: allOrders) {
			System.out.println(a.toString());
		}
		
		
		
	}

}
