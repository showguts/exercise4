package Constructor;

import Entities.Shop;
import Entities.Initializer;
import Main.Client;
import Menu.*;
public class MainInitializer {

	public static void init() {
		initContext();
		initMenu();
		initShop();
		Client.Run();
	}
	
	public static void initContext() {
		Context.setShop(new Shop());
		Context.setMenu(new Menu());
	}
	
	public static void initShop() {
		Initializer.init();
	}
	
	public static void initMenu() {
		MenuInitializer menuinit = new MenuInitializer();
		menuinit.init();
	}
}
