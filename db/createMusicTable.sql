CREATE TABLE Music
(
	musicID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	musicName			varchar(100)	not null,
	
	
	musicToken		varchar(100)	not null,
	userStatus		integer	not null,
	userLastUpdate	text not null
);