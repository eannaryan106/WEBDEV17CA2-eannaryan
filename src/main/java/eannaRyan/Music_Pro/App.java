package eannaRyan.Music_Pro;


import java.util.Date;
import java.util.Scanner;
import	org.apache.logging.log4j.LogManager;
import	org.apache.logging.log4j.Logger;

//This	is	added	to	every	class	that	needs	to	log	with one	change
 //	The	getLogger(	)	part	should	contain	the	name	of	the	class	its	in

/**********************************
 * Date 2018	
 * Author: COR edited as needed by ER
 *
 *
 *	*	-	Demonstrates	the	use	of	development	tools	:	GIT,	MAVEN,	Eclipse
	*	-	Demonstrates	how	to	use	Eclipse
	*	-	Provides	a	refresher	of	OOP	in	Java
	*	-	Provide	an	introduction	to	project	file	structure	layout	-	MAVEN	Archetype
	*	-	Show	how	to	setup	Log4j2
********************************** */
public class App 
{
    public static void main( String args[] )
    {
              
        //	To	view	the	arguments	being	entered
	 	 seeCommandlineInput(args);
			
	 	 //	To	instantiate	App	class	based	in	the	parameters	entered	at	the	commandline
	 actionCommandlineInput(args);
    }
    // DATA
    //.................
    // declare objects
    private Scanner someInput;
    private Date today;
    private	static	Logger	LOG; 
    
    //CONSTRUCTORS
    //................
    public App()
    {
    	//initialize variables
    	
    	//create objects
    	this.someInput = new Scanner(System.in);
    	
    	//Starting Method
    	
    	//associate	logging	with	this	class	so	know	the	messages	that	came	from	objects	of	this	class
    	
    	
    	    	
    	//private void sayHi()
    	
    	
    		LOG	=	LogManager.getLogger(App.class);
    		//log	tester
         	testLogOutput();
         	this.someInput.nextLine();
    		this.today = new Date();
    		System.out.println("App say Hi at " +today);
    	    	     	
    	//pause before exit (this is only useful if an error occurs)
    	System.out.println("\n Press enter to exit the program");
    	this.someInput.nextLine();
    	
    	//close the program without error
    	System.exit(0);
    }

		// TODO Auto-generated method stub
		
//		METHODS	used	by	main()	or	debug	methods	-	note	they	are	static	methods
		 //............................................................
		 /**
		 	*	action	the	arguments	presented	at	the	command	line
		 	*	instantiate	the	App	class	based	on	the	arguments	passed
		 	*/
		 	private	static	void	actionCommandlineInput(	String	args[]	)
		 	{
		 	 	//	no	special	instantiation	yet	as	don't	pass	args	to	it
		 	 	App	anApp	=	new	App();
		 	}
					
		 /**
		 	*	View	the	arguments	presented	at	the	commandline
		 	*	This	is	for	debug	and	demo	purposes
		 	*/
		 	private	static	void	seeCommandlineInput(	String	args[]	)
		 	{	
		 	 if	(args.length	==	0)
									{
													System.out.println("There	were	no	commandline	arguments	passed!");
									}
		 	 else
			{
		 	 	 //	display	the	command	line		entered	
		 	 	 for(int	i	=	0;	i	<	args.length;	i++)	
				{
		 												System.out.println(args[i]);
		 												
		 								}
			}
				
		 	}//EOM
		 	
		 /**
		 	*	Test	the	Log4J2	logging
		 	*/
		 	private	static	void	testLogOutput()
		 	{
		 	 LOG.debug("Log	test:	Test	printed	on	debug");
		 				LOG.info("Log	test:	Test	printed	on	info");
		 				LOG.warn("Log	test:	Test	printed	on	warn");
		 				LOG.error("Log	test:	Test	printed	on	error");
		 				LOG.fatal("Log	test:	Test	printed	on	fatal");
		 				LOG.info("Appending	string:	{}.",	"Application	log	test	message	-	Hi");
				
		 	}//EOM
					
	//EOC
		
	}

