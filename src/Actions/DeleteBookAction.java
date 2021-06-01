package Actions;

import Constructor.Context;
import Entities.Book;
import Entities.Shop;

import java.util.List;
import java.util.Scanner;

public class DeleteBookAction implements Action {

	@Override
	public void doAction() {
		Scanner scanner = new Scanner(System.in);
		Shop shop = Context.getShop();
		List<Book> storage = Context.getShop().getStorage();
		
		if(storage.size() == 0) {
			System.out.println("There are no books in storage");
			
			return;
		}
		
		System.out.println("Choose book you want to write off:");
		
		for(int i = 0; i < storage.size(); i++) {
			if(storage.get(i).isInStock()) {
				System.out.println((i + 1) + ". " + storage.get(i).getName());
			}
		}
		
		int choice = scanner.nextInt();
		if(choice > 0 && choice <= storage.size() && storage.size() != 0) {
			//Book book = storage.get(choice - 1);
			//book.setInStock(false);
			//storage.set(choice - 1, book);
			storage.remove(choice - 1);
			shop.setStorage(storage);
			//Context.setShop(shop);
			System.out.println("Book has been wrote off");
		}
		else {
			System.out.println("There are no books with such an index!");
		}
		
	}
}
