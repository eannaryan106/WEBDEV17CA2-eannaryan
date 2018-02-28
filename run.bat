@ECHO	OFF
REM	---------------------------------------------------------------------
REM	the	directory	path	to	java.exe	on	your	machine	may	be	different
REM	from	the	path	I	have	between	the	double	quotes	below	to	this	may
REM	need	to	be	changed	in	order	for	compile	to	work	on	your	machine
REM	IF	JAVA_HOME	is	set	you	do	not	need	to	specify	the	path	just	java
REM	---------------------------------------------------------------------

"C:\Program Files (x86)\Java\jre1.8.0_144\bin\java.exe"
C:\_DEV\Music_Pro\src\main\java\com\eannaRyan\Music_Pro

java -cp target\Music_Pro-v1.jar com.eannaRyan.Music_Pro.App
java -cp target\Music_Pro-v1.jar com.eannaRyan.Music_Pro.App -v

java -cp target\Music_Pro-v1.jar com.eannaRyan.Music_Pro.App -help
java -cp target\Music_Pro-v1.jar com.eannaRyan.Music_Pro.App -version

echo "Press ENTER to close window"

PAUSE