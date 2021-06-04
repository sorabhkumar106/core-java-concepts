/*
Exception may be occur by user end or programmer
end so we need to ensure if any Exception occured then
program flow not disrupted
* so we handle Exception by the help of try-catch block
* inside try block we code that may throw exception 
and then in catch block we hadle that exception 
we program catch block if any exception occured then 
we code custom code
*if exception is not occured then catch block skiped 
and run the code after catch block
* after catch block we code finally block this 
finally block will alway run weither Exception occured or not 
*/
class Clac{
public static int div(int a,int b){
	int c=a/b;
	return c;
		}	
	
}
public class Main {
	public static void main(String[] args) {
		try{
			//this line will through error
		int d=Clac.div(12,0);
		System.out.println(d);
		
		}
		//this block will executed if exception occured
		catch(Exception e){
		System.out.println(e.getMessage());	
		}
		//this block always run weither exception occured or not
		finally{
		System.out.println("\n -> <Exception handled/>");	
		}
	}
}