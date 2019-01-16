import java.util.Scanner;

/**
 * 
 * @author hdiab22
 *
 */
//already in the class!
public class methodexmples 
{
//this is our program
	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name= in.nextLine();
		//you need a scanner object, so you dont need "static"
		
		
		//greeting("Hady");
		greeting(name);
		
		//contents of var name gets passed, not var name itself
		//contents replace variable name
		
		
		System.out.println("Enter a number to double: ");
		int mynumber= in.nextInt();
		in.nextLine(); //clear scanner
		int mydouble= doubleInt(mynumber); //assignment state
		System.out.println("My number doubled: "+mydouble);
	}

	
	//You need to run this is the main method
	public static void greeting(String arg1) //have to give me a string
	{ 
		//small hidden line: arg1= "Hady"
		System.out.println("Hello, "+arg1);
		System.out.println("Have a nice day");
		 
	}
	
	//return value
	public static int doubleInt(int num)
	{ //int num=5 (initialize int num)
		int newnumber= num*2;
		return newnumber;
		//returns 10
		//return value pictured replacing method call
		
	}
}
