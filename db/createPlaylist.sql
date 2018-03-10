CREATE TABLE Playlist
(
	PlaylistID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	PlaylistName			varchar(100)	not null,
	PlaylistEmail		varchar(100)	not null,
	PlaylistRole			varchar(20)	not null,
	PlaylistToken		varchar(100)	not null,
	PlaylistStatus		integer	not null,
	PlaylistLastUpdate	text not null
);

//THis is the User_Music table aka playlist 