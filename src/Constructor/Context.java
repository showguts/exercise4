package Constructor;

import Entities.Shop;
import Actions.Action;
import java.util.List;
import Menu.Menu;
import java.util.Scanner;

public class Context {

	private static Shop shop;
	private static List<Action> actions;
	private static Menu menu;

	
	public static Menu getMenu() {
		return menu;
	}

	public static void setMenu(Menu menu) {
		Context.menu = menu;
	}

	public static List<Action> getActions() {
		return actions;
	}

	public static void executeAction(int action) {
		actions.get(action).doAction();
	}
	
	public static void setActions(List<Action> actions) {
		Context.actions = actions;
	}
	
	public static Shop getShop() {
		return shop;
	}

	public static void setShop(Shop shop) {
		Context.shop = shop;
	}
	
	
}
