import java.util.List;
import java.util.Scanner;

import controller.OrderHelper;
import model.Order;

public class StartOrder {

	
	static Scanner in = new Scanner(System.in);
	static OrderHelper oh = new OrderHelper();

	private static void addAnOrder() {
		// TODO Auto-generated method stub
		System.out.print("Enter a drink: ");
		String drink = in.nextLine();
		System.out.print("Enter a size: ");
		String size = in.nextLine();
		Order toAdd = new Order(drink, size);
		oh.insertOrder(toAdd);

	}
	
	private static void deleteAnOrder() {
		// TODO Auto-generated method stub
		System.out.print("Enter the drink to delete: ");
		String drink= in.nextLine();
		System.out.print("Enter the size to delete: ");
		String size = in.nextLine();
		Order toDelete = new Order(drink, size);
		oh.delete(toDelete);
	}
	
	private static void editAnOrder() {
		// TODO Auto-generated method stub
		System.out.println("How would you like to search? ");
		System.out.println("1 : Search by Drink name");
		System.out.println("2 : Search by the size you orderd");
		int searchBy = in.nextInt();
		in.nextLine();
		List<Order> foundOrders;
		if (searchBy == 1) {
			System.out.print("Enter the drink name: ");
			String drinkName = in.nextLine();
			foundOrders = oh.searchForOrderByDrink(drinkName);
			
		} else {
			System.out.print("Enter the size you ordered: ");
			String size = in.nextLine();
			foundOrders= oh.searchForOrderBySize(size);
		}

		if (!foundOrders.isEmpty()) {
			System.out.println("Found Results.");
			for (Order O : foundOrders) {
				System.out.println(O.getId() + " : " + O.returnOrderDetails());
			}
			System.out.print("Which ID to edit: ");
			int idToEdit = in.nextInt();

			Order toEdit = oh.searchForOrderById(idToEdit);
			System.out.println("Retrieved " + toEdit.getDrink() + " from " + toEdit.getSize());
			System.out.println("1 : Update Drink");
			System.out.println("2 : Update Size");
			int update = in.nextInt();
			in.nextLine();

			if (update == 1) {
				System.out.print("New Drink Name: ");
				String newDrink = in.nextLine();
				toEdit.setDrink(newDrink);
			} else if (update == 2) {
				System.out.print("New Size: ");
				String newSize = in.nextLine();
				toEdit.setSize(newSize);
			}

			oh.updateItem(toEdit);

		} else {
			System.out.println("---- No results found");
		}

	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runMenu();

	}
	
	public static void runMenu() {
		boolean goAgain = true;
		System.out.println("--- Welcome to your local coffee shop! ---");
		while (goAgain) {
			System.out.println("*  Select an order");
			System.out.println("*  1 -- Add an order");
			System.out.println("*  2 -- Edit an order");
			System.out.println("*  3 -- Delete an order");
			System.out.println("*  4 -- View past orders");
			System.out.println("*  5 -- Exit the coffee shop");
			System.out.print("*  Your selection: ");
			int selection = in.nextInt();
			in.nextLine();

			if (selection == 1) {
				addAnOrder();
			}  else if (selection == 2) {
				editAnOrder();
			} else if (selection == 3) {
				deleteAnOrder();
			} else if (selection == 4) {
				viewTheOrders();
			}
			else {
				oh.cleanUp();
				System.out.println("   See you again soon!   ");
				goAgain = false;
			}
		}

	}
	
	private static void viewTheOrders() {
		List<Order>	allOrders = oh.showAllOrders();
		for(Order singleItem : allOrders){
		System.out.println(singleItem.returnOrderDetails());
		}			

	}
	


}
