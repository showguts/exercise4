package Actions;

import Entities.*;
import java.util.List;
import Constructor.Context;
import java.util.Scanner;

public class LeaveRequestAction implements Action{

	@Override
	public void doAction() {
		Scanner scanner = new Scanner(System.in);
		List<Order> orders = Context.getShop().getOrders();
		List<Book> storage = Context.getShop().getStorage();
		
		System.out.println("Enter book name	");
		Book book = new Book();
		book.setName(scanner.next());
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
		
		
		Order order = new Order();
		order.setOrderedBook(book);
		order.setStatus(OrderStatuses.New);
		
		orders.add(order);
		
		Shop shop = Context.getShop();
		shop.setOrders(orders);
		//Context.setShop(shop);
		
		System.out.println("Request has been sent");
	}
}
