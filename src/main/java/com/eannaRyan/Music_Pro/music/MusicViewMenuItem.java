package com.eannaRyan.Music_Pro.music;

import java.util.Scanner;

import com.eannaRyan.Music_Pro.menu.ConsoleControls;
import com.eannaRyan.Music_Pro.menu.IExecutable;

public class MusicViewMenuItem implements IExecutable {

	Scanner input = new Scanner(System.in);
	 
	public MusicViewMenuItem() {}

	// @Override
	public void execute() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... MUSIC VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n"+ MusicViewMenuItem.class.getName() + " has no MVC implementation.");
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
	}

}
