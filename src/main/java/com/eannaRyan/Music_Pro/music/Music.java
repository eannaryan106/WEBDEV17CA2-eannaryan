package com.eannaRyan.Music_Pro.music;

/*****************************************************************
 * Date: 2017
 * 
 * @author EOR
 * 
 *         Music class
 * 			THis is the clone of the User
 *****************************************************************/

public class Music {

	// DATA
	// ............................................................
	// declare objects

	// private String userToken;
	// private int userStatus;
	// Music music = new Music(resultSet.getInt("songID"),
	// resultSet.getString("artistName"),
	// resultSet.getString("songName"),
	// resultSet.getString("urlName"),resultSet.getString("musicLastUpdate"));
	private int songID;
	private String artistName;
	private String songName;
	private String urlName;
	private String musicLastUpdate;

	// CONSTRUCTORS
	// ............................................................
	public Music(int songID, String artistName, String songName, String urlName, String musicLastUpdate) {
		super();
		this.songID = songID;
		this.artistName = artistName;
		this.songName = songName;
		this.urlName = urlName;
		this.musicLastUpdate = musicLastUpdate;

	}

	@Override
	public String toString() {
		return "Music [songID=" + songID + ", artistName=" + artistName + ", songName=" + songName + ", urlName="
				+ urlName + ", musicLastUpdate=" + musicLastUpdate + "]";
	}

	public int getSongID() {
		return songID;
	}

	public void setSongID(int songID) {
		this.songID = songID;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	public String getMusicLastUpdate() {
		return musicLastUpdate;
	}

	public void setMusicLastUpdate(String musicLastUpdate) {
		this.musicLastUpdate = musicLastUpdate;
	}

}
