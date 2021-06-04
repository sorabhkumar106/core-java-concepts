//user defined exception
class CustomException extends Exception{
public CustomException(String s){
	super(s);
		}
	public String toString(){
		return "custom exception occured";
			}	
}
class sorabh{
public void printN(){
for(int i=1;i<10;i++){
	try{

	if(i==7)throw new CustomException("Seven");	
		System.out.println(i);
	}catch(Exception e){
	System.out.print(e);		
	}
			}	
		}	
}
public class Main {
	public static void main(String[] args) {
	sorabh s=new sorabh();
	s.printN();	
	}
}