package com.eannaRyan.Music_Pro.music;

import java.util.ArrayList;

public interface IMusicDAO {

	public ArrayList<Music> getAllMusics();

	public Music getMusic(int songID);

	public int addMusic(Music aMusic);

	public void updateMusic(Music aMusic);

	public void deleteMusic(Music aMusic);

	public String printMusic(int songID);
}