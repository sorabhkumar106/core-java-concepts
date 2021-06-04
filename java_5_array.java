//Array in java
/*
*Array are used to store homogenous data values
*there are three ways to declare array in java
that write below
*/
public class Main {
	public static void main(String[] args) {
	//Creating and initializing array
	//first type
	String[] startup=new String[5];	
	startup[0]="Paytm";
	startup[1]="Byju's";
	startup[2]="OYO";
	startup[3]="Swiggy";
	startup[4]="Zomato";
	System.out.println(startup[0]);
	//second type
	String[] startup2={"Freshworks","OLA","Unacdmey","Zerodha","policy bazar"};
	System.out.println(startup2[2]);
	//third type
	String[] startup3;
	startup3=new String[5];
	//Note:- you can choose any data type and 
	//implement these initializing methods
	}
}