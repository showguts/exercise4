package Main;

import Constructor.Context;
import Actions.Action;
import java.util.Scanner;

public class Client {
		public static void Run() {
			while(true) {
				
			for(int i = 0; i < Context.getMenu().getItems().size(); i++) {
				System.out.println("[" + (i+1) + "]" + " - " + Context.getMenu().getItems().get(i).Text);
			}
				Context.getMenu().executeComand();
			/*for(int i = 0; i < Context.getActions().size(); i++) {
				System.out.println((i+1) + ". " + Context.getActions().get(i).getClass().getSimpleName());
			}
			
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			
			Context.executeAction(choice - 1);*/
			}
		}
}
