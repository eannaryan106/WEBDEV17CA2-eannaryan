package com.eannaRyan.Music_Pro.menu;

import java.util.Scanner;

public class UndefinedMenuItem implements IExecutable {
	Scanner input = new Scanner(System.in);

	public UndefinedMenuItem() {
	}

<<<<<<< HEAD
  // @Override
=======
	@Override
>>>>>>> parent of 0bc6c40... The MVC's or Music,Playlist and User are working, Crossed out overrides
	public void execute() {
		System.out.println("The	class " + UndefinedMenuItem.class.getName() + "	is a placeholder menu item.");
		System.out.println("	\n	Press	enter	return	to	the	main	menu");
		this.input.nextLine();
	}
}