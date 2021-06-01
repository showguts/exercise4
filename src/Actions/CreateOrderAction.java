package Actions;

import Constructor.Context;
import Entities.*;
import java.util.List;
import java.util.Scanner;

public class CreateOrderAction implements Action {

	@Override
	public void doAction() {
		Scanner scanner = new Scanner(System.in);
		List<Order> orders = Context.getShop().getOrders();
		List<Book> storage = Context.getShop().getStorage();
		
		System.out.println("Enter book name");
		Order newOrder = new Order();
		String name = scanner.next();
		
		Book book = new Book();
		book.setName(name);
		book.setInStock(false);
		
		for(Book bk : storage) {
			if(bk.getName().equals(book.getName())) {
				System.out.println("This book is in stock");
				book.setInStock(true);
				
				Order order = new Order();
				order.setOrderedBook(book);
				order.setStatus(OrderStatuses.Completed);
				
				orders.add(order);
				
				Shop shop = Context.getShop();
				shop.setOrders(orders);
				Context.setShop(shop);
				return;
			}
		}
		
		if(name.length() != 0) {
			newOrder.setOrderedBook(book);
			newOrder.setStatus(OrderStatuses.New);
			orders.add(newOrder);
			Shop shop = Context.getShop();
			shop.setOrders(orders);
			//Context.setShop(shop);
			System.out.println("Order has been added");
		}
		else {
			System.out.println("Something went wrong");
		}
		
	}
}
