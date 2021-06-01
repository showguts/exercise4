package Actions;

import Entities.*;
import java.util.List;
import Constructor.Context;
import java.util.Scanner;

public class AddBookAction implements Action {

	@Override
	public void doAction() {
		List<Book> storage = Context.getShop().getStorage();
		Book book = new Book();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter book name");
		book.setName(scanner.next());
		book.setInStock(true);
		storage.add(book);
		
		List<Order> orders = Context.getShop().getOrders();
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderedBook().getName().equals(book.getName())) {
				Order order = orders.get(i);
				order.setStatus(OrderStatuses.Completed);
				orders.set(i, order);
				//orders.remove(i);
			}
		}
		
		Shop shop = Context.getShop();
		shop.setOrders(orders);
		shop.setStorage(storage);
		//Context.setShop(shop);
		System.out.println("Book has been added");
	}
}
