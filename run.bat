@ECHO	OFF
REM	---------------------------------------------------------------------
REM	the	directory	path	to	java.exe	on	your	machine	may	be	different
REM	from	the	path	I	have	between	the	double	quotes	below	to	this	may
REM	need	to	be	changed	in	order	for	compile	to	work	on	your	machine
REM	IF	JAVA_HOME	is	set	you	do	not	need	to	specify	the	path	just	java
REM	---------------------------------------------------------------------




rem java -cp target\Music_Pro-v1.jar com.eannaRyan.Music_Pro.App
java -cp target\Music_Pro-v6.jar com.eannaRyan.Music_Pro.App -v
java -cp target/Music_Pro-v6.jar com.eannaRyan.Music_Pro.App -database jdbc:sqlite:database/oreallyoreilly.db
rem java -cp target/Music_Pro-v6.jar com.eannaRyan.Music_Pro.App -v -d jdbc:sqlite:database/oreallyoreilly.db
rem java -cp target\Music_Pro-v1.jar com.eannaRyan.Music_Pro.App -help
rem java -cp target\Music_Pro-v1.jar com.eannaRyan.Music_Pro.App -version


echo "Press ENTER to close window"

PAUSE