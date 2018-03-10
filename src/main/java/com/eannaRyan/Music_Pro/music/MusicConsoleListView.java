package com.eannaRyan.Music_Pro.music;

public class MusicConsoleListView {
	
	import java.util.ArrayList;
	import java.util.Iterator;
	import com.eannaRyan.Music_Pro.menu.ConsoleControls;

	public class MusicConsoleListView {

		ArrayList <Music> musicList;

		public UserConsoleListView() {
		}

		public void setUserList(ArrayList<User> userList) {
			this.userList = userList;
		}

		public void display() {

			System.out.println(ConsoleControls.ANSI_YELLOW_BRIGHT + "...MUSIC VIEWER	..." + ConsoleControls.ANSI_RESET);
			System.out.println("\n");
			Iterator<Music> iterator = this.musicList.iterator();
			while (iterator.hasNext()) {
				Music aMusic = (User)iterator.next();
				aMusic.display();
			}
		}
	}



