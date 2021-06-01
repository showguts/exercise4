package Entities;

public class Order {

	private Book orderedBook;
	private int amountOfRequests;
	private OrderStatuses status;
	
	public int getAmountOfRequests() {
		return amountOfRequests;
	}
	public void setAmountOfRequests(int amountOfRequests) {
		this.amountOfRequests = amountOfRequests;
	}
	public Book getOrderedBook() {
		return orderedBook;
	}
	public void setOrderedBook(Book orderedBook) {
		this.orderedBook = orderedBook;
	}
	public OrderStatuses getStatus() {
		return status;
	}
	public void setStatus(OrderStatuses status) {
		this.status = status;
	}
	
}
