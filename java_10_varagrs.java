//vsrargs is an special type arguments in java
//that used to pass arguments as many you want
public class VarargsInJava {
	public static void main(String[] args) {
//calling and printing element
System.out.println(add(1,3,5,5));
	}
//creating function with Varags element
	public static int add(int x, int ...arr) {
		int sum = 0;
		for (int i : arr)
			sum += i;
		return sum;
	}
}