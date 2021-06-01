package Actions;

import Entities.*;
import java.util.List;
import Constructor.Context;
import java.util.Scanner;

public class CancelOrderAction implements Action {

	@Override
	public void doAction() {
		Scanner scanner = new Scanner(System.in);
		List<Order> orders = Context.getShop().getOrders();
		
		if(orders.size() == 0) {
			System.out.println("There are no orders");
			
			return;
		}
		
		System.out.println("Choose an order:");
		for(int i = 0; i < orders.size(); i++) {
			System.out.println((i + 1) + ". " + orders.get(i).getOrderedBook().getName() + " | status: " + orders.get(i).getStatus());
		}
		int choice = scanner.nextInt();
		
		if(choice > 0 && choice <= orders.size() && orders.size() != 0) {
			orders.remove(choice - 1);
			Shop shop = Context.getShop();
			shop.setOrders(orders);
			//Context.setShop(shop);
			System.out.println("Order has been canceled");
		}
		else {
			System.out.println("Wrong number");
		}
		
	}
}
