//Method in java
public class MethodInJava {
	public static void main(String[] args) {
//calling static function
		print("Amazon is an ecommerce company");
//calling non-static function
		MethodInJava obj = new MethodInJava();
		int result = obj.calc(12, 45, '+');

//printing the result
System.out.println("calc function is return :"+result);
	}
	// this method is static so you don't need to call this method by object
	public static void print(String s) {
		System.out.println(s);
	}
	//this non-static function so you need to call this by using object of this class
	public int calc(int num1, int num2, char sign) {
		int cal = 0;
		switch (sign) {
		case '+':
			cal = num1 + num2;
			break;
		case '-':
			cal = num1 - num2;
			break;
		case '*':
			cal = num1 * num2;
			break;
		case '/':
			cal = num1 / num2;
			break;
		default:
			System.out.println("Invalid input !");
		}
		return cal;
	}
}