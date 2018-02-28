package com.eannaRyan.Music_Pro.menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.eannaRyan.Music_Pro.App;
import com.eannaRyan.Music_Pro.music.MusicViewMenuItem;
import com.eannaRyan.Music_Pro.playlist.PlaylistViewMenuItem;
import com.eannaRyan.Music_Pro.user.UserViewMenuItem;

/*
	*	This	class	could	be	used	instead	of	the	generic	Factory	class
	*/
public class MenuItemFactory {

	private static Logger LOG;

	public MenuItemFactory() {
		LOG = LogManager.getLogger(MenuItemFactory.class);
	}

	public IExecuatable getMenuItem(String className) {

		if ("com.eannaRyan.Music_Pro.playlist.PlaylistViewMenuItem".equals(className)) {
			return (IExecuatable) new PlaylistViewMenuItem();
		}

		if ("com.eannaRyan.Music_Pro.music.MusicViewMenuItem".equals(className)) {
			return (IExecuatable) new MusicViewMenuItem();
		}

		if ("com.eannaRyan.Music_Pro.user.UserViewMenuItem".equals(className)) {
			return (IExecuatable) new UserViewMenuItem();
		}

		// for each menu item take a copy of an if line above change the class it is
		// looking for
		// and the class to use

		// this catches deliberetly undefined menu items and errors

		if ("com.eannaRyan.Music_Pro.playlist.UndefinedMenuItem".equals(className)) {
			return (IExecuatable) new UndefinedMenuItem();
		} else {
			LOG.error("Undefined	class	requested" + className);
			return (IExecuatable) new UndefinedMenuItem();
		}

	}
}