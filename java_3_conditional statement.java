import java.util.Scanner;

//Conditional statement in java
/*
* there are four main conditional statement in java
* if -statement
*if - else statement
* if- else - statement
* switch case statement
*/
public class ConditionalStatement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your gender :");
		String gender = sc.next();
//if - condition
		if (gender.equalsIgnoreCase("male")) {

			System.out.println("You are male .");
		}
		System.out.println("Enter your country :");
		String country=sc.next();
//if - else condition
		if(country.equalsIgnoreCase("india")){
		System.out.println("You are indian .");	
		}else{
		System.out.println("You are not indian .");	
		}
//if - else - condition
System.out.println("Enter your marks :");
int marks=sc.nextInt();
if(marks>90 &&marks<=100){
System.out.println("You passed with first grade");	
}else if(marks<90 && marks>70){
System.out.println("You passed with second grade");	
}else if(marks<=60 && marks>=50){
System.out.println("You passed with third grade");	
}else{
System.out.println("Great effort but you can't succeed you are fail");		
}
	}
}