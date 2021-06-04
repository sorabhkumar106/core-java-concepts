import java.util.Scanner;

/*
*Loops in java
*loops are used to iterate a piece of code until
*specified condition is true
*there are four loops in java -
* for loop
*foreach loop
*while loop
*do-while loop
*/
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print table that number");
		int num1 = sc.nextInt();
//for loop in java
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * num1 + " ");
		}
		System.out.println("\n");
		String[] arr = {"tata elxsi", "tata motors", "tata steel", "tata tcs", "tata consumer products", "tata digitel"};
		System.out.println("Tata group of companise list");
//foreach loop
		for (String company : arr)
			System.out.println(company + "\n");

//while loop
		System.out.println();
		int i = 1;
		System.out.println("Printing number 1 to 100");
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
//do-while loop in java
		System.out.println("Printing number 100 to 200");
		do {
			System.out.println(i);
			i++;
		} while (i < 200);
	}
}