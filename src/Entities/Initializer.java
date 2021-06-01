package Entities;

import Constructor.Context;
import java.util.List;
import java.util.ArrayList;

public class Initializer {

	public static void init(){
		Shop shop = new Shop();
		
		shop.setOrders(initOrders());
		shop.setStorage(initBooks());
		
		Context.setShop(shop);
	}
	
	public static List<Order> initOrders() {
		return new ArrayList<Order>();
	}
	
	public static List<Book> initBooks() {
		return new ArrayList<Book>();
	}
}
