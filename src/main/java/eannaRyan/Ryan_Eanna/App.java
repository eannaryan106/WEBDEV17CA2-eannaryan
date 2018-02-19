package eannaRyan.Ryan_Eanna;


import java.util.Date;
import java.util.Scanner;
/**********************************
 * Date 2018	
 * Author: COR
 *
********************************** */
public class App 
{
    public static void main( String args[] )
    {
        App anApp= new App();
    }
    // DATA
    //.................
    // declare objects
    private Scanner someInput;
    private Date today;
    
    //CONSTRUCTORS
    //................
    public App()
    {
    	//initialize variables
    	
    	//create objects
    	this.someInput = new Scanner(System.in);
    	
    	//Starting Method
    	//private void sayHi()
    	{
    		this.today = new Date();
    		System.out.println("App say Hi at " +today);
    	}
    	
    	//pause before exit (this is only useful if an error occurs)
    	System.out.println("\n Press enter to exit the program");
    	this.someInput.nextLine();
    	
    	//close the program without error
    	System.exit(0);
    }

	private void sayHi() {
		// TODO Auto-generated method stub
		
	}
}
