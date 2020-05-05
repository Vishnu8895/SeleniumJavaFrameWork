package Day28;
/*
 * Exception Handling
 * Exception is a unexpected condition at runtime
 * Exception Handling is a handling any unexpected behavior during execution
 *  catch the exception and log massage for troubleshooting
 *  Enables continuation of runs even if a test fails
 */

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		try{
		int i=1/0;
		System.out.println("Completed");
		}
		catch(Exception e){
			System.out.println("I am inside catch block");
			System.out.println("Massage is : "+e.getMessage());
			System.out.println("Cause is :"+e.getCause());
			
			e.printStackTrace();
		}			
		
		finally{
			System.out.println("I am inside finally block");
		}
		
	}

	
}
