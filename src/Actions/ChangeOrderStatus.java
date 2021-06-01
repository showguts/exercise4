package Actions;

import Entities.*;
import java.util.List;
import java.util.Scanner;

import Constructor.Context;

public class ChangeOrderStatus implements Action {

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
				System.out.println((i + 1) + ". " + orders.get(i).getOrderedBook().getName() + " |status: " + orders.get(i).getStatus());
		}
		
		int choice = scanner.nextInt();
		
		if(choice > 0 && choice <= orders.size() && orders.size() != 0) {
			System.out.println(orders.get(choice - 1).getOrderedBook().getName() + " |status: " + orders.get(choice - 1).getStatus());
			Order order = orders.get(choice - 1);
			
			System.out.println("Choose status you want to change:");
			System.out.println("1. " + OrderStatuses.New.toString() + "\n2. " + OrderStatuses.Completed.toString() + "\n3. " + OrderStatuses.Canceled.toString());
			int status = scanner.nextInt();
			
			if(status == 1) {
				order.setStatus(OrderStatuses.New);
				
				//List<Book> storage = Context.getShop().getStorage();
				
				orders.set(choice - 1, order);
			}
			else if(status == 2) {
				order.setStatus(OrderStatuses.Completed);
				//orders.remove(choice - 1);
			}
			else if(status == 3) {
				order.setStatus(OrderStatuses.Canceled);
				//orders.remove(choice - 1);
			}
			else {
				System.out.println("Wrong number");
				return;
			}
			System.out.println("Status has been changed");
			
		}
		else System.out.println("Wrong number");
		
	}
}
