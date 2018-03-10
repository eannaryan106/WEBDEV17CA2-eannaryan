package com.eannaRyan.Music_Pro.music;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.eannaRyan.Music_Pro.data.IDataManager;

public class MusicDAO implements IMusicDAO {

	// DATA
	// ............................................................

	private IDataManager dataManager;

	// This is added to every class that needs to log with one change
	// The getLogger( ) part should contain the name of the class its in
	// So you know the messages that came from objects of this class
	private final Logger LOG = LogManager.getLogger(MusicDAO.class);
	// CONSTRUCTORS
	// ............................................................

	public MusicDAO(IDataManager dataManager) {

		this.dataManager = dataManager;
	}

	// METHODS
	// ............................................................

	public ArrayList<Music> getAllMusics() {

		ArrayList<Music> musicList = new ArrayList<Music>();

		// Get JDBC connection to database
		Connection connection = null;

		try {
			// get a database connection
			connection = this.dataManager.getConnectionObject();

			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			// Run the query

			ResultSet resultSet = statement.executeQuery("select * from	music");

			// iterate through the results create User objects put in the ListArray

			while (resultSet.next()) {
				Music music = new Music(resultSet.getInt("songID"), resultSet.getString("artistName"),
						resultSet.getString("song_name"), resultSet.getString("urlName"),resultSet.getString("musicLastUpdate"));
						
						//Here we've changed the base user code to have new music database entries 
						//resultSet.getString("userToken"), resultSet.getInt("userStatus"),
						

				// putting the user objects into the list but not using them yet
				userList.add(music);

				// print the results by using the toString() on User
				LOG.debug("User	object	:	" + music);
			}

		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			LOG.error(e.getMessage());
		} finally {
			try {
				if (connection != null)
					this.dataManager.disconnect();
			} catch (SQLException e) {
				// connection close failed.
				LOG.error(e.getMessage());
			}
		}

		return musicList;
	}// EOM

	public Music getMusic(int songID) {
		throw new UnsupportedOperationException();
	}

	public int addMusic(Music aMusic) {
		throw new UnsupportedOperationException();
	}

	public void updateMusic((Music aMusic) {
		throw new UnsupportedOperationException();
	}

	public void deleteMusic(Music aMusic) {
		throw new UnsupportedOperationException();
	}

	public String printMusic(int songID) {
		throw new UnsupportedOperationException();
	}
}



