package Menu;

import java.util.List;
import java.util.Scanner;

public class Menu {

	public List<MenuItem> items;

	public void executeComand() {
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if(choice > items.size() || choice < 1) {
			System.out.println("Wrong number");
			return;
		}
		MenuItem item = items.get(choice - 1);
		item.action.doAction();
	}
	
	public List<MenuItem> getItems() {
		return items;
	}

	public void setItems(List<MenuItem> items) {
		this.items = items;
	}
	
}
