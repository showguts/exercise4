package Entities;

import java.util.List;

public class Shop {

	private List<Book> storage;
	private List<Order> orders;
	
	public List<Book> getStorage() {
		return storage;
	}
	public void setStorage(List<Book> storage) {
		this.storage = storage;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
}

