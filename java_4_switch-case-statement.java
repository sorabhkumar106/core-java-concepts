import java.util.Scanner;

//conditional Statement
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find day :");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Today is monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is saturday");
			break;
		case 7:
			System.out.println("Today is Sonday");
			break;
		default:
		System.out.println("Sorry we can't featch data \nYou entered wrong input !");
		}
	}
}