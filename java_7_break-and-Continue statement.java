/*
* java continue and break Statement
* break statement are used to break the loop at any point
* continue statement are used to take back
to next itretion
*/
public class Main {
	public static void main(String[] args) {
		//java break statement
		int i = 1;
		while (i <= 40) {
			//this line will break the loop when i value will 50
			if (i == 5)
				break;
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n");
		do {
			i++;
			//this line take back to next iteration
			if (i == 20)
				continue;
			//this line will not print 20
			System.out.print(i + " ");

		} while (i < 50);
	}
}