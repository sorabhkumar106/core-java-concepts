import java.util.Scanner;

//taking input from user by the help of Scanner class
public class TakingInputFromUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter your first name :");
	//taking input from user
	String firstName=sc.next();
	System.out.println();
	System.out.print("Enter your second name :");
	String secondName=sc.next();
	String name=firstName+" "+secondName;
	// printing name
	System.out.println("\nYour name is :"+name);
	
	}
}