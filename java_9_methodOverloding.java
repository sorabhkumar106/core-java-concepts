//Method overloding in java
public class MethodOverloading{
	public static void main(String[] args) {
		//creating objects
		MethodOverloading mo=new MethodOverloading();
		//adding two numbers
		int sum=mo.add(10,20);
		System.out.println("the sum of two number :"+sum);
		//adding three number
		sum=mo.add(10,20,30);
		System.out.println("the sum of three number :"+sum);
	}
	//this add() function by two parameter
public int add(int num1, int num2){
int result=num1+num2;
//return to Main function result
return result;	
}
//this add() function by three parameter
public int add(int num1, int num2, int num3){
int result=num1+num2+num3;
return result;	
}
}