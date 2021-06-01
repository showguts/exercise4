package Menu;

import java.util.ArrayList;
import Constructor.Context;
import Actions.*;

public class MenuInitializer {

	private Menu menu;
	
	public void init() {
		menu = new Menu();
		initMenuItems();
		initMenuContext();
	}
	
	private void initMenuContext() {
		
		Context.setMenu(this.menu);
	}
	
	private void initMenuItems(){
		//ArrayList<MenuItem> items = new ArrayList<MenuItem>();
		menu.items = new ArrayList<>();
		
		MenuItem addbookitem = new MenuItem();
		addbookitem.Text = "Add book";
		addbookitem.action = new AddBookAction();
		
		MenuItem cancelorder = new MenuItem();
		cancelorder.Text = "Cancel order";
		cancelorder.action = new CancelOrderAction();
		
		MenuItem changeorderstatus = new MenuItem();
		changeorderstatus.Text = "Change order status";
		changeorderstatus.action = new ChangeOrderStatus();
		
		MenuItem createorder = new MenuItem();
		createorder.Text = "Create order";
		createorder.action = new CreateOrderAction();
		
		MenuItem deletebook = new MenuItem();
		deletebook.Text = "Delete book";
		deletebook.action = new DeleteBookAction();
		
		MenuItem leaverequest = new MenuItem();
		leaverequest.Text = "Leave request";
		leaverequest.action = new LeaveRequestAction();
		
		MenuItem exitaction = new MenuItem();
		exitaction.Text = "Exit";
		exitaction.action = new ExitProgrammAction();
		
		menu.items.add(addbookitem);
		menu.items.add(cancelorder);
		menu.items.add(changeorderstatus);
		menu.items.add(createorder);
		menu.items.add(deletebook);
		menu.items.add(leaverequest);
		menu.items.add(exitaction);
		
	}
}
