package com.eannaRyan.Music_Pro.user;

import com.eannaRyan.Music_Pro.data.DataManagerSQLite;
import com.eannaRyan.Music_Pro.menu.IExecutable;

public class UserViewMenuItem implements IExecutable {

	public UserViewMenuItem() {
	}

	public void execute() {
		// System.out.println("I ran: " + UserViewMenuItem.class.getName());

		// Get the User data
		UserDAO model = new UserDAO(DataManagerSQLite.getInstance());
		UserConsoleListView view = new UserConsoleListView();
		UserController controller = new UserController(view, model);
		controller.display();

	}

}